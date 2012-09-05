package com.gopawpaw.kynb.module.print2.dpmtmng;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**	
 *  
 * @author ¬���� luxiangqi521@gmail.com
 * @version 1.0 2012-9-5
 */
public class OptBtnsPanel extends JPanel {
	private static final long serialVersionUID = -8925941701245494929L;
	
	private ThorpMngDialog fdialog;
	
	private JButton btnAdd = new JButton("����");
	private JButton btnUpd = new JButton("�޸�");
	private JButton btnDel = new JButton("ɾ��");

	public OptBtnsPanel(ThorpMngDialog f) {
		this.fdialog = f;
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				
				PrintThorp pt = new PrintThorp();
				pt.setName(fdialog.getPnlQuery().getTtfName().getText().trim());
				
				//��������У��
				DataValidate dv = new DataValidate();
				String error = dv.addValidate(pt);
				if(error == null || "".equals(error)) {
					PrintThorpDAO ptdao = new PrintThorpDAO();
					if(ptdao.save(pt)) {
						//����ɹ�ˢ������
						JOptionPane.showMessageDialog(null, "����ɹ���", "���ݱ�����ʾ��",
								JOptionPane.PLAIN_MESSAGE);		
						fdialog.getTspThorpsTable().refreshTable(ptdao.findArrayToTable(null));
					} else {
						JOptionPane.showMessageDialog(null, "����ʧ�ܣ�", "���ݱ�����ʾ��",
								JOptionPane.ERROR_MESSAGE);	
					}
				} else {
					//У��ʧ�ܣ���ʾ�û�������Ϣ�������ý���
					JOptionPane.showMessageDialog(null, error, "����У����ʾ��",
							JOptionPane.ERROR_MESSAGE);	
					fdialog.getPnlQuery().getTtfName().setFocusable(true);
				}
			}
		});
		
		btnUpd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				if(fdialog.getTspThorpsTable().getSelectRow() == null) {
					JOptionPane.showMessageDialog(null, 
							"�����ڻ����б���ѡ����Ӧ�ļ�¼��", 
							"������ʾ��",
							JOptionPane.ERROR_MESSAGE);	
					return;
				}
				
				String oldName = fdialog.getTspThorpsTable().getSelectRow().getName();
				String newName = fdialog.getPnlQuery().getTtfName().getText().trim();
				if(oldName.equals(newName)) return;					
		
				PrintThorp pt = new PrintThorp();
				pt.setId(fdialog.getTspThorpsTable().getSelectRow().getId());
				pt.setName(fdialog.getPnlQuery().getTtfName().getText().trim());
				
				//��������У��
				DataValidate dv = new DataValidate();
				String error = dv.updValidate(pt);
				if(error == null || "".equals(error)) {
					PrintThorpDAO ptdao = new PrintThorpDAO();
					if(ptdao.update(pt)) {
						//����ɹ�ˢ������
						JOptionPane.showMessageDialog(null, "����ɹ���", "���ݱ�����ʾ��",
								JOptionPane.PLAIN_MESSAGE);		
						fdialog.getTspThorpsTable().refreshTable(ptdao.findArrayToTable(null));
					} else {
						JOptionPane.showMessageDialog(null, "����ʧ�ܣ�", "���ݱ�����ʾ��",
								JOptionPane.ERROR_MESSAGE);	
					}
				} else {
					//У��ʧ�ܣ���ʾ�û�������Ϣ�������ý���
					JOptionPane.showMessageDialog(null, error, "����У����ʾ��",
							JOptionPane.ERROR_MESSAGE);	
					fdialog.getPnlQuery().getTtfName().setFocusable(true);
				}				
			}
		});
		
		btnDel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				if(fdialog.getTspThorpsTable().getSelectRow() == null) {
					JOptionPane.showMessageDialog(null, 
							"�����ڻ����б���ѡ����Ӧ�ļ�¼��", 
							"������ʾ��",
							JOptionPane.ERROR_MESSAGE);	
					return;
				}
				
				PrintThorp pt = new PrintThorp();
				pt.setId(fdialog.getTspThorpsTable().getSelectRow().getId());
				pt.setName(fdialog.getPnlQuery().getTtfName().getText().trim());
				
				//��������У��
				DataValidate dv = new DataValidate();
				String error = dv.delValidate(pt);
				if(error == null || "".equals(error)) {
					//ѯ���û��Ƿ����ȷ�Ͻ���ɾ������
					int rv =  JOptionPane.showConfirmDialog(null,
							"�Ƿ�ȷ��ɾ������Ϊ��" + pt.getName() + "���Ļ�����", "ɾ����ʾ��", 
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.OK_CANCEL_OPTION);
					
					if(rv == 0) {
						PrintThorpDAO ptdao = new PrintThorpDAO();
						if(ptdao.delete(pt.getId())) {
							//ɾ���ɹ�ˢ������
							JOptionPane.showMessageDialog(null, "ɾ���ɹ���", "���ݱ�����ʾ��",
									JOptionPane.PLAIN_MESSAGE);		
							fdialog.getTspThorpsTable().refreshTable(ptdao.findArrayToTable(null));
						} else {
							JOptionPane.showMessageDialog(null, "ɾ��ʧ�ܣ�", "���ݱ�����ʾ��",
									JOptionPane.ERROR_MESSAGE);	
						}						
					}
				} else {
					//У��ʧ�ܣ���ʾ�û�������Ϣ�������ý���
					JOptionPane.showMessageDialog(null, error, "����У����ʾ��",
							JOptionPane.ERROR_MESSAGE);	
					fdialog.getPnlQuery().getTtfName().setFocusable(true);
				}			
				
			}
		});
		
		Box box = Box.createVerticalBox();
		box.add(btnAdd);
		box.add(btnUpd);
		box.add(btnDel);
		add(box);
	}
}
