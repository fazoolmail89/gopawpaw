package com.gopawpaw.droidcore.paser;

/**
 * 数据解析接口
 * @author EX-LIJINHUA001
 * @date 2013-1-14
 */
public interface ParserInterface {
	
	/**
	 * 执行解析
	 * @author EX-LIJINHUA001
	 * @date 2013-1-14
	 * @param data
	 */
	public void actionParse(byte[] data);
	
	/**
	 * 获取解析数据
	 * @author EX-LIJINHUA001
	 * @date 2013-1-14
	 * @return
	 */
	public Object getData();
	
	/**
	 * 检查errCode，若果errCode不是成功状态，则提示消息<br>
	 * 部分系统错误将会在此被处理
	 * @author EX-LIJINHUA001
	 * @date 2013-1-14
	 * @param data
	 * @param urlId
	 * @return
	 */
	public int checkErrorCode(Object data,String urlId);
}
