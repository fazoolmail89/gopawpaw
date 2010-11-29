package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAtdcMstr entity provides the base persistence definition of the
 * AtdcMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtdcMstr implements java.io.Serializable {

	// Fields

	private String atdcName;
	private Double oidAtdcMstr;
	private String atdcPhyName;
	private String atdcDir;
	private String atdcHost;
	private String atdcServer;
	private String atdcType;
	private String atdcNetwork;
	private String atdcParmfile;
	private Boolean atdcOnline;
	private String atdcDesc;
	private Date atdcQadt01;
	private Date atdcQadt02;
	private Date atdcModDate;
	private String atdcModUserid;
	private String atdcUser1;
	private String atdcUser2;
	private String atdcQadc01;
	private String atdcQadc02;

	// Constructors

	/** default constructor */
	public AbstractAtdcMstr() {
	}

	/** minimal constructor */
	public AbstractAtdcMstr(Double oidAtdcMstr, String atdcPhyName,
			String atdcDir, String atdcHost, String atdcServer,
			String atdcType, String atdcNetwork, String atdcParmfile,
			Boolean atdcOnline, String atdcDesc, Date atdcModDate,
			String atdcModUserid, String atdcUser1, String atdcUser2,
			String atdcQadc01, String atdcQadc02) {
		this.oidAtdcMstr = oidAtdcMstr;
		this.atdcPhyName = atdcPhyName;
		this.atdcDir = atdcDir;
		this.atdcHost = atdcHost;
		this.atdcServer = atdcServer;
		this.atdcType = atdcType;
		this.atdcNetwork = atdcNetwork;
		this.atdcParmfile = atdcParmfile;
		this.atdcOnline = atdcOnline;
		this.atdcDesc = atdcDesc;
		this.atdcModDate = atdcModDate;
		this.atdcModUserid = atdcModUserid;
		this.atdcUser1 = atdcUser1;
		this.atdcUser2 = atdcUser2;
		this.atdcQadc01 = atdcQadc01;
		this.atdcQadc02 = atdcQadc02;
	}

	/** full constructor */
	public AbstractAtdcMstr(Double oidAtdcMstr, String atdcPhyName,
			String atdcDir, String atdcHost, String atdcServer,
			String atdcType, String atdcNetwork, String atdcParmfile,
			Boolean atdcOnline, String atdcDesc, Date atdcQadt01,
			Date atdcQadt02, Date atdcModDate, String atdcModUserid,
			String atdcUser1, String atdcUser2, String atdcQadc01,
			String atdcQadc02) {
		this.oidAtdcMstr = oidAtdcMstr;
		this.atdcPhyName = atdcPhyName;
		this.atdcDir = atdcDir;
		this.atdcHost = atdcHost;
		this.atdcServer = atdcServer;
		this.atdcType = atdcType;
		this.atdcNetwork = atdcNetwork;
		this.atdcParmfile = atdcParmfile;
		this.atdcOnline = atdcOnline;
		this.atdcDesc = atdcDesc;
		this.atdcQadt01 = atdcQadt01;
		this.atdcQadt02 = atdcQadt02;
		this.atdcModDate = atdcModDate;
		this.atdcModUserid = atdcModUserid;
		this.atdcUser1 = atdcUser1;
		this.atdcUser2 = atdcUser2;
		this.atdcQadc01 = atdcQadc01;
		this.atdcQadc02 = atdcQadc02;
	}

	// Property accessors

	public String getAtdcName() {
		return this.atdcName;
	}

	public void setAtdcName(String atdcName) {
		this.atdcName = atdcName;
	}

	public Double getOidAtdcMstr() {
		return this.oidAtdcMstr;
	}

	public void setOidAtdcMstr(Double oidAtdcMstr) {
		this.oidAtdcMstr = oidAtdcMstr;
	}

	public String getAtdcPhyName() {
		return this.atdcPhyName;
	}

	public void setAtdcPhyName(String atdcPhyName) {
		this.atdcPhyName = atdcPhyName;
	}

	public String getAtdcDir() {
		return this.atdcDir;
	}

	public void setAtdcDir(String atdcDir) {
		this.atdcDir = atdcDir;
	}

	public String getAtdcHost() {
		return this.atdcHost;
	}

	public void setAtdcHost(String atdcHost) {
		this.atdcHost = atdcHost;
	}

	public String getAtdcServer() {
		return this.atdcServer;
	}

	public void setAtdcServer(String atdcServer) {
		this.atdcServer = atdcServer;
	}

	public String getAtdcType() {
		return this.atdcType;
	}

	public void setAtdcType(String atdcType) {
		this.atdcType = atdcType;
	}

	public String getAtdcNetwork() {
		return this.atdcNetwork;
	}

	public void setAtdcNetwork(String atdcNetwork) {
		this.atdcNetwork = atdcNetwork;
	}

	public String getAtdcParmfile() {
		return this.atdcParmfile;
	}

	public void setAtdcParmfile(String atdcParmfile) {
		this.atdcParmfile = atdcParmfile;
	}

	public Boolean getAtdcOnline() {
		return this.atdcOnline;
	}

	public void setAtdcOnline(Boolean atdcOnline) {
		this.atdcOnline = atdcOnline;
	}

	public String getAtdcDesc() {
		return this.atdcDesc;
	}

	public void setAtdcDesc(String atdcDesc) {
		this.atdcDesc = atdcDesc;
	}

	public Date getAtdcQadt01() {
		return this.atdcQadt01;
	}

	public void setAtdcQadt01(Date atdcQadt01) {
		this.atdcQadt01 = atdcQadt01;
	}

	public Date getAtdcQadt02() {
		return this.atdcQadt02;
	}

	public void setAtdcQadt02(Date atdcQadt02) {
		this.atdcQadt02 = atdcQadt02;
	}

	public Date getAtdcModDate() {
		return this.atdcModDate;
	}

	public void setAtdcModDate(Date atdcModDate) {
		this.atdcModDate = atdcModDate;
	}

	public String getAtdcModUserid() {
		return this.atdcModUserid;
	}

	public void setAtdcModUserid(String atdcModUserid) {
		this.atdcModUserid = atdcModUserid;
	}

	public String getAtdcUser1() {
		return this.atdcUser1;
	}

	public void setAtdcUser1(String atdcUser1) {
		this.atdcUser1 = atdcUser1;
	}

	public String getAtdcUser2() {
		return this.atdcUser2;
	}

	public void setAtdcUser2(String atdcUser2) {
		this.atdcUser2 = atdcUser2;
	}

	public String getAtdcQadc01() {
		return this.atdcQadc01;
	}

	public void setAtdcQadc01(String atdcQadc01) {
		this.atdcQadc01 = atdcQadc01;
	}

	public String getAtdcQadc02() {
		return this.atdcQadc02;
	}

	public void setAtdcQadc02(String atdcQadc02) {
		this.atdcQadc02 = atdcQadc02;
	}

}