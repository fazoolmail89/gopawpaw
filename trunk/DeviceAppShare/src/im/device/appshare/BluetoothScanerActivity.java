/**
 * 
 */
package im.device.appshare;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.android.bluetooth.opp.BluetoothOppShareInfo;
import com.gopawpaw.droidcore.activity.BaseActivity;
import com.pingan.plugins.bluetooth.obexshare.BluetoothOppObexShare;
import com.pingan.plugins.bluetooth.obexshare.OppObexShareCallback;
import com.pingan.plugins.bluetooth.scanner.Scanner;
import com.pingan.plugins.bluetooth.scanner.ScannerCallback;
import com.pingan.plugins.bluetooth.share.BluetoothShare;

/**
 * @author jinhua
 * 
 */
public class BluetoothScanerActivity extends BaseActivity implements
		OnClickListener,ScannerCallback {

	public static void actionStart(Context context, String appName,
			String apkPath) {
		Intent intent = new Intent(context, BluetoothScanerActivity.class);
		intent.putExtra("appName", appName);
		intent.putExtra("apkPath", apkPath);
		context.startActivity(intent);
	}

	private static final int HANDLER_WHAT_FOUND = 0;
	private static final int HANDLER_WHAT_DISCOVERY_FINISHED = 1;

	private String appName;
	private String apkPath;
	private LinearLayout llBluetooths;
	private Button btnScanner;
	
	private Scanner bluetoothScanner;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bluetooth_scanner);

		llBluetooths = (LinearLayout) findViewById(R.id.ll_bluetooths);
		btnScanner = (Button) findViewById(R.id.btn_scanner);
		btnScanner.setOnClickListener(this);
		appName = getIntent().getExtras().getString("appName");
		apkPath = getIntent().getExtras().getString("apkPath");
		
		bluetoothScanner = Scanner.Factory.create(this);
		bluetoothScanner.setCallback(this);
		bluetoothScanner.startDiscovery();
