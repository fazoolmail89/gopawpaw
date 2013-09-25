/*
 * 文  件   名： FoodAdapter.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：[该类的简要描述]
 * 创  建   人： LiJinHua
 * 创建时间： 2013-1-17
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
package im.device.smartdining.adapter;

import im.device.smartdining.JsonKey;
import im.device.smartdining.R;
import im.device.smartdining.widget.ExpandAnimation;

import java.util.HashMap;
import java.util.List;

import android.R.color;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gopawpaw.droidcore.http.download.image.ImageLoadAdapter;
import com.gopawpaw.droidcore.log.AppLog;
import com.gopawpaw.droidcore.utils.Tools;

/**
 * @author LiJinHua
 * @date 2013-1-17
 * @version [Android 1.0.0, 2013-1-17]
 * @description
 */
public class FoodAdapter extends ImageLoadAdapter implements
		OnCheckedChangeListener, OnClickListener,OnTouchListener {

	/**
	 * Log标签
	 */
	private static final String TAG = FoodAdapter.class.getSimpleName();

	/**
	 * 点餐数量key
	 */
	public static final String KEY_COUNT = "FOOD_KEY_COUNT";

	private LayoutInflater mLayoutInflater;

	private List<HashMap<String, Object>> mListData;

	/** 存放是否已经选中的项，以便重用HolderView时进行 **/
	private HashMap<Object, Boolean> mSelectMap = new HashMap<Object, Boolean>();

	private OnSelectedFoodChangedListener mOnSelectedFoodChangedListener;
	private OnClickFoodIconListener onClickFoodIconListener;
	private OnLongClickListener onLongClickListener;
	
	
	/**动画时间**/
	private static final int ANIMATION_TIME = 0;
	
	
	private ExpandAnimation mExpandAnimation;
	
	public FoodAdapter(Context context, List<HashMap<String, Object>> listData) {
		super();
		
		mExpandAnimation = new ExpandAnimation(ANIMATION_TIME);
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
					.inflate(R.layout.list_item_food, null);
			holder.icon = (ImageView) convertView.findViewById(R.id.img_icon);
			holder.name = (TextView) convertView.findViewById(R.id.tv_name);
			holder.price = (TextView) convertView.findViewById(R.id.tv_price);
			holder.checkbox = (CheckBox) convertView
					.findViewById(R.id.tv_check);
			holder.optioncount = (RelativeLayout) convertView
					.findViewById(R.id.rl_option_count);
			holder.count = (TextView) convertView.findViewById(R.id.tv_count);
			holder.minus = (Button) convertView.findViewById(R.id.btn_minus);
			holder.plus = (Button) convertView.findViewById(R.id.btn_plus);
			holder.llContent = (LinearLayout) convertView.findViewById(R.id.ll_content);
			holder.llItem = (LinearLayout) convertView.findViewById(R.id.ll_item_food);
			
			holder.checkbox.setOnCheckedChangeListener(this);
			holder.minus.setOnClickListener(this);
			holder.plus.setOnClickListener(this);
			holder.icon.setOnClickListener(this);
			holder.llContent.setOnClickListener(this);
			holder.llContent.setOnTouchListener(this);
			holder.llItem.setOnLongClickListener(onLongClickListener);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		convertView.setBackgroundColor(color.transparent);
		holder.id = data.get(JsonKey.ID);
		holder.position = position;
		holder.icon.setImageResource(R.drawable.icon_eatery_def_02);
		holder.icon.setTag(data.get(JsonKey.TIMG));
		updateBitmapUI(holder.icon);

		holder.name.setText("" + data.get(JsonKey.NAME));
		holder.price.setText("¥" + Tools.getStringAmountFormat(""+data.get(JsonKey.PRICE)));

		holder.icon.setTag(R.id.img_icon, holder);
		holder.checkbox.setTag(holder);
		holder.minus.setTag(holder);
		holder.plus.setTag(holder);
		holder.llContent.setTag(holder);
		
		
		// 初始化选中状态
		holder.checkbox.setOnCheckedChangeListener(null);
		if (isSelectedItem(holder.id)) {
			holder.checkbox.setChecked(true);
			((LinearLayout.LayoutParams) holder.optioncount.getLayoutParams()).bottomMargin = 0;
			holder.optioncount.setVisibility(View.VISIBLE);
			Integer count = (Integer) data.get(KEY_COUNT);
			if (count == null){
				count = 0;
				if(count <=1){
					holder.minus.setEnabled(false);
				}
			}
			holder.count.setText("" + count);
		} else {
			holder.checkbox.setChecked(false);
			holder.optioncount.setVisibility(View.GONE);
			holder.count.setText("0");
		}
		holder.checkbox.setOnCheckedChangeListener(this);
		return convertView;
	}

	class ViewHolder {
		private Object id;
		private int position;
		private ImageView icon;
		private TextView name;
		private TextView price;
		private CheckBox checkbox;
		private RelativeLayout optioncount;
		private TextView count;
		private Button minus;
		private Button plus;
		private LinearLayout llContent;
		private LinearLayout llItem;
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		AppLog.d(TAG, "onCheckedChanged buttonView=" + buttonView
				+ " isChecked=" + isChecked);
		ViewHolder holder = (ViewHolder) buttonView.getTag();
		HashMap<String, Object> data = getItem(holder.position);
		setSelectItem(holder.id, isChecked);
		if (isSelectedItem(holder.id)) {
			Integer count = (Integer) data.get(KEY_COUNT);
			if (count == null || count <= 0) {
				count = 1;
				holder.minus.setEnabled(false);
			}
			holder.count.setText("" + count);
			data.put(KEY_COUNT, count);
			((LinearLayout.LayoutParams) holder.optioncount.getLayoutParams()).bottomMargin = -89;
			holder.optioncount.setVisibility(View.VISIBLE);
//			// Creating the expand animation for the item
//			mExpandAnimation.setAnimatedView(holder.optioncount);
//			// Start the animation on the toolbar
//			holder.optioncount.startAnimation(mExpandAnimation);
			
			Message msg = new Message();
			msg.what = MSG_WHAT_EXPAND;
			msg.obj = holder.optioncount;
			indexExpand = 0;
			mAnimationHandler.sendMessageDelayed(msg, ANIMATION_TIME);
		} else {
			holder.count.setText("0");
			data.put(KEY_COUNT, 0);
			((LinearLayout.LayoutParams) holder.optioncount.getLayoutParams()).bottomMargin = 0;
//			// Creating the expand animation for the item
//			mExpandAnimation.setAnimatedView(holder.optioncount);
//			// Start the animation on the toolbar
//			holder.optioncount.startAnimation(mExpandAnimation);
			
			Message msg = new Message();
			msg.what = MSG_WHAT_STRICTION;
			msg.obj = holder.optioncount;
			indexStriction = 0;
			mAnimationHandler.sendMessageDelayed(msg, ANIMATION_TIME);
		}
		updateSelectCount();
	}

	/**
	 * 设置选择的项
	 * 
	 * @param id
	 * @param isChecked
	 */
	private void setSelectItem(Object id, boolean isChecked) {
		mSelectMap.put(id, isChecked);
	}

	/**
	 * 判断是否选中
	 * 
	 * @param id
	 * @return
	 */
	private boolean isSelectedItem(Object id) {
		Boolean b = mSelectMap.get(id);
		if (b == null) {
			return false;
		} else {
			return b;
		}
	}

	@Override
	public void onClick(View v) {
		ViewHolder holder = null;
		if(v instanceof ImageView){
			holder = (ViewHolder) v.getTag(R.id.img_icon);
		}else{
			holder = (ViewHolder) v.getTag();
		}
		
		HashMap<String, Object> data = getItem(holder.position);
		Integer count = (Integer) data.get(KEY_COUNT);
		AppLog.d(TAG, "onClick v=" + v + " count=" + count);
		switch (v.getId()) {
		case R.id.btn_minus:
			--count;
			if (count <= 1) {
				// 数量已经减少为1
				holder.minus.setEnabled(false);
			}
			holder.count.setText("" + count);
			data.put(KEY_COUNT, count);
			updateSelectCount();
			break;
		case R.id.btn_plus:
			++count;
			holder.minus.setEnabled(true);
			holder.count.setText("" + count);
			data.put(KEY_COUNT, count);
			updateSelectCount();
			break;
		case R.id.img_icon:
			String timg = ""+data.get(JsonKey.TIMG);
			String img = ""+data.get(JsonKey.IMG);
			if(onClickFoodIconListener != null){
				onClickFoodIconListener.OnClickFoodIcon(img, timg);
			}
			break;
		case R.id.ll_content:
			setSelectItem(holder.id, !isSelectedItem(holder.id));
			holder.checkbox.setOnCheckedChangeListener(null);
			if (isSelectedItem(holder.id)) {
				holder.checkbox.setChecked(true);
				Integer count2 = (Integer) data.get(KEY_COUNT);
				if (count2 == null || count2 <= 0) {
					count2 = 1;
					holder.minus.setEnabled(false);
				}
				holder.count.setText("" + count2);
				data.put(KEY_COUNT, count2);
				
				((LinearLayout.LayoutParams) holder.optioncount.getLayoutParams()).bottomMargin = -89;
				holder.optioncount.setVisibility(View.VISIBLE);
//				// Creating the expand animation for the item
//				mExpandAnimation.setAnimatedView(holder.optioncount);
//				// Start the animation on the toolbar
//				holder.optioncount.startAnimation(mExpandAnimation);
				
				Message msg = new Message();
				msg.what = MSG_WHAT_EXPAND;
				msg.obj = holder.optioncount;
				indexExpand = 0;
				mAnimationHandler.sendMessageDelayed(msg, ANIMATION_TIME);
			} else {
				holder.checkbox.setChecked(false);
				AppLog.d(TAG, "onclick holder.optioncount:"+holder.optioncount);
				holder.count.setText("0");
				data.put(KEY_COUNT, 0);
				((LinearLayout.LayoutParams) holder.optioncount.getLayoutParams()).bottomMargin = 0;
//				// Creating the expand animation for the item
//				mExpandAnimation.setAnimatedView(holder.optioncount);
//				// Start the animation on the toolbar
//				holder.optioncount.startAnimation(mExpandAnimation);
				
				Message msg = new Message();
				msg.what = MSG_WHAT_STRICTION;
				msg.obj = holder.optioncount;
				indexStriction = 0;
				mAnimationHandler.sendMessageDelayed(msg, ANIMATION_TIME);
			}
			holder.checkbox.setOnCheckedChangeListener(this);
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
		
		if(mOnSelectedFoodChangedListener != null){
			mOnSelectedFoodChangedListener.onSelectedFoodChanged();
		}
	}

	/**
	 * 点餐监听器
	 * 
	 * @author jinhua
	 * 
	 */
	public interface OnSelectedFoodChangedListener {
		void onSelectedFoodChanged();
	}
	public void setOnSelectedFoodChangedListener(
			OnSelectedFoodChangedListener onSelectedFoodChangedListener) {
		this.mOnSelectedFoodChangedListener = onSelectedFoodChangedListener;
	}

	public interface OnClickFoodIconListener{
		void OnClickFoodIcon(String img,String timg);
	}

	public void setOnClickFoodIconListener(
			OnClickFoodIconListener onClickFoodIconListener) {
		this.onClickFoodIconListener = onClickFoodIconListener;
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		ViewHolder holder = (ViewHolder) v.getTag();
		switch (event.getAction()) {
        	case MotionEvent.ACTION_DOWN:
        		holder.llItem.setBackgroundResource(R.drawable.bg_shadow_f2);
        		break;
        	default:
        		holder.llItem.setBackgroundColor(color.transparent);
            	break;
		}
		return false;
	}
	
	private static final int MSG_WHAT_EXPAND = 1;
	private static final int MSG_WHAT_STRICTION = 2;
	private int[] mBottomMarginExpand = new int[]{-80,-60,-30,-5,0};
	private int[] mBottomMarginStriction = new int[]{0,-30,-60,-80};
	private int indexExpand = 0;
	private int indexStriction = 0;
	private Handler mAnimationHandler = new Handler(){

		@Override
		public void handleMessage(Message msg) {
			// TODO Auto-generated method stub
			View view = (View)msg.obj;
			switch (msg.what) {
			case MSG_WHAT_EXPAND:
				view.setVisibility(View.VISIBLE);
				if(indexExpand<mBottomMarginExpand.length){					
					LayoutParams mViewLayoutParams = (LayoutParams) view.getLayoutParams();
					mViewLayoutParams.bottomMargin = mBottomMarginExpand[indexExpand];
					view.requestLayout();
					++indexExpand;
					Message msg2 = new Message();
					msg2.what = msg.what;
					msg2.obj = msg.obj;
					mAnimationHandler.sendMessageDelayed(msg2, ANIMATION_TIME);
				}
				break;
			case MSG_WHAT_STRICTION:
				if(indexStriction<mBottomMarginStriction.length){					
					LayoutParams mViewLayoutParams = (LayoutParams) view.getLayoutParams();
					mViewLayoutParams.bottomMargin = mBottomMarginStriction[indexStriction];
					view.requestLayout();
					++indexStriction;
					Message msg2 = new Message();
					msg2.what = msg.what;
					msg2.obj = msg.obj;
					mAnimationHandler.sendMessageDelayed(msg2, ANIMATION_TIME);
				}else{
					view.setVisibility(View.GONE);
				}
				break;
			default:
				break;
			}
		}
		
	};

	public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
		this.onLongClickListener = onLongClickListener;
	}
}
