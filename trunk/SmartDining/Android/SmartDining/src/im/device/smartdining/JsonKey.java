/**
 * @author EX-LIJINHUA001
 * @date 2013-1-15
 */
package im.device.smartdining;

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
	 * 当前最新版本ID;分类ID;菜式ID
	 */
	public static final String ID = "id";
	
	/**
	 * 当前最新版本号
	 */
	public static final String VERSION = "version";
	
	/**
	 * 最新版本发布时间
	 */
	public static final String DATE = "date";
	
	/**
	 * 符合条件的总记录数
	 */
	public static final String RECORDCOUNT = "recordcount";
	
	/**
	 * 总页数
	 */
	public static final String PAGECOUNT = "pagecount";
	
	/**
	 * 每页显示数
	 */
	public static final String PAGESIZE = "pagesize";
	
	/**
	 * 当前页码
	 */
	public static final String PAGENO = "pageno";
	
	/**
	 * 商家列表
	 */
	public static final String EATERYS = "eaterys";
	
	/**
	 * 商家名称;分类名称;菜式名称
	 */
	public static final String NAME = "name";
	
	/**
	 * 商家门面图;菜式图片
	 */
	public static final String IMG = "img";
	
	/**
	 * 商家门面图;菜式图片 缩略图
	 */
	public static final String TIMG = "timg";
	
	/**
	 * 营业时间
	 */
	public static final String HOURS = "hours";
	
	/**
	 * 最低起送
	 */
	public static final String MINIMUM = "minimum";
	
	/**
	 * 距离用户位置（单位米）
	 */
	public static final String DISTANCE = "distance";
	
	/**
	 * 喜欢数
	 */
	public static final String LIKENUM = "likenum";
	
	/**
	 * 经度
	 */
	public static final String LONGITUDE = "longitude";
	
	/**
	 * 纬度
	 */
	public static final String LATITUDE = "latitude";
	
	/**
	 * 分类总数
	 */
	public static final String COUNT = "count";
	
	/**
	 * 分类列表
	 */
	public static final String FOODTYPES = "foodtypes";
	
	/**
	 * 首个分类中的菜式列表（当请求时传递firstfoods参数位1时使用）
	 */
	public static final String FIRSTFOODS = "firstfoods";
	
	/**
	 * 菜式价格
	 */
	public static final String PRICE = "price";
	
	/**
	 * 菜式列表
	 */
	public static final String FOODS = "foods";
	
	/**
	 * 送餐费（单位：元）
	 */
	public static final String FREIGHT = "freight";
	
	/**
	 * 商家地址
	 */
	public static final String ADDRESS = "address";
	
	/**
	 * 送餐范围
	 */
	public static final String AREA = "area";
	
	/**
	 * 备注信息
	 */
	public static final String TEMP = "temp";
	
	/**
	 * 首选联系电话
	 */
	public static final String TEL1 = "tel1";
	
	/**
	 * 备选联系电话
	 */
	public static final String TEL2 = "tel2";
	
	/**
	 * 30分钟内的拨打次数
	 */
	public static final String CALL = "call";
	
	/**
	 * 版本号
	 */
	public static final String NO = "no";
	
	/**
	 * 
	 */
	public static final String MUST = "must";
	
	/**
	 * 信息
	 */
	public static final String INFO = "info";
	/**
	 * 信息
	 */
	public static final String DATETIME = "datetime";
	
	
}
