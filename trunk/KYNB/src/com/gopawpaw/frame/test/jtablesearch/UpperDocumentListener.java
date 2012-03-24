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
 * @author 李锦华
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
	  * 根据条件搜索
	  * @param e 搜索事件对象
	  */
	 private void smsContentSearch(DocumentEvent e) {
	  
	  try {
	   //获得文本域内容
	   this.smsContent = e.getDocument().getText(0, e.getDocument().getLength());
	  } catch (BadLocationException e1) {
	   // TODO Auto-generated catch block
	   e1.printStackTrace();
	  }

	  //传入搜索条件，把满足条件的内容搜索出来
	  Vector<?> vec = this.search.searchSmsContent(this.smsContent);
	  
	  //创建表模板
	  defaultModel = new DefaultTableModel(vec,smsHead);
	  
	  //设置表模板
	  table.setModel(defaultModel);
	 }
	}
