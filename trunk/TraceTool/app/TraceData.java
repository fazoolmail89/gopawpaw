package app;

public class TraceData {
	private String proto;
	private String localAddress;
	private String localprot;
	private String foreignAddress;
	private String foreignprot;
	private String state;
	private String geographicalPosition;
	public String getForeignAddress() {
		return foreignAddress;
	}
	public void setForeignAddress(String foreignAddress) {
		this.foreignAddress = foreignAddress;
	}
	public String getForeignprot() {
		return foreignprot;
	}
	public void setForeignprot(String foreignprot) {
		this.foreignprot = foreignprot;
	}
	public String getGeographicalPosition() {
		return geographicalPosition;
	}
	public void setGeographicalPosition(String geographicalPosition) {
		this.geographicalPosition = geographicalPosition;
	}
	public String getLocalAddress() {
		return localAddress;
	}
	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}
	public String getLocalprot() {
		return localprot;
	}
	public void setLocalprot(String localprot) {
		this.localprot = localprot;
	}
	public String getProto() {
		return proto;
	}
	public void setProto(String proto) {
		this.proto = proto;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public boolean ifEqual(TraceData trd){
		return (this.foreignAddress.equals(trd.foreignAddress));
	}
}
