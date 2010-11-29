package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMofMstr entity provides the base persistence definition of the
 * MofMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMofMstr implements java.io.Serializable {

	// Fields

	private String mofKey;
	private Integer mofFromLogin;
	private Integer mofToLogin;
	private Integer mofFromIdleMenu;
	private Integer mofFromIdleProg;
	private Boolean mofFilter;
	private String mofFromUserid;
	private String mofToUserid;
	private String mofFromSel;
	private String mofToSel;
	private Boolean mofBind;
	private String mofDesc;
	private Integer mofSessions;
	private String mofUser1;
	private String mofUser2;
	private String mofQadc01;
	private Double mofQadd01;
	private Integer mofQadi01;
	private Boolean mofQadl01;
	private Date mofQadt01;
	private Double oidMofMstr;

	// Constructors

	/** default constructor */
	public AbstractMofMstr() {
	}

	/** minimal constructor */
	public AbstractMofMstr(Double oidMofMstr) {
		this.oidMofMstr = oidMofMstr;
	}

	/** full constructor */
	public AbstractMofMstr(Integer mofFromLogin, Integer mofToLogin,
			Integer mofFromIdleMenu, Integer mofFromIdleProg,
			Boolean mofFilter, String mofFromUserid, String mofToUserid,
			String mofFromSel, String mofToSel, Boolean mofBind,
			String mofDesc, Integer mofSessions, String mofUser1,
			String mofUser2, String mofQadc01, Double mofQadd01,
			Integer mofQadi01, Boolean mofQadl01, Date mofQadt01,
			Double oidMofMstr) {
		this.mofFromLogin = mofFromLogin;
		this.mofToLogin = mofToLogin;
		this.mofFromIdleMenu = mofFromIdleMenu;
		this.mofFromIdleProg = mofFromIdleProg;
		this.mofFilter = mofFilter;
		this.mofFromUserid = mofFromUserid;
		this.mofToUserid = mofToUserid;
		this.mofFromSel = mofFromSel;
		this.mofToSel = mofToSel;
		this.mofBind = mofBind;
		this.mofDesc = mofDesc;
		this.mofSessions = mofSessions;
		this.mofUser1 = mofUser1;
		this.mofUser2 = mofUser2;
		this.mofQadc01 = mofQadc01;
		this.mofQadd01 = mofQadd01;
		this.mofQadi01 = mofQadi01;
		this.mofQadl01 = mofQadl01;
		this.mofQadt01 = mofQadt01;
		this.oidMofMstr = oidMofMstr;
	}

	// Property accessors

	public String getMofKey() {
		return this.mofKey;
	}

	public void setMofKey(String mofKey) {
		this.mofKey = mofKey;
	}

	public Integer getMofFromLogin() {
		return this.mofFromLogin;
	}

	public void setMofFromLogin(Integer mofFromLogin) {
		this.mofFromLogin = mofFromLogin;
	}

	public Integer getMofToLogin() {
		return this.mofToLogin;
	}

	public void setMofToLogin(Integer mofToLogin) {
		this.mofToLogin = mofToLogin;
	}

	public Integer getMofFromIdleMenu() {
		return this.mofFromIdleMenu;
	}

	public void setMofFromIdleMenu(Integer mofFromIdleMenu) {
		this.mofFromIdleMenu = mofFromIdleMenu;
	}

	public Integer getMofFromIdleProg() {
		return this.mofFromIdleProg;
	}

	public void setMofFromIdleProg(Integer mofFromIdleProg) {
		this.mofFromIdleProg = mofFromIdleProg;
	}

	public Boolean getMofFilter() {
		return this.mofFilter;
	}

	public void setMofFilter(Boolean mofFilter) {
		this.mofFilter = mofFilter;
	}

	public String getMofFromUserid() {
		return this.mofFromUserid;
	}

	public void setMofFromUserid(String mofFromUserid) {
		this.mofFromUserid = mofFromUserid;
	}

	public String getMofToUserid() {
		return this.mofToUserid;
	}

	public void setMofToUserid(String mofToUserid) {
		this.mofToUserid = mofToUserid;
	}

	public String getMofFromSel() {
		return this.mofFromSel;
	}

	public void setMofFromSel(String mofFromSel) {
		this.mofFromSel = mofFromSel;
	}

	public String getMofToSel() {
		return this.mofToSel;
	}

	public void setMofToSel(String mofToSel) {
		this.mofToSel = mofToSel;
	}

	public Boolean getMofBind() {
		return this.mofBind;
	}

	public void setMofBind(Boolean mofBind) {
		this.mofBind = mofBind;
	}

	public String getMofDesc() {
		return this.mofDesc;
	}

	public void setMofDesc(String mofDesc) {
		this.mofDesc = mofDesc;
	}

	public Integer getMofSessions() {
		return this.mofSessions;
	}

	public void setMofSessions(Integer mofSessions) {
		this.mofSessions = mofSessions;
	}

	public String getMofUser1() {
		return this.mofUser1;
	}

	public void setMofUser1(String mofUser1) {
		this.mofUser1 = mofUser1;
	}

	public String getMofUser2() {
		return this.mofUser2;
	}

	public void setMofUser2(String mofUser2) {
		this.mofUser2 = mofUser2;
	}

	public String getMofQadc01() {
		return this.mofQadc01;
	}

	public void setMofQadc01(String mofQadc01) {
		this.mofQadc01 = mofQadc01;
	}

	public Double getMofQadd01() {
		return this.mofQadd01;
	}

	public void setMofQadd01(Double mofQadd01) {
		this.mofQadd01 = mofQadd01;
	}

	public Integer getMofQadi01() {
		return this.mofQadi01;
	}

	public void setMofQadi01(Integer mofQadi01) {
		this.mofQadi01 = mofQadi01;
	}

	public Boolean getMofQadl01() {
		return this.mofQadl01;
	}

	public void setMofQadl01(Boolean mofQadl01) {
		this.mofQadl01 = mofQadl01;
	}

	public Date getMofQadt01() {
		return this.mofQadt01;
	}

	public void setMofQadt01(Date mofQadt01) {
		this.mofQadt01 = mofQadt01;
	}

	public Double getOidMofMstr() {
		return this.oidMofMstr;
	}

	public void setOidMofMstr(Double oidMofMstr) {
		this.oidMofMstr = oidMofMstr;
	}

}