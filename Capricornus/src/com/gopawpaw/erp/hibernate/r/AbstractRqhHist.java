package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqhHist entity provides the base persistence definition of the
 * RqhHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqhHist implements java.io.Serializable {

	// Fields

	private RqhHistId id;
	private Integer rqhLine;
	private String rqhAprUserid;
	private String rqhRole;
	private String rqhAction;
	private String rqhEntUserid;
	private String rqhRttoUserid;
	private String rqhEmailList;
	private String rqhRoleList;
	private String rqhChr01;
	private String rqhChr02;
	private String rqhChr03;
	private String rqhChr04;
	private String rqhQadc01;
	private String rqhQadc02;
	private String rqhQadc03;
	private String rqhQadc04;
	private Double oidRqhHist;

	// Constructors

	/** default constructor */
	public AbstractRqhHist() {
	}

	/** minimal constructor */
	public AbstractRqhHist(RqhHistId id, Double oidRqhHist) {
		this.id = id;
		this.oidRqhHist = oidRqhHist;
	}

	/** full constructor */
	public AbstractRqhHist(RqhHistId id, Integer rqhLine, String rqhAprUserid,
			String rqhRole, String rqhAction, String rqhEntUserid,
			String rqhRttoUserid, String rqhEmailList, String rqhRoleList,
			String rqhChr01, String rqhChr02, String rqhChr03, String rqhChr04,
			String rqhQadc01, String rqhQadc02, String rqhQadc03,
			String rqhQadc04, Double oidRqhHist) {
		this.id = id;
		this.rqhLine = rqhLine;
		this.rqhAprUserid = rqhAprUserid;
		this.rqhRole = rqhRole;
		this.rqhAction = rqhAction;
		this.rqhEntUserid = rqhEntUserid;
		this.rqhRttoUserid = rqhRttoUserid;
		this.rqhEmailList = rqhEmailList;
		this.rqhRoleList = rqhRoleList;
		this.rqhChr01 = rqhChr01;
		this.rqhChr02 = rqhChr02;
		this.rqhChr03 = rqhChr03;
		this.rqhChr04 = rqhChr04;
		this.rqhQadc01 = rqhQadc01;
		this.rqhQadc02 = rqhQadc02;
		this.rqhQadc03 = rqhQadc03;
		this.rqhQadc04 = rqhQadc04;
		this.oidRqhHist = oidRqhHist;
	}

	// Property accessors

	public RqhHistId getId() {
		return this.id;
	}

	public void setId(RqhHistId id) {
		this.id = id;
	}

	public Integer getRqhLine() {
		return this.rqhLine;
	}

	public void setRqhLine(Integer rqhLine) {
		this.rqhLine = rqhLine;
	}

	public String getRqhAprUserid() {
		return this.rqhAprUserid;
	}

	public void setRqhAprUserid(String rqhAprUserid) {
		this.rqhAprUserid = rqhAprUserid;
	}

	public String getRqhRole() {
		return this.rqhRole;
	}

	public void setRqhRole(String rqhRole) {
		this.rqhRole = rqhRole;
	}

	public String getRqhAction() {
		return this.rqhAction;
	}

	public void setRqhAction(String rqhAction) {
		this.rqhAction = rqhAction;
	}

	public String getRqhEntUserid() {
		return this.rqhEntUserid;
	}

	public void setRqhEntUserid(String rqhEntUserid) {
		this.rqhEntUserid = rqhEntUserid;
	}

	public String getRqhRttoUserid() {
		return this.rqhRttoUserid;
	}

	public void setRqhRttoUserid(String rqhRttoUserid) {
		this.rqhRttoUserid = rqhRttoUserid;
	}

	public String getRqhEmailList() {
		return this.rqhEmailList;
	}

	public void setRqhEmailList(String rqhEmailList) {
		this.rqhEmailList = rqhEmailList;
	}

	public String getRqhRoleList() {
		return this.rqhRoleList;
	}

	public void setRqhRoleList(String rqhRoleList) {
		this.rqhRoleList = rqhRoleList;
	}

	public String getRqhChr01() {
		return this.rqhChr01;
	}

	public void setRqhChr01(String rqhChr01) {
		this.rqhChr01 = rqhChr01;
	}

	public String getRqhChr02() {
		return this.rqhChr02;
	}

	public void setRqhChr02(String rqhChr02) {
		this.rqhChr02 = rqhChr02;
	}

	public String getRqhChr03() {
		return this.rqhChr03;
	}

	public void setRqhChr03(String rqhChr03) {
		this.rqhChr03 = rqhChr03;
	}

	public String getRqhChr04() {
		return this.rqhChr04;
	}

	public void setRqhChr04(String rqhChr04) {
		this.rqhChr04 = rqhChr04;
	}

	public String getRqhQadc01() {
		return this.rqhQadc01;
	}

	public void setRqhQadc01(String rqhQadc01) {
		this.rqhQadc01 = rqhQadc01;
	}

	public String getRqhQadc02() {
		return this.rqhQadc02;
	}

	public void setRqhQadc02(String rqhQadc02) {
		this.rqhQadc02 = rqhQadc02;
	}

	public String getRqhQadc03() {
		return this.rqhQadc03;
	}

	public void setRqhQadc03(String rqhQadc03) {
		this.rqhQadc03 = rqhQadc03;
	}

	public String getRqhQadc04() {
		return this.rqhQadc04;
	}

	public void setRqhQadc04(String rqhQadc04) {
		this.rqhQadc04 = rqhQadc04;
	}

	public Double getOidRqhHist() {
		return this.oidRqhHist;
	}

	public void setOidRqhHist(Double oidRqhHist) {
		this.oidRqhHist = oidRqhHist;
	}

}