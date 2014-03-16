/**
 * @author EX-LIJINHUA001
 * @date 2013-4-17
 */
package im.device.appshare;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.gopawpaw.droidcore.dialog.BaseDialog;

/**
 * 选择分享对话框
 * 
 * @author EX-LIJINHUA001
 * @date 2013-4-17
 */
public class SelectShareDialog extends BaseDialog {

	private View contentView;
	private Button mBtnShareApk;
	private Button mBtnShareLink;
	private Button mBtnOpen;
	private Button mBtnManage;
	private Button mBtnUninstall;
	
	private PackageInfo data;
	private OnSelectShareItem mOnSelectShareItem;
	public SelectShareDialog(Context context,OnSelectShareItem onSelectShareItem) {
		super(context);
		contentView = LayoutInflater.from(getContext()).inflate(
				R.layout.dialog_select_share, null);
		mBtnShareApk = (Button) contentView.findViewById(R.id.btn_share_apk);
		mBtnShareLink = (Button) contentView.findViewById(R.id.btn_share_link);
		
		mBtnOpen = (Button) contentView.findViewById(R.id.btn_1);
		mBtnManage = (Button) contentView.findViewById(R.id.btn_2);
		mBtnUninstall = (Button) contentView.findViewById(R.id.btn_3);
		
		mOnSelectShareItem = onSelectShareItem;
		
		this.setTitle(R.string.select_share_title);
		this.btn1.setVisibility(View.GONE);
		this.btn2.setVisibility(View.GONE);
		this.btn3.setVisibility(View.GONE);
		
		mBtnShareApk.setOnClickListener(mOnClickListener);
		mBtnShareLink.setOnClickListener(mOnClickListener);
		mBtnOpen.setOnClickListener(mOnClickListener);
		mBtnManage.setOnClickListener(mOnClickListener);
		mBtnUninstall.setOnClickListener(mOnClickListener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gopawpaw.droid.dialog.BaseDialog#createContentView()
	 */
	@Override
	public View createContentView() {
		// TODO Auto-generated method stub
		return contentView;
	}
	
	private View.OnClickListener mOnClickListener = new View.OnClickListener(){

		@Override
		public void onClick(View v) {
			if(mOnSelectShareItem != null){
				int type = OnSelectShareItem.TYPE_APK;
				if(v.getId() == R.id.btn_share_apk){
					type = OnSelectShareItem.TYPE_APK;
				}else if(v.getId() == R.id.btn_share_link){
					type = OnSelectShareItem.TYPE_LINK;
				}else if(v.getId() == R.id.btn_1){
					type = OnSelectShareItem.TYPE_OPEN;
				}else if(v.getId() == R.id.btn_2){
					type = OnSelectShareItem.TYPE_MANAGE;
				}else if(v.getId() == R.id.btn_3){
					type = OnSelectShareItem.TYPE_UNINSTALL;
				}
				mOnSelectShareItem.onSelectShareItem(type, data);
			}
			dismiss();
		}
	};
	public void setData(PackageInfo data) {
		this.data = data;
		String appName = data.applicationInfo.loadLabel(this.getContext().getPackageManager())
		.toString();
		this.setTitle(String.format(this.getContext().getResources().getString(R.string.select_share_title),appName));
	}
	
	interface OnSelectShareItem{
		public static final int TYPE_APK = 1;
		public static final int TYPE_LINK = 2;
		public static final int TYPE_OPEN = 3;
		public static final int TYPE_MANAGE = 4;
		public static final int TYPE_UNINSTALL = 5;
		public void onSelectShareItem(int type,PackageInfo data);
	}
}
