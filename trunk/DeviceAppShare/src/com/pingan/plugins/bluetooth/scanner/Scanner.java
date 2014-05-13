package com.pingan.plugins.bluetooth.scanner;

import im.device.appshare.AppLog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public interface Scanner {

	public void setCallback(ScannerCallback callback);

	public List<BluetoothDevice> getDevices();

	public boolean startDiscovery();

	public void cancelDiscovery();

	public static class Factory {

		public static Scanner create(Context context) {
			return new ScannerImpl(context);
		}

		private static class ScannerImpl implements Scanner {
			private static final String TAG = "Scanner";

			private Context context;

			private ScannerCallback callback;

			private HashSet<String> foundDevicesAddress;
			
			private List<BluetoothDevice> foundDevices;
			
			private IntentFilter filterBluetoothScanner;
			
			private BluetoothAdapter mBluetoothAdapter;
			
			public ScannerImpl(Context context) {
				super();
				this.context = context;
				foundDevicesAddress = new HashSet<String>();
				foundDevices = new ArrayList<BluetoothDevice>();
				filterBluetoothScanner = new IntentFilter();
				filterBluetoothScanner.addAction(BluetoothDevice.ACTION_FOUND);// 用BroadcastReceiver来取得搜索结果
				filterBluetoothScanner.addAction(BluetoothAdapter.ACTION_DISCOVERY_FINISHED);
				
				mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
				if (!mBluetoothAdapter.isEnabled()) {
					boolean en = mBluetoothAdapter.enable();
					AppLog.d(TAG, "enable:" + en);
				}
			}

			@Override
			public void setCallback(ScannerCallback callback) {
				this.callback = callback;
			}

			@Override
			public List<BluetoothDevice> getDevices() {
				return foundDevices;
			}
			
			@Override
			public boolean startDiscovery() {
				// TODO Auto-generated method stub
				boolean ret = false;
				foundDevicesAddress.clear();
				if (!mBluetoothAdapter.isEnabled()) {
					ret = mBluetoothAdapter.enable();
					AppLog.d(TAG, "enable:" + ret);
					if(!ret){
						return ret;
					}
				}
				
				if (!mBluetoothAdapter.isDiscovering()) {
					context.registerReceiver(mReceiver, filterBluetoothScanner);
					foundDevices = new ArrayList<BluetoothDevice>();
					ret = mBluetoothAdapter.startDiscovery();
					if(!ret){
						//need  unregisterReceiver if startDiscovery fail
						context.unregisterReceiver(mReceiver);
					}
					AppLog.d(TAG, " startDiscovery:" + ret);
				} else {
					ret = false;
				}
				return ret;
			}
			
			@Override
			public void cancelDiscovery() {
				// TODO Auto-generated method stub
				mBluetoothAdapter.cancelDiscovery();
				context.unregisterReceiver(mReceiver);
			}

			private BroadcastReceiver mReceiver = new BroadcastReceiver() {
				public void onReceive(Context context, Intent intent) {
					String action = intent.getAction();
					// 找到设备
					if (BluetoothDevice.ACTION_FOUND.equals(action)) {
						BluetoothDevice device = intent
								.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
						String str = device.getName() + "|"
								+ device.getAddress();
						// 防止重复添加
						if (!foundDevicesAddress.contains(str)) {
							// 获取设备名称和mac地址
							foundDevicesAddress.add(str);
							foundDevices.add(device);
							AppLog.v(TAG, "find device: " + device.getName()+" "
									+ device.getAddress());
							if (device.getBondState() == BluetoothDevice.BOND_BONDED) {
								AppLog.i(TAG, "has par：" + device.getName());
							}
							if(callback != null){
								callback.onFoundDevice(device);
							}
						}
					}
					// 搜索完成
					else if (BluetoothAdapter.ACTION_DISCOVERY_FINISHED
							.equals(action)) {
						AppLog.v(TAG, "find over bluetoothCount:"
								+ foundDevicesAddress.size());
						// Cancel discovery because it will slow down the
						cancelDiscovery();
						if(callback != null){
							callback.onScanFinished();
						}
					}
				}

			};
		}
	}
}
