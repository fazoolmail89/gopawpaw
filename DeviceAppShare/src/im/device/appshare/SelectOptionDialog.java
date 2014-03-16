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
 * @author EX-LIJINHUA001
 * @date 2013-4-17
 */
public class SelectOptionDialog extends BaseDialog {

	private View contentView;
	private Button mBtnOpen;
	private Button mBtnManage;
	private Button mBtnUninstall;
	
	private PackageInfo data;
	private OnSelectOptionItem mOnSelectOptionItem;
	public SelectOptionDialog(Context context,OnSelectOptionItem onSelectOptionItem) {
		super(context);
		contentView = LayoutInflater.from(getContext()).inflate(
				R.layout.dialog_select_option, null);
		mBtnOpen = (Button) contentView.findViewById(R.id.btn_1);
		mBtnManage = (Button) contentView.findViewById(R.id.btn_2);
		mBtnUninstall = (Button) contentView.findViewById(R.id.btn_3);
		
		mOnSelectOptionItem = onSelectOptionItem;
		
		this.setTitle(R.string.select_option_title);
		this.btn1.setVisibility(View.GONE);
		this.btn2.setVisibility(View.GONE);
		this.btn3.setVisibility(View.GONE);
		
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
			if(mOnSelectOptionItem != null){
				int type = OnSelectOptionItem.TYPE_OPEN;
				if(v.getId() == R.id.btn_1){
					type = OnSelectOptionItem.TYPE_OPEN;
				}else if(v.getId() == R.id.btn_2){
					type = OnSelectOptionItem.TYPE_MANAGE;
				}else if(v.getId() == R.id.btn_3){
					type = OnSelectOptionItem.TYPE_UNINSTALL;
				}
				mOnSelectOptionItem.onSelectOptionItem(type, data);
			}
			dismiss();
		}
	};
	public void setData(PackageInfo data) {
		this.data = data;
		String appName = data.applicationInfo.loadLabel(this.getContext().getPackageManager())
		.toString();
		this.setTitle(String.format(this.getContext().getResources().getString(R.string.select_option_title),appName));
	}
	
	interface OnSelectOptionItem{
		public static final int TYPE_OPEN = 1;
		public static final int TYPE_MANAGE = 2;
		public static final int TYPE_UNINSTALL = 3;
		public void onSelectOptionItem(int type,PackageInfo data);
	}
}
