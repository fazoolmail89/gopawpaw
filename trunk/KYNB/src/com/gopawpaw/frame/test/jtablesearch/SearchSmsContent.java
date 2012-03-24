/**
 * 
 */
package com.gopawpaw.frame.test.jtablesearch;

import java.util.Vector;

/**
 * @version 2010-5-9
 * @author �����
 * 
 */
public class SearchSmsContent implements ISearchSmsContentInter {

	private Vector<?> vec;

	public SearchSmsContent(Vector<?> vec) {
		this.vec = vec;
	}

	/**
	 * ��������������Vector�����������������������
	 */
	public Vector searchSmsContent(String content) {

		Vector afterRow = new Vector();

		for (int rowIndex = 0; rowIndex < vec.size(); rowIndex++) {
			Vector<?> colSms = (Vector<?>) vec.get(rowIndex);

			Vector afterCol = new Vector();

			boolean flag = false;
			for (int colIndex = 0; colIndex < colSms.size(); colIndex++) {
				afterCol.add(colSms.get(colIndex));
				if (colSms.get(colIndex).toString().indexOf(content) > -1) {
					flag = true;
				}
			}

			if (flag) {
				afterRow.add(afterCol);
			}
		}
		return afterRow;
	}

}
