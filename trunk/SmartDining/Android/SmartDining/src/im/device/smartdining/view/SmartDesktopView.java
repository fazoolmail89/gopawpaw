/**
 * @author EX-LIJINHUA001
 * @date 2013-6-24
 */
package im.device.smartdining.view;

import im.device.smartdining.JsonKey;
import im.device.smartdining.R;
import im.device.smartdining.adapter.FoodAdapter;
import im.device.smartdining.adapter.FoodAdapter.OnClickFoodIconListener;
import im.device.smartdining.adapter.FoodAdapter.OnSelectedFoodChangedListener;
import im.device.smartdining.db.FoodDao;
import im.device.smartdining.db.FoodTypeDao;

import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.Toast;

import com.gopawpaw.droidcore.log.AppLog;

/**
 * 智能桌面布局
 * @author EX-LIJINHUA001
 * @date 2013-6-24
 */
public class SmartDesktopView extends LinearLayout implements TabHost.TabContentFactory,OnSelectedFoodChangedListener,OnClickListener{
	
	protected static final String TAG = SmartDesktopView.class.getSimpleName();
	
	/**
	 * 正面
	 */
	public static final int DESKTOP_FRONT = 0;
	
	/**
	 * 反面
	 */
	public static final int DESKTOP_OPPOSITE = 1;
	
	/**
	 * 桌面类型
	 */
	private int desktopType = DESKTOP_FRONT;
	
	private Context mContext;
	
	private TabHost mTabHost;
	
	/**
	 * 菜单分类
	 */
	private List<HashMap<String, Object>> mFoodTypeListData;
	
	/**
	 * 菜单数据
	 */
	private HashMap<String,List<HashMap<String, Object>>> mMapListDataFood = new HashMap<String,List<HashMap<String, Object>>>();
	
	/**
	 * FoodAdapter列表映射
	 */
	private HashMap<String,FoodAdapter> mMapFoodAdapter = new HashMap<String,FoodAdapter>();
	
	private FoodDao mFoodDao;
	
	private int mEateryId = 4;
	
	/**
	 * 长按拖动View监听器
	 */
	private OnLongClickListener dragViewOnLongClickListener;
	
	private OnClickListener onClickListener;
	
	private Button btn_top_fenlei,btn_top_jinrizhuda,btn_top_zhaopai,btn_top_jingdiantaocan,btn_top_zhekou,btn_top_fengwei,btn_top_tuijian;
	
	/**
	 * @param context
	 */
	public SmartDesktopView(Context context) {
		super(context);
		mContext = context;
		init();
	}

	/**
	 * 
	 * @param context
	 * @param dragViewOnLongClickListener
	 */
	public SmartDesktopView(Context context,OnLongClickListener dragViewOnLongClickListener,OnClickListener onClickListener ) {
		super(context);
		mContext = context;
		this.dragViewOnLongClickListener = dragViewOnLongClickListener;
		this.onClickListener = onClickListener;
		init();
	}
	
	/**
	 * 
	 * @param context
	 * @param dragViewOnLongClickListener
	 * @param desktopType
	 */
	public SmartDesktopView(Context context,OnLongClickListener dragViewOnLongClickListener,OnClickListener onClickListener,int desktopType) {
		super(context);
		mContext = context;
		this.dragViewOnLongClickListener = dragViewOnLongClickListener;
		this.onClickListener = onClickListener;
		this.desktopType = desktopType;
		init();
	}
	
	/**
	 * @param context
	 * @param attrs
	 */
	public SmartDesktopView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mContext = context;
		init();
	}

	/**
	 * @param context
	 * @param attrs
	 * @param defStyle
	 */
	public SmartDesktopView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		mContext = context;
		init();
		
	}

	
	private Integer[] mps = {
	        R.drawable.icon,
	        R.drawable.icon,
	        R.drawable.icon,
	        R.drawable.icon,
	        R.drawable.icon,
	        R.drawable.icon
	};
	
