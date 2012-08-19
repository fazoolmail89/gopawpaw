package com.gopawpaw.kynb.module.excelupgrade;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import jxl.Cell;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.CellFormat;
import jxl.format.Colour;
import jxl.format.Font;
import jxl.format.Format;
import jxl.format.Orientation;
import jxl.format.Pattern;
import jxl.format.VerticalAlignment;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.module.BaseModuleFrame;

public class ExcelUpgradeFrame extends BaseModuleFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	
	private JTextField mJTextPathInput = new JTextField();
	private JTextField mJTextPathOutput = new JTextField();
	
	private JTextArea  mJTextExcelInput = new JTextArea();
	private JTextArea  mJTextExcelOutput = new JTextArea();
	
	private JProgressBar progressBar = new JProgressBar();
	
	private String mInputPath = "";
	private String mOutputPath = "";
	private List<String> fileList = new ArrayList<String>();
	
	public ExcelUpgradeFrame() {
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		
		this.setSize(900, 600);
		this.setLocation(200, 100);
		this.setTitle("Excel格式升级");
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		JPanel jContentPane = new JPanel();
		jContentPane.setLayout(new BorderLayout());

		jContentPane.add(getJPanelCenter(), BorderLayout.CENTER);
		return jContentPane;
	}

	/**
	 * 中间面板
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JSplitPane
	 */
	private JPanel getJPanelCenter() {

		JSplitPane jSplitPaneCenter = new JSplitPane(
				JSplitPane.HORIZONTAL_SPLIT, mJTextExcelInput, mJTextExcelOutput);
		jSplitPaneCenter.setDividerLocation(450);
		
		
		mJTextPathInput.setEditable(false);
		mJTextPathOutput.setEditable(false);
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new BorderLayout());
		JPanel jPanel11 = new JPanel();
		jPanel11.setLayout(new BoxLayout(jPanel11, BoxLayout.X_AXIS));
		jPanel11.add(getJButtonInputPath());
		jPanel11.add(mJTextPathInput);
		jPanel11.add(getJButtonOutputPath());
		jPanel11.add(mJTextPathOutput);
		jPanel11.add(getJButtonAction());
		
		jPanel1.add(jSplitPaneCenter, BorderLayout.CENTER);
		jPanel1.add(jPanel11, BorderLayout.NORTH);
		jPanel1.add(progressBar, BorderLayout.SOUTH);
		

		return jPanel1;
	}

	private JButton getJButtonInputPath() {

		final JButton jButton = new JButton();
		jButton.setText("选择Excel目录");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				JFileChooser chooser = new JFileChooser();  
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);  
				int result = chooser.showOpenDialog(null);  
				if (result == JFileChooser.APPROVE_OPTION) {  
				
					String filePath = chooser.getSelectedFile().getPath();  
					mJTextPathInput.setText(filePath);
					reflashExcelFile(filePath);
				}
				
			}
		});
		return jButton;
	}

	private JButton getJButtonOutputPath() {

		final JButton jButton = new JButton();
		jButton.setText("选择输出目录");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				JFileChooser chooser = new JFileChooser();  
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);  
				int result = chooser.showOpenDialog(null);  
				if (result == JFileChooser.APPROVE_OPTION) {  
				
					String filePath = chooser.getSelectedFile().getPath();  
					mJTextPathOutput.setText(filePath);  
					mOutputPath = filePath;
				}
			}
		});
		return jButton;
	}
	
	private JButton getJButtonAction() {

		final JButton jButton = new JButton();
		jButton.setText("执行升级");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSwitch();
			}
		});
		return jButton;
	}
	
	
	private void reflashExcelFile(String path){
		mInputPath = path;
		File f = new File(path);
		String[] files = f.list();
		fileList.clear();
		if(files != null){
			for(int i=0;i<files.length;i++){
				String name = files[i];
				if(name != null && name.endsWith(".xls")){
					fileList.add(name);
					String temp = mJTextExcelInput.getText();
					if(temp == null || temp.isEmpty()){
						mJTextExcelInput.setText(name);
					}else{
						mJTextExcelInput.setText(temp+"\r\n"+name);
					}
				}
			}
		}
	}
	
	private void actionSwitch(){
		
		if(mInputPath == null || "".equals(mInputPath) || fileList.isEmpty()){
			
			JOptionPane.showConfirmDialog(this, "该目录下没有符合条件的Excel，请重新选择目录。","系统提示",JOptionPane.OK_OPTION);
			return;
		}
		
		if(mOutputPath == null || "".equals(mOutputPath)){
			
			JOptionPane.showConfirmDialog(this, "您没有选择输出目录，请选择一个转换后输出的目录。","系统提示",JOptionPane.OK_OPTION);
			return;
		}

		if(mOutputPath.equals(mInputPath)){
			JOptionPane.showConfirmDialog(this, "输入目录和输出目录不能相同，请重新选择。","系统提示",JOptionPane.OK_OPTION);
			return;
		}

		UpgradeExcelThread uet = new UpgradeExcelThread();
		uet.start();
	}
	
	private boolean actionUpgrade(String sourceName,String tagname){
		
		boolean ret = false;
		try {
			
			//输出文件
			FileOutputStream targetFile = new FileOutputStream(new File(tagname));
			
			Workbook mWorkbook = Workbook.getWorkbook(new File(sourceName));
			
			WritableWorkbook wwb = Workbook.createWorkbook(targetFile, mWorkbook);
			
			WritableSheet wws = wwb.getSheet(0);
			
			//取出表头
			Cell cA1 = wws.getCell(0, 0);
			Cell cA3 = wws.getCell(0, 2);
			
			
			//移除列
			wws.removeColumn(19);
			wws.removeColumn(13);
			wws.removeColumn(5);
			wws.removeColumn(0);
			
			wws.removeRow(2);
			wws.insertRow(2);
			
			Label labA1 = new Label(0,0,cA1.getContents());
			labA1.setCellFormat(cA1.getCellFormat());
			Label labA3 = new Label(0,2,cA3.getContents());
			labA3.setCellFormat(cA3.getCellFormat());
			
			
			//重新添加表头
			wws.addCell(labA1);
			wws.addCell(labA3);
			
			wws.mergeCells(0, 2, 2, 2);
			
			//插入新的两列
			wws.insertColumn(5);
			wws.insertColumn(6);
			wws.insertColumn(7);
			wws.insertColumn(12);
			wws.insertColumn(13);
			
			Cell cC4 = wws.getCell(2, 3);
			
			Label lab54 = new Label(5,3,"缴费银行名称");
			lab54.setCellFormat(cC4.getCellFormat());
			Label lab64 = new Label(6,3,"缴费银行账号");
			lab64.setCellFormat(cC4.getCellFormat());
			Label lab74 = new Label(7,3,"缴费银行户名");
			lab74.setCellFormat(cC4.getCellFormat());
			
			Label labK4 = new Label(12,3,"村干任职年限");
			labK4.setCellFormat(cC4.getCellFormat());
			Label labL4 = new Label(13,3,"村干任职类型");
			labL4.setCellFormat(cC4.getCellFormat());
			
			wws.addCell(lab54);
			wws.addCell(lab64);
			wws.addCell(lab74);
			wws.addCell(labK4);
			wws.addCell(labL4);
			
			//重命名
			Cell cBankName = wws.getCell(8, 3);
			Cell cBankAcc = wws.getCell(9, 3);
			
			Label lab83 = new Label(8,3,"支付银行名称");
			lab83.setCellFormat(cBankName.getCellFormat());
			Label lab93 = new Label(9,3,"支付银行账号");
			lab93.setCellFormat(cBankAcc.getCellFormat());
			Label lab163 = new Label(16,3,"是否参加老农保");
			lab163.setCellFormat(cBankAcc.getCellFormat());
			
			wws.addCell(lab83);
			wws.addCell(lab93);
			wws.addCell(lab163);
			//写入
			wwb.write();
			
			//关闭各个文件链接
			wwb.close();
			mWorkbook.close();
			targetFile.close();
			ret = true;
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ret;
	}
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();

				ExcelUpgradeFrame thisClass = new ExcelUpgradeFrame();
				thisClass.showWithFrame();
			}
		});
	}

	class UpgradeExcelThread extends Thread{
		@Override
		public void run() {

			int size = fileList.size();
			progressBar.setMaximum(size);
			progressBar.setStringPainted(true); // 显示提示信息
			progressBar.setIndeterminate(false); // 确定进度的进度条
			
			for(int i = 0;i<size;i++){
				String filename= fileList.get(i);
				
				String result = "升级失败";
				if(actionUpgrade(mInputPath+"\\"+filename,mOutputPath+"\\"+filename)){
					result = "升级成功";
				}
				
				String temp = mJTextExcelOutput.getText();
				if(temp == null || temp.isEmpty()){
					mJTextExcelOutput.setText(filename+" --------> "+result);
				}else{
					mJTextExcelOutput.setText(temp+"\r\n"+filename+" --------> "+result);
				}
				
				progressBar.setString("进度：" + (i+1) + "/" + size);
				progressBar.setValue(i+1); // 进度值
			
			}
		}
	}
}
