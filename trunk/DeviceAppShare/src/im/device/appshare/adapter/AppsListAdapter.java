/**
 * @author EX-LIJINHUA001
 * @date 2013-4-8
 */
package im.device.appshare.adapter;

import im.device.appshare.R;

import java.util.List;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gopawpaw.droidcore.log.AppLog;

/**
 * @author EX-LIJINHUA001
 * @date 2013-4-8
 */
public class AppsListAdapter extends BaseAdapter {

	/**
	 * Log标签
	 */
	private static final String TAG = AppsListAdapter.class.getSimpleName();

	
	private LayoutInflater mLayoutInflater;

	private List<PackageInfo> mListData;
	
	private Context mContext;
	public AppsListAdapter(Context context,
			List<PackageInfo> listData) {
		super();
		this.mContext = context;
		mLayoutInflater = LayoutInflater.from(context);
		this.mListData = listData;
		
		AppLog.d(TAG, "mListData.size="+mListData.size());
	}

	public void setData(List<PackageInfo> listData) {
		this.mListData = listData;
	}

	@Override
	public int getCount() {
		if (mListData != null) {
			return mListData.size();
		}
		return 0;
	}

	@Override
	public PackageInfo getItem(int position) {
		// TODO Auto-generated method stub
		if (mListData != null) {
			return mListData.get(position);
		}
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		AppLog.d(TAG, "getView position="+position);
		ViewHolder holder = null;
		PackageInfo packageInfo = getItem(position);
		if (convertView == null || convertView.getTag() == null) {
			holder = new ViewHolder();
			convertView = mLayoutInflater.inflate(
					R.layout.list_item_app, null);
			holder.icon = (ImageView) convertView.findViewById(R.id.iv_icon);
			holder.appName = (TextView) convertView.findViewById(R.id.tv_name);
			holder.appPackage = (TextView) convertView.findViewById(R.id.tv_package);
			holder.versionName = (TextView) convertView.findViewById(R.id.tv_vname);
			holder.versionCode = (TextView) convertView.findViewById(R.id.tv_vcode);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		String appName = packageInfo.applicationInfo.loadLabel(
				mContext.getPackageManager()).toString();
		String packageName = packageInfo.packageName;
		String versionName = packageInfo.versionName;
		String versionCode = ""+packageInfo.versionCode;
		Drawable appIcon = packageInfo.applicationInfo
				.loadIcon(mContext.getPackageManager());
		
		holder.appName.setText(appName);
		holder.appPackage.setText(packageName);
		holder.versionName.setText("version : "+versionName);
		holder.versionCode.setText("version code : "+versionCode);
		holder.icon.setImageDrawable(appIcon);
		return convertView;
	}
	
	class ViewHolder {
		public ImageView icon;
		public TextView appName;
		public TextView appPackage;
		public TextView versionName;
		public TextView versionCode;
	}
}
