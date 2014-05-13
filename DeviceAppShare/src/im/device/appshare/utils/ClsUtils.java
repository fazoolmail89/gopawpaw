/**
 * 
 */
package im.device.appshare.utils;

/**
 * @author jinhua
 *
 */

/***********************************
 * 蓝牙配对函数 * **************/
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.util.Log;

public class ClsUtils {

	/**
	 * 涓庤澶囬厤瀵�鍙傝�婧愮爜锛歱latform/packages/apps/Settings.git
	 * /Settings/src/com/android/settings/bluetooth/CachedBluetoothDevice.java
	 */
	static public boolean createBond(Class btClass, BluetoothDevice btDevice)
			throws Exception {
		Method createBondMethod = btClass.getMethod("createBond");
		Boolean returnValue = (Boolean) createBondMethod.invoke(btDevice);
		return returnValue.booleanValue();
	}

	/**
	 * 涓庤澶囪В闄ら厤瀵�鍙傝�婧愮爜锛歱latform/packages/apps/Settings.git
	 * /Settings/src/com/android/settings/bluetooth/CachedBluetoothDevice.java
	 */
	static public boolean removeBond(Class btClass, BluetoothDevice btDevice)
			throws Exception {
		Method removeBondMethod = btClass.getMethod("removeBond");
		Boolean returnValue = (Boolean) removeBondMethod.invoke(btDevice);
		return returnValue.booleanValue();
	}

	static public boolean setPin(Class btClass, BluetoothDevice btDevice,
			String str) throws Exception {
		try {			
			Method removeBondMethod = btClass.getDeclaredMethod("setPin",
					new Class[] { byte[].class });
			Boolean returnValue = (Boolean) removeBondMethod.invoke(btDevice,
			new Object[] { str.getBytes() });
			Log.e("returnValue", "" + returnValue);
		} catch (SecurityException e) {
			// throw new RuntimeException(e.getMessage());
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// throw new RuntimeException(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;

	}

	/**
	 * 
	 * @param clsShow
	 */
	static public void printAllInform(Class clsShow) {
		try {
			// 鍙栧緱鎵�湁鏂规硶
			Method[] hideMethod = clsShow.getMethods();
			int i = 0;
			for (; i < hideMethod.length; i++) {
				Log.e("method name", hideMethod[i].getName() + ";and the i is:" + i);				
			
			}
			// 鍙栧緱鎵�湁甯搁噺
			Field[] allFields = clsShow.getFields();
			for (i = 0; i < allFields.length; i++) {
				Log.e("Field name", allFields[i].getName());
			}
		} catch (SecurityException e) {
			// throw new RuntimeException(e.getMessage());
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// throw new RuntimeException(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 配对
	 * @param address
	 * @param psw
	 * @return
	 */
	public static boolean pair(String address,String psw,BluetoothAdapter adapter){
		boolean result = false;
		BluetoothDevice device = adapter.getRemoteDevice(address);
		if(device.getBondState() != BluetoothDevice.BOND_BONDED){
			try {
				setPin(device.getClass(),device, psw);
				boolean flag = createBond(device.getClass(), device);
				if(flag){
					result = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			result = true;
		}
		return result;
	}
}

