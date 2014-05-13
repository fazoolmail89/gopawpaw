/**
 * 
 */
package im.device.appshare.bluetooth;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.bluetooth.BluetoothSocket;

import com.gopawpaw.droidcore.log.AppLog;

/**
 * @author jinhua
 * 
 */
public class ConnectedThread extends Thread {
	private static final String TAG = ConnectedThread.class.getSimpleName();
	private final BluetoothSocket cwjSocket;

	private final InputStream cwjInStream;

	private final OutputStream cwjOutStream;

	public ConnectedThread(BluetoothSocket socket) {
		cwjSocket = socket;

		InputStream tmpIn = null; // 上面定义的为final这是使用temp临时对象
		OutputStream tmpOut = null;
		try {
			tmpIn = socket.getInputStream(); // 使用getInputStream作为一个流处理
			tmpOut = socket.getOutputStream();

		} catch (IOException e) {
			e.printStackTrace();
		}

		cwjInStream = tmpIn;

		cwjOutStream = tmpOut;

	}

	public void run() {

		byte[] buffer = new byte[1024];
		
		int bytes;
		while (true) {
			try {
				bytes = cwjInStream.read(buffer);
//				mHandler.obtainMessage(MESSAGE_READ, bytes, -1, buffer)
//						.sendToTarget(); // 传递给UI线程
				AppLog.i(TAG, "bytes : "+bytes);
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}

		}

	}
	
	public void write(byte[] bytes) {
		try {
			cwjOutStream.write(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void cancel() {
		try {

			cwjSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}