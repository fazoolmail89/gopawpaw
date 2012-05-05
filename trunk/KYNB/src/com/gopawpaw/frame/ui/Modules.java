/**
 * 
 */
package com.gopawpaw.frame.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.database.Dmnd_det;
import com.gopawpaw.frame.utils.GppDynamicJar;
import com.gopawpaw.frame.widget.BaseJInternalFrame;

/**
 * @version 2010-6-7
 * @author 李锦华
 * 
 */
public class Modules {

	private Dmnd_det dmnd_det = null;

	public static char[] hexChar = { '0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	/**
	 * 运行模块结果信息
	 */
	private String actionModulesMessage = "";

	private ModulesListener modulesListener;
	/**
	 * 
	 */
	public Modules(ModulesListener modulesListener) {
		
		this.modulesListener = modulesListener;
		initialize();
	}

	private void initialize() {

	}

	/**
	 * 执行菜单命令
	 * 
	 * @param mitem
	 *            菜单项
	 * @return 执行结果
	 */
	public void actionModule(Dmnd_det dd) {
		BaseJInternalFrame retb = null;
		this.dmnd_det = dd;

		if (dd == null) {
			actionModulesMessage = "参数为空";
			
			//回调监听器
			modulesListener.onModulesAction(false, actionModulesMessage, null);
			return;
		}
		if (!Authorization.canRun(dd)) {
			String tempmsg = "您没有权限使用该功能：" + dd.getMnd_label();

			actionModulesMessage = tempmsg;
			
			//回调监听器
			modulesListener.onModulesAction(false, actionModulesMessage, null);
			return;
		}
		// 如果是jar文件
		if (isJarFile(dd.getMnd_exec())) {
			System.out.println("GppModule.actionModule() 执行jar程序:"
					+ dd.getMnd_exec());

			String tem = GlobalParameter.getProgramAbsolutePath()
					+ File.separator + dd.getMnd_exec();
			retb = actionJarProgram(tem);
			if (retb == null) {
				actionModulesMessage = "找不到程序：" + tem;
				//回调监听器
				modulesListener.onModulesAction(false, actionModulesMessage, null);
				return;
			}
		}

		if (dd.isHaveChild()) {
			// 进入下级菜单
			actionModulesMessage = "进入菜单:" + dd.getMnd_exec();
			//回调监听器
			modulesListener.onModulesAction(true, actionModulesMessage, null);
			return;
		} else {
			// 执行程序命令
			actionModulesMessage = "执行程序命令:" + dd.getMnd_exec();
			//回调监听器
			modulesListener.onModulesAction(true, actionModulesMessage, retb);
			return;
		}

	}

	/**
	 * 获取最近一次模块运行结果信息
	 */
	public String getActionModuleMessage() {
		// String retstr = "";

		return actionModulesMessage;
	}

	/**
	 * 判断是否为可执行的jar文件
	 */
	public static boolean isJarFile(String mnd_exec) {
		boolean retb = false;

		if (mnd_exec == null) {
			return false;
		}
		String[] arrmitem = mnd_exec.split("\\.");
		if (arrmitem[arrmitem.length - 1].equals("jar")
				|| arrmitem[arrmitem.length - 1].equals("p")
				|| arrmitem[arrmitem.length - 1].equals("r")) {
			retb = true;
		} else {
			retb = false;
		}

		return retb;
	}

	/**
	 * 运行JAR程序
	 */
	private BaseJInternalFrame actionJarProgram(String jarPath) {
		BaseJInternalFrame frame = null;
		GppDynamicJar gdj = new GppDynamicJar(GppDynamicJar.LOCAL, jarPath);
		if (gdj.isExistJarPack()) {
			String[] args = new String[2];
			try {
				args[0] = "MD5=" + getFileMD5(jarPath);
				
				Class<?> c = gdj.getMainClass();
				if(c != null){
					Object obj = c.newInstance();
					if(obj instanceof BaseJInternalFrame){
						frame = (BaseJInternalFrame)obj;
					}
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			// String tempmsg = "找不到程序：" + jarPath;
			// JOptionPane.showConfirmDialog(null, tempmsg, "系统提示",
			// JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}

		return frame;
	}

	/**
	 * 获取文件MD5值
	 */
	public static String getFileMD5(String filepath) throws Exception {
		InputStream fis;
		fis = new FileInputStream(filepath);
		byte[] buffer = new byte[1024];
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		int numRead = 0;
		while ((numRead = fis.read(buffer)) > 0) {
			md5.update(buffer, 0, numRead);
		}
		fis.close();

		return toHexString(md5.digest());
	}

	public static String toHexString(byte[] b) {
		StringBuilder sb = new StringBuilder(b.length * 2);
		for (int i = 0; i < b.length; i++) {
			sb.append(hexChar[(b[i] & 0xf0) >>> 4]);
			sb.append(hexChar[b[i] & 0x0f]);
		}
		return sb.toString();
	}

}

/**
 * 模块监听器
 * @version 2012-5-3
 * @author LiJinHua
 */
interface ModulesListener{
	/**
	 * 
	 * @version 2012-5-3
	 * @author LiJinHua
	 * @param
	 * @return void
	 */
	public void onModulesAction(boolean actionState,String errMsg,BaseJInternalFrame baseJInternalFrame);
}