package com.gopawpaw.erp.hibernate.w;

/**
 * AbstractWocCtrl entity provides the base persistence definition of the
 * WocCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWocCtrl implements java.io.Serializable {

	// Fields

	private String wocDomain;
	private Boolean wocAutoNbr;
	private Integer wocNbr;
	private Integer wocQadi01;
	private Boolean wocWcmmts;
	private Boolean wocRcmmts;
	private Boolean wocMove;
	private Integer wocPaperLt;
	private Boolean wocQadl02;
	private Boolean wocQadl01;
	private String wocUser1;
	private String wocUser2;
	private Integer wocQadi02;
	private String wocSched;
	private String wocTimeInd;
	private Boolean wocLbrUp;
	private Boolean wocBdnUp;
	private Boolean wocGlLbr;
	private Boolean wocGlBdn;
	private Boolean wocVar;
	private String wocNbrPre;
	private Double oidWocCtrl;

	// Constructors

	/** default constructor */
	public AbstractWocCtrl() {
	}

	/** minimal constructor */
	public AbstractWocCtrl(Double oidWocCtrl) {
		this.oidWocCtrl = oidWocCtrl;
	}

	/** full constructor */
	public AbstractWocCtrl(Boolean wocAutoNbr, Integer wocNbr,
			Integer wocQadi01, Boolean wocWcmmts, Boolean wocRcmmts,
			Boolean wocMove, Integer wocPaperLt, Boolean wocQadl02,
			Boolean wocQadl01, String wocUser1, String wocUser2,
			Integer wocQadi02, String wocSched, String wocTimeInd,
			Boolean wocLbrUp, Boolean wocBdnUp, Boolean wocGlLbr,
			Boolean wocGlBdn, Boolean wocVar, String wocNbrPre,
			Double oidWocCtrl) {
		this.wocAutoNbr = wocAutoNbr;
		this.wocNbr = wocNbr;
		this.wocQadi01 = wocQadi01;
		this.wocWcmmts = wocWcmmts;
		this.wocRcmmts = wocRcmmts;
		this.wocMove = wocMove;
		this.wocPaperLt = wocPaperLt;
		this.wocQadl02 = wocQadl02;
		this.wocQadl01 = wocQadl01;
		this.wocUser1 = wocUser1;
		this.wocUser2 = wocUser2;
		this.wocQadi02 = wocQadi02;
		this.wocSched = wocSched;
		this.wocTimeInd = wocTimeInd;
		this.wocLbrUp = wocLbrUp;
		this.wocBdnUp = wocBdnUp;
		this.wocGlLbr = wocGlLbr;
		this.wocGlBdn = wocGlBdn;
		this.wocVar = wocVar;
		this.wocNbrPre = wocNbrPre;
		this.oidWocCtrl = oidWocCtrl;
	}

	// Property accessors

	public String getWocDomain() {
		return this.wocDomain;
	}

	public void setWocDomain(String wocDomain) {
		this.wocDomain = wocDomain;
	}

	public Boolean getWocAutoNbr() {
		return this.wocAutoNbr;
	}

	public void setWocAutoNbr(Boolean wocAutoNbr) {
		this.wocAutoNbr = wocAutoNbr;
	}

	public Integer getWocNbr() {
		return this.wocNbr;
	}

	public void setWocNbr(Integer wocNbr) {
		this.wocNbr = wocNbr;
	}

	public Integer getWocQadi01() {
		return this.wocQadi01;
	}

	public void setWocQadi01(Integer wocQadi01) {
		this.wocQadi01 = wocQadi01;
	}

	public Boolean getWocWcmmts() {
		return this.wocWcmmts;
	}

	public void setWocWcmmts(Boolean wocWcmmts) {
		this.wocWcmmts = wocWcmmts;
	}

	public Boolean getWocRcmmts() {
		return this.wocRcmmts;
	}

	public void setWocRcmmts(Boolean wocRcmmts) {
		this.wocRcmmts = wocRcmmts;
	}

	public Boolean getWocMove() {
		return this.wocMove;
	}

	public void setWocMove(Boolean wocMove) {
		this.wocMove = wocMove;
	}

	public Integer getWocPaperLt() {
		return this.wocPaperLt;
	}

	public void setWocPaperLt(Integer wocPaperLt) {
		this.wocPaperLt = wocPaperLt;
	}

	public Boolean getWocQadl02() {
		return this.wocQadl02;
	}

	public void setWocQadl02(Boolean wocQadl02) {
		this.wocQadl02 = wocQadl02;
	}

	public Boolean getWocQadl01() {
		return this.wocQadl01;
	}

	public void setWocQadl01(Boolean wocQadl01) {
		this.wocQadl01 = wocQadl01;
	}

	public String getWocUser1() {
		return this.wocUser1;
	}

	public void setWocUser1(String wocUser1) {
		this.wocUser1 = wocUser1;
	}

	public String getWocUser2() {
		return this.wocUser2;
	}

	public void setWocUser2(String wocUser2) {
		this.wocUser2 = wocUser2;
	}

	public Integer getWocQadi02() {
		return this.wocQadi02;
	}

	public void setWocQadi02(Integer wocQadi02) {
		this.wocQadi02 = wocQadi02;
	}

	public String getWocSched() {
		return this.wocSched;
	}

	public void setWocSched(String wocSched) {
		this.wocSched = wocSched;
	}

	public String getWocTimeInd() {
		return this.wocTimeInd;
	}

	public void setWocTimeInd(String wocTimeInd) {
		this.wocTimeInd = wocTimeInd;
	}

	public Boolean getWocLbrUp() {
		return this.wocLbrUp;
	}

	public void setWocLbrUp(Boolean wocLbrUp) {
		this.wocLbrUp = wocLbrUp;
	}

	public Boolean getWocBdnUp() {
		return this.wocBdnUp;
	}

	public void setWocBdnUp(Boolean wocBdnUp) {
		this.wocBdnUp = wocBdnUp;
	}

	public Boolean getWocGlLbr() {
		return this.wocGlLbr;
	}

	public void setWocGlLbr(Boolean wocGlLbr) {
		this.wocGlLbr = wocGlLbr;
	}

	public Boolean getWocGlBdn() {
		return this.wocGlBdn;
	}

	public void setWocGlBdn(Boolean wocGlBdn) {
		this.wocGlBdn = wocGlBdn;
	}

	public Boolean getWocVar() {
		return this.wocVar;
	}

	public void setWocVar(Boolean wocVar) {
		this.wocVar = wocVar;
	}

	public String getWocNbrPre() {
		return this.wocNbrPre;
	}

	public void setWocNbrPre(String wocNbrPre) {
		this.wocNbrPre = wocNbrPre;
	}

	public Double getOidWocCtrl() {
		return this.oidWocCtrl;
	}

	public void setOidWocCtrl(Double oidWocCtrl) {
		this.oidWocCtrl = oidWocCtrl;
	}

}