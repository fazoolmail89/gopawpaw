/**
 * 
 */
package im.device.smartdining.adapter;

import im.device.smartdining.JsonKey;
import im.device.smartdining.R;

import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.gopawpaw.droidcore.log.AppLog;
import com.gopawpaw.droidcore.utils.Tools;

/**
 * 选中的套餐适配器
 * 
 * @author jinhua
 * 
 */
public class FoodSelectedAdapter extends BaseAdapter implements
		 OnClickListener {

	/**
	 * Log标签
	 */
	private static final String TAG = FoodSelectedAdapter.class.getSimpleName();

	/**
	 * 点餐数量key
	 */
	public static final String KEY_COUNT = FoodAdapter.KEY_COUNT;

	private LayoutInflater mLayoutInflater;

	private List<HashMap<String, Object>> mListData;
	
	private OnSelectedFoodChangedListener mOnSelectedFoodChangedListener;
	
	private String mSelectedFoodId = "";
	
	public FoodSelectedAdapter(Context context, List<HashMap<String, Object>> listData) {
		super();

		mLayoutInflater = LayoutInflater.from(context);
		this.mListData = listData;
	}

	public void setData(List<HashMap<String, Object>> listData) {
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
	public HashMap<String, Object> getItem(int position) {
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
		ViewHolder holder = null;
		HashMap<String, Object> data = getItem(position);
		if (convertView == null || convertView.getTag() == null) {
			holder = new ViewHolder();
			convertView = mLayoutInflater
					.inflate(R.layout.list_item_food_selected, null);
			holder.name = (TextView) convertView.findViewById(R.id.tv_name);
			holder.price = (TextView) convertView.findViewById(R.id.tv_price);
			holder.count = (TextView) convertView.findViewById(R.id.tv_count);
			holder.minus = (Button) convertView.findViewById(R.id.btn_minus);
			holder.plus = (Button) convertView.findViewById(R.id.btn_plus);

			holder.minus.setOnClickListener(this);
			holder.plus.setOnClickListener(this);

			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		holder.position = position;
		String name = "  "+data.get(JsonKey.NAME)+ "  ";
		holder.name.setText(name);
		holder.price.setText("¥" + Tools.getStringAmountFormat(""+data.get(JsonKey.PRICE)));

		holder.minus.setTag(holder);
		holder.plus.setTag(holder);

		Integer count = (Integer) data.get(KEY_COUNT);
		// 初始化选中状态
		holder.count.setText("" + count);
		
		if (count <= 0) {
			// 数量已经减少为0
			holder.minus.setEnabled(false);
			
			SpannableString ss = new SpannableString(name);   
	        ss.setSpan(new StrikethroughSpan(), 0, name.length(),
	                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); 
	        holder.name.setText(ss);
		}else{
			holder.minus.setEnabled(true);
		}
	
		return convertView;
	}

	class ViewHolder {
		private int position;
		private TextView name;
		private TextView price;
		private TextView count;
		private Button minus;
		private Button plus;
	}
	

	@Override
	public void onClick(View v) {
		ViewHolder holder = (ViewHolder) v.getTag();
		HashMap<String, Object> data = getItem(holder.position);
		Integer count = (Integer) data.get(KEY_COUNT);
		AppLog.d(TAG, "onClick v=" + v + " count=" + count);
		switch (v.getId()) {
		case R.id.btn_minus:
			--count;
			if (count <= 0) {
				// 数量已经减少为0
				holder.minus.setEnabled(false);
			}
			holder.count.setText("" + count);
			data.put(KEY_COUNT, count);
			String name = holder.name.getText().toString();
			SpannableString ss = new SpannableString(name);   
	        ss.setSpan(new StrikethroughSpan(), 0, name.length(),
	                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); 
	        holder.name.setText(ss);
			updateSelectCount();
			break;
		case R.id.btn_plus:
			++count;
			holder.minus.setEnabled(true);
			holder.count.setText("" + count);
			data.put(KEY_COUNT, count);
			String name2 = holder.name.getText().toString();
	        holder.name.setText(name2);
			updateSelectCount();
			break;
		default:
			break;
		}
	}

	/**
	 * 更新选中d数量和价钱，并回调接口
	 */
	private void updateSelectCount() {
		if (mListData == null) {
			return;
		}
		mSelectedFoodId = "";
		// 总价钱
		float sum = 0f;
		// 总数量
		int counts = 0;
				
		for (HashMap<String, Object> data : mListData) {
			Integer count = (Integer) data.get(KEY_COUNT);
			String priceStr = (String) data.get(JsonKey.PRICE);
			try {
				float price = Float.parseFloat(priceStr);
				sum += price * count;
				counts += count;
				for(int i =0;i<count;i++){
					if("".equals(mSelectedFoodId)){
						mSelectedFoodId = ""+data.get(JsonKey.ID);
					}else{
						mSelectedFoodId = mSelectedFoodId+","+data.get(JsonKey.ID);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(mOnSelectedFoodChangedListener != null){
			mOnSelectedFoodChangedListener.onSelectedFoodChanged(sum,counts,mSelectedFoodId);
		}
	}

	/**
	 * 点餐监听器
	 * 
	 * @author jinhua
	 * 
	 */
	public interface OnSelectedFoodChangedListener {
		void onSelectedFoodChanged(float price,int counts,String foodsId);
	}
	
	public void setOnSelectedFoodChangedListener(
			OnSelectedFoodChangedListener onSelectedFoodChangedListener) {
		this.mOnSelectedFoodChangedListener = onSelectedFoodChangedListener;
	}

}
