/**
 * 
 */
package com.gopawpaw.javax.swing;

import java.io.IOException;
import java.net.URL;

import javax.swing.JEditorPane;

/**
 * @version 2009-10-31
 * @author Àî½õ»ª
 */
public class GppJEditorPane extends JEditorPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7199187895561962245L;

	/**
	 * 
	 */
	public GppJEditorPane() {
		super();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJEditorPane(String arg0, String arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @throws IOException
	 */
	public GppJEditorPane(String arg0) throws IOException {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @throws IOException
	 */
	public GppJEditorPane(URL arg0) throws IOException {
		super(arg0);
	}

}
