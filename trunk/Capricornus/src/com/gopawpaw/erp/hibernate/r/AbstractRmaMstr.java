package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRmaMstr entity provides the base persistence definition of the
 * RmaMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRmaMstr implements java.io.Serializable {

	// Fields

	private RmaMstrId id;
	private String rmaCustVen;
	private String rmaShip;
	private Date rmaOrdDate;
	private Date rmaReqDate;
	private Date rmaExpDate;
	private Boolean rmaPrtRec;
	private String rmaPrList;
	private String rmaSource;
	private String rmaStat;
	private Date rmaShipdate;
	private Integer rmaCmtindx;
	private String rmaUser1;
	private String rmaUser2;
	private String rmaType;
	private String rmaChr01;
	private String rmaChr02;
	private String rmaChr03;
	private String rmaChr04;
	private String rmaChr05;
	private String rmaChr06;
	private String rmaChr07;
	private String rmaChr08;
	private String rmaChr09;
	private String rmaChr10;
	private Date rmaDte01;
	private Date rmaDte02;
	private Double rmaDec01;
	private Double rmaDec02;
	private Boolean rmaLog01;
	private Boolean rmaComplete;
	private String rmaCrprlist;
	private String rmaContract;
	private String rmaCtype;
	private String rmaCaNbr;
	private String rmaLocIss;
	private String rmaSiteRec;
	private String rmaSiteIss;
	private String rmaLocRec;
	private String rmaBillTo;
	private String rmaQadc04;
	private String rmaEngCode;
	private Double rmaQadd03;
	private Boolean rmaTaxable;
	private String rmaTaxc;
	private String rmaCstmlist;
	private String rmaEnduser;
	private String rmaQadc01;
	private String rmaQadc02;
	private String rmaQadc03;
	private Date rmaQadt01;
	private Date rmaQadt02;
	private Date rmaQadt03;
	private Double rmaQadd01;
	private Double rmaQadd02;
	private Integer rmaQadi01;
	private Integer rmaQadi02;
	private Boolean rmaQadl01;
	private Boolean rmaQadl02;
	private String rmaModUserid;
	private Date rmaModDate;
	private Double rmaRstkPct;
	private Double rmaQadd04;
	private String rmaQadc05;
	private Integer rmaQadi03;
	private Double oidRmaMstr;

	// Constructors

	/** default constructor */
	public AbstractRmaMstr() {
	}

	/** minimal constructor */
	public AbstractRmaMstr(RmaMstrId id, Double oidRmaMstr) {
		this.id = id;
		this.oidRmaMstr = oidRmaMstr;
	}

	/** full constructor */
	public AbstractRmaMstr(RmaMstrId id, String rmaCustVen, String rmaShip,
			Date rmaOrdDate, Date rmaReqDate, Date rmaExpDate,
			Boolean rmaPrtRec, String rmaPrList, String rmaSource,
			String rmaStat, Date rmaShipdate, Integer rmaCmtindx,
			String rmaUser1, String rmaUser2, String rmaType, String rmaChr01,
			String rmaChr02, String rmaChr03, String rmaChr04, String rmaChr05,
			String rmaChr06, String rmaChr07, String rmaChr08, String rmaChr09,
			String rmaChr10, Date rmaDte01, Date rmaDte02, Double rmaDec01,
			Double rmaDec02, Boolean rmaLog01, Boolean rmaComplete,
			String rmaCrprlist, String rmaContract, String rmaCtype,
			String rmaCaNbr, String rmaLocIss, String rmaSiteRec,
			String rmaSiteIss, String rmaLocRec, String rmaBillTo,
			String rmaQadc04, String rmaEngCode, Double rmaQadd03,
			Boolean rmaTaxable, String rmaTaxc, String rmaCstmlist,
			String rmaEnduser, String rmaQadc01, String rmaQadc02,
			String rmaQadc03, Date rmaQadt01, Date rmaQadt02, Date rmaQadt03,
			Double rmaQadd01, Double rmaQadd02, Integer rmaQadi01,
			Integer rmaQadi02, Boolean rmaQadl01, Boolean rmaQadl02,
			String rmaModUserid, Date rmaModDate, Double rmaRstkPct,
			Double rmaQadd04, String rmaQadc05, Integer rmaQadi03,
			Double oidRmaMstr) {
		this.id = id;
		this.rmaCustVen = rmaCustVen;
		this.rmaShip = rmaShip;
		this.rmaOrdDate = rmaOrdDate;
		this.rmaReqDate = rmaReqDate;
		this.rmaExpDate = rmaExpDate;
		this.rmaPrtRec = rmaPrtRec;
		this.rmaPrList = rmaPrList;
		this.rmaSource = rmaSource;
		this.rmaStat = rmaStat;
		this.rmaShipdate = rmaShipdate;
		this.rmaCmtindx = rmaCmtindx;
		this.rmaUser1 = rmaUser1;
		this.rmaUser2 = rmaUser2;
		this.rmaType = rmaType;
		this.rmaChr01 = rmaChr01;
		this.rmaChr02 = rmaChr02;
		this.rmaChr03 = rmaChr03;
		this.rmaChr04 = rmaChr04;
		this.rmaChr05 = rmaChr05;
		this.rmaChr06 = rmaChr06;
		this.rmaChr07 = rmaChr07;
		this.rmaChr08 = rmaChr08;
		this.rmaChr09 = rmaChr09;
		this.rmaChr10 = rmaChr10;
		this.rmaDte01 = rmaDte01;
		this.rmaDte02 = rmaDte02;
		this.rmaDec01 = rmaDec01;
		this.rmaDec02 = rmaDec02;
		this.rmaLog01 = rmaLog01;
		this.rmaComplete = rmaComplete;
		this.rmaCrprlist = rmaCrprlist;
		this.rmaContract = rmaContract;
		this.rmaCtype = rmaCtype;
		this.rmaCaNbr = rmaCaNbr;
		this.rmaLocIss = rmaLocIss;
		this.rmaSiteRec = rmaSiteRec;
		this.rmaSiteIss = rmaSiteIss;
		this.rmaLocRec = rmaLocRec;
		this.rmaBillTo = rmaBillTo;
		this.rmaQadc04 = rmaQadc04;
		this.rmaEngCode = rmaEngCode;
		this.rmaQadd03 = rmaQadd03;
		this.rmaTaxable = rmaTaxable;
		this.rmaTaxc = rmaTaxc;
		this.rmaCstmlist = rmaCstmlist;
		this.rmaEnduser = rmaEnduser;
		this.rmaQadc01 = rmaQadc01;
		this.rmaQadc02 = rmaQadc02;
		this.rmaQadc03 = rmaQadc03;
		this.rmaQadt01 = rmaQadt01;
		this.rmaQadt02 = rmaQadt02;
		this.rmaQadt03 = rmaQadt03;
		this.rmaQadd01 = rmaQadd01;
		this.rmaQadd02 = rmaQadd02;
		this.rmaQadi01 = rmaQadi01;
		this.rmaQadi02 = rmaQadi02;
		this.rmaQadl01 = rmaQadl01;
		this.rmaQadl02 = rmaQadl02;
		this.rmaModUserid = rmaModUserid;
		this.rmaModDate = rmaModDate;
		this.rmaRstkPct = rmaRstkPct;
		this.rmaQadd04 = rmaQadd04;
		this.rmaQadc05 = rmaQadc05;
		this.rmaQadi03 = rmaQadi03;
		this.oidRmaMstr = oidRmaMstr;
	}

	// Property accessors

	public RmaMstrId getId() {
		return this.id;
	}

	public void setId(RmaMstrId id) {
		this.id = id;
	}

	public String getRmaCustVen() {
		return this.rmaCustVen;
	}

	public void setRmaCustVen(String rmaCustVen) {
		this.rmaCustVen = rmaCustVen;
	}

	public String getRmaShip() {
		return this.rmaShip;
	}

	public void setRmaShip(String rmaShip) {
		this.rmaShip = rmaShip;
	}

	public Date getRmaOrdDate() {
		return this.rmaOrdDate;
	}

	public void setRmaOrdDate(Date rmaOrdDate) {
		this.rmaOrdDate = rmaOrdDate;
	}

	public Date getRmaReqDate() {
		return this.rmaReqDate;
	}

	public void setRmaReqDate(Date rmaReqDate) {
		this.rmaReqDate = rmaReqDate;
	}

	public Date getRmaExpDate() {
		return this.rmaExpDate;
	}

	public void setRmaExpDate(Date rmaExpDate) {
		this.rmaExpDate = rmaExpDate;
	}

	public Boolean getRmaPrtRec() {
		return this.rmaPrtRec;
	}

	public void setRmaPrtRec(Boolean rmaPrtRec) {
		this.rmaPrtRec = rmaPrtRec;
	}

	public String getRmaPrList() {
		return this.rmaPrList;
	}

	public void setRmaPrList(String rmaPrList) {
		this.rmaPrList = rmaPrList;
	}

	public String getRmaSource() {
		return this.rmaSource;
	}

	public void setRmaSource(String rmaSource) {
		this.rmaSource = rmaSource;
	}

	public String getRmaStat() {
		return this.rmaStat;
	}

	public void setRmaStat(String rmaStat) {
		this.rmaStat = rmaStat;
	}

	public Date getRmaShipdate() {
		return this.rmaShipdate;
	}

	public void setRmaShipdate(Date rmaShipdate) {
		this.rmaShipdate = rmaShipdate;
	}

	public Integer getRmaCmtindx() {
		return this.rmaCmtindx;
	}

	public void setRmaCmtindx(Integer rmaCmtindx) {
		this.rmaCmtindx = rmaCmtindx;
	}

	public String getRmaUser1() {
		return this.rmaUser1;
	}

	public void setRmaUser1(String rmaUser1) {
		this.rmaUser1 = rmaUser1;
	}

	public String getRmaUser2() {
		return this.rmaUser2;
	}

	public void setRmaUser2(String rmaUser2) {
		this.rmaUser2 = rmaUser2;
	}

	public String getRmaType() {
		return this.rmaType;
	}

	public void setRmaType(String rmaType) {
		this.rmaType = rmaType;
	}

	public String getRmaChr01() {
		return this.rmaChr01;
	}

	public void setRmaChr01(String rmaChr01) {
		this.rmaChr01 = rmaChr01;
	}

	public String getRmaChr02() {
		return this.rmaChr02;
	}

	public void setRmaChr02(String rmaChr02) {
		this.rmaChr02 = rmaChr02;
	}

	public String getRmaChr03() {
		return this.rmaChr03;
	}

	public void setRmaChr03(String rmaChr03) {
		this.rmaChr03 = rmaChr03;
	}

	public String getRmaChr04() {
		return this.rmaChr04;
	}

	public void setRmaChr04(String rmaChr04) {
		this.rmaChr04 = rmaChr04;
	}

	public String getRmaChr05() {
		return this.rmaChr05;
	}

	public void setRmaChr05(String rmaChr05) {
		this.rmaChr05 = rmaChr05;
	}

	public String getRmaChr06() {
		return this.rmaChr06;
	}

	public void setRmaChr06(String rmaChr06) {
		this.rmaChr06 = rmaChr06;
	}

	public String getRmaChr07() {
		return this.rmaChr07;
	}

	public void setRmaChr07(String rmaChr07) {
		this.rmaChr07 = rmaChr07;
	}

	public String getRmaChr08() {
		return this.rmaChr08;
	}

	public void setRmaChr08(String rmaChr08) {
		this.rmaChr08 = rmaChr08;
	}

	public String getRmaChr09() {
		return this.rmaChr09;
	}

	public void setRmaChr09(String rmaChr09) {
		this.rmaChr09 = rmaChr09;
	}

	public String getRmaChr10() {
		return this.rmaChr10;
	}

	public void setRmaChr10(String rmaChr10) {
		this.rmaChr10 = rmaChr10;
	}

	public Date getRmaDte01() {
		return this.rmaDte01;
	}

	public void setRmaDte01(Date rmaDte01) {
		this.rmaDte01 = rmaDte01;
	}

	public Date getRmaDte02() {
		return this.rmaDte02;
	}

	public void setRmaDte02(Date rmaDte02) {
		this.rmaDte02 = rmaDte02;
	}

	public Double getRmaDec01() {
		return this.rmaDec01;
	}

	public void setRmaDec01(Double rmaDec01) {
		this.rmaDec01 = rmaDec01;
	}

	public Double getRmaDec02() {
		return this.rmaDec02;
	}

	public void setRmaDec02(Double rmaDec02) {
		this.rmaDec02 = rmaDec02;
	}

	public Boolean getRmaLog01() {
		return this.rmaLog01;
	}

	public void setRmaLog01(Boolean rmaLog01) {
		this.rmaLog01 = rmaLog01;
	}

	public Boolean getRmaComplete() {
		return this.rmaComplete;
	}

	public void setRmaComplete(Boolean rmaComplete) {
		this.rmaComplete = rmaComplete;
	}

	public String getRmaCrprlist() {
		return this.rmaCrprlist;
	}

	public void setRmaCrprlist(String rmaCrprlist) {
		this.rmaCrprlist = rmaCrprlist;
	}

	public String getRmaContract() {
		return this.rmaContract;
	}

	public void setRmaContract(String rmaContract) {
		this.rmaContract = rmaContract;
	}

	public String getRmaCtype() {
		return this.rmaCtype;
	}

	public void setRmaCtype(String rmaCtype) {
		this.rmaCtype = rmaCtype;
	}

	public String getRmaCaNbr() {
		return this.rmaCaNbr;
	}

	public void setRmaCaNbr(String rmaCaNbr) {
		this.rmaCaNbr = rmaCaNbr;
	}

	public String getRmaLocIss() {
		return this.rmaLocIss;
	}

	public void setRmaLocIss(String rmaLocIss) {
		this.rmaLocIss = rmaLocIss;
	}

	public String getRmaSiteRec() {
		return this.rmaSiteRec;
	}

	public void setRmaSiteRec(String rmaSiteRec) {
		this.rmaSiteRec = rmaSiteRec;
	}

	public String getRmaSiteIss() {
		return this.rmaSiteIss;
	}

	public void setRmaSiteIss(String rmaSiteIss) {
		this.rmaSiteIss = rmaSiteIss;
	}

	public String getRmaLocRec() {
		return this.rmaLocRec;
	}

	public void setRmaLocRec(String rmaLocRec) {
		this.rmaLocRec = rmaLocRec;
	}

	public String getRmaBillTo() {
		return this.rmaBillTo;
	}

	public void setRmaBillTo(String rmaBillTo) {
		this.rmaBillTo = rmaBillTo;
	}

	public String getRmaQadc04() {
		return this.rmaQadc04;
	}

	public void setRmaQadc04(String rmaQadc04) {
		this.rmaQadc04 = rmaQadc04;
	}

	public String getRmaEngCode() {
		return this.rmaEngCode;
	}

	public void setRmaEngCode(String rmaEngCode) {
		this.rmaEngCode = rmaEngCode;
	}

	public Double getRmaQadd03() {
		return this.rmaQadd03;
	}

	public void setRmaQadd03(Double rmaQadd03) {
		this.rmaQadd03 = rmaQadd03;
	}

	public Boolean getRmaTaxable() {
		return this.rmaTaxable;
	}

	public void setRmaTaxable(Boolean rmaTaxable) {
		this.rmaTaxable = rmaTaxable;
	}

	public String getRmaTaxc() {
		return this.rmaTaxc;
	}

	public void setRmaTaxc(String rmaTaxc) {
		this.rmaTaxc = rmaTaxc;
	}

	public String getRmaCstmlist() {
		return this.rmaCstmlist;
	}

	public void setRmaCstmlist(String rmaCstmlist) {
		this.rmaCstmlist = rmaCstmlist;
	}

	public String getRmaEnduser() {
		return this.rmaEnduser;
	}

	public void setRmaEnduser(String rmaEnduser) {
		this.rmaEnduser = rmaEnduser;
	}

	public String getRmaQadc01() {
		return this.rmaQadc01;
	}

	public void setRmaQadc01(String rmaQadc01) {
		this.rmaQadc01 = rmaQadc01;
	}

	public String getRmaQadc02() {
		return this.rmaQadc02;
	}

	public void setRmaQadc02(String rmaQadc02) {
		this.rmaQadc02 = rmaQadc02;
	}

	public String getRmaQadc03() {
		return this.rmaQadc03;
	}

	public void setRmaQadc03(String rmaQadc03) {
		this.rmaQadc03 = rmaQadc03;
	}

	public Date getRmaQadt01() {
		return this.rmaQadt01;
	}

	public void setRmaQadt01(Date rmaQadt01) {
		this.rmaQadt01 = rmaQadt01;
	}

	public Date getRmaQadt02() {
		return this.rmaQadt02;
	}

	public void setRmaQadt02(Date rmaQadt02) {
		this.rmaQadt02 = rmaQadt02;
	}

	public Date getRmaQadt03() {
		return this.rmaQadt03;
	}

	public void setRmaQadt03(Date rmaQadt03) {
		this.rmaQadt03 = rmaQadt03;
	}

	public Double getRmaQadd01() {
		return this.rmaQadd01;
	}

	public void setRmaQadd01(Double rmaQadd01) {
		this.rmaQadd01 = rmaQadd01;
	}

	public Double getRmaQadd02() {
		return this.rmaQadd02;
	}

	public void setRmaQadd02(Double rmaQadd02) {
		this.rmaQadd02 = rmaQadd02;
	}

	public Integer getRmaQadi01() {
		return this.rmaQadi01;
	}

	public void setRmaQadi01(Integer rmaQadi01) {
		this.rmaQadi01 = rmaQadi01;
	}

	public Integer getRmaQadi02() {
		return this.rmaQadi02;
	}

	public void setRmaQadi02(Integer rmaQadi02) {
		this.rmaQadi02 = rmaQadi02;
	}

	public Boolean getRmaQadl01() {
		return this.rmaQadl01;
	}

	public void setRmaQadl01(Boolean rmaQadl01) {
		this.rmaQadl01 = rmaQadl01;
	}

	public Boolean getRmaQadl02() {
		return this.rmaQadl02;
	}

	public void setRmaQadl02(Boolean rmaQadl02) {
		this.rmaQadl02 = rmaQadl02;
	}

	public String getRmaModUserid() {
		return this.rmaModUserid;
	}

	public void setRmaModUserid(String rmaModUserid) {
		this.rmaModUserid = rmaModUserid;
	}

	public Date getRmaModDate() {
		return this.rmaModDate;
	}

	public void setRmaModDate(Date rmaModDate) {
		this.rmaModDate = rmaModDate;
	}

	public Double getRmaRstkPct() {
		return this.rmaRstkPct;
	}

	public void setRmaRstkPct(Double rmaRstkPct) {
		this.rmaRstkPct = rmaRstkPct;
	}

	public Double getRmaQadd04() {
		return this.rmaQadd04;
	}

	public void setRmaQadd04(Double rmaQadd04) {
		this.rmaQadd04 = rmaQadd04;
	}

	public String getRmaQadc05() {
		return this.rmaQadc05;
	}

	public void setRmaQadc05(String rmaQadc05) {
		this.rmaQadc05 = rmaQadc05;
	}

	public Integer getRmaQadi03() {
		return this.rmaQadi03;
	}

	public void setRmaQadi03(Integer rmaQadi03) {
		this.rmaQadi03 = rmaQadi03;
	}

	public Double getOidRmaMstr() {
		return this.oidRmaMstr;
	}

	public void setOidRmaMstr(Double oidRmaMstr) {
		this.oidRmaMstr = oidRmaMstr;
	}

}