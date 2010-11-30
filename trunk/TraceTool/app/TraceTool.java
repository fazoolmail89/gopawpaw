package app;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import java.awt.Dimension;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JToolBar;
import javax.swing.JToggleButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TraceTool extends JFrame implements Runnable{

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;
	
	Analyzer analyzer = null;
	Analyzer analyzerstart = null;
	Analyzer analyzerend = null;
	Analyzer analyzerbt = null;
	
	Thread threadAnalyzer = null;  //  @jve:decl-index=0:
	Vector<Vector<Comparable>> srcdata = new Vector<Vector<Comparable>>(8);  //  @jve:decl-index=0:

	private JToolBar jJToolBarBar = null;

	private JToggleButton jToggleButton = null;

	private JToggleButton jToggleButton1 = null;

	private JToggleButton jToggleButton2 = null;

	private JToggleButton jToggleButton3 = null;

	private JScrollPane jScrollPane = null;

	private JTable jTable = null;

	private JProgressBar jProgressBar = null;  //  @jve:decl-index=0:visual-constraint="956,281"

	private JToggleButton jToggleButton4 = null;

	private JToggleButton jToggleButton5 = null;

	

	/**
	 * This method initializes jJToolBarBar	
	 * 	
	 * @return javax.swing.JToolBar	
	 */
	private JToolBar getJJToolBarBar() {
		if (jJToolBarBar == null) {
			jJToolBarBar = new JToolBar();
			jJToolBarBar.add(getJToggleButton1());
			jJToolBarBar.add(getJToggleButton2());
			jJToolBarBar.add(getJToggleButton3());
			jJToolBarBar.add(getJToggleButton());
			jJToolBarBar.add(getJToggleButton4());
			jJToolBarBar.add(getJToggleButton5());
		}
		return jJToolBarBar;
	}

	/**
	 * This method initializes jToggleButton	
	 * 	
	 * @return javax.swing.JToggleButton	
	 */
	private JToggleButton getJToggleButton() {
		if (jToggleButton == null) {
			jToggleButton = new JToggleButton();
			jToggleButton.setText("解析物理位置");
			jToggleButton.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					
					reStart();
					
				}
			});
		}
		return jToggleButton;
	}

	/**
	 * This method initializes jToggleButton1	
	 * 	
	 * @return javax.swing.JToggleButton	
	 */
	private JToggleButton getJToggleButton1() {
		if (jToggleButton1 == null) {
			jToggleButton1 = new JToggleButton();
			jToggleButton1.setText("开始");
			jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					
					analyzerstart = new Analyzer();
					
					analyzer = analyzerstart;
					
					updateShow(analyzerstart);
				}
			});
		}
		return jToggleButton1;
	}

	/**
	 * This method initializes jToggleButton2	
	 * 	
	 * @return javax.swing.JToggleButton	
	 */
	private JToggleButton getJToggleButton2() {
		if (jToggleButton2 == null) {
			jToggleButton2 = new JToggleButton();
			jToggleButton2.setText("结束");
			jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					analyzerend = new Analyzer();
					analyzer = analyzerend;
					updateShow(analyzerend);
				}
			});
		}
		return jToggleButton2;
	}

	/**
	 * This method initializes jToggleButton3	
	 * 	
	 * @return javax.swing.JToggleButton	
	 */
	private JToggleButton getJToggleButton3() {
		if (jToggleButton3 == null) {
			jToggleButton3 = new JToggleButton();
			jToggleButton3.setText("截取新增连接");
			jToggleButton3.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					analyzerbt = Analyzer.intercepting(analyzerstart,analyzerend);
					analyzer = analyzerbt;
					updateShow(analyzerbt);
				}
			});
		}
		return jToggleButton3;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJTable());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTable	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTable() {
		if (jTable == null) {
			jTable = new JTable();
			
			//设置列标题(表头)
			String[] columnName = {"序号","协议","本地IP","本地端口","远程IP","远程端口","状态","远程计算机物理地址" };

			Vector<String> cname = new Vector<String>(8);
			cname.add(columnName[0]);
			cname.add(columnName[1]);
			cname.add(columnName[2]);
			cname.add(columnName[3]);
			cname.add(columnName[4]);
			cname.add(columnName[5]);
			cname.add(columnName[6]);
			cname.add(columnName[7]);
			

			// 初始化表格
			
			DefaultTableModel model = new DefaultTableModel(srcdata, cname);

			jTable.setModel(model);
			jTable.setBounds(new Rectangle(0, 0, 5, 30));
			jTable.setIntercellSpacing(new Dimension(10, 1));
			jTable.setPreferredScrollableViewportSize(new Dimension(120, 200));
			
			
		}
		return jTable;
	}

	/**
	 * This method initializes jProgressBar	
	 * 	
	 * @return javax.swing.JProgressBar	
	 */
	private JProgressBar getJProgressBar() {
		if (jProgressBar == null) {
			jProgressBar = new JProgressBar();
		}
		return jProgressBar;
	}

	/**
	 * This method initializes jToggleButton4	
	 * 	
	 * @return javax.swing.JToggleButton	
	 */
	private JToggleButton getJToggleButton4() {
		if (jToggleButton4 == null) {
			jToggleButton4 = new JToggleButton();
			jToggleButton4.setText("暂停");
			jToggleButton4.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					try {
						threadAnalyzer.wait();
					} catch (InterruptedException e1) {
						
						e1.printStackTrace();
					}
				}
			});
		}
		return jToggleButton4;
	}

	/**
	 * This method initializes jToggleButton5	
	 * 	
	 * @return javax.swing.JToggleButton	
	 */
	private JToggleButton getJToggleButton5() {
		if (jToggleButton5 == null) {
			jToggleButton5 = new JToggleButton();
			jToggleButton5.setText("继续");
			jToggleButton5.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					reStart();
				}
			});
		}
		return jToggleButton5;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				TraceTool thisClass = new TraceTool();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
		

	}

	/**
	 * This is the default constructor
	 */
	public TraceTool() {
		super();
		analyzer = new Analyzer();
		
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(871, 252);
		this.setContentPane(getJContentPane());
		this.setTitle("IP监听工具  —— 作者：木瓜");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJJToolBarBar(), BorderLayout.NORTH);
			jContentPane.add(getJScrollPane(), BorderLayout.CENTER);
			jContentPane.add(getJProgressBar(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}
	
	private void updateShow(Analyzer ana){
		srcdata.removeAllElements();
		Iterator it = (ana.getTraceDatas()).iterator();
		int i=0;
		while(it.hasNext()){
			
			TraceData trd = (TraceData)it.next();
			Vector<Comparable> onerow = new Vector<Comparable>(8);
			onerow.add(i);
			onerow.add(trd.getProto());
			onerow.add(trd.getLocalAddress());
			onerow.add(trd.getLocalprot());
			onerow.add(trd.getForeignAddress());
			onerow.add(trd.getForeignprot());
			onerow.add(trd.getState());
			onerow.add(trd.getGeographicalPosition());
			System.out.println(trd.getForeignAddress());
			srcdata.add(onerow);
			i++;
		}
		jTable.repaint();
		jTable.updateUI();
		
	}

	public void run() {
		
		int alln = analyzer.getTraceDatas().size();
		
		getJProgressBar().setMaximum(alln);
		
		Iterator it = analyzer.getTraceDatas().iterator();
		
		int i = 0;
		while (it.hasNext()) {
			
			
			TraceData trd = (TraceData) it.next();
			trd.setGeographicalPosition(analyzer.getGeographicalPosition(trd.getForeignAddress()));
			
			getJProgressBar().setValue(i+1);
			getJProgressBar().setStringPainted(true);
			
			Vector<Comparable> onerow = new Vector<Comparable>(8);
			onerow.add(i);
			onerow.add(trd.getProto());
			onerow.add(trd.getLocalAddress());
			onerow.add(trd.getLocalprot());
			onerow.add(trd.getForeignAddress());
			onerow.add(trd.getForeignprot());
			onerow.add(trd.getState());
			onerow.add(trd.getGeographicalPosition());
			
			srcdata.set(i, onerow);
			jTable.repaint();
			jTable.updateUI();
			
			i++;
		}
	}
	private void reStart() {
		threadAnalyzer = new Thread(this);
		threadAnalyzer.start();
	}

}  //  @jve:decl-index=0:visual-constraint="31,37"
