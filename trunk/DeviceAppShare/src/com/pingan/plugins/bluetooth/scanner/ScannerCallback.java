/**
 * 
 */
package com.pingan.plugins.bluetooth.scanner;

import android.bluetooth.BluetoothDevice;

/**
 * @author jinhua
 *
 */
public interface ScannerCallback {
	
	void onFoundDevice(BluetoothDevice device);
	
	void onScanFinished();
}
