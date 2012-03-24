/**
 * 
 */
package com.gopawpaw.frame;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


/**
 * @version 2010-4-23
 * @author 李锦华
 *
 */
public class GppReportBrowser {

	private String url = null;

	/**
	 * 
	 */
	public GppReportBrowser() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 设置报表路径
	 */
	public void setURL(String url) {
		this.url = url;
	}

	/**
	 * 运行报表
	 */
	public void runReport() {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("GPP Reprot Browser ");
		createContents(shell, url);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

	private void createContents(Shell shell, String location) {

		shell.setLayout(new FormLayout());

		// Create the web browser
		final Browser browser = new Browser(shell, SWT.BORDER);
		FormData data = new FormData();
		data.top = new FormAttachment(0, 0);
		data.bottom = new FormAttachment(100, 0);
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		browser.setLayoutData(data);

		// Go to the initial URL
		if (location != null) {
			browser.setUrl(location);
		}
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://localhost:27279/frameset?__report=new_report2.rptdesign";
		GppReportBrowser grb = new GppReportBrowser();
		grb.setURL(url);
		grb.runReport();
	}

}
