/**
 * @author EX-LIJINHUA001
 * @date 2013-1-15
 */
package im.device.appshare;

/**
 * Key常量，用于服务器交互的json取值key定义
 * @author EX-LIJINHUA001
 * @date 2013-1-15
 */
public class JsonKey {

	/**
	 * 响应状态码 
	 * 状态码范围	说明
	 *	1 – 99		正常
	 *	901 – 999	系统层错误
	 *	系统层错误状态码：
	 *	状态		说明
	 *	901		服务器内部错误
	 *	999		未知错误
	 */
	public static final String CODE = "code";
	
	/**
	 * 当发生错误时存放错误信息
	 */
	public static final String MSG = "msg";
	
	/**
	 * 数据节点，一般在响应状态码正常时访问
	 */
	public static final String DATA = "data";
		
	/**
	 * 经度
	 */
	public static final String LONGITUDE = "longitude";
	
	/**
	 * 纬度
	 */
	public static final String LATITUDE = "latitude";
	
	public static final String ID = "id";
	
	public static final String FLAG = "flag";
	
	public static final String URL = "url";
}