//	public class ImageAdapter extends BaseAdapter {
//		private Context mContext;
//			public ImageAdapter(Context context) {
//			mContext = context;
//		}
//
//		public int getCount() { 
//			return mps.length;
//		}
//
//		public Object getItem(int position) {
//			return position;
//		}
//
//		public long getItemId(int position) {
//			return position;
//		}
//
//		public View getView(int position, View convertView, ViewGroup parent) {
//			ImageView image = new ImageView(mContext);
//			image.setImageResource(mps[position]);
//			image.setAdjustViewBounds(true);
//			image.setLayoutParams(new Gallery.LayoutParams(
//				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
//			return image;
//		}
//	}
	
	private void init(){
		LayoutInflater inflater = LayoutInflater.from(mContext);
		LinearLayout view = (LinearLayout) inflater.inflate(R.layout.view_smartdesktop, null);
		addView(view);
		
		btn_top_fenlei = (Button) view.findViewById(R.id.btn_top_fenlei);
		btn_top_jingdiantaocan = (Button) view.findViewById(R.id.btn_top_jingdiantaocan);
		btn_top_jinrizhuda = (Button) view.findViewById(R.id.btn_top_jinrizhuda);
		btn_top_zhaopai = (Button) view.findViewById(R.id.btn_top_zhaopai);
		btn_top_zhekou = (Button) view.findViewById(R.id.btn_top_zhekou);
		btn_top_fengwei = (Button) view.findViewById(R.id.btn_top_fengwei);
		btn_top_tuijian = (Button) view.findViewById(R.id.btn_top_tuijian);
		
		btn_top_fenlei.setOnClickListener(this);
		btn_top_jingdiantaocan.setOnClickListener(this);
		btn_top_jinrizhuda.setOnClickListener(this);
		btn_top_zhaopai.setOnClickListener(this);
		btn_top_zhekou.setOnClickListener(this);
		btn_top_fengwei.setOnClickListener(this);
		btn_top_tuijian.setOnClickListener(this);
		
		TextView ivIcon = (TextView) view.findViewById(R.id.tv_icon);
		ivIcon.setOnLongClickListener(dragViewOnLongClickListener);
		ivIcon.setTag(desktopType);
		
		mTabHost = (TabHost) view.findViewById(R.id.tabhost);
		mTabHost.setup();
		mTabHost.getTabWidget().setOrientation(TabWidget.VERTICAL);
		
		FoodTypeDao ftDao = new FoodTypeDao(mContext);
		mFoodTypeListData = ftDao.getFoodTypeByEateryId(mEateryId);
		mFoodDao = new FoodDao(mContext);
		mMapListDataFood = mFoodDao.getAllFood(""+mEateryId);
		
		updateFoodType();
		
//		Gallery gallery = (Gallery) findViewById(R.id.gallery);
		
		
		ImageAdapter adapter = new ImageAdapter(mContext, mps);
        adapter.createReflectedImages();//创建倒影效果
        GalleryFlow galleryFlow = (GalleryFlow) this.findViewById(R.id.gallery);
        galleryFlow.setFadingEdgeLength(0);
        galleryFlow.setSpacing(-100); //图片之间的间距
        galleryFlow.setAdapter(adapter);
        
        galleryFlow.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) {
                Toast.makeText(mContext, String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });
        galleryFlow.setSelection(4);
        
        view.findViewById(R.id.btn_change_screem).setOnClickListener(onClickListener);
	}
	
	/**
	 * 更新菜式类型
	 */
	private void updateFoodType(){
		if(mFoodTypeListData == null){
			return;
		}
		mTabHost.clearAllTabs();
        for (HashMap<String, Object> data :mFoodTypeListData) {
            String id = (String) data.get(JsonKey.ID);
            String name = (String) data.get(JsonKey.NAME);
            mTabHost.addTab(mTabHost.newTabSpec(id).setIndicator(createIndicatorView(name))
            		.setContent(this));
        }
	}
	
	/**
	 * 
	 * @param title
	 * @return
	 */
	private View createIndicatorView(String title){
		
		LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View tabIndicator = inflater.inflate(R.layout.tab_indicator_horizontal, mTabHost.getTabWidget(),false);
		
		Button titleView = (Button)tabIndicator.findViewById(R.id.title);
		titleView.setText(title);
		
		return tabIndicator;
		
	}

	@Override
	public View createTabContent(String typeId) {
		// TODO Auto-generated method stub
		AppLog.d(TAG, "createTabContent tag="+typeId);
		LayoutInflater layoutInflater = LayoutInflater.from(mContext);
		ListView lv = (ListView) layoutInflater.inflate(
				R.layout.list_foods, null);
//		ListView lv = new ListView(this);
//		LayoutParams lp = new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT);
//		lv.setLayoutParams(lp);
//		lv.setCacheColorHint(0);
//		lv.setDivider(getResources().getDrawable(R.drawable.food_list_split));
//		lv.setSelector(R.drawable.selector_bg_shadow);
		
		List<HashMap<String, Object>> d = mMapListDataFood.get(typeId);
		FoodAdapter foodAdapter = mMapFoodAdapter.get(typeId);
		if(foodAdapter == null){
			//为tag首次创建FoodAdapter
			foodAdapter = new FoodAdapter(mContext, null);
			foodAdapter.setOnSelectedFoodChangedListener(this);
			foodAdapter.setOnClickFoodIconListener(onClickFoodIconListener);
			foodAdapter.setOnLongClickListener(mOnLongClickListener);
			mMapFoodAdapter.put(typeId, foodAdapter);
		}
		lv.setAdapter(foodAdapter);
//		lv.setOnItemClickListener(mOnItemClickListener);
//		lv.setOnClickListener(mClickListener);
//		lv.setOnLongClickListener(mOnLongClickListener);
		
		if(d == null){
			//菜单还未加载,则先从本地获取数据显示，后发送请求加载新数据
			List<HashMap<String, Object>> listD = mFoodDao.getAllFood(""+mEateryId, typeId);
			foodAdapter.setData(listD);
			mMapListDataFood.put(typeId, listD);
//			if(!isNetworkData(typeId) && CommonUtils.isNetworkAvailable(this)){
//				//未加载，并且网络可用时，发送请求
//				requestFoodByTypeId(typeId);
//			}
		}else{
			foodAdapter.setData(d);
		}
		
		return lv;
	}

	@Override
	public void onSelectedFoodChanged() {
//		updateSelectCount();
	}
	
	/**
	 * 更新选中d数量和价钱，并回调接口
	 */
