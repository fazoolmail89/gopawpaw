/**
 * 
 */
package com.gopawpaw.erp.common;

import java.awt.Component;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;


import com.gopawpaw.dev.common.GppComponentAuthorizationControlInterface;
import com.gopawpaw.erp.GlobalParameter;
import com.gopawpaw.erp.dataEntity.mfg.GppPcaDet;
import com.gopawpaw.erp.dataEntity.mfg.GppProDet;
import com.gopawpaw.erp.dataEntity.mfg.GppProMstr;
import com.gopawpaw.erp.hibernate.p.PcaDet;
import com.gopawpaw.erp.hibernate.p.PcaDetId;
import com.gopawpaw.erp.hibernate.p.ProDet;
import com.gopawpaw.erp.hibernate.p.ProMstr;
import com.gopawpaw.erp.hibernate.p.ProMstrId;
import com.gopawpaw.javax.swing.GppJFrame;

import java.awt.Dimension;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 * This code was edited or generated using CloudGarden's Jigloo
 * SWT/Swing GUI Builder, which is free for non-commercial
 * use. If Jigloo is being used commercially (ie, by a corporation,
 * company or business for any purpose whatever) then you
 * should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details.
 * Use of Jigloo implies acceptance of these licensing terms.
 * A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
 * THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
 * LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
/**
 * @version 2010-6-15
 * @author �����
 * 
 */
public class BaseFrame extends GppJFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5274413356887481683L;

	DefaultMutableTreeNode componentRoot = null;

	DefaultTreeModel componentTreeModel = null;

	String[] args = null;

	String is_MD5 = null;

	String is_MND = null;

	private boolean is_isNeedUpdate = true;

	/**
	 * @throws HeadlessException
	 */
	public BaseFrame() throws HeadlessException {
		initialize();
	}

	/**
	 * ����Ȩ�޿��ƹ��췽��
	 * 
	 * @param args
	 * @throws HeadlessException
	 */
	public BaseFrame(String[] args) throws HeadlessException {
		this.args = args;
		initialize();

	}

	/**
	 * @param gc
	 */
	public BaseFrame(GraphicsConfiguration gc) {
		super(gc);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public BaseFrame(String title) throws HeadlessException {
		super(title);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @param gc
	 */
	public BaseFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
		this.setSize(new Dimension(735, 229));
		this.setTitle("����ģ��ά�����");
		// ����Ȩ����
		if (args != null) {
			for (int i = 0; i < args.length; i++) {

				if (args[i] == null) {
					continue;
				}

				String temkey = getStringKey(args[i]);
				if (temkey == null) {
					continue;
				}

				if (temkey.equals("MD5")) {
					this.is_MD5 = getStringValues(args[i]);
				} else if (temkey.equals("MND")) {
					this.is_MND = getStringValues(args[i]);
				}
			}
		}
	}

	/**
	 * ���ַ����л�ȡ����
	 */
	private String getStringKey(String keyandvalues) {
		if (keyandvalues == null) {
			return null;
		}

		String[] ls_arr = keyandvalues.split("=");

		if (ls_arr.length > 1) {
			return ls_arr[0];
		} else {
			return null;
		}

	}

	/**
	 * ���ַ����л�ȡֵ
	 */
	private String getStringValues(String keyandvalues) {
		String[] ls_arr = keyandvalues.split("=");

		if (ls_arr.length > 1) {
			return ls_arr[1];
		}
		return null;
	}

	/**
	 * ִ����Ȩ��Ϣ
	 */
	public void actionAuthorization() {

		// --------------
		ProMstr promstr = new ProMstr();
		ProMstrId promstrid = new ProMstrId();
		promstrid.setProMndNbrSelect(is_MND);
		promstrid.setProSerial(this.getAuthorizationSerial());
		promstr.setId(promstrid);
		promstr.setProMd5(is_MD5);
		promstr.setProName(this.getName());

		updateAuthorizationProgramData(promstr);
		// -------------
		setAuthorizationOfGppContainer(this, this.getAuthorizationSerial());

	}

	/**
	 * ������Ȩ�������ݿ�����
	 */
	private boolean updateAuthorizationProgramData(ProMstr promstr) {
		GppProMstr gpm = new GppProMstr(promstr);

		if (!gpm.isHaveProMstr()) {
			this.is_isNeedUpdate = true;
		} else {
			this.is_isNeedUpdate = gpm.isNeedUpdate();
		}

		return gpm.updateAction();
	}

	/**
	 * ������Ȩ������ݿ�����
	 */
	private boolean updateAuthorizationProgramData(ProDet prodet) {
		boolean retboo = true;
		if (this.is_isNeedUpdate) {
			GppProDet gpd = new GppProDet(prodet);

			retboo = gpd.updateAction();
		}
		return retboo;
	}

	/**
	 * ����GppJPanel���ؼ������Ȩ��
	 */
	private void setAuthorizationOfGppContainer(Container cont,
			String parentSerial) {

		// �������ʵ����Ȩ�ӿڣ�����Ȩ���в�Ϊnull
		if (cont instanceof GppComponentAuthorizationControlInterface
				&& ((GppComponentAuthorizationControlInterface) cont)
						.getAuthorizationSerial() != null) {
			GppComponentAuthorizationControlInterface gcac = (GppComponentAuthorizationControlInterface) cont;
			ProDet prodet = new ProDet();
			prodet.setProComSerial(gcac.getAuthorizationSerial());
			prodet.setProComName(cont.getName());
			prodet.setProComObject(cont.getClass().getName());
			prodet.setProComParSerial(parentSerial);
			prodet.setProSerial(this.getAuthorizationSerial());

			updateAuthorizationProgramData(prodet);
			PcaDet temppcadet = getPcadet(gcac.getAuthorizationSerial());

			if (temppcadet != null) {
				cont.setEnabled(temppcadet.getPcaEnable());
				cont.setVisible(temppcadet.getPcaVisible());
			}

			parentSerial = gcac.getAuthorizationSerial();
		} else {

		}

		Component[] comp = cont.getComponents();
		for (int i = 0; i < comp.length; i++) {
			setAuthorizationOfGppContainer((Container) comp[i], parentSerial);
		}
	}

	/**
	 * ��ȡ��Ȩ����,û���򷵻�null
	 */
	private PcaDet getPcadet(String authorizationSerial) {
		PcaDet retpca = null;
		PcaDetId pcadetid = new PcaDetId();
		pcadetid.setPcaMndNbrSelect(is_MND);
		pcadetid.setPcaProComSerial(authorizationSerial);

		pcadetid.setPcaTarget(GlobalParameter.getLoginSession().getUsername());
		pcadetid.setPcaType("u");
		retpca = GppPcaDet.getPcadet(pcadetid);

		// ��û�ж��û�������Ȩ�������û�����Ȩ
		if (retpca == null) {
			pcadetid.setPcaTarget(GlobalParameter.getLoginSession()
					.getGroupname());
			pcadetid.setPcaType("g");
			retpca = GppPcaDet.getPcadet(pcadetid);
		}

		return retpca;
	}

	public void setVisible(boolean b) {
		if (this.is_MD5 != null && !this.is_MD5.isEmpty()
				&& this.is_MND != null && !this.is_MND.isEmpty()) {

			actionAuthorization();
		}
		super.setVisible(b);
	}

} // @jve:decl-index=0:visual-constraint="10,10"
