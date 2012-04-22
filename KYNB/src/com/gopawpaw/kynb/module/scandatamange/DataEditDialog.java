package com.gopawpaw.kynb.module.scandatamange;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DataEditDialog extends JDialog {
	private static final long serialVersionUID = -5152772964362597159L;

	private ScanDataMangeFrame mainFrame = null;
	
	private static Dimension dmsTfd = new Dimension(250, 21);
	
	private OtherDataBean odata = null;
	
	private JPanel pnlID = null;
	private JLabel lblID = null;
	private JTextField tfdID = null;
	
	private JPanel pnlA = null;
	private JLabel lblA = null;
	private JTextField tfdA = null;
	
	private JPanel pnlB = null;
	private JLabel lblB = null;
	private JTextField tfdB = null;
	
	private JPanel pnlC = null;
	private JLabel lblC = null;
	private JTextField tfdC = null;
	
	private JPanel pnlD = null;
	private JLabel lblD = null;
	private JTextField tfdD = null;
	
	private JPanel pnlE = null;
	private JLabel lblE = null;
	private JTextField tfdE = null;
	
	private JPanel pnlF = null;
	private JLabel lblF = null;
	private JTextField tfdF = null;
	
	private JPanel pnlG = null;
	private JLabel lblG = null;
	private JTextField tfdG = null;
	
	private JPanel pnlH = null;
	private JLabel lblH = null;
	private JTextField tfdH = null;
	
	private JPanel pnlI = null;
	private JLabel lblI = null;
	private JTextField tfdI = null;
	
	private JPanel pnlJ = null;
	private JLabel lblJ = null;
	private JTextField tfdJ = null;
	
	private JPanel pnlOptBtns = null;
	private JButton btnSave = null;
	private JButton btnQuit = null;
	
	public DataEditDialog() {
		initialize();
	}
	
	public DataEditDialog(OtherDataBean odata) {
		this.odata = odata;
		initialize();
	}
	
	private void initialize() {
		setTitle("编辑数据");
		Box bgBox = Box.createVerticalBox();
		bgBox.add(getPnlID());
		bgBox.add(getPnlA());
		bgBox.add(getPnlB());
		bgBox.add(getPnlC());
		bgBox.add(getPnlD());
		bgBox.add(getPnlE());
		bgBox.add(getPnlF());
		bgBox.add(getPnlG());
		bgBox.add(getPnlH());
		bgBox.add(getPnlI());
		bgBox.add(getPnlJ());
		bgBox.add(getPnlOptBtns());
		
		add(bgBox);
		setSize(new Dimension(500, 600));
		ScanDataMangeFrame.setDialogLocaltion(this);
		setModal(true);
		setVisible(true);
	}
	
	private JPanel getPnlID() {
		pnlID = new JPanel();
		lblID = new JLabel("ID");
		tfdID = new JTextField();
		tfdID.setPreferredSize(dmsTfd);
		tfdID.setEditable(false);
		pnlID.add(lblID);
		pnlID.add(tfdID);
		return pnlID;
	}

	private JPanel getPnlA() {
		pnlA = new JPanel();
		lblA = new JLabel("A列");
		tfdA = new JTextField();
		tfdA.setPreferredSize(dmsTfd);
		pnlA.add(lblA);
		pnlA.add(tfdA);
		return pnlA;
	}
	
	private JPanel getPnlB() {
		pnlB = new JPanel();
		lblB = new JLabel("B列");
		tfdB = new JTextField();
		tfdB.setPreferredSize(dmsTfd);
		pnlB.add(lblB);
		pnlB.add(tfdB);
		return pnlB;
	}
	
	private JPanel getPnlC() {
		pnlC = new JPanel();
		lblC = new JLabel("C列");
		tfdC = new JTextField();
		tfdC.setPreferredSize(dmsTfd);
		pnlC.add(lblC);
		pnlC.add(tfdC);
		return pnlC;
	}
	
	private JPanel getPnlD() {
		pnlD = new JPanel();
		lblD = new JLabel("D列");
		tfdD = new JTextField();
		tfdD.setPreferredSize(dmsTfd);
		pnlD.add(lblD);
		pnlD.add(tfdD);
		return pnlD;
	}
	
	private JPanel getPnlE() {
		pnlE = new JPanel();
		lblE = new JLabel("E列");
		tfdE = new JTextField();
		tfdE.setPreferredSize(dmsTfd);
		pnlE.add(lblE);
		pnlE.add(tfdE);
		return pnlE;
	}
	
	private JPanel getPnlF() {
		pnlF = new JPanel();
		lblF = new JLabel("F列");
		tfdF = new JTextField();
		tfdF.setPreferredSize(dmsTfd);
		pnlF.add(lblF);
		pnlF.add(tfdF);
		return pnlF;
	}
	
	private JPanel getPnlG() {
		pnlG = new JPanel();
		lblG = new JLabel("G列");
		tfdG = new JTextField();
		tfdG.setPreferredSize(dmsTfd);
		pnlG.add(lblG);
		pnlG.add(tfdG);
		return pnlG;
	}
	
	private JPanel getPnlH() {
		pnlH = new JPanel();
		lblH = new JLabel("H列");
		tfdH = new JTextField();
		tfdH.setPreferredSize(dmsTfd);
		pnlH.add(lblH);
		pnlH.add(tfdH);
		return pnlH;
	}
	
	private JPanel getPnlI() {
		pnlI = new JPanel();
		lblI = new JLabel("I列");
		tfdI = new JTextField();
		tfdI.setPreferredSize(dmsTfd);
		pnlI.add(lblI);
		pnlI.add(tfdI);
		return pnlI;
	}
	
	private JPanel getPnlJ() {
		pnlJ = new JPanel();
		lblJ = new JLabel("J列");
		tfdJ = new JTextField();
		tfdJ.setPreferredSize(dmsTfd);
		pnlJ.add(lblJ);
		pnlJ.add(tfdJ);
		return pnlJ;
	}
	
	private JPanel getPnlOptBtns() {
		pnlOptBtns = new JPanel();
		btnSave = new JButton("保存");
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DataOpertor dot = new DataOpertor();
				boolean result = dot.saveOrUpdate(assignment());
				Toolkit.getDefaultToolkit().beep();
				if(result) {
					JOptionPane.showMessageDialog(null, "保存成功！", "操作提示！",
							JOptionPane.PLAIN_MESSAGE);	
					if(tfdID.getText().trim().length() == 0) cleare();
				} else {
					JOptionPane.showMessageDialog(null, "保存失败！", "操作提示！",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnQuit = new JButton("取消");
		pnlOptBtns.add(btnSave);
		pnlOptBtns.add(btnQuit);
		return pnlOptBtns;
	}
	
	private OtherDataBean assignment() {
		if(odata == null)
			odata = new OtherDataBean();
		odata.setId(tfdID.getText().trim());
		odata.setAcol(tfdA.getText().trim());
		odata.setBcol(tfdB.getText().trim());
		odata.setCcol(tfdC.getText().trim());
		odata.setDcol(tfdD.getText().trim());
		odata.setEcol(tfdE.getText().trim());
		odata.setFcol(tfdF.getText().trim());
		odata.setGcol(tfdG.getText().trim());
		odata.setHcol(tfdH.getText().trim());
		odata.setIcol(tfdI.getText().trim());
		odata.setJcol(tfdJ.getText().trim());
		return odata;
	}
	
	public void setOdata(OtherDataBean odata) {
		this.odata = odata;
		tfdID.setText(odata.getId());
		tfdA.setText(odata.getAcol());
		tfdB.setText(odata.getBcol());
		tfdC.setText(odata.getCcol());
		tfdD.setText(odata.getDcol());
		tfdE.setText(odata.getEcol());
		tfdF.setText(odata.getFcol());
		tfdG.setText(odata.getGcol());
		tfdH.setText(odata.getHcol());
		tfdI.setText(odata.getIcol());
		tfdJ.setText(odata.getJcol());
	}
	
	/**
	 * 清空界面输入框
	 */
	private void cleare() {
		this.odata = null;
		tfdID.setText("");
		tfdA.setText("");
		tfdB.setText("");
		tfdC.setText("");
		tfdD.setText("");
		tfdE.setText("");
		tfdF.setText("");
		tfdG.setText("");
		tfdH.setText("");
		tfdI.setText("");
		tfdJ.setText("");
	}
}
