/**
 * 
 */
package com.gopawpaw.frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.gopawpaw.dev.common.GppDynamicJar;
import com.gopawpaw.frame.dataEntity.Dmnd_det;

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

	/**
	 * 
	 */
	public Modules() {
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
	public boolean actionModule(Dmnd_det dd) {
		boolean retb = false;
		this.dmnd_det = dd;

		if (dd == null) {
			actionModulesMessage = "����Ϊ��";
			return false;
		}
		if (!Authorization.canRun(dd)) {
			String tempmsg = "��û��Ȩ��ʹ�øù��ܣ�" + dd.getMnd_label();

			actionModulesMessage = tempmsg;
			return false;
		}
		// �����jar�ļ�
		if (isJarFile(dd.getMnd_exec())) {
			System.out.println("GppModule.actionModule() ִ��jar����:"
					+ dd.getMnd_exec());

			String tem = GlobalParameter.getProgramAbsolutePath()
					+ File.separator + dd.getMnd_exec();

			if (!actionJarProgram(tem)) {
				actionModulesMessage = "�Ҳ�������" + tem;

				retb = false;
			} else {
				retb = true;
			}
			return retb;
		}

		if (dd.isHaveChild()) {
			// �����¼��˵�
			System.out.println("GppModule.actionModule()-����˵���"
					+ dd.getMnd_exec());
			actionModulesMessage = "����˵�:" + dd.getMnd_exec();
			retb = true;
		} else {
			// ִ�г�������
			System.out.println("GppModule.actionModule()-ִ�г���"
					+ dd.getMnd_exec());
			actionModulesMessage = "ִ�г�������:" + dd.getMnd_exec();

		}

		return retb;
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
	private boolean actionJarProgram(String jarPath) {
		boolean retboo = false;
		GppDynamicJar gdj = new GppDynamicJar(GppDynamicJar.LOCAL, jarPath);
		if (gdj.isExistJarPack()) {
			String[] args = new String[2];
			try {
				args[0] = "MD5=" + getFileMD5(jarPath);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			args[1] = "MND=" + this.dmnd_det.getMnd_nbr() + "."
					+ this.dmnd_det.getMnd_select();
			retboo = gdj.runJar(args);
		} else {

			// String tempmsg = "�Ҳ�������" + jarPath;
			// JOptionPane.showConfirmDialog(null, tempmsg, "ϵͳ��ʾ",
			// JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}

		return retboo;
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