package im.device.smartdining.widget.animation;


import java.io.Serializable;

import android.content.Context;
import android.view.View.OnClickListener;

/**
 * 
 * [一句话功能简述]<BR>
 * [功能详细描述]
 * @author EX-XUJIAO001
 * @version [Android PABank C01, 2011-12-22]
 */
public class Shortcut implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * shortcut图片id
	 */
	private int icon;
	
	/**
	 * shortcut标题
	 */
	
	private String title;
	
	/**
	 * onclick监听
	 */
	private OnClickListener onShortcutClickListener;
	
	/**
	 * 可删除状态时的图片id
	 */
	private int deleteIcon;
	
	/**
	 * 
	 * [无参]
	 */
	public Shortcut() {
		
	}
	
	
	
	/**
	 * 
	 * [根据图片和标题构造]
	 * @param icon 图片id
	 * @param title 标题
	 */
	
	public Shortcut(int icon, String title) {
		this.icon = icon;
		this.title = title;
	}
	/**
	 * 
	 * [根据图片和标题和删除图片构造]
	 * @param icon 图片id
	 * @param title 标题
	 * @param deleteIcon 可删除状态id
	 */
	public Shortcut(int icon,String title,int deleteIcon) {
		this.icon = icon;
		this.title = title;
		this.deleteIcon = deleteIcon;
	}
	
	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述]getter
	 * @return 可删除状态id
	 */
	public int getDeleteIcon() {
		return deleteIcon;
	}

	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述]setter
	 * @param deleteIcon 可删除状态id
	 */

	public void setDeleteIcon(int deleteIcon) {
		this.deleteIcon = deleteIcon;
	}
	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述]getter
	 * @return 图片id
	 */
	public int getIcon() {
		return icon;
	}
	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述]setter
	 * @param icon 图片id
	 */
	public void setIcon(int icon) {
		this.icon = icon;
	}
	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述] getter
	 * @return shortcut标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述] setter
	 * @param title shortcut标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述]
	 * @param onShortcutClickListener onclick监听
	 */
	public void setOnShortcutClickListener(OnClickListener onShortcutClickListener) {
		this.onShortcutClickListener = onShortcutClickListener;
	}
	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述]
	 * @return OnClickListner
	 */
	public OnClickListener getOnShortcutClickListener() {
		return onShortcutClickListener;
	}

	/**
	 * 
	 * [一句话功能简述]<BR>
	 * [功能详细描述] 根据Shortcut对象创建ShortcutView对象
	 * @param context 上下文
	 * @return ShortcutView
	 */
	public ShortcutView createShortcutView(Context context) {
		ShortcutView shortcutView = new ShortcutView(context);
		shortcutView.setmShortcut(this);
		return  shortcutView;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shortcut other = (Shortcut) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	
	
}