//		filterBluetoothScanner.addAction(BluetoothDevice.ACTION_FOUND);// 用BroadcastReceiver来取得搜索结果
//		filterBluetoothScanner.addAction(BluetoothAdapter.ACTION_DISCOVERY_FINISHED);
//		filterBluetoothScanner.addAction(BluetoothDevice.ACTION_BOND_STATE_CHANGED);
//		filterBluetoothScanner.addAction(BluetoothAdapter.ACTION_SCAN_MODE_CHANGED);
//		filterBluetoothScanner.addAction(BluetoothAdapter.ACTION_STATE_CHANGED);

	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	
	@Override
	public void onClick(View v) {
		if(bluetoothScanner.startDiscovery()){
			llBluetooths.removeAllViews();
		}else{
			Toast.makeText(BluetoothScanerActivity.this, "正在扫描，请稍后...",
					Toast.LENGTH_SHORT).show();
		}
	}

	private Handler mHandler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			// TODO Auto-generated method stub
			super.handleMessage(msg);
			switch (msg.what) {
			case HANDLER_WHAT_FOUND:
				BluetoothDevice device = (BluetoothDevice) msg.obj;
				addBluetoothDevice(device);
				break;
			case HANDLER_WHAT_DISCOVERY_FINISHED:
				Toast.makeText(BluetoothScanerActivity.this, "扫描结束",
						Toast.LENGTH_SHORT).show();
				break;
			default:
				break;
			}
		}
	};

	private void addBluetoothDevice(BluetoothDevice device) {
		String name = device.getName() == null ? device.getAddress() : device.getName();
		Button btn = new Button(this);
		btn.setText(name);
		btn.setTag(device);
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sendToBluetoothDevice((BluetoothDevice) v.getTag());
			}
		});
		llBluetooths.addView(btn);
	}

	private void sendToBluetoothDevice(BluetoothDevice device) {
		AppLog.i(TAG, "sendToBluetoothDevice : " + device.getName() + "  :  "
				+ device.getAddress());
		// device.createRfcommSocketToServiceRecord(uuid);
		// connectBluetoothDevice(device);
//		if (device.getBondState() != BluetoothDevice.BOND_BONDED) {
//			Method createBondMethod;
//			try {
//				createBondMethod = BluetoothDevice.class
//						.getMethod("createBond");
//				Log.d(TAG, "开始配对");
//				Boolean returnValue = (Boolean) createBondMethod.invoke(device);
//				Log.d(TAG, "配对returnValue:" + returnValue);
//			} catch (SecurityException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (NoSuchMethodException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IllegalArgumentException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IllegalAccessException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (InvocationTargetException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}
//		new ConnectThread(device).start();
//		shareFileToBluetoothDevice(device,apkPath);
//		BluetoothConnector bc = new BluetoothConnector(device, false, mBluetoothAdapter, null);
//		try {
//			BluetoothSocketWrapper bsw = bc.connect();
//			bsw.getOutputStream();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		ArrayList<Uri> vRetArray = new ArrayList<Uri>();
//		File f = new File(apkPath);
//		vRetArray.add( Uri.fromFile(f));
//		Intent intent = new Intent(Intent.ACTION_SEND_MULTIPLE);  
//        intent.setClassName("com.android.bluetooth", "com.android.bluetooth.opp.BluetoothOppLauncherActivity");  
//        intent.putExtra(Intent.EXTRA_STREAM,vRetArray);  
//        intent.setType("*/*"); //must set this flag  
//        startActivity(intent); 
        
//        Intent in1 = new Intent(BluetoothDevicePicker.ACTION_LAUNCH);  
//        in1.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);  
//        in1.putExtra(BluetoothDevicePicker.EXTRA_NEED_AUTH, false);  
//        in1.putExtra(BluetoothDevicePicker.EXTRA_FILTER_TYPE,  
//                BluetoothDevicePicker.FILTER_TYPE_TRANSFER);  
//        in1.putExtra(BluetoothDevicePicker.EXTRA_LAUNCH_PACKAGE,  
//                Constants.THIS_PACKAGE_NAME);  
//        in1.putExtra(BluetoothDevicePicker.EXTRA_LAUNCH_CLASS,  
//                BluetoothOppReceiver.class.getName());  
//
//        this.startActivity(in1);
		
//		BluetoothOppManager b;
//		sendBluetoothDevice(device);
//		BluetoothShare.Factory.create(this, device).shareFile("*/*", apkPath);
	    mBluetoothOppObexShare = BluetoothOppObexShare.Factory.create(getApplicationContext(), device, mOppObexShareCallback).connect();
	}
	private BluetoothOppObexShare mBluetoothOppObexShare;
	private OppObexShareCallback mOppObexShareCallback = new OppObexShareCallback(){
		
		@Override
		public void onConnect(int state) {
			// TODO Auto-generated method stub
			AppLog.i(TAG, "onConnect:"+state);
			mBluetoothOppObexShare.shareFile("*/*", apkPath);
		}

		@Override
		public void onDisconnect(int state) {
			// TODO Auto-generated method stub
			AppLog.i(TAG, "onDisconnect:"+state);
		}
		
		@Override
		public void onTransferStart(BluetoothOppShareInfo share, int size) {
			// TODO Auto-generated method stub
			AppLog.i(TAG, "onTransferStart:"+size);
		}

		@Override
		public void onTransferProgress(BluetoothOppShareInfo share, int progress) {
			// TODO Auto-generated method stub
			AppLog.i(TAG, "onTransferProgress:"+progress);
		}

		@Override
		public void onShareTimeout(BluetoothOppShareInfo share) {
			// TODO Auto-generated method stub
			AppLog.i(TAG, "onShareTimeout:"+share);
		}

		@Override
		public void onShareFailed(BluetoothOppShareInfo share, int failReason) {
			// TODO Auto-generated method stub
			AppLog.i(TAG, "onDisconnect:"+failReason);
		}

		@Override
		public void onShareSuccess(BluetoothOppShareInfo share) {
			// TODO Auto-generated method stub
			AppLog.i(TAG, "onShareSuccess:"+share);
		}

		
	};
	
	private void sendDevicePickedIntent(BluetoothDevice device) {
		String action = "android.bluetooth.devicepicker.action.DEVICE_SELECTED";//BluetoothDevicePicker.ACTION_DEVICE_SELECTED
		String mLaunchPackage = "com.android.bluetooth";
		String mLaunchClass = "BluetoothOppReceiver";
        Intent intent = new Intent(action);
        if (mLaunchPackage != null && mLaunchClass != null) {
            intent.setClassName(mLaunchPackage, mLaunchClass);
        }
        intent.putExtra(BluetoothDevice.EXTRA_DEVICE, device);
        sendBroadcast(intent);
    }
	
	private void sendBluetoothDevice(BluetoothDevice device){
		Uri CONTENT_URI = Uri.parse("content://com.android.bluetooth.opp/btopp");
		File f = new File(apkPath);
		Uri mUriOfSendingFile = Uri.fromFile(f);
		String mMimeTypeOfSendigFile = "*/*";
		ContentValues values = new ContentValues();
        values.put(/*BluetoothShare.URI*/"uri", mUriOfSendingFile.toString());
        values.put(/*BluetoothShare.MIMETYPE*/"mimetype", mMimeTypeOfSendigFile);
        values.put(/*BluetoothShare.DESTINATION*/"destination", device.getAddress());
        final Uri contentUri = getContentResolver().insert(/*BluetoothShare.CONTENT_URI*/CONTENT_URI,
                values);
        
        Log.v(TAG, "Insert contentUri: " + contentUri + "  to device: "
                    + device.getName());
	}
	
	// public void connectBluetoothDevice(final BluetoothDevice device) {
	// Thread thread = new Thread(new Runnable() {
	// public void run() {
	// BluetoothSocket bluetoothSocket = null;
	// Method method;
	// try {
	// method = device.getClass().getMethod("createRfcommSocket", new
	// Class[]{int.class});
	// bluetoothSocket = (BluetoothSocket) method.invoke(device, 1);
	// } catch (Exception e) {
	// // setState(CONNECT_FAILED);
	// AppLog.e("TAG", e.toString());
	// }
	// // socket = tmp;
	// try {
	// bluetoothSocket.connect();
	// AppLog.i("TAG", "bluetoothSocket.connect() true ");
	// // isConnect = true;
	// } catch (Exception e) {
	// // setState(CONNECT_FAILED);
	// AppLog.e("TAG", e.toString());
	// }
	//
	// }
	// });
	// thread.start();
	// }

	private void shareFileToBluetoothDevice(BluetoothDevice device,String filePath) {
		try {
			/*
			 * 网络流传的通过UUID连接的方式是不工作的，经过了好一阵搜索终于找到了下面的替换方法
			 */
			// UUID uuid = UUID.fromString(SPP_UUID);
			// btSocket = btDev.createRfcommSocketToServiceRecord(uuid);
			BluetoothSocket btSocket = null;
			Method m = null;
			try {
				m = device.getClass().getMethod("createRfcommSocket",
						new Class[] { int.class });
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
			try {
				btSocket = (BluetoothSocket) m.invoke(device, 1);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			btSocket = device.createRfcommSocketToServiceRecord(UUID.fromString("00001101-0000-1000-8000-00805F9B34FB")); 
			
			btSocket.connect();

			/*
			 * 该段落是通过btsocket发送字符串给其它蓝牙设备，接收端应该需要做相应接收处理才能收到 所以尚未测试，暂且留着吧
			 */
			// OutputStream outStream = null;
			// outStream = btSocket.getOutputStream();
			// String message = "Hello message from client to server.";
			// byte[] msgBuffer = message.getBytes();
			// try {
			// outStream.write(msgBuffer);
			// } catch (IOException e) {
			// e.printStackTrace();
			// }
			// btSocket.close();

			/*
			 * 发送一指定的文件到其它蓝牙设备
			 */
			ContentValues cv = new ContentValues();
			cv.put("uri", filePath);
			cv.put("destination", device.getAddress());
			cv.put("direction", 0);
			Long ts = System.currentTimeMillis();
			cv.put("timestamp", ts);
			getContentResolver().insert(
					Uri.parse("content://com.android.bluetooth.opp/btopp"), cv);
			btSocket.close();
			
			/*
			 * 下面一段是通过intent的方式发送文件 与上面一段的不同在于，该方式会打开一个数据分享方式列表，如蓝牙，短信，Email 等
			 * 选择蓝牙方式后也是可以发送到其它蓝牙设备的
			 * 只不过偶尔也会抛出一个ioException异常，所以健壮性还有待加强，如添加try/catch模块
			 */
			// Intent intent = new Intent();
			// intent.setAction(Intent.ACTION_SEND);
			// intent.setType("image/jpg");
			// intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new
			// File("/sdcard/test.jpg")) );
			// startActivity(intent);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onFoundDevice(BluetoothDevice device) {
		// TODO Auto-generated method stub
		Message msg = new Message();
		msg.what = HANDLER_WHAT_FOUND;
		msg.obj = device;
		mHandler.sendMessage(msg);
	}

	@Override
	public void onScanFinished() {
		// TODO Auto-generated method stub
		Message msg = new Message();
		msg.what = HANDLER_WHAT_DISCOVERY_FINISHED;
		mHandler.sendMessage(msg);
	}
}
