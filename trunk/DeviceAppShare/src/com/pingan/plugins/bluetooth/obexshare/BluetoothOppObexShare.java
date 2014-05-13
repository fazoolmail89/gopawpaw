package com.pingan.plugins.bluetooth.obexshare;

import java.util.HashMap;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;

import com.android.bluetooth.opp.BluetoothOppShareInfo;
import com.android.bluetooth.opp.BluetoothOppTransfer;
import com.android.bluetooth.opp.BluetoothOppTransfer.BluetoothOppTransferListener;
import com.android.bluetooth.opp.BluetoothShare;

/**
 * 蓝牙OPP 对象传输分享接口
 * @author LiJinHua
 * @modify 2014年5月13日 上午9:53:57
 */
public interface BluetoothOppObexShare {
	
	void shareFile(String mimetype,String filePath);
	
	BluetoothOppObexShare connect();
	
	void disconnect();
	
	public static class Factory {
		
		private static HashMap<String,BluetoothOppObexShare> mBluetoothOppObexShareMap = new HashMap<String,BluetoothOppObexShare>();
		
		public static BluetoothOppObexShare create(Context context,BluetoothDevice device,OppObexShareCallback callback) {
			if(context == null || device == null){
				return null;
			}
			BluetoothOppObexShare oppObexShare = mBluetoothOppObexShareMap.get(device.getAddress());
			if(oppObexShare == null){
				oppObexShare = new BluetoothOppObexShareImpl(context,device,callback);
				mBluetoothOppObexShareMap.put(device.getAddress(), oppObexShare);
			}
			return oppObexShare;
		}
		
		static class BluetoothOppObexShareImpl implements BluetoothOppObexShare,BluetoothOppTransferListener{
			private Context context;
			private BluetoothDevice device;
			private OppObexShareCallback callback;
			private BluetoothOppTransfer btOppT;
			public BluetoothOppObexShareImpl(Context context,
					BluetoothDevice device, OppObexShareCallback callback) {
				super();
				this.context = context;
				this.device = device;
				this.callback = callback;
			}
			
			@Override
			public BluetoothOppObexShare connect() {
				// TODO Auto-generated method stub
				BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
				adapter.cancelDiscovery();
				if(btOppT == null){
					btOppT = new BluetoothOppTransfer(context,device);
					btOppT.setBluetoothOppTransferListener(this);
					btOppT.start();
				}
				return this;
			}
			
			@Override
			public void disconnect() {
				mBluetoothOppObexShareMap.remove(device.getAddress());
				if(btOppT != null){
					btOppT.stop();
					btOppT = null;
				}
			}
			
			@Override
			public void shareFile(String mimetype,
					String filePath) {
				if(btOppT == null){
					connect();
				}
				final BluetoothOppShareInfo info = new BluetoothOppShareInfo(filePath,"平安地推安装包.apk",mimetype,device.getAddress(),BluetoothShare.STATUS_PENDING);
				btOppT.addShare(info);
			}
			
			@Override
			public void onShareTimeout(BluetoothOppShareInfo share) {
				// TODO Auto-generated method stub
				if(callback != null){
					callback.onShareTimeout(share);
				}
			}

			@Override
			public void onShareFailed(BluetoothOppShareInfo share,
					int failReason) {
				// TODO Auto-generated method stub
				if(callback != null){
					callback.onShareFailed(share, failReason);
				}
			}

			@Override
			public void onConnect(int state) {
				if(callback != null){
					callback.onConnect(state);
				}
			}

			@Override
			public void onDisconnect(int state) {
				disconnect();
				if(callback != null){
					callback.onDisconnect(state);
				}
			}

			@Override
			public void onTransferStart(BluetoothOppShareInfo share, int size) {
				// TODO Auto-generated method stub
				if(callback != null){
					callback.onTransferStart(share, size);
				}
			}

			@Override
			public void onTransferProgress(BluetoothOppShareInfo share,
					int progress) {
				// TODO Auto-generated method stub
				if(callback != null){
					callback.onTransferProgress(share, progress);
				}
			}

			@Override
			public void onShareSuccess(BluetoothOppShareInfo share) {
				// TODO Auto-generated method stub
				if(callback != null){
					callback.onShareSuccess(share);
				}
			}


		}
	}
}
