package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDcMstr entity provides the base persistence definition of the DcMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDcMstr implements java.io.Serializable {

	// Fields

	private String dcName;
	private String dcPhyName;
	private String dcDir;
	private String dcHost;
	private String dcServer;
	private String dcType;
	private String dcNetwork;
	private String dcParmfile;
	private String dcChr01;
	private String dcChr02;
	private Boolean dcActive;
	private String dcDesc;
	private Integer dcCmtindx;
	private String dcUser1;
	private String dcUser2;
	private Boolean dcUseApp;
	private String dcQadc01;
	private String dcQadc02;
	private Boolean dcQadl01;
	private Boolean dcQadl02;
	private Double oidDcMstr;

	// Constructors

	/** default constructor */
	public AbstractDcMstr() {
	}

	/** minimal constructor */
	public AbstractDcMstr(String dcPhyName, Boolean dcUseApp, Double oidDcMstr) {
		this.dcPhyName = dcPhyName;
		this.dcUseApp = dcUseApp;
		this.oidDcMstr = oidDcMstr;
	}

	/** full constructor */
	public AbstractDcMstr(String dcPhyName, String dcDir, String dcHost,
			String dcServer, String dcType, String dcNetwork,
			String dcParmfile, String dcChr01, String dcChr02,
			Boolean dcActive, String dcDesc, Integer dcCmtindx, String dcUser1,
			String dcUser2, Boolean dcUseApp, String dcQadc01, String dcQadc02,
			Boolean dcQadl01, Boolean dcQadl02, Double oidDcMstr) {
		this.dcPhyName = dcPhyName;
		this.dcDir = dcDir;
		this.dcHost = dcHost;
		this.dcServer = dcServer;
		this.dcType = dcType;
		this.dcNetwork = dcNetwork;
		this.dcParmfile = dcParmfile;
		this.dcChr01 = dcChr01;
		this.dcChr02 = dcChr02;
		this.dcActive = dcActive;
		this.dcDesc = dcDesc;
		this.dcCmtindx = dcCmtindx;
		this.dcUser1 = dcUser1;
		this.dcUser2 = dcUser2;
		this.dcUseApp = dcUseApp;
		this.dcQadc01 = dcQadc01;
		this.dcQadc02 = dcQadc02;
		this.dcQadl01 = dcQadl01;
		this.dcQadl02 = dcQadl02;
		this.oidDcMstr = oidDcMstr;
	}

	// Property accessors

	public String getDcName() {
		return this.dcName;
	}

	public void setDcName(String dcName) {
		this.dcName = dcName;
	}

	public String getDcPhyName() {
		return this.dcPhyName;
	}

	public void setDcPhyName(String dcPhyName) {
		this.dcPhyName = dcPhyName;
	}

	public String getDcDir() {
		return this.dcDir;
	}

	public void setDcDir(String dcDir) {
		this.dcDir = dcDir;
	}

	public String getDcHost() {
		return this.dcHost;
	}

	public void setDcHost(String dcHost) {
		this.dcHost = dcHost;
	}

	public String getDcServer() {
		return this.dcServer;
	}

	public void setDcServer(String dcServer) {
		this.dcServer = dcServer;
	}

	public String getDcType() {
		return this.dcType;
	}

	public void setDcType(String dcType) {
		this.dcType = dcType;
	}

	public String getDcNetwork() {
		return this.dcNetwork;
	}

	public void setDcNetwork(String dcNetwork) {
		this.dcNetwork = dcNetwork;
	}

	public String getDcParmfile() {
		return this.dcParmfile;
	}

	public void setDcParmfile(String dcParmfile) {
		this.dcParmfile = dcParmfile;
	}

	public String getDcChr01() {
		return this.dcChr01;
	}

	public void setDcChr01(String dcChr01) {
		this.dcChr01 = dcChr01;
	}

	public String getDcChr02() {
		return this.dcChr02;
	}

	public void setDcChr02(String dcChr02) {
		this.dcChr02 = dcChr02;
	}

	public Boolean getDcActive() {
		return this.dcActive;
	}

	public void setDcActive(Boolean dcActive) {
		this.dcActive = dcActive;
	}

	public String getDcDesc() {
		return this.dcDesc;
	}

	public void setDcDesc(String dcDesc) {
		this.dcDesc = dcDesc;
	}

	public Integer getDcCmtindx() {
		return this.dcCmtindx;
	}

	public void setDcCmtindx(Integer dcCmtindx) {
		this.dcCmtindx = dcCmtindx;
	}

	public String getDcUser1() {
		return this.dcUser1;
	}

	public void setDcUser1(String dcUser1) {
		this.dcUser1 = dcUser1;
	}

	public String getDcUser2() {
		return this.dcUser2;
	}

	public void setDcUser2(String dcUser2) {
		this.dcUser2 = dcUser2;
	}

	public Boolean getDcUseApp() {
		return this.dcUseApp;
	}

	public void setDcUseApp(Boolean dcUseApp) {
		this.dcUseApp = dcUseApp;
	}

	public String getDcQadc01() {
		return this.dcQadc01;
	}

	public void setDcQadc01(String dcQadc01) {
		this.dcQadc01 = dcQadc01;
	}

	public String getDcQadc02() {
		return this.dcQadc02;
	}

	public void setDcQadc02(String dcQadc02) {
		this.dcQadc02 = dcQadc02;
	}

	public Boolean getDcQadl01() {
		return this.dcQadl01;
	}

	public void setDcQadl01(Boolean dcQadl01) {
		this.dcQadl01 = dcQadl01;
	}

	public Boolean getDcQadl02() {
		return this.dcQadl02;
	}

	public void setDcQadl02(Boolean dcQadl02) {
		this.dcQadl02 = dcQadl02;
	}

	public Double getOidDcMstr() {
		return this.oidDcMstr;
	}

	public void setOidDcMstr(Double oidDcMstr) {
		this.oidDcMstr = oidDcMstr;
	}

}