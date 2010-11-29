package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSeocCtrl entity provides the base persistence definition of the
 * SeocCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSeocCtrl implements java.io.Serializable {

	// Fields

	private String seocDomain;
	private Integer seocBoAdvice;
	private Boolean seocQadl01;
	private Integer seocDnote;
	private Boolean seocImmedShip;
	private String seocChr01;
	private String seocChr02;
	private String seocChr03;
	private String seocChr04;
	private String seocChr05;
	private Double seocDec01;
	private Double seocDec02;
	private Date seocDte01;
	private Date seocDte02;
	private Boolean seocLog01;
	private Boolean seocLog02;
	private Integer seocIndex1;
	private String seocSoPre;
	private Boolean seocHcmmts;
	private Boolean seocLcmmts;
	private Integer seocSo;
	private Boolean seocDetAll;
	private Integer seocAllDays;
	private Boolean seocLnFmt;
	private Boolean seocSoHist;
	private Boolean seocKitAuto;
	private Boolean seocQadl02;
	private Integer seocKitNbr;
	private Boolean seocConsume;
	private Boolean seocShipTo;
	private Double seocQadd01;
	private Boolean seocReq;
	private Integer seocShpLead;
	private String seocIntCust;
	private Boolean seocConfirm;
	private String seocUser1;
	private String seocUser2;
	private Date seocModDate;
	private String seocModUserid;
	private String seocKitPre;
	private String seocQadc02;
	private Integer seocQadi01;
	private String seocExRatetype;
	private String seocQadc03;
	private Double seocQadd02;
	private Integer seocQadi02;
	private Date seocQadt01;
	private Date seocQadt02;
	private Double oidSeocCtrl;

	// Constructors

	/** default constructor */
	public AbstractSeocCtrl() {
	}

	/** minimal constructor */
	public AbstractSeocCtrl(String seocIntCust, String seocExRatetype,
			Double oidSeocCtrl) {
		this.seocIntCust = seocIntCust;
		this.seocExRatetype = seocExRatetype;
		this.oidSeocCtrl = oidSeocCtrl;
	}

	/** full constructor */
	public AbstractSeocCtrl(Integer seocBoAdvice, Boolean seocQadl01,
			Integer seocDnote, Boolean seocImmedShip, String seocChr01,
			String seocChr02, String seocChr03, String seocChr04,
			String seocChr05, Double seocDec01, Double seocDec02,
			Date seocDte01, Date seocDte02, Boolean seocLog01,
			Boolean seocLog02, Integer seocIndex1, String seocSoPre,
			Boolean seocHcmmts, Boolean seocLcmmts, Integer seocSo,
			Boolean seocDetAll, Integer seocAllDays, Boolean seocLnFmt,
			Boolean seocSoHist, Boolean seocKitAuto, Boolean seocQadl02,
			Integer seocKitNbr, Boolean seocConsume, Boolean seocShipTo,
			Double seocQadd01, Boolean seocReq, Integer seocShpLead,
			String seocIntCust, Boolean seocConfirm, String seocUser1,
			String seocUser2, Date seocModDate, String seocModUserid,
			String seocKitPre, String seocQadc02, Integer seocQadi01,
			String seocExRatetype, String seocQadc03, Double seocQadd02,
			Integer seocQadi02, Date seocQadt01, Date seocQadt02,
			Double oidSeocCtrl) {
		this.seocBoAdvice = seocBoAdvice;
		this.seocQadl01 = seocQadl01;
		this.seocDnote = seocDnote;
		this.seocImmedShip = seocImmedShip;
		this.seocChr01 = seocChr01;
		this.seocChr02 = seocChr02;
		this.seocChr03 = seocChr03;
		this.seocChr04 = seocChr04;
		this.seocChr05 = seocChr05;
		this.seocDec01 = seocDec01;
		this.seocDec02 = seocDec02;
		this.seocDte01 = seocDte01;
		this.seocDte02 = seocDte02;
		this.seocLog01 = seocLog01;
		this.seocLog02 = seocLog02;
		this.seocIndex1 = seocIndex1;
		this.seocSoPre = seocSoPre;
		this.seocHcmmts = seocHcmmts;
		this.seocLcmmts = seocLcmmts;
		this.seocSo = seocSo;
		this.seocDetAll = seocDetAll;
		this.seocAllDays = seocAllDays;
		this.seocLnFmt = seocLnFmt;
		this.seocSoHist = seocSoHist;
		this.seocKitAuto = seocKitAuto;
		this.seocQadl02 = seocQadl02;
		this.seocKitNbr = seocKitNbr;
		this.seocConsume = seocConsume;
		this.seocShipTo = seocShipTo;
		this.seocQadd01 = seocQadd01;
		this.seocReq = seocReq;
		this.seocShpLead = seocShpLead;
		this.seocIntCust = seocIntCust;
		this.seocConfirm = seocConfirm;
		this.seocUser1 = seocUser1;
		this.seocUser2 = seocUser2;
		this.seocModDate = seocModDate;
		this.seocModUserid = seocModUserid;
		this.seocKitPre = seocKitPre;
		this.seocQadc02 = seocQadc02;
		this.seocQadi01 = seocQadi01;
		this.seocExRatetype = seocExRatetype;
		this.seocQadc03 = seocQadc03;
		this.seocQadd02 = seocQadd02;
		this.seocQadi02 = seocQadi02;
		this.seocQadt01 = seocQadt01;
		this.seocQadt02 = seocQadt02;
		this.oidSeocCtrl = oidSeocCtrl;
	}

	// Property accessors

	public String getSeocDomain() {
		return this.seocDomain;
	}

	public void setSeocDomain(String seocDomain) {
		this.seocDomain = seocDomain;
	}

	public Integer getSeocBoAdvice() {
		return this.seocBoAdvice;
	}

	public void setSeocBoAdvice(Integer seocBoAdvice) {
		this.seocBoAdvice = seocBoAdvice;
	}

	public Boolean getSeocQadl01() {
		return this.seocQadl01;
	}

	public void setSeocQadl01(Boolean seocQadl01) {
		this.seocQadl01 = seocQadl01;
	}

	public Integer getSeocDnote() {
		return this.seocDnote;
	}

	public void setSeocDnote(Integer seocDnote) {
		this.seocDnote = seocDnote;
	}

	public Boolean getSeocImmedShip() {
		return this.seocImmedShip;
	}

	public void setSeocImmedShip(Boolean seocImmedShip) {
		this.seocImmedShip = seocImmedShip;
	}

	public String getSeocChr01() {
		return this.seocChr01;
	}

	public void setSeocChr01(String seocChr01) {
		this.seocChr01 = seocChr01;
	}

	public String getSeocChr02() {
		return this.seocChr02;
	}

	public void setSeocChr02(String seocChr02) {
		this.seocChr02 = seocChr02;
	}

	public String getSeocChr03() {
		return this.seocChr03;
	}

	public void setSeocChr03(String seocChr03) {
		this.seocChr03 = seocChr03;
	}

	public String getSeocChr04() {
		return this.seocChr04;
	}

	public void setSeocChr04(String seocChr04) {
		this.seocChr04 = seocChr04;
	}

	public String getSeocChr05() {
		return this.seocChr05;
	}

	public void setSeocChr05(String seocChr05) {
		this.seocChr05 = seocChr05;
	}

	public Double getSeocDec01() {
		return this.seocDec01;
	}

	public void setSeocDec01(Double seocDec01) {
		this.seocDec01 = seocDec01;
	}

	public Double getSeocDec02() {
		return this.seocDec02;
	}

	public void setSeocDec02(Double seocDec02) {
		this.seocDec02 = seocDec02;
	}

	public Date getSeocDte01() {
		return this.seocDte01;
	}

	public void setSeocDte01(Date seocDte01) {
		this.seocDte01 = seocDte01;
	}

	public Date getSeocDte02() {
		return this.seocDte02;
	}

	public void setSeocDte02(Date seocDte02) {
		this.seocDte02 = seocDte02;
	}

	public Boolean getSeocLog01() {
		return this.seocLog01;
	}

	public void setSeocLog01(Boolean seocLog01) {
		this.seocLog01 = seocLog01;
	}

	public Boolean getSeocLog02() {
		return this.seocLog02;
	}

	public void setSeocLog02(Boolean seocLog02) {
		this.seocLog02 = seocLog02;
	}

	public Integer getSeocIndex1() {
		return this.seocIndex1;
	}

	public void setSeocIndex1(Integer seocIndex1) {
		this.seocIndex1 = seocIndex1;
	}

	public String getSeocSoPre() {
		return this.seocSoPre;
	}

	public void setSeocSoPre(String seocSoPre) {
		this.seocSoPre = seocSoPre;
	}

	public Boolean getSeocHcmmts() {
		return this.seocHcmmts;
	}

	public void setSeocHcmmts(Boolean seocHcmmts) {
		this.seocHcmmts = seocHcmmts;
	}

	public Boolean getSeocLcmmts() {
		return this.seocLcmmts;
	}

	public void setSeocLcmmts(Boolean seocLcmmts) {
		this.seocLcmmts = seocLcmmts;
	}

	public Integer getSeocSo() {
		return this.seocSo;
	}

	public void setSeocSo(Integer seocSo) {
		this.seocSo = seocSo;
	}

	public Boolean getSeocDetAll() {
		return this.seocDetAll;
	}

	public void setSeocDetAll(Boolean seocDetAll) {
		this.seocDetAll = seocDetAll;
	}

	public Integer getSeocAllDays() {
		return this.seocAllDays;
	}

	public void setSeocAllDays(Integer seocAllDays) {
		this.seocAllDays = seocAllDays;
	}

	public Boolean getSeocLnFmt() {
		return this.seocLnFmt;
	}

	public void setSeocLnFmt(Boolean seocLnFmt) {
		this.seocLnFmt = seocLnFmt;
	}

	public Boolean getSeocSoHist() {
		return this.seocSoHist;
	}

	public void setSeocSoHist(Boolean seocSoHist) {
		this.seocSoHist = seocSoHist;
	}

	public Boolean getSeocKitAuto() {
		return this.seocKitAuto;
	}

	public void setSeocKitAuto(Boolean seocKitAuto) {
		this.seocKitAuto = seocKitAuto;
	}

	public Boolean getSeocQadl02() {
		return this.seocQadl02;
	}

	public void setSeocQadl02(Boolean seocQadl02) {
		this.seocQadl02 = seocQadl02;
	}

	public Integer getSeocKitNbr() {
		return this.seocKitNbr;
	}

	public void setSeocKitNbr(Integer seocKitNbr) {
		this.seocKitNbr = seocKitNbr;
	}

	public Boolean getSeocConsume() {
		return this.seocConsume;
	}

	public void setSeocConsume(Boolean seocConsume) {
		this.seocConsume = seocConsume;
	}

	public Boolean getSeocShipTo() {
		return this.seocShipTo;
	}

	public void setSeocShipTo(Boolean seocShipTo) {
		this.seocShipTo = seocShipTo;
	}

	public Double getSeocQadd01() {
		return this.seocQadd01;
	}

	public void setSeocQadd01(Double seocQadd01) {
		this.seocQadd01 = seocQadd01;
	}

	public Boolean getSeocReq() {
		return this.seocReq;
	}

	public void setSeocReq(Boolean seocReq) {
		this.seocReq = seocReq;
	}

	public Integer getSeocShpLead() {
		return this.seocShpLead;
	}

	public void setSeocShpLead(Integer seocShpLead) {
		this.seocShpLead = seocShpLead;
	}

	public String getSeocIntCust() {
		return this.seocIntCust;
	}

	public void setSeocIntCust(String seocIntCust) {
		this.seocIntCust = seocIntCust;
	}

	public Boolean getSeocConfirm() {
		return this.seocConfirm;
	}

	public void setSeocConfirm(Boolean seocConfirm) {
		this.seocConfirm = seocConfirm;
	}

	public String getSeocUser1() {
		return this.seocUser1;
	}

	public void setSeocUser1(String seocUser1) {
		this.seocUser1 = seocUser1;
	}

	public String getSeocUser2() {
		return this.seocUser2;
	}

	public void setSeocUser2(String seocUser2) {
		this.seocUser2 = seocUser2;
	}

	public Date getSeocModDate() {
		return this.seocModDate;
	}

	public void setSeocModDate(Date seocModDate) {
		this.seocModDate = seocModDate;
	}

	public String getSeocModUserid() {
		return this.seocModUserid;
	}

	public void setSeocModUserid(String seocModUserid) {
		this.seocModUserid = seocModUserid;
	}

	public String getSeocKitPre() {
		return this.seocKitPre;
	}

	public void setSeocKitPre(String seocKitPre) {
		this.seocKitPre = seocKitPre;
	}

	public String getSeocQadc02() {
		return this.seocQadc02;
	}

	public void setSeocQadc02(String seocQadc02) {
		this.seocQadc02 = seocQadc02;
	}

	public Integer getSeocQadi01() {
		return this.seocQadi01;
	}

	public void setSeocQadi01(Integer seocQadi01) {
		this.seocQadi01 = seocQadi01;
	}

	public String getSeocExRatetype() {
		return this.seocExRatetype;
	}

	public void setSeocExRatetype(String seocExRatetype) {
		this.seocExRatetype = seocExRatetype;
	}

	public String getSeocQadc03() {
		return this.seocQadc03;
	}

	public void setSeocQadc03(String seocQadc03) {
		this.seocQadc03 = seocQadc03;
	}

	public Double getSeocQadd02() {
		return this.seocQadd02;
	}

	public void setSeocQadd02(Double seocQadd02) {
		this.seocQadd02 = seocQadd02;
	}

	public Integer getSeocQadi02() {
		return this.seocQadi02;
	}

	public void setSeocQadi02(Integer seocQadi02) {
		this.seocQadi02 = seocQadi02;
	}

	public Date getSeocQadt01() {
		return this.seocQadt01;
	}

	public void setSeocQadt01(Date seocQadt01) {
		this.seocQadt01 = seocQadt01;
	}

	public Date getSeocQadt02() {
		return this.seocQadt02;
	}

	public void setSeocQadt02(Date seocQadt02) {
		this.seocQadt02 = seocQadt02;
	}

	public Double getOidSeocCtrl() {
		return this.oidSeocCtrl;
	}

	public void setOidSeocCtrl(Double oidSeocCtrl) {
		this.oidSeocCtrl = oidSeocCtrl;
	}

}