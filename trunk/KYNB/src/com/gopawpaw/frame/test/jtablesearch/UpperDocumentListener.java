/**
 * 
 */
package com.gopawpaw.frame.test.jtablesearch;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;


//import com.huawei.mobilePartner.gui.model.modelinterface.ICommandHolder;


/**
 * @version 2010-5-9
 * @author �����
 *
 */
public class UpperDocumentListener implements DocumentListener{

	 private ISearchSmsContentInter search;
	 
	 private Vector<?> smsVector;
	 
	 private Vector<?> smsHead;
	 
	 private String smsContent;
	 
	 private JTable table;
	 
	 private DefaultTableModel defaultModel = null;
	 
	 public UpperDocumentListener(JTable table,Vector<?> smsVector,Vector<?> smsHead)
	 {
	  this.table = table;
	  this.smsVector = smsVector;
	  this.smsHead = smsHead;
	  this.search = new SearchSmsContent(this.smsVector);
	 }
	 
	 public void changedUpdate(DocumentEvent e) {
	  smsContentSearch(e);
	 }
	 

	 public void insertUpdate(DocumentEvent e) {
	  smsContentSearch(e);
	 }

	 public void removeUpdate(DocumentEvent e) {
	  smsContentSearch(e);
	 }
	 
	 /**
	  * ������������
	  * @param e �����¼�����
	  */
	 private void smsContentSearch(DocumentEvent e) {
	  
	  try {
	   //����ı�������
	   this.smsContent = e.getDocument().getText(0, e.getDocument().getLength());
	  } catch (BadLocationException e1) {
	   // TODO Auto-generated catch block
	   e1.printStackTrace();
	  }

	  //��������������������������������������
	  Vector<?> vec = this.search.searchSmsContent(this.smsContent);
	  
	  //������ģ��
	  defaultModel = new DefaultTableModel(vec,smsHead);
	  
	  //���ñ�ģ��
	  table.setModel(defaultModel);
	 }
	}
