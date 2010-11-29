/**
 * 
 */
package com.gopawpaw.dev.test;

import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.KeyStroke;

import com.gopawpaw.javax.swing.GppJTable;

/**
 * @version 2009-11-1
 * @author 李锦华
 */
public   class   KeyCodeAdapter   {   
//    
//	  private   KeyCodeMap   keyCodeMap   ;   
//	  private   GppJTable   myTable;   
//	    
//	  //按键操作，包括单键和多键操作   
//	  private   int   iStrokeCount   =   0;   
//	  private   String[]   keyStrokePath   =   new   String[1024];   
//	  KeyStroke   keyStroke[]   =   new   KeyStroke[1024];   
//	    
//	    
//	    
//	    
//	  public   KeyCodeAdapter(KeyCodeMap   pm_keyCodeMap,JTable   pm_jTable)   
//	  {   
//	  this.keyCodeMap   =   pm_keyCodeMap;   
//	  this.myTable   =   pm_jTable;   
//	    
//	  }   
//	    
//	  /**   
//	    *   register   Action   to   the   JTable   
//	    */   
//	  public   void   registerAction()   
//	  {   
//	  LinkedList   keyCodeList   =   (LinkedList)keyCodeMap.getKeyCodeMapList();   
//	  for(int   i=0;i<keyCodeList.size();i++)   
//	  {   
//	  LinkedList   rowKeyCodeList   =   (LinkedList)keyCodeList.get(i);   
//	  {   
//	          int   iType   =   Integer.parseInt(String.valueOf(rowKeyCodeList.get(1)));   
//	            
//	          LinkedList   keyList   =   (LinkedList)rowKeyCodeList.get(2);   
//	          int   iModifi=0,iKeyCode=0;   
//	          for(int   j=0;j<keyList.size()-1;j++)   
//	          {   
//	          iModifi   =   iModifi+Integer.parseInt(String.valueOf(keyList.get(j)));   
//	          }   
//	          iKeyCode   =   Integer.parseInt(String.valueOf(keyList.get(keyList.size()-1)));   
//	          //add   new   KeyStroke   
//	            //单键操作   
//	          if(iModifi   ==   0)   
//	          {   
//	          keyStroke[iStrokeCount]   =   KeyStroke.getKeyStroke((char)iKeyCode);   
//	          }   
//	            //多键操作   
//	          else   
//	          {   
//	          keyStroke[iStrokeCount]   =   KeyStroke.getKeyStroke(iKeyCode,iModifi,false);   
//	            
//	          }   
//	          
//	          this.myTable.registerKeyboardAction((ActionListener) this,"iStroke"+(iStrokeCount),keyStroke[iStrokeCount],JComponent.WHEN_FOCUSED);   
//	          keyStrokePath[iStrokeCount]=String.valueOf(rowKeyCodeList.get(0));   
//	          iStrokeCount++;   
//	            
//	                    
//	  }   
//	  }   
//	    
//	    
//	  }   
//	    
//	    
//	    
//	  /**   
//	    *   cancel   the   ActionListener   
//	    */   
//	  public   void   removeAction()   
//	  {   
//	  this.myTable.resetKeyboardActions();   
//	  this.iStrokeCount   =   0;   
//	  this.keyStrokePath   =   new   String[1024];   
//	  this.keyStroke   =   new   KeyStroke[1024];   
//	    
//	  }
//	  
}