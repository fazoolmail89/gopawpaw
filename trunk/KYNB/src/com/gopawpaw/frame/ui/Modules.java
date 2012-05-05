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
 * @author �����
 * 
 */
public class Modules {

	private Dmnd_det dmnd_det = null;

	public static char[] hexChar = { '0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	/**
	 * ����ģ������Ϣ
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
	 * ִ�в˵�����
	 * 
	 * @param mitem
	 *            �˵���
	 * @return ִ�н��
	 */
	public void actionModule(Dmnd_det dd) {
		BaseJInternalFrame retb = null;
		this.dmnd_det = dd;

		if (dd == null) {
			actionModulesMessage = "����Ϊ��";
			
			//�ص�������
			modulesListener.onModulesAction(false, actionModulesMessage, null);
			return;
		}
		if (!Authorization.canRun(dd)) {
			String tempmsg = "��û��Ȩ��ʹ�øù��ܣ�" + dd.getMnd_label();

			actionModulesMessage = tempmsg;
			
			//�ص�������
			modulesListener.onModulesAction(false, actionModulesMessage, null);
			return;
		}
		// �����jar�ļ�
		if (isJarFile(dd.getMnd_exec())) {
			System.out.println("GppModule.actionModule() ִ��jar����:"
					+ dd.getMnd_exec());

			String tem = GlobalParameter.getProgramAbsolutePath()
					+ File.separator + dd.getMnd_exec();
			retb = actionJarProgram(tem);
			if (retb == null) {
				actionModulesMessage = "�Ҳ�������" + tem;
				//�ص�������
				modulesListener.onModulesAction(false, actionModulesMessage, null);
				return;
			}
		}

		if (dd.isHaveChild()) {
			// �����¼��˵�
			actionModulesMessage = "����˵�:" + dd.getMnd_exec();
			//�ص�������
			modulesListener.onModulesAction(true, actionModulesMessage, null);
			return;
		} else {
			// ִ�г�������
			actionModulesMessage = "ִ�г�������:" + dd.getMnd_exec();
			//�ص�������
			modulesListener.onModulesAction(true, actionModulesMessage, retb);
			return;
		}

	}

	/**
	 * ��ȡ���һ��ģ�����н����Ϣ
	 */
	public String getActionModuleMessage() {
		// String retstr = "";

		return actionModulesMessage;
	}

	/**
	 * �ж��Ƿ�Ϊ��ִ�е�jar�ļ�
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
	 * ����JAR����
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

			// String tempmsg = "�Ҳ�������" + jarPath;
			// JOptionPane.showConfirmDialog(null, tempmsg, "ϵͳ��ʾ",
			// JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}

		return frame;
	}

	/**
	 * ��ȡ�ļ�MD5ֵ
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
 * ģ�������
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