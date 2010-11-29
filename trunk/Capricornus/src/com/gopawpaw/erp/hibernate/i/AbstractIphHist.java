package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIphHist entity provides the base persistence definition of the
 * IphHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIphHist implements java.io.Serializable {

	// Fields

	private IphHistId id;
	private String iphDiscAcct;
	private String iphDiscCc;
	private String iphDiscSub;
	private String iphDiscProj;
	private Double iphQty;
	private Double iphAmt;
	private Double iphDiscAmt;
	private String iphBreakCat;
	private Double iphPidQty;
	private Double iphMinNet;
	private String iphCrTerms;
	private String iphFrList;
	private String iphFrTerms;
	private String iphUser1;
	private String iphUser2;
	private String iphQadc01;
	private Double iphQadd01;
	private Date iphDte01;
	private Date iphDte02;
	private Double iphDec01;
	private Double iphDec02;
	private Boolean iphLog01;
	private String iphChr01;
	private String iphChr02;
	private String iphChr03;
	private String iphChr04;
	private String iphChr05;
	private String iphChr06;
	private String iphChr07;
	private String iphChr08;
	private String iphChr09;
	private String iphChr10;
	private Date iphModDate;
	private String iphUserid;
	private String iphQtyType;
	private String iphUm;
	private Integer iphTime;
	private String iphAccrAcct;
	private String iphList;
	private String iphCombType;
	private String iphAccrCc;
	private String iphAccrProj;
	private String iphAccrSub;
	private Double iphDiscSeq;
	private Boolean iphPrint;
	private String iphPromo1;
	private String iphPromo2;
	private String iphPromo3;
	private String iphPromo4;
	private Integer iphBonusLine;
	private String iphPigCode;
	private Double oidIphHist;

	// Constructors

	/** default constructor */
	public AbstractIphHist() {
	}

	/** minimal constructor */
	public AbstractIphHist(IphHistId id, String iphUm, String iphList,
			String iphCombType, Double oidIphHist) {
		this.id = id;
		this.iphUm = iphUm;
		this.iphList = iphList;
		this.iphCombType = iphCombType;
		this.oidIphHist = oidIphHist;
	}

	/** full constructor */
	public AbstractIphHist(IphHistId id, String iphDiscAcct, String iphDiscCc,
			String iphDiscSub, String iphDiscProj, Double iphQty,
			Double iphAmt, Double iphDiscAmt, String iphBreakCat,
			Double iphPidQty, Double iphMinNet, String iphCrTerms,
			String iphFrList, String iphFrTerms, String iphUser1,
			String iphUser2, String iphQadc01, Double iphQadd01, Date iphDte01,
			Date iphDte02, Double iphDec01, Double iphDec02, Boolean iphLog01,
			String iphChr01, String iphChr02, String iphChr03, String iphChr04,
			String iphChr05, String iphChr06, String iphChr07, String iphChr08,
			String iphChr09, String iphChr10, Date iphModDate,
			String iphUserid, String iphQtyType, String iphUm, Integer iphTime,
			String iphAccrAcct, String iphList, String iphCombType,
			String iphAccrCc, String iphAccrProj, String iphAccrSub,
			Double iphDiscSeq, Boolean iphPrint, String iphPromo1,
			String iphPromo2, String iphPromo3, String iphPromo4,
			Integer iphBonusLine, String iphPigCode, Double oidIphHist) {
		this.id = id;
		this.iphDiscAcct = iphDiscAcct;
		this.iphDiscCc = iphDiscCc;
		this.iphDiscSub = iphDiscSub;
		this.iphDiscProj = iphDiscProj;
		this.iphQty = iphQty;
		this.iphAmt = iphAmt;
		this.iphDiscAmt = iphDiscAmt;
		this.iphBreakCat = iphBreakCat;
		this.iphPidQty = iphPidQty;
		this.iphMinNet = iphMinNet;
		this.iphCrTerms = iphCrTerms;
		this.iphFrList = iphFrList;
		this.iphFrTerms = iphFrTerms;
		this.iphUser1 = iphUser1;
		this.iphUser2 = iphUser2;
		this.iphQadc01 = iphQadc01;
		this.iphQadd01 = iphQadd01;
		this.iphDte01 = iphDte01;
		this.iphDte02 = iphDte02;
		this.iphDec01 = iphDec01;
		this.iphDec02 = iphDec02;
		this.iphLog01 = iphLog01;
		this.iphChr01 = iphChr01;
		this.iphChr02 = iphChr02;
		this.iphChr03 = iphChr03;
		this.iphChr04 = iphChr04;
		this.iphChr05 = iphChr05;
		this.iphChr06 = iphChr06;
		this.iphChr07 = iphChr07;
		this.iphChr08 = iphChr08;
		this.iphChr09 = iphChr09;
		this.iphChr10 = iphChr10;
		this.iphModDate = iphModDate;
		this.iphUserid = iphUserid;
		this.iphQtyType = iphQtyType;
		this.iphUm = iphUm;
		this.iphTime = iphTime;
		this.iphAccrAcct = iphAccrAcct;
		this.iphList = iphList;
		this.iphCombType = iphCombType;
		this.iphAccrCc = iphAccrCc;
		this.iphAccrProj = iphAccrProj;
		this.iphAccrSub = iphAccrSub;
		this.iphDiscSeq = iphDiscSeq;
		this.iphPrint = iphPrint;
		this.iphPromo1 = iphPromo1;
		this.iphPromo2 = iphPromo2;
		this.iphPromo3 = iphPromo3;
		this.iphPromo4 = iphPromo4;
		this.iphBonusLine = iphBonusLine;
		this.iphPigCode = iphPigCode;
		this.oidIphHist = oidIphHist;
	}

	// Property accessors

	public IphHistId getId() {
		return this.id;
	}

	public void setId(IphHistId id) {
		this.id = id;
	}

	public String getIphDiscAcct() {
		return this.iphDiscAcct;
	}

	public void setIphDiscAcct(String iphDiscAcct) {
		this.iphDiscAcct = iphDiscAcct;
	}

	public String getIphDiscCc() {
		return this.iphDiscCc;
	}

	public void setIphDiscCc(String iphDiscCc) {
		this.iphDiscCc = iphDiscCc;
	}

	public String getIphDiscSub() {
		return this.iphDiscSub;
	}

	public void setIphDiscSub(String iphDiscSub) {
		this.iphDiscSub = iphDiscSub;
	}

	public String getIphDiscProj() {
		return this.iphDiscProj;
	}

	public void setIphDiscProj(String iphDiscProj) {
		this.iphDiscProj = iphDiscProj;
	}

	public Double getIphQty() {
		return this.iphQty;
	}

	public void setIphQty(Double iphQty) {
		this.iphQty = iphQty;
	}

	public Double getIphAmt() {
		return this.iphAmt;
	}

	public void setIphAmt(Double iphAmt) {
		this.iphAmt = iphAmt;
	}

	public Double getIphDiscAmt() {
		return this.iphDiscAmt;
	}

	public void setIphDiscAmt(Double iphDiscAmt) {
		this.iphDiscAmt = iphDiscAmt;
	}

	public String getIphBreakCat() {
		return this.iphBreakCat;
	}

	public void setIphBreakCat(String iphBreakCat) {
		this.iphBreakCat = iphBreakCat;
	}

	public Double getIphPidQty() {
		return this.iphPidQty;
	}

	public void setIphPidQty(Double iphPidQty) {
		this.iphPidQty = iphPidQty;
	}

	public Double getIphMinNet() {
		return this.iphMinNet;
	}

	public void setIphMinNet(Double iphMinNet) {
		this.iphMinNet = iphMinNet;
	}

	public String getIphCrTerms() {
		return this.iphCrTerms;
	}

	public void setIphCrTerms(String iphCrTerms) {
		this.iphCrTerms = iphCrTerms;
	}

	public String getIphFrList() {
		return this.iphFrList;
	}

	public void setIphFrList(String iphFrList) {
		this.iphFrList = iphFrList;
	}

	public String getIphFrTerms() {
		return this.iphFrTerms;
	}

	public void setIphFrTerms(String iphFrTerms) {
		this.iphFrTerms = iphFrTerms;
	}

	public String getIphUser1() {
		return this.iphUser1;
	}

	public void setIphUser1(String iphUser1) {
		this.iphUser1 = iphUser1;
	}

	public String getIphUser2() {
		return this.iphUser2;
	}

	public void setIphUser2(String iphUser2) {
		this.iphUser2 = iphUser2;
	}

	public String getIphQadc01() {
		return this.iphQadc01;
	}

	public void setIphQadc01(String iphQadc01) {
		this.iphQadc01 = iphQadc01;
	}

	public Double getIphQadd01() {
		return this.iphQadd01;
	}

	public void setIphQadd01(Double iphQadd01) {
		this.iphQadd01 = iphQadd01;
	}

	public Date getIphDte01() {
		return this.iphDte01;
	}

	public void setIphDte01(Date iphDte01) {
		this.iphDte01 = iphDte01;
	}

	public Date getIphDte02() {
		return this.iphDte02;
	}

	public void setIphDte02(Date iphDte02) {
		this.iphDte02 = iphDte02;
	}

	public Double getIphDec01() {
		return this.iphDec01;
	}

	public void setIphDec01(Double iphDec01) {
		this.iphDec01 = iphDec01;
	}

	public Double getIphDec02() {
		return this.iphDec02;
	}

	public void setIphDec02(Double iphDec02) {
		this.iphDec02 = iphDec02;
	}

	public Boolean getIphLog01() {
		return this.iphLog01;
	}

	public void setIphLog01(Boolean iphLog01) {
		this.iphLog01 = iphLog01;
	}

	public String getIphChr01() {
		return this.iphChr01;
	}

	public void setIphChr01(String iphChr01) {
		this.iphChr01 = iphChr01;
	}

	public String getIphChr02() {
		return this.iphChr02;
	}

	public void setIphChr02(String iphChr02) {
		this.iphChr02 = iphChr02;
	}

	public String getIphChr03() {
		return this.iphChr03;
	}

	public void setIphChr03(String iphChr03) {
		this.iphChr03 = iphChr03;
	}

	public String getIphChr04() {
		return this.iphChr04;
	}

	public void setIphChr04(String iphChr04) {
		this.iphChr04 = iphChr04;
	}

	public String getIphChr05() {
		return this.iphChr05;
	}

	public void setIphChr05(String iphChr05) {
		this.iphChr05 = iphChr05;
	}

	public String getIphChr06() {
		return this.iphChr06;
	}

	public void setIphChr06(String iphChr06) {
		this.iphChr06 = iphChr06;
	}

	public String getIphChr07() {
		return this.iphChr07;
	}

	public void setIphChr07(String iphChr07) {
		this.iphChr07 = iphChr07;
	}

	public String getIphChr08() {
		return this.iphChr08;
	}

	public void setIphChr08(String iphChr08) {
		this.iphChr08 = iphChr08;
	}

	public String getIphChr09() {
		return this.iphChr09;
	}

	public void setIphChr09(String iphChr09) {
		this.iphChr09 = iphChr09;
	}

	public String getIphChr10() {
		return this.iphChr10;
	}

	public void setIphChr10(String iphChr10) {
		this.iphChr10 = iphChr10;
	}

	public Date getIphModDate() {
		return this.iphModDate;
	}

	public void setIphModDate(Date iphModDate) {
		this.iphModDate = iphModDate;
	}

	public String getIphUserid() {
		return this.iphUserid;
	}

	public void setIphUserid(String iphUserid) {
		this.iphUserid = iphUserid;
	}

	public String getIphQtyType() {
		return this.iphQtyType;
	}

	public void setIphQtyType(String iphQtyType) {
		this.iphQtyType = iphQtyType;
	}

	public String getIphUm() {
		return this.iphUm;
	}

	public void setIphUm(String iphUm) {
		this.iphUm = iphUm;
	}

	public Integer getIphTime() {
		return this.iphTime;
	}

	public void setIphTime(Integer iphTime) {
		this.iphTime = iphTime;
	}

	public String getIphAccrAcct() {
		return this.iphAccrAcct;
	}

	public void setIphAccrAcct(String iphAccrAcct) {
		this.iphAccrAcct = iphAccrAcct;
	}

	public String getIphList() {
		return this.iphList;
	}

	public void setIphList(String iphList) {
		this.iphList = iphList;
	}

	public String getIphCombType() {
		return this.iphCombType;
	}

	public void setIphCombType(String iphCombType) {
		this.iphCombType = iphCombType;
	}

	public String getIphAccrCc() {
		return this.iphAccrCc;
	}

	public void setIphAccrCc(String iphAccrCc) {
		this.iphAccrCc = iphAccrCc;
	}

	public String getIphAccrProj() {
		return this.iphAccrProj;
	}

	public void setIphAccrProj(String iphAccrProj) {
		this.iphAccrProj = iphAccrProj;
	}

	public String getIphAccrSub() {
		return this.iphAccrSub;
	}

	public void setIphAccrSub(String iphAccrSub) {
		this.iphAccrSub = iphAccrSub;
	}

	public Double getIphDiscSeq() {
		return this.iphDiscSeq;
	}

	public void setIphDiscSeq(Double iphDiscSeq) {
		this.iphDiscSeq = iphDiscSeq;
	}

	public Boolean getIphPrint() {
		return this.iphPrint;
	}

	public void setIphPrint(Boolean iphPrint) {
		this.iphPrint = iphPrint;
	}

	public String getIphPromo1() {
		return this.iphPromo1;
	}

	public void setIphPromo1(String iphPromo1) {
		this.iphPromo1 = iphPromo1;
	}

	public String getIphPromo2() {
		return this.iphPromo2;
	}

	public void setIphPromo2(String iphPromo2) {
		this.iphPromo2 = iphPromo2;
	}

	public String getIphPromo3() {
		return this.iphPromo3;
	}

	public void setIphPromo3(String iphPromo3) {
		this.iphPromo3 = iphPromo3;
	}

	public String getIphPromo4() {
		return this.iphPromo4;
	}

	public void setIphPromo4(String iphPromo4) {
		this.iphPromo4 = iphPromo4;
	}

	public Integer getIphBonusLine() {
		return this.iphBonusLine;
	}

	public void setIphBonusLine(Integer iphBonusLine) {
		this.iphBonusLine = iphBonusLine;
	}

	public String getIphPigCode() {
		return this.iphPigCode;
	}

	public void setIphPigCode(String iphPigCode) {
		this.iphPigCode = iphPigCode;
	}

	public Double getOidIphHist() {
		return this.oidIphHist;
	}

	public void setOidIphHist(Double oidIphHist) {
		this.oidIphHist = oidIphHist;
	}

}