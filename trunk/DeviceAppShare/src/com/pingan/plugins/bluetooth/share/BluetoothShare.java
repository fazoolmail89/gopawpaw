/**
 * 
 */
package com.pingan.plugins.bluetooth.share;

import java.io.File;
import java.util.List;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import com.android.bluetooth.opp.BluetoothOppBatch;
import com.android.bluetooth.opp.BluetoothOppShareInfo;
import com.android.bluetooth.opp.BluetoothOppTransfer;

/**
 * @author jinhua
 *
 */
public interface BluetoothShare {
	Uri CONTENT_URI = Uri.parse("content://com.android.bluetooth.opp/btopp");
	
//	boolean shareFile(String mimetype,String filePath);
//	
//	boolean shareFile(String mimetype,List<String> filesPath);
//	
//	public static class Factory{
//		private static final String TAG = "BluetoothShare";
//		
//		private static BluetoothShare mBluetoothShare;
//		public static BluetoothShare create(Context context){
//			return null;
//		}
//		
//		public static BluetoothShare create(Context context,BluetoothDevice device){
//			Log.i(TAG, "android.os.Build.VERSION:"+android.os.Build.VERSION.SDK_INT);
////            if (android.os.Build.VERSION.SDK_INT > 15) {
////                return new BluetoothShareToAPI_LEVEL_Greater_Than_15_Impl(context,device);
////            } else {
////            	return new BluetoothShareToAPI_LEVEL_15_impl(context,device);
////            }
//			if(mBluetoothShare == null){
//				mBluetoothShare= new BluetoothShareToDefImpl(context,device);
//			}
//			return mBluetoothShare;
//		}
//		
//		static class BluetoothShareToDefImpl implements BluetoothShare{
//
//			private Context context;
//			private BluetoothDevice device;
//			private BluetoothOppBatch batch;
//			
//			public BluetoothShareToDefImpl(Context context,
//					BluetoothDevice device) {
//				super();
//				this.context = context;
//				this.device = device;
//			}
//
//			@Override
//			public boolean shareFile(String mimetype, String filePath) {
//				if(batch == null){
//					BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
//					adapter.cancelDiscovery();
//					BluetoothOppShareInfo info = new BluetoothOppShareInfo(filePath,"test name",mimetype,device.getAddress(),0);
////					batch = new BluetoothOppBatch(context,info);
//					BluetoothOppTransfer btOppT = new BluetoothOppTransfer(context,batch);
//					btOppT.start();
//				}else{
//					BluetoothOppShareInfo info = new BluetoothOppShareInfo(filePath,"test name",mimetype,device.getAddress(),0);
//					batch.addShare(info);
//				}
//				return false;
//			}
//
//			@Override
//			public boolean shareFile(String mimetype, List<String> filesPath) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//			
//		}
//		/**
//		 * 分享到SDK小于4.0
//		 * @author jinhua
//		 *
//		 */
//		static class BluetoothShareToAPI_LEVEL_15_impl implements BluetoothShare{
//			private Context context;
//			private BluetoothDevice device;
//			public BluetoothShareToAPI_LEVEL_15_impl(Context context,BluetoothDevice device) {
//				super();
//				this.context = context;
//				this.device = device;
//			}
//			
//			@Override
//			public boolean shareFile(String mimetype, String filePath) {
//				// TODO Auto-generated method stub
//				Uri CONTENT_URI = Uri.parse("content://com.android.bluetooth.opp/btopp");
//				File f = new File(filePath);
//				Uri mUriOfSendingFile = Uri.fromFile(f);
//				ContentValues values = new ContentValues();
//		        values.put(/*BluetoothShare.URI*/"uri", mUriOfSendingFile.toString());
//		        values.put(/*BluetoothShare.MIMETYPE*/"mimetype", mimetype);
//		        values.put(/*BluetoothShare.DESTINATION*/"destination", device.getAddress());
//		        final Uri contentUri = context.getContentResolver().insert(/*BluetoothShare.CONTENT_URI*/CONTENT_URI,
//		                values);
//		        Log.v(TAG, "Insert contentUri: " + contentUri + "  to device: "
//		                    + device.getName());
//				return false;
//			}
//
//			@Override
//			public boolean shareFile(String mimetype, List<String> filesPath) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//		}
//		
//		/**
//		 * 分享到SDK大于等于4.0
//		 * @author jinhua
//		 */
//		static class BluetoothShareToAPI_LEVEL_Greater_Than_15_Impl implements BluetoothShare{
//			private Context context;
//			private BluetoothDevice device;
//			public BluetoothShareToAPI_LEVEL_Greater_Than_15_Impl(Context context,BluetoothDevice device) {
//				super();
//				this.context = context;
//				this.device = device;
//			}
//			
//			@Override
//			public boolean shareFile(String mimetype, String filePath) {
//				// TODO Auto-generated method stub
//				File f = new File(filePath);
//				Uri uri = Uri.fromFile(f);
////				
////				Intent sharingIntent = new Intent(
////                        android.content.Intent.ACTION_SEND);
////                sharingIntent.setType(mimetype);
////                sharingIntent
////                        .setComponent(new ComponentName(
////                                "com.android.bluetooth",
////                                "com.android.bluetooth.opp.BluetoothOppLauncherActivity"));
////                sharingIntent.putExtra(Intent.EXTRA_STREAM, uri);
////                context.startActivity(sharingIntent);
////				05-09 23:03:19.620: W/BroadcastQueue(2254): Permission Denial: broadcasting Intent { act=android.btopp.intent.action.HANDOVER_SEND cat=[android.intent.category.DEFAULT] typ=*/* flg=0x10 (has extras) } from im.device.appshare (pid=19041, uid=10122) requires com.android.permission.WHITELIST_BLUETOOTH_DEVICE due to receiver com.android.bluetooth/.opp.BluetoothOppHandoverReceiver
//
//		    	Intent intent = new Intent("android.btopp.intent.action.HANDOVER_SEND");
//		    	intent.setComponent(new ComponentName("com.android.bluetooth","com.android.bluetooth.opp.BluetoothOppHandoverReceiver"));
//		    	intent.putExtra("android.bluetooth.device.extra.DEVICE", device);
//		    	intent.setType(mimetype);
//		    	intent.putExtra(Intent.EXTRA_STREAM, uri);
//		    	intent.addCategory("android.intent.category.DEFAULT");
//		    	context.sendBroadcast(intent,"com.android.permission.WHITELIST_BLUETOOTH_DEVICE");
////				try {
////					
////					Class cl = Class.forName("com.android.bluetooth.opp.BluetoothOppManager");
////					Method[] ms = cl.getMethods();
////					if(ms != null){
////						for(Method m : ms){
////							Log.i(TAG, m.getName());
////						}
////					}
////				} catch (ClassNotFoundException e) {
////					// TODO Auto-generated catch block
////					e.printStackTrace();
////				}
////		    	device.createRfcommSocketToServiceRecord(uuid)
////		    	BluetoothSocket clientSocket = device.createRfcommSocketToServerRecord(null);  
////		    	clientSocket.connet();  
//
//				return false;
//			}
//
//			@Override
//			public boolean shareFile(String mimetype, List<String> filesPath) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//		}
//	}
}
