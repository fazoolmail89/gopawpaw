/**
 * 
 */
package im.device.appshare.bluetooth;

import java.io.IOException;
import java.util.UUID;

import com.gopawpaw.droidcore.log.AppLog;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;

/**
 * @author jinhua
 *
 */
public class ConnectThread extends Thread {  
	private static final String TAG = ConnectThread.class.getSimpleName();
	
	private BluetoothAdapter mBluetoothAdapter = BluetoothAdapter
			.getDefaultAdapter();
    private final BluetoothSocket mmSocket;  
    private final BluetoothDevice mmDevice; 
    private UUID uuid = UUID.fromString("00001106-0000-1000-8000-00805F9B34FB");//文件交换型UUID
    public ConnectThread(BluetoothDevice device) {  
        // Use a temporary object that is later assigned to mmSocket,  
        // because mmSocket is final  
        BluetoothSocket tmp = null;  
        mmDevice = device;  
        // Get a BluetoothSocket to connect with the given BluetoothDevice  
        try {  
            // MY_UUID is the app's UUID string, also used by the server code  
            tmp = device.createRfcommSocketToServiceRecord(uuid);  
        } catch (IOException e) { 
        	e.printStackTrace();
        }
        mmSocket = tmp;  
    }  
  
    public void run() {  
        try {  
            // Connect the device through the socket. This will block  
            // until it succeeds or throws an exception  
            mmSocket.connect();
//            new ConnectedThread(mmSocket).start();
            AppLog.d(TAG, "mmSocket.connect() true");
        } catch (IOException connectException) {
            // Unable to connect; close the socket and get out  
        	connectException.printStackTrace();
            try {  
                mmSocket.close();  
            } catch (IOException closeException) { 
            	closeException.printStackTrace();
            }  
            return;  
        }
  
        // Do work to manage the connection (in a separate thread)  
//        manageConnectedSocket(mmSocket);  
    }
  
    /** Will cancel an in-progress connection, and close the socket */  
    public void cancel() {  
        try {  
            mmSocket.close();  
        } catch (IOException e) { }  
    }
}