//	private void updateSelectCount() {
//		mFoodlistSelected.clear();
//		mSelectedFoodId = "";
//		// 总价钱
//		float sum = 0f;
//		// 总数量
//		int counts = 0;
//		Iterator<String> it = mMapListDataFood.keySet().iterator();
//		while(it.hasNext()){
//			List<HashMap<String, Object>> listData = mMapListDataFood.get(it.next());
//			if(listData == null || listData.size() == 0){
//				continue;
//			}
//			for (HashMap<String, Object> data : listData) {
//				Integer count = (Integer) data.get(FoodAdapter.KEY_COUNT);
//				String priceStr = (String) data.get(JsonKey.PRICE);
//				if(count==null){
//					count = 0;
//				}
//				if(priceStr == null){
//					priceStr = "0";
//				}
//				try {
//					float price = Float.parseFloat(priceStr);
//					sum += price * count;
//					counts += count;
//					
//					if(count != null && count != 0){
//						//保存选中
//						mFoodlistSelected.add(data);
//						for(int i =0;i<count;i++){
//							if("".equals(mSelectedFoodId)){
//								mSelectedFoodId = ""+data.get(JsonKey.ID);
//							}else{
//								mSelectedFoodId = mSelectedFoodId+","+data.get(JsonKey.ID);
//							}
//						}
//					}
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				
//			}
//		}
//
//		mPriceSelected = sum;
//		mCountSelected = counts;
//		AppLog.d(TAG, "updateSelectCount counts="+counts+" price="+sum);
//		mTvOptionCount.setText(String.format(getResources().getString(R.string.food_option_count), ""+counts));
//		mTvOptionAmount.setText(String.format(getResources().getString(R.string.food_option_amount), ""+Tools.getStringAmountFormat(""+sum)));
//	
//	}
	
	private OnClickFoodIconListener onClickFoodIconListener = new OnClickFoodIconListener(){

		@Override
		public void OnClickFoodIcon(String img, String timg) {
			// TODO Auto-generated method stub
//			showBigImage(timg,img);
			AppLog.d(TAG, "OnClickFoodIcon="+timg);
		}
		
	};
	
	private OnItemClickListener mOnItemClickListener = new OnItemClickListener(){

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			AppLog.d(TAG, "parent="+parent);
		}
		
	};
	
	private android.view.View.OnLongClickListener
	mOnLongClickListener = new android.view.View.OnLongClickListener(){

		@Override
		public boolean onLongClick(View v) {
			AppLog.d(TAG, "onLongClick="+v);
			if(dragViewOnLongClickListener != null){
				v.setTag(desktopType);
				dragViewOnLongClickListener.onLongClick(v);
			}
			return false;
		}
		
	};

	public int getDesktopType() {
		return desktopType;
	}

	private int[] desktopIds = new int[]{R.id.layout_desktop_tuijian,
			R.id.layout_destktop_fenlei,
			R.id.layout_desktop_jingdantaocan,
			R.id.layout_desktop_jinrizhuda,
			R.id.layout_desktop_zhaopai,
			R.id.layout_desktop_zhekou,
			R.id.layout_desktop_fengwei};
	
	/**
	 * 显示指定的desktop
	 * @author LiJinHua
	 * @modify 2013-11-2  下午2:22:02
	 * @param desktopId
	 */
	private void showDesktop(int desktopId){
		for(int id :desktopIds){
			if(id != desktopId){
				this.findViewById(id).setVisibility(View.GONE);
			}else{
				this.findViewById(id).setVisibility(View.VISIBLE);
			}
		}
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_top_tuijian:
			showDesktop(R.id.layout_desktop_tuijian);
			break;
		case R.id.btn_top_fenlei:
			showDesktop(R.id.layout_destktop_fenlei);
			break;
		case R.id.btn_top_jingdiantaocan:
			showDesktop(R.id.layout_desktop_jingdantaocan);
			break;
		case R.id.btn_top_jinrizhuda:
			showDesktop(R.id.layout_desktop_jinrizhuda);
			break;
		case R.id.btn_top_zhaopai:
			showDesktop(R.id.layout_desktop_zhaopai);
			break;
		case R.id.btn_top_zhekou:
			showDesktop(R.id.layout_desktop_zhekou);
			break;
		case R.id.btn_top_fengwei:
			showDesktop(R.id.layout_desktop_fengwei);
			break;
		default:
			break;
		}
		
	}
}
