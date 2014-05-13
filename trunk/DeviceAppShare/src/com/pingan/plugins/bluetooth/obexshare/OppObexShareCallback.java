package com.pingan.plugins.bluetooth.obexshare;

import com.android.bluetooth.opp.BluetoothOppShareInfo;

/**
 * OPP 对象分享回调接口
 * @author LiJinHua
 * @modify 2014年5月13日 上午10:44:41
 */
public interface OppObexShareCallback {
	
	public static final int STATE_FAIL = 0;
	public static final int STATE_SUCCESS = 1;
	public static final int STATE_TIME_OUT = 2;
	
	public void onConnect(int state);
	
	public void onDisconnect(int state);
	
	public void onTransferStart(BluetoothOppShareInfo share,int size);
	
	public void onTransferProgress(BluetoothOppShareInfo share,int progress);
	
	public void onShareTimeout(BluetoothOppShareInfo share);
	
	public void onShareFailed(BluetoothOppShareInfo share,int failReason);
	
	public void onShareSuccess(BluetoothOppShareInfo share);

	
}
