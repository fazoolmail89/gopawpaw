/**
 * 
 */
package ptss;

/**
 * @version 2010-3-16
 * @author Àî½õ»ª
 *
 */
public class DBToolData {

	private String tableName = null;
	private String columnsName = null;
	private int    columnsLen = 0;
	/**
	 * @return the tableName
	 */
	public String getTableName() {
		return tableName;
	}
	/**
	 * @param tableName the tableName to set
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	/**
	 * @return the columnsName
	 */
	public String getColumnsName() {
		return columnsName;
	}
	/**
	 * @param columnsName the columnsName to set
	 */
	public void setColumnsName(String columnsName) {
		this.columnsName = columnsName;
	}
	/**
	 * @return the columnsLen
	 */
	public int getColumnsLen() {
		return columnsLen;
	}
	/**
	 * @param columnsLen the columnsLen to set
	 */
	public void setColumnsLen(int columnsLen) {
		this.columnsLen = columnsLen;
	}
	
}
