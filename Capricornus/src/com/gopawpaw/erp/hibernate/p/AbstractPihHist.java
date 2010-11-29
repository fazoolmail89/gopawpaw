package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPihHist entity provides the base persistence definition of the
 * PihHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPihHist implements java.io.Serializable {

	// Fields

	private PihHistId id;
	private String pihDiscAcct;
	private String pihDiscCc;
	private String pihDiscSub;
	private String pihDiscProj;
	private Double pihQty;
	private Double pihAmt;
	private Double pihDiscAmt;
	private String pihBreakCat;
	private Double pihPidQty;
	private Double pihMinNet;
	private String pihCrTerms;
	private String pihFrList;
	private String pihFrTerms;
	private String pihUser1;
	private String pihUser2;
	private String pihQadc01;
	private Double pihQadd01;
	private Date pihDte01;
	private Date pihDte02;
	private Double pihDec01;
	private Double pihDec02;
	private Boolean pihLog01;
	private String pihChr01;
	private String pihChr02;
	private String pihChr03;
	private String pihChr04;
	private String pihChr05;
	private String pihChr06;
	private String pihChr07;
	private String pihChr08;
	private String pihChr09;
	private String pihChr10;
	private Date pihModDate;
	private String pihUserid;
	private String pihQtyType;
	private String pihUm;
	private Integer pihTime;
	private String pihAccrAcct;
	private String pihList;
	private String pihCombType;
	private String pihAccrCc;
	private String pihAccrProj;
	private String pihAccrSub;
	private Double pihDiscSeq;
	private Boolean pihPrint;
	private String pihPromo1;
	private String pihPromo2;
	private Integer pihBonusLine;
	private String pihPromo3;
	private String pihPromo4;
	private String pihPigCode;
	private Double oidPihHist;

	// Constructors

	/** default constructor */
	public AbstractPihHist() {
	}

	/** minimal constructor */
	public AbstractPihHist(PihHistId id, String pihUm, String pihList,
			String pihCombType, String pihPromo1, String pihPromo2,
			Integer pihBonusLine, Double oidPihHist) {
		this.id = id;
		this.pihUm = pihUm;
		this.pihList = pihList;
		this.pihCombType = pihCombType;
		this.pihPromo1 = pihPromo1;
		this.pihPromo2 = pihPromo2;
		this.pihBonusLine = pihBonusLine;
		this.oidPihHist = oidPihHist;
	}

	/** full constructor */
	public AbstractPihHist(PihHistId id, String pihDiscAcct, String pihDiscCc,
			String pihDiscSub, String pihDiscProj, Double pihQty,
			Double pihAmt, Double pihDiscAmt, String pihBreakCat,
			Double pihPidQty, Double pihMinNet, String pihCrTerms,
			String pihFrList, String pihFrTerms, String pihUser1,
			String pihUser2, String pihQadc01, Double pihQadd01, Date pihDte01,
			Date pihDte02, Double pihDec01, Double pihDec02, Boolean pihLog01,
			String pihChr01, String pihChr02, String pihChr03, String pihChr04,
			String pihChr05, String pihChr06, String pihChr07, String pihChr08,
			String pihChr09, String pihChr10, Date pihModDate,
			String pihUserid, String pihQtyType, String pihUm, Integer pihTime,
			String pihAccrAcct, String pihList, String pihCombType,
			String pihAccrCc, String pihAccrProj, String pihAccrSub,
			Double pihDiscSeq, Boolean pihPrint, String pihPromo1,
			String pihPromo2, Integer pihBonusLine, String pihPromo3,
			String pihPromo4, String pihPigCode, Double oidPihHist) {
		this.id = id;
		this.pihDiscAcct = pihDiscAcct;
		this.pihDiscCc = pihDiscCc;
		this.pihDiscSub = pihDiscSub;
		this.pihDiscProj = pihDiscProj;
		this.pihQty = pihQty;
		this.pihAmt = pihAmt;
		this.pihDiscAmt = pihDiscAmt;
		this.pihBreakCat = pihBreakCat;
		this.pihPidQty = pihPidQty;
		this.pihMinNet = pihMinNet;
		this.pihCrTerms = pihCrTerms;
		this.pihFrList = pihFrList;
		this.pihFrTerms = pihFrTerms;
		this.pihUser1 = pihUser1;
		this.pihUser2 = pihUser2;
		this.pihQadc01 = pihQadc01;
		this.pihQadd01 = pihQadd01;
		this.pihDte01 = pihDte01;
		this.pihDte02 = pihDte02;
		this.pihDec01 = pihDec01;
		this.pihDec02 = pihDec02;
		this.pihLog01 = pihLog01;
		this.pihChr01 = pihChr01;
		this.pihChr02 = pihChr02;
		this.pihChr03 = pihChr03;
		this.pihChr04 = pihChr04;
		this.pihChr05 = pihChr05;
		this.pihChr06 = pihChr06;
		this.pihChr07 = pihChr07;
		this.pihChr08 = pihChr08;
		this.pihChr09 = pihChr09;
		this.pihChr10 = pihChr10;
		this.pihModDate = pihModDate;
		this.pihUserid = pihUserid;
		this.pihQtyType = pihQtyType;
		this.pihUm = pihUm;
		this.pihTime = pihTime;
		this.pihAccrAcct = pihAccrAcct;
		this.pihList = pihList;
		this.pihCombType = pihCombType;
		this.pihAccrCc = pihAccrCc;
		this.pihAccrProj = pihAccrProj;
		this.pihAccrSub = pihAccrSub;
		this.pihDiscSeq = pihDiscSeq;
		this.pihPrint = pihPrint;
		this.pihPromo1 = pihPromo1;
		this.pihPromo2 = pihPromo2;
		this.pihBonusLine = pihBonusLine;
		this.pihPromo3 = pihPromo3;
		this.pihPromo4 = pihPromo4;
		this.pihPigCode = pihPigCode;
		this.oidPihHist = oidPihHist;
	}

	// Property accessors

	public PihHistId getId() {
		return this.id;
	}

	public void setId(PihHistId id) {
		this.id = id;
	}

	public String getPihDiscAcct() {
		return this.pihDiscAcct;
	}

	public void setPihDiscAcct(String pihDiscAcct) {
		this.pihDiscAcct = pihDiscAcct;
	}

	public String getPihDiscCc() {
		return this.pihDiscCc;
	}

	public void setPihDiscCc(String pihDiscCc) {
		this.pihDiscCc = pihDiscCc;
	}

	public String getPihDiscSub() {
		return this.pihDiscSub;
	}

	public void setPihDiscSub(String pihDiscSub) {
		this.pihDiscSub = pihDiscSub;
	}

	public String getPihDiscProj() {
		return this.pihDiscProj;
	}

	public void setPihDiscProj(String pihDiscProj) {
		this.pihDiscProj = pihDiscProj;
	}

	public Double getPihQty() {
		return this.pihQty;
	}

	public void setPihQty(Double pihQty) {
		this.pihQty = pihQty;
	}

	public Double getPihAmt() {
		return this.pihAmt;
	}

	public void setPihAmt(Double pihAmt) {
		this.pihAmt = pihAmt;
	}

	public Double getPihDiscAmt() {
		return this.pihDiscAmt;
	}

	public void setPihDiscAmt(Double pihDiscAmt) {
		this.pihDiscAmt = pihDiscAmt;
	}

	public String getPihBreakCat() {
		return this.pihBreakCat;
	}

	public void setPihBreakCat(String pihBreakCat) {
		this.pihBreakCat = pihBreakCat;
	}

	public Double getPihPidQty() {
		return this.pihPidQty;
	}

	public void setPihPidQty(Double pihPidQty) {
		this.pihPidQty = pihPidQty;
	}

	public Double getPihMinNet() {
		return this.pihMinNet;
	}

	public void setPihMinNet(Double pihMinNet) {
		this.pihMinNet = pihMinNet;
	}

	public String getPihCrTerms() {
		return this.pihCrTerms;
	}

	public void setPihCrTerms(String pihCrTerms) {
		this.pihCrTerms = pihCrTerms;
	}

	public String getPihFrList() {
		return this.pihFrList;
	}

	public void setPihFrList(String pihFrList) {
		this.pihFrList = pihFrList;
	}

	public String getPihFrTerms() {
		return this.pihFrTerms;
	}

	public void setPihFrTerms(String pihFrTerms) {
		this.pihFrTerms = pihFrTerms;
	}

	public String getPihUser1() {
		return this.pihUser1;
	}

	public void setPihUser1(String pihUser1) {
		this.pihUser1 = pihUser1;
	}

	public String getPihUser2() {
		return this.pihUser2;
	}

	public void setPihUser2(String pihUser2) {
		this.pihUser2 = pihUser2;
	}

	public String getPihQadc01() {
		return this.pihQadc01;
	}

	public void setPihQadc01(String pihQadc01) {
		this.pihQadc01 = pihQadc01;
	}

	public Double getPihQadd01() {
		return this.pihQadd01;
	}

	public void setPihQadd01(Double pihQadd01) {
		this.pihQadd01 = pihQadd01;
	}

	public Date getPihDte01() {
		return this.pihDte01;
	}

	public void setPihDte01(Date pihDte01) {
		this.pihDte01 = pihDte01;
	}

	public Date getPihDte02() {
		return this.pihDte02;
	}

	public void setPihDte02(Date pihDte02) {
		this.pihDte02 = pihDte02;
	}

	public Double getPihDec01() {
		return this.pihDec01;
	}

	public void setPihDec01(Double pihDec01) {
		this.pihDec01 = pihDec01;
	}

	public Double getPihDec02() {
		return this.pihDec02;
	}

	public void setPihDec02(Double pihDec02) {
		this.pihDec02 = pihDec02;
	}

	public Boolean getPihLog01() {
		return this.pihLog01;
	}

	public void setPihLog01(Boolean pihLog01) {
		this.pihLog01 = pihLog01;
	}

	public String getPihChr01() {
		return this.pihChr01;
	}

	public void setPihChr01(String pihChr01) {
		this.pihChr01 = pihChr01;
	}

	public String getPihChr02() {
		return this.pihChr02;
	}

	public void setPihChr02(String pihChr02) {
		this.pihChr02 = pihChr02;
	}

	public String getPihChr03() {
		return this.pihChr03;
	}

	public void setPihChr03(String pihChr03) {
		this.pihChr03 = pihChr03;
	}

	public String getPihChr04() {
		return this.pihChr04;
	}

	public void setPihChr04(String pihChr04) {
		this.pihChr04 = pihChr04;
	}

	public String getPihChr05() {
		return this.pihChr05;
	}

	public void setPihChr05(String pihChr05) {
		this.pihChr05 = pihChr05;
	}

	public String getPihChr06() {
		return this.pihChr06;
	}

	public void setPihChr06(String pihChr06) {
		this.pihChr06 = pihChr06;
	}

	public String getPihChr07() {
		return this.pihChr07;
	}

	public void setPihChr07(String pihChr07) {
		this.pihChr07 = pihChr07;
	}

	public String getPihChr08() {
		return this.pihChr08;
	}

	public void setPihChr08(String pihChr08) {
		this.pihChr08 = pihChr08;
	}

	public String getPihChr09() {
		return this.pihChr09;
	}

	public void setPihChr09(String pihChr09) {
		this.pihChr09 = pihChr09;
	}

	public String getPihChr10() {
		return this.pihChr10;
	}

	public void setPihChr10(String pihChr10) {
		this.pihChr10 = pihChr10;
	}

	public Date getPihModDate() {
		return this.pihModDate;
	}

	public void setPihModDate(Date pihModDate) {
		this.pihModDate = pihModDate;
	}

	public String getPihUserid() {
		return this.pihUserid;
	}

	public void setPihUserid(String pihUserid) {
		this.pihUserid = pihUserid;
	}

	public String getPihQtyType() {
		return this.pihQtyType;
	}

	public void setPihQtyType(String pihQtyType) {
		this.pihQtyType = pihQtyType;
	}

	public String getPihUm() {
		return this.pihUm;
	}

	public void setPihUm(String pihUm) {
		this.pihUm = pihUm;
	}

	public Integer getPihTime() {
		return this.pihTime;
	}

	public void setPihTime(Integer pihTime) {
		this.pihTime = pihTime;
	}

	public String getPihAccrAcct() {
		return this.pihAccrAcct;
	}

	public void setPihAccrAcct(String pihAccrAcct) {
		this.pihAccrAcct = pihAccrAcct;
	}

	public String getPihList() {
		return this.pihList;
	}

	public void setPihList(String pihList) {
		this.pihList = pihList;
	}

	public String getPihCombType() {
		return this.pihCombType;
	}

	public void setPihCombType(String pihCombType) {
		this.pihCombType = pihCombType;
	}

	public String getPihAccrCc() {
		return this.pihAccrCc;
	}

	public void setPihAccrCc(String pihAccrCc) {
		this.pihAccrCc = pihAccrCc;
	}

	public String getPihAccrProj() {
		return this.pihAccrProj;
	}

	public void setPihAccrProj(String pihAccrProj) {
		this.pihAccrProj = pihAccrProj;
	}

	public String getPihAccrSub() {
		return this.pihAccrSub;
	}

	public void setPihAccrSub(String pihAccrSub) {
		this.pihAccrSub = pihAccrSub;
	}

	public Double getPihDiscSeq() {
		return this.pihDiscSeq;
	}

	public void setPihDiscSeq(Double pihDiscSeq) {
		this.pihDiscSeq = pihDiscSeq;
	}

	public Boolean getPihPrint() {
		return this.pihPrint;
	}

	public void setPihPrint(Boolean pihPrint) {
		this.pihPrint = pihPrint;
	}

	public String getPihPromo1() {
		return this.pihPromo1;
	}

	public void setPihPromo1(String pihPromo1) {
		this.pihPromo1 = pihPromo1;
	}

	public String getPihPromo2() {
		return this.pihPromo2;
	}

	public void setPihPromo2(String pihPromo2) {
		this.pihPromo2 = pihPromo2;
	}

	public Integer getPihBonusLine() {
		return this.pihBonusLine;
	}

	public void setPihBonusLine(Integer pihBonusLine) {
		this.pihBonusLine = pihBonusLine;
	}

	public String getPihPromo3() {
		return this.pihPromo3;
	}

	public void setPihPromo3(String pihPromo3) {
		this.pihPromo3 = pihPromo3;
	}

	public String getPihPromo4() {
		return this.pihPromo4;
	}

	public void setPihPromo4(String pihPromo4) {
		this.pihPromo4 = pihPromo4;
	}

	public String getPihPigCode() {
		return this.pihPigCode;
	}

	public void setPihPigCode(String pihPigCode) {
		this.pihPigCode = pihPigCode;
	}

	public Double getOidPihHist() {
		return this.oidPihHist;
	}

	public void setOidPihHist(Double oidPihHist) {
		this.oidPihHist = oidPihHist;
	}

}