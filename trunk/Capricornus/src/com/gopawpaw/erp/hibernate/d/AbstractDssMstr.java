package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDssMstr entity provides the base persistence definition of the
 * DssMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDssMstr implements java.io.Serializable {

	// Fields

	private DssMstrId id;
	private String dssBol;
	private Integer dssCartons;
	private Integer dssCmtindx;
	private Date dssDueDate;
	private String dssFob;
	private String dssFrList;
	private String dssFrTerms;
	private String dssLang;
	private String dssSoNbr;
	private Date dssCreated;
	private String dssPoNbr;
	private String dssRmks;
	private String dssRecSite;
	private String dssShipvia;
	private Date dssShipdate;
	private String dssStatus;
	private String dssUser1;
	private String dssUser2;
	private String dssChr01;
	private String dssChr02;
	private String dssChr03;
	private String dssChr04;
	private String dssChr05;
	private String dssChr06;
	private String dssChr07;
	private String dssChr08;
	private String dssChr09;
	private String dssChr10;
	private Double dssDec01;
	private Double dssDec02;
	private Date dssDte01;
	private Date dssDte02;
	private Boolean dssLog01;
	private Double dssQad01;
	private Double dssQad02;
	private Double dssQad03;
	private Integer dssQad04;
	private String dssQad05;
	private String dssAppOwner;
	private Double dssWeight;
	private String dssWeightUm;
	private Double dssFrMinWt;
	private Double oidDssMstr;

	// Constructors

	/** default constructor */
	public AbstractDssMstr() {
	}

	/** minimal constructor */
	public AbstractDssMstr(DssMstrId id, String dssSoNbr, String dssAppOwner,
			Double dssWeight, String dssWeightUm, Double dssFrMinWt,
			Double oidDssMstr) {
		this.id = id;
		this.dssSoNbr = dssSoNbr;
		this.dssAppOwner = dssAppOwner;
		this.dssWeight = dssWeight;
		this.dssWeightUm = dssWeightUm;
		this.dssFrMinWt = dssFrMinWt;
		this.oidDssMstr = oidDssMstr;
	}

	/** full constructor */
	public AbstractDssMstr(DssMstrId id, String dssBol, Integer dssCartons,
			Integer dssCmtindx, Date dssDueDate, String dssFob,
			String dssFrList, String dssFrTerms, String dssLang,
			String dssSoNbr, Date dssCreated, String dssPoNbr, String dssRmks,
			String dssRecSite, String dssShipvia, Date dssShipdate,
			String dssStatus, String dssUser1, String dssUser2,
			String dssChr01, String dssChr02, String dssChr03, String dssChr04,
			String dssChr05, String dssChr06, String dssChr07, String dssChr08,
			String dssChr09, String dssChr10, Double dssDec01, Double dssDec02,
			Date dssDte01, Date dssDte02, Boolean dssLog01, Double dssQad01,
			Double dssQad02, Double dssQad03, Integer dssQad04,
			String dssQad05, String dssAppOwner, Double dssWeight,
			String dssWeightUm, Double dssFrMinWt, Double oidDssMstr) {
		this.id = id;
		this.dssBol = dssBol;
		this.dssCartons = dssCartons;
		this.dssCmtindx = dssCmtindx;
		this.dssDueDate = dssDueDate;
		this.dssFob = dssFob;
		this.dssFrList = dssFrList;
		this.dssFrTerms = dssFrTerms;
		this.dssLang = dssLang;
		this.dssSoNbr = dssSoNbr;
		this.dssCreated = dssCreated;
		this.dssPoNbr = dssPoNbr;
		this.dssRmks = dssRmks;
		this.dssRecSite = dssRecSite;
		this.dssShipvia = dssShipvia;
		this.dssShipdate = dssShipdate;
		this.dssStatus = dssStatus;
		this.dssUser1 = dssUser1;
		this.dssUser2 = dssUser2;
		this.dssChr01 = dssChr01;
		this.dssChr02 = dssChr02;
		this.dssChr03 = dssChr03;
		this.dssChr04 = dssChr04;
		this.dssChr05 = dssChr05;
		this.dssChr06 = dssChr06;
		this.dssChr07 = dssChr07;
		this.dssChr08 = dssChr08;
		this.dssChr09 = dssChr09;
		this.dssChr10 = dssChr10;
		this.dssDec01 = dssDec01;
		this.dssDec02 = dssDec02;
		this.dssDte01 = dssDte01;
		this.dssDte02 = dssDte02;
		this.dssLog01 = dssLog01;
		this.dssQad01 = dssQad01;
		this.dssQad02 = dssQad02;
		this.dssQad03 = dssQad03;
		this.dssQad04 = dssQad04;
		this.dssQad05 = dssQad05;
		this.dssAppOwner = dssAppOwner;
		this.dssWeight = dssWeight;
		this.dssWeightUm = dssWeightUm;
		this.dssFrMinWt = dssFrMinWt;
		this.oidDssMstr = oidDssMstr;
	}

	// Property accessors

	public DssMstrId getId() {
		return this.id;
	}

	public void setId(DssMstrId id) {
		this.id = id;
	}

	public String getDssBol() {
		return this.dssBol;
	}

	public void setDssBol(String dssBol) {
		this.dssBol = dssBol;
	}

	public Integer getDssCartons() {
		return this.dssCartons;
	}

	public void setDssCartons(Integer dssCartons) {
		this.dssCartons = dssCartons;
	}

	public Integer getDssCmtindx() {
		return this.dssCmtindx;
	}

	public void setDssCmtindx(Integer dssCmtindx) {
		this.dssCmtindx = dssCmtindx;
	}

	public Date getDssDueDate() {
		return this.dssDueDate;
	}

	public void setDssDueDate(Date dssDueDate) {
		this.dssDueDate = dssDueDate;
	}

	public String getDssFob() {
		return this.dssFob;
	}

	public void setDssFob(String dssFob) {
		this.dssFob = dssFob;
	}

	public String getDssFrList() {
		return this.dssFrList;
	}

	public void setDssFrList(String dssFrList) {
		this.dssFrList = dssFrList;
	}

	public String getDssFrTerms() {
		return this.dssFrTerms;
	}

	public void setDssFrTerms(String dssFrTerms) {
		this.dssFrTerms = dssFrTerms;
	}

	public String getDssLang() {
		return this.dssLang;
	}

	public void setDssLang(String dssLang) {
		this.dssLang = dssLang;
	}

	public String getDssSoNbr() {
		return this.dssSoNbr;
	}

	public void setDssSoNbr(String dssSoNbr) {
		this.dssSoNbr = dssSoNbr;
	}

	public Date getDssCreated() {
		return this.dssCreated;
	}

	public void setDssCreated(Date dssCreated) {
		this.dssCreated = dssCreated;
	}

	public String getDssPoNbr() {
		return this.dssPoNbr;
	}

	public void setDssPoNbr(String dssPoNbr) {
		this.dssPoNbr = dssPoNbr;
	}

	public String getDssRmks() {
		return this.dssRmks;
	}

	public void setDssRmks(String dssRmks) {
		this.dssRmks = dssRmks;
	}

	public String getDssRecSite() {
		return this.dssRecSite;
	}

	public void setDssRecSite(String dssRecSite) {
		this.dssRecSite = dssRecSite;
	}

	public String getDssShipvia() {
		return this.dssShipvia;
	}

	public void setDssShipvia(String dssShipvia) {
		this.dssShipvia = dssShipvia;
	}

	public Date getDssShipdate() {
		return this.dssShipdate;
	}

	public void setDssShipdate(Date dssShipdate) {
		this.dssShipdate = dssShipdate;
	}

	public String getDssStatus() {
		return this.dssStatus;
	}

	public void setDssStatus(String dssStatus) {
		this.dssStatus = dssStatus;
	}

	public String getDssUser1() {
		return this.dssUser1;
	}

	public void setDssUser1(String dssUser1) {
		this.dssUser1 = dssUser1;
	}

	public String getDssUser2() {
		return this.dssUser2;
	}

	public void setDssUser2(String dssUser2) {
		this.dssUser2 = dssUser2;
	}

	public String getDssChr01() {
		return this.dssChr01;
	}

	public void setDssChr01(String dssChr01) {
		this.dssChr01 = dssChr01;
	}

	public String getDssChr02() {
		return this.dssChr02;
	}

	public void setDssChr02(String dssChr02) {
		this.dssChr02 = dssChr02;
	}

	public String getDssChr03() {
		return this.dssChr03;
	}

	public void setDssChr03(String dssChr03) {
		this.dssChr03 = dssChr03;
	}

	public String getDssChr04() {
		return this.dssChr04;
	}

	public void setDssChr04(String dssChr04) {
		this.dssChr04 = dssChr04;
	}

	public String getDssChr05() {
		return this.dssChr05;
	}

	public void setDssChr05(String dssChr05) {
		this.dssChr05 = dssChr05;
	}

	public String getDssChr06() {
		return this.dssChr06;
	}

	public void setDssChr06(String dssChr06) {
		this.dssChr06 = dssChr06;
	}

	public String getDssChr07() {
		return this.dssChr07;
	}

	public void setDssChr07(String dssChr07) {
		this.dssChr07 = dssChr07;
	}

	public String getDssChr08() {
		return this.dssChr08;
	}

	public void setDssChr08(String dssChr08) {
		this.dssChr08 = dssChr08;
	}

	public String getDssChr09() {
		return this.dssChr09;
	}

	public void setDssChr09(String dssChr09) {
		this.dssChr09 = dssChr09;
	}

	public String getDssChr10() {
		return this.dssChr10;
	}

	public void setDssChr10(String dssChr10) {
		this.dssChr10 = dssChr10;
	}

	public Double getDssDec01() {
		return this.dssDec01;
	}

	public void setDssDec01(Double dssDec01) {
		this.dssDec01 = dssDec01;
	}

	public Double getDssDec02() {
		return this.dssDec02;
	}

	public void setDssDec02(Double dssDec02) {
		this.dssDec02 = dssDec02;
	}

	public Date getDssDte01() {
		return this.dssDte01;
	}

	public void setDssDte01(Date dssDte01) {
		this.dssDte01 = dssDte01;
	}

	public Date getDssDte02() {
		return this.dssDte02;
	}

	public void setDssDte02(Date dssDte02) {
		this.dssDte02 = dssDte02;
	}

	public Boolean getDssLog01() {
		return this.dssLog01;
	}

	public void setDssLog01(Boolean dssLog01) {
		this.dssLog01 = dssLog01;
	}

	public Double getDssQad01() {
		return this.dssQad01;
	}

	public void setDssQad01(Double dssQad01) {
		this.dssQad01 = dssQad01;
	}

	public Double getDssQad02() {
		return this.dssQad02;
	}

	public void setDssQad02(Double dssQad02) {
		this.dssQad02 = dssQad02;
	}

	public Double getDssQad03() {
		return this.dssQad03;
	}

	public void setDssQad03(Double dssQad03) {
		this.dssQad03 = dssQad03;
	}

	public Integer getDssQad04() {
		return this.dssQad04;
	}

	public void setDssQad04(Integer dssQad04) {
		this.dssQad04 = dssQad04;
	}

	public String getDssQad05() {
		return this.dssQad05;
	}

	public void setDssQad05(String dssQad05) {
		this.dssQad05 = dssQad05;
	}

	public String getDssAppOwner() {
		return this.dssAppOwner;
	}

	public void setDssAppOwner(String dssAppOwner) {
		this.dssAppOwner = dssAppOwner;
	}

	public Double getDssWeight() {
		return this.dssWeight;
	}

	public void setDssWeight(Double dssWeight) {
		this.dssWeight = dssWeight;
	}

	public String getDssWeightUm() {
		return this.dssWeightUm;
	}

	public void setDssWeightUm(String dssWeightUm) {
		this.dssWeightUm = dssWeightUm;
	}

	public Double getDssFrMinWt() {
		return this.dssFrMinWt;
	}

	public void setDssFrMinWt(Double dssFrMinWt) {
		this.dssFrMinWt = dssFrMinWt;
	}

	public Double getOidDssMstr() {
		return this.oidDssMstr;
	}

	public void setOidDssMstr(Double oidDssMstr) {
		this.oidDssMstr = oidDssMstr;
	}

}