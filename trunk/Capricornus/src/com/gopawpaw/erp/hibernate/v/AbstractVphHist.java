package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVphHist entity provides the base persistence definition of the
 * VphHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVphHist implements java.io.Serializable {

	// Fields

	private VphHistId id;
	private Double vphCurrAmt;
	private String vphQadc02;
	private Integer vphQadi01;
	private String vphNbr;
	private Double vphInvCost;
	private Double vphInvQty;
	private Date vphInvDate;
	private String vphUser1;
	private String vphUser2;
	private String vphAvgPost;
	private String vphAcct;
	private String vphCc;
	private Double vphAmt;
	private String vphElement;
	private String vphQadc01;
	private String vphProject;
	private String vphCostadjAcct;
	private String vphCostadjSub;
	private String vphCostadjCc;
	private String vphDscrAcct;
	private String vphDscrSub;
	private String vphDscrCc;
	private String vphSub;
	private Boolean vphAdjInv;
	private Boolean vphAdjWip;
	private Double vphAdjAmt;
	private Double vphDscrAmt;
	private Double vphCfAdjAmt;
	private Double vphCfDscrAmt;
	private Double vphAdjPrvCst;
	private Double vphQohAtAdj;
	private Double oidVphHist;

	// Constructors

	/** default constructor */
	public AbstractVphHist() {
	}

	/** minimal constructor */
	public AbstractVphHist(VphHistId id, String vphAvgPost, Double oidVphHist) {
		this.id = id;
		this.vphAvgPost = vphAvgPost;
		this.oidVphHist = oidVphHist;
	}

	/** full constructor */
	public AbstractVphHist(VphHistId id, Double vphCurrAmt, String vphQadc02,
			Integer vphQadi01, String vphNbr, Double vphInvCost,
			Double vphInvQty, Date vphInvDate, String vphUser1,
			String vphUser2, String vphAvgPost, String vphAcct, String vphCc,
			Double vphAmt, String vphElement, String vphQadc01,
			String vphProject, String vphCostadjAcct, String vphCostadjSub,
			String vphCostadjCc, String vphDscrAcct, String vphDscrSub,
			String vphDscrCc, String vphSub, Boolean vphAdjInv,
			Boolean vphAdjWip, Double vphAdjAmt, Double vphDscrAmt,
			Double vphCfAdjAmt, Double vphCfDscrAmt, Double vphAdjPrvCst,
			Double vphQohAtAdj, Double oidVphHist) {
		this.id = id;
		this.vphCurrAmt = vphCurrAmt;
		this.vphQadc02 = vphQadc02;
		this.vphQadi01 = vphQadi01;
		this.vphNbr = vphNbr;
		this.vphInvCost = vphInvCost;
		this.vphInvQty = vphInvQty;
		this.vphInvDate = vphInvDate;
		this.vphUser1 = vphUser1;
		this.vphUser2 = vphUser2;
		this.vphAvgPost = vphAvgPost;
		this.vphAcct = vphAcct;
		this.vphCc = vphCc;
		this.vphAmt = vphAmt;
		this.vphElement = vphElement;
		this.vphQadc01 = vphQadc01;
		this.vphProject = vphProject;
		this.vphCostadjAcct = vphCostadjAcct;
		this.vphCostadjSub = vphCostadjSub;
		this.vphCostadjCc = vphCostadjCc;
		this.vphDscrAcct = vphDscrAcct;
		this.vphDscrSub = vphDscrSub;
		this.vphDscrCc = vphDscrCc;
		this.vphSub = vphSub;
		this.vphAdjInv = vphAdjInv;
		this.vphAdjWip = vphAdjWip;
		this.vphAdjAmt = vphAdjAmt;
		this.vphDscrAmt = vphDscrAmt;
		this.vphCfAdjAmt = vphCfAdjAmt;
		this.vphCfDscrAmt = vphCfDscrAmt;
		this.vphAdjPrvCst = vphAdjPrvCst;
		this.vphQohAtAdj = vphQohAtAdj;
		this.oidVphHist = oidVphHist;
	}

	// Property accessors

	public VphHistId getId() {
		return this.id;
	}

	public void setId(VphHistId id) {
		this.id = id;
	}

	public Double getVphCurrAmt() {
		return this.vphCurrAmt;
	}

	public void setVphCurrAmt(Double vphCurrAmt) {
		this.vphCurrAmt = vphCurrAmt;
	}

	public String getVphQadc02() {
		return this.vphQadc02;
	}

	public void setVphQadc02(String vphQadc02) {
		this.vphQadc02 = vphQadc02;
	}

	public Integer getVphQadi01() {
		return this.vphQadi01;
	}

	public void setVphQadi01(Integer vphQadi01) {
		this.vphQadi01 = vphQadi01;
	}

	public String getVphNbr() {
		return this.vphNbr;
	}

	public void setVphNbr(String vphNbr) {
		this.vphNbr = vphNbr;
	}

	public Double getVphInvCost() {
		return this.vphInvCost;
	}

	public void setVphInvCost(Double vphInvCost) {
		this.vphInvCost = vphInvCost;
	}

	public Double getVphInvQty() {
		return this.vphInvQty;
	}

	public void setVphInvQty(Double vphInvQty) {
		this.vphInvQty = vphInvQty;
	}

	public Date getVphInvDate() {
		return this.vphInvDate;
	}

	public void setVphInvDate(Date vphInvDate) {
		this.vphInvDate = vphInvDate;
	}

	public String getVphUser1() {
		return this.vphUser1;
	}

	public void setVphUser1(String vphUser1) {
		this.vphUser1 = vphUser1;
	}

	public String getVphUser2() {
		return this.vphUser2;
	}

	public void setVphUser2(String vphUser2) {
		this.vphUser2 = vphUser2;
	}

	public String getVphAvgPost() {
		return this.vphAvgPost;
	}

	public void setVphAvgPost(String vphAvgPost) {
		this.vphAvgPost = vphAvgPost;
	}

	public String getVphAcct() {
		return this.vphAcct;
	}

	public void setVphAcct(String vphAcct) {
		this.vphAcct = vphAcct;
	}

	public String getVphCc() {
		return this.vphCc;
	}

	public void setVphCc(String vphCc) {
		this.vphCc = vphCc;
	}

	public Double getVphAmt() {
		return this.vphAmt;
	}

	public void setVphAmt(Double vphAmt) {
		this.vphAmt = vphAmt;
	}

	public String getVphElement() {
		return this.vphElement;
	}

	public void setVphElement(String vphElement) {
		this.vphElement = vphElement;
	}

	public String getVphQadc01() {
		return this.vphQadc01;
	}

	public void setVphQadc01(String vphQadc01) {
		this.vphQadc01 = vphQadc01;
	}

	public String getVphProject() {
		return this.vphProject;
	}

	public void setVphProject(String vphProject) {
		this.vphProject = vphProject;
	}

	public String getVphCostadjAcct() {
		return this.vphCostadjAcct;
	}

	public void setVphCostadjAcct(String vphCostadjAcct) {
		this.vphCostadjAcct = vphCostadjAcct;
	}

	public String getVphCostadjSub() {
		return this.vphCostadjSub;
	}

	public void setVphCostadjSub(String vphCostadjSub) {
		this.vphCostadjSub = vphCostadjSub;
	}

	public String getVphCostadjCc() {
		return this.vphCostadjCc;
	}

	public void setVphCostadjCc(String vphCostadjCc) {
		this.vphCostadjCc = vphCostadjCc;
	}

	public String getVphDscrAcct() {
		return this.vphDscrAcct;
	}

	public void setVphDscrAcct(String vphDscrAcct) {
		this.vphDscrAcct = vphDscrAcct;
	}

	public String getVphDscrSub() {
		return this.vphDscrSub;
	}

	public void setVphDscrSub(String vphDscrSub) {
		this.vphDscrSub = vphDscrSub;
	}

	public String getVphDscrCc() {
		return this.vphDscrCc;
	}

	public void setVphDscrCc(String vphDscrCc) {
		this.vphDscrCc = vphDscrCc;
	}

	public String getVphSub() {
		return this.vphSub;
	}

	public void setVphSub(String vphSub) {
		this.vphSub = vphSub;
	}

	public Boolean getVphAdjInv() {
		return this.vphAdjInv;
	}

	public void setVphAdjInv(Boolean vphAdjInv) {
		this.vphAdjInv = vphAdjInv;
	}

	public Boolean getVphAdjWip() {
		return this.vphAdjWip;
	}

	public void setVphAdjWip(Boolean vphAdjWip) {
		this.vphAdjWip = vphAdjWip;
	}

	public Double getVphAdjAmt() {
		return this.vphAdjAmt;
	}

	public void setVphAdjAmt(Double vphAdjAmt) {
		this.vphAdjAmt = vphAdjAmt;
	}

	public Double getVphDscrAmt() {
		return this.vphDscrAmt;
	}

	public void setVphDscrAmt(Double vphDscrAmt) {
		this.vphDscrAmt = vphDscrAmt;
	}

	public Double getVphCfAdjAmt() {
		return this.vphCfAdjAmt;
	}

	public void setVphCfAdjAmt(Double vphCfAdjAmt) {
		this.vphCfAdjAmt = vphCfAdjAmt;
	}

	public Double getVphCfDscrAmt() {
		return this.vphCfDscrAmt;
	}

	public void setVphCfDscrAmt(Double vphCfDscrAmt) {
		this.vphCfDscrAmt = vphCfDscrAmt;
	}

	public Double getVphAdjPrvCst() {
		return this.vphAdjPrvCst;
	}

	public void setVphAdjPrvCst(Double vphAdjPrvCst) {
		this.vphAdjPrvCst = vphAdjPrvCst;
	}

	public Double getVphQohAtAdj() {
		return this.vphQohAtAdj;
	}

	public void setVphQohAtAdj(Double vphQohAtAdj) {
		this.vphQohAtAdj = vphQohAtAdj;
	}

	public Double getOidVphHist() {
		return this.oidVphHist;
	}

	public void setOidVphHist(Double oidVphHist) {
		this.oidVphHist = oidVphHist;
	}

}