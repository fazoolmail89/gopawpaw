package im.device.smartdining.widget.animation;

import im.device.smartdining.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * 
 * [一句话功能简述]<BR>
 * [功能详细描述] 自定义的快捷方式
 * @author EX-XUJIAO001
 * @version [Android PABank C01, 2012-4-5]
 */
public class ShortcutView extends FrameLayout implements Cloneable {
	/**
	 * 上下文
	 */
	private Context context;
	/**
	 * 带叉的图片
	 */
	private ImageView shortcutDelelteImage;
	/**
	 * 带圈的图片
	 */
	private ImageView shortcutSelectorImage;
	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述] getter
	 * @return ImageView
	 */
	public ImageView getShortcutDelelteImage() {
		return shortcutDelelteImage;
	}
	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述] setter
	 * @param shortcutDelelteImage 带叉的图片
	 */
	public void setShortcutDelelteImage(ImageView shortcutDelelteImage) {
		this.shortcutDelelteImage = shortcutDelelteImage;
	}

	/**
	 * 
	 * [构造简要说明]
	 * 
	 * @param context
	 *            上下文
	 */
	public ShortcutView(Context context) {
		super(context);
		this.context = context;
	}

	/**
	 * 
	 * [构造简要说明]
	 * 
	 * @param context
	 *            上下文
	 * @param attrs
	 *            属性
	 */
	public ShortcutView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
	}

	/**
	 * 
	 * [构造简要说明]
	 * 
	 * @param context
	 *            上下文
	 * @param attrs
	 *            属性
	 * @param defStyle
	 *            int
	 */
	public ShortcutView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.context = context;
	}

	/**
	 * 拖动层
	 */
	private DragLayer mDragLayer;
	/**
	 * shorcutView中的shorcut实例
	 */
	private Shortcut mShortcut;
	/**
	 * 是否抖动
	 */
	private boolean isDock;

	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述] 判断快捷键是否抖动
	 * 
	 * @return boolean
	 */
	public boolean isDock() {
		return isDock;
	}

	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述] 设定是否抖动
	 * 
	 * @param isDock
	 *            抖动
	 */
	public void setDock(boolean isDock) {
		this.isDock = isDock;
	}

	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述] 设置快捷键
	 * 
	 * @param mShortcut
	 *            shortcut
	 */
	public void setmShortcut(Shortcut mShortcut) {
		this.mShortcut = mShortcut;
	}

	/**
	 * 在dock的那个快捷方式位置 0 表示没有在dock中 1 表示在快捷方式的第一个位置 2 表示在快捷方式的第二个位置 3
	 * 表示在快捷方式的第三个位置
	 */
	private int inWhichShortcut;


	@Override
	public ShortcutView clone() {
		ShortcutView shortcutView = new ShortcutView(getContext());
		shortcutView.setmShortcut(new Shortcut(mShortcut.getIcon(), mShortcut
				.getTitle()));
		shortcutView.setBackgroundResource(mShortcut.getIcon());
		// shortcutView.setShortcutDelelteImage(shortcutDelelteImage);
		addTouchEvent(shortcutView);
		return shortcutView;
	}

	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述] getter
	 * 
	 * @return DragLayer
	 */
	public DragLayer getmDragLayer() {
		return mDragLayer;
	}

	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [获取shortcut] getter
	 * 
	 * @return Shortcut
	 */
	public Shortcut getmShortcut() {
		return mShortcut;
	}

	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述] setter
	 * 
	 * @param mDragLayer
	 *            设置拖动层
	 */
	public void setmDragLayer(DragLayer mDragLayer) {
		this.mDragLayer = mDragLayer;
	}

	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [快捷键的位置] setter
	 * 
	 * @param inWichShortcut
	 *            设定快捷键在快捷键容器中的位置
	 */
	public void setInWhichShortcut(int inWichShortcut) {
		this.inWhichShortcut = inWichShortcut;
	}

	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述] getter
	 * 
	 * @return 0,1,2
	 */
	public int getInWhichShortcut() {
		return inWhichShortcut;
	}

	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述] 初始化操作，设置单击，长按事件
	 */
	public void init() {

		ImageView shortcutImage = new ImageView(context);
		shortcutImage.setBackgroundResource(mShortcut.getIcon());
		addView(shortcutImage);

		shortcutDelelteImage = new ImageView(context);
		shortcutDelelteImage.setBackgroundResource(R.drawable.icon_delete_page);
		// setFocusable(true);
		// setFocusableInTouchMode(true);
		// setClickable(false);

		setOnClickListener(mShortcut.getOnShortcutClickListener());

		setOnLongClickListener(new OnLongClickListener() {
			public boolean onLongClick(View v) {
				if (shortcutSelectorImage != null) {
					removeView(shortcutSelectorImage);
				}
				mDragLayer.startDrag(ShortcutView.this, null, null,
						DragController.DRAG_ACTION_COPY);
				return true;
			}
		});

		addTouchEvent(this);

	}
	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述]
	 * @param shortcutView 自定义的快捷方式
	 */
	public void addTouchEvent(final ShortcutView shortcutView) {
		shortcutView.setOnTouchListener(new View.OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {

				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					if (shortcutSelectorImage == null) {
						shortcutSelectorImage = new ImageView(context);
						shortcutSelectorImage
						.setBackgroundResource(R.drawable.icon_selected_page);
					}
					shortcutView.addView(shortcutSelectorImage);
					break;
				case MotionEvent.ACTION_UP:
					shortcutView.removeView(shortcutSelectorImage);
					break;
				default:
					break;
				}
				return false;
			}
		});
	}

}
