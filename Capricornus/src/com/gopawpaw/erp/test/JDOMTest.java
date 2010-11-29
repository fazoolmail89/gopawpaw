/**
 * 
 */
package com.gopawpaw.erp.test;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;

import com.gopawpaw.erp.GlobalParameter;

/**
 * @version 2010-4-6
 * @author Àî½õ»ª
 * 
 */
public class JDOMTest {

	/**
	 * 
	 */
	public JDOMTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = GlobalParameter.getHibernateCfgAbsolutePath();

		SAXBuilder builder = new SAXBuilder();
//		InputSource is = new InputSource(new StringReader(filename));
		Document doc = null;
		builder.setEntityResolver(new NoOpEntityResolver());
		try {
			doc = builder.build(filename);
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		XMLOutputter fmt = new XMLOutputter();

		Element persons = doc.getRootElement();
		List list = persons.getChildren("session-factory");
		for (Iterator it = list.iterator(); it.hasNext();) {
			Element person = (Element) it.next();
			List li = person.getChildren("property");
			for (Iterator it2 = li.iterator(); it2.hasNext();) {
				Element perso = (Element) it2.next();
				// String email = perso.getAttributeValue("name");
				String email = perso.getText();
				System.out.println(email);
			}
		}

	}

}
