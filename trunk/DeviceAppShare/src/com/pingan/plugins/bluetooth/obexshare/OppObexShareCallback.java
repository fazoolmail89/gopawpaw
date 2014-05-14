package com.pingan.plugins.bluetooth.obexshare;

import com.pingan.plugins.bluetooth.opp.BluetoothOppShareInfo;

/**
 * OPP 对象分享回调接口
 * @author LiJinHua
 * @modify 2014年5月13日 上午10:44:41
 */
public interface OppObexShareCallback {
	
	public static final int STATE_FAIL = 0;
	public static final int STATE_SUCCESS = 1;
	public static final int STATE_TIME_OUT = 2;
	
	enum StatusType{
		onConnect,
		onDisconnect,
		onTransferStart,
		onTransferProgress,
		onShareTimeout,
		onShareFailed,
		onShareSuccess
	}
	
	public void onOppObexShareStatus(StatusType type,int value,BluetoothOppShareInfo shareInfo);
}
