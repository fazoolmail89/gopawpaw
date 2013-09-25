/*
 * 文  件   名： FoodTypeAdapter.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：[该类的简要描述]
 * 创  建   人： LiJinHua
 * 创建时间： 2013-1-16
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
/*
 * 文  件   名： FoodTypeAdapter.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：[该类的简要描述]
 * 创  建   人： LiJinHua
 * 创建时间： 2013-1-16
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
package im.device.smartdining.adapter;

import im.device.smartdining.JsonKey;
import im.device.smartdining.R;

import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;


/**
 * [功能简要说明]<BR>
 * [功能详细描述]
 * @author LiJinHua
 * @version [Android 1.0.0, 2013-1-16] 
 */
public class FoodTypeAdapter extends BaseAdapter {

	/**
	 * Log标签
	 */
	private static final String TAG = FoodTypeAdapter.class.getSimpleName();
	
	private LayoutInflater mLayoutInflater;
	
	private List<HashMap<String,Object>> mListData;
	
	public FoodTypeAdapter(Context context,List<HashMap<String,Object>> listData ) {
		super();
		
		mLayoutInflater = LayoutInflater.from(context);
		this.mListData = listData;
	}

	public void setData(List<HashMap<String,Object>> listData){
		this.mListData = listData;
	}
	
	@Override
	public int getCount() {
		if(mListData != null){
			return mListData.size();
		}
		return 0;
	}

	@Override
	public HashMap<String,Object> getItem(int position) {
		// TODO Auto-generated method stub
		if(mListData != null){
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
		ViewHolder holder = null;
		HashMap<String,Object> data=getItem(position);
		if(convertView==null || convertView.getTag()==null){
			holder = new ViewHolder();
			convertView = mLayoutInflater.inflate(R.layout.list_item_foodtype, null);
			holder.btnFoodType =(Button) convertView.findViewById(R.id.btn_foodtype);
			convertView.setTag(holder);
		}else{
			holder=(ViewHolder)convertView.getTag();
		}
		
		holder.btnFoodType.setText(""+data.get(JsonKey.NAME));
		
		return convertView;
	}
	
	class ViewHolder {
		private Button btnFoodType;
	}
	
	private OnClickListener mOnClickListener = new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			v.setSelected(true);
		}
		
	};
}

