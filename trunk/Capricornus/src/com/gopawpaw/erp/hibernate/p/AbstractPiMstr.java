package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPiMstr entity provides the base persistence definition of the PiMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPiMstr implements java.io.Serializable {

	// Fields

	private PiMstrId id;
	private String piDesc;
	private Date piExpire;
	private String piCombType;
	private String piAmtType;
	private String piBreakCat;
	private String piQtyType;
	private Boolean piManual;
	private Double piMaxQty;
	private String piCostSet;
	private String piDiscAcct;
	private String piDiscSub;
	private String piDiscProj;
	private String piListId;
	private Boolean piConfgDisc;
	private Double piMinNet;
	private Integer piMaxOrd;
	private Double piListPrice;
	private Double piMinPrice;
	private Double piMaxPrice;
	private String piUserid;
	private Date piModDate;
	private String piUser1;
	private String piUser2;
	private String piQadc01;
	private Double piQadd01;
	private Date piDte01;
	private Date piDte02;
	private Double piDec01;
	private Double piDec02;
	private Boolean piLog01;
	private String piChr01;
	private String piChr02;
	private String piChr03;
	private String piChr04;
	private String piChr05;
	private String piChr06;
	private String piChr07;
	private String piChr08;
	private String piChr09;
	private String piChr10;
	private String piDiscCc;
	private String piTerms;
	private Integer piCmtindx;
	private Integer piSrchType;
	private String piAccrCc;
	private String piAccrProj;
	private String piAccrAcct;
	private String piAccrSub;
	private Boolean piPrint;
	private Double piDiscSeq;
	private Boolean piExtrec;
	private String piPromo1;
	private String piPromo2;
	private String piPromo3;
	private String piPromo4;
	private String piPigCode;
	private Double oidPiMstr;

	// Constructors

	/** default constructor */
	public AbstractPiMstr() {
	}

	/** minimal constructor */
	public AbstractPiMstr(PiMstrId id, String piCombType, String piAmtType,
			String piPromo1, String piPromo2, Double oidPiMstr) {
		this.id = id;
		this.piCombType = piCombType;
		this.piAmtType = piAmtType;
		this.piPromo1 = piPromo1;
		this.piPromo2 = piPromo2;
		this.oidPiMstr = oidPiMstr;
	}

	/** full constructor */
	public AbstractPiMstr(PiMstrId id, String piDesc, Date piExpire,
			String piCombType, String piAmtType, String piBreakCat,
			String piQtyType, Boolean piManual, Double piMaxQty,
			String piCostSet, String piDiscAcct, String piDiscSub,
			String piDiscProj, String piListId, Boolean piConfgDisc,
			Double piMinNet, Integer piMaxOrd, Double piListPrice,
			Double piMinPrice, Double piMaxPrice, String piUserid,
			Date piModDate, String piUser1, String piUser2, String piQadc01,
			Double piQadd01, Date piDte01, Date piDte02, Double piDec01,
			Double piDec02, Boolean piLog01, String piChr01, String piChr02,
			String piChr03, String piChr04, String piChr05, String piChr06,
			String piChr07, String piChr08, String piChr09, String piChr10,
			String piDiscCc, String piTerms, Integer piCmtindx,
			Integer piSrchType, String piAccrCc, String piAccrProj,
			String piAccrAcct, String piAccrSub, Boolean piPrint,
			Double piDiscSeq, Boolean piExtrec, String piPromo1,
			String piPromo2, String piPromo3, String piPromo4,
			String piPigCode, Double oidPiMstr) {
		this.id = id;
		this.piDesc = piDesc;
		this.piExpire = piExpire;
		this.piCombType = piCombType;
		this.piAmtType = piAmtType;
		this.piBreakCat = piBreakCat;
		this.piQtyType = piQtyType;
		this.piManual = piManual;
		this.piMaxQty = piMaxQty;
		this.piCostSet = piCostSet;
		this.piDiscAcct = piDiscAcct;
		this.piDiscSub = piDiscSub;
		this.piDiscProj = piDiscProj;
		this.piListId = piListId;
		this.piConfgDisc = piConfgDisc;
		this.piMinNet = piMinNet;
		this.piMaxOrd = piMaxOrd;
		this.piListPrice = piListPrice;
		this.piMinPrice = piMinPrice;
		this.piMaxPrice = piMaxPrice;
		this.piUserid = piUserid;
		this.piModDate = piModDate;
		this.piUser1 = piUser1;
		this.piUser2 = piUser2;
		this.piQadc01 = piQadc01;
		this.piQadd01 = piQadd01;
		this.piDte01 = piDte01;
		this.piDte02 = piDte02;
		this.piDec01 = piDec01;
		this.piDec02 = piDec02;
		this.piLog01 = piLog01;
		this.piChr01 = piChr01;
		this.piChr02 = piChr02;
		this.piChr03 = piChr03;
		this.piChr04 = piChr04;
		this.piChr05 = piChr05;
		this.piChr06 = piChr06;
		this.piChr07 = piChr07;
		this.piChr08 = piChr08;
		this.piChr09 = piChr09;
		this.piChr10 = piChr10;
		this.piDiscCc = piDiscCc;
		this.piTerms = piTerms;
		this.piCmtindx = piCmtindx;
		this.piSrchType = piSrchType;
		this.piAccrCc = piAccrCc;
		this.piAccrProj = piAccrProj;
		this.piAccrAcct = piAccrAcct;
		this.piAccrSub = piAccrSub;
		this.piPrint = piPrint;
		this.piDiscSeq = piDiscSeq;
		this.piExtrec = piExtrec;
		this.piPromo1 = piPromo1;
		this.piPromo2 = piPromo2;
		this.piPromo3 = piPromo3;
		this.piPromo4 = piPromo4;
		this.piPigCode = piPigCode;
		this.oidPiMstr = oidPiMstr;
	}

	// Property accessors

	public PiMstrId getId() {
		return this.id;
	}

	public void setId(PiMstrId id) {
		this.id = id;
	}

	public String getPiDesc() {
		return this.piDesc;
	}

	public void setPiDesc(String piDesc) {
		this.piDesc = piDesc;
	}

	public Date getPiExpire() {
		return this.piExpire;
	}

	public void setPiExpire(Date piExpire) {
		this.piExpire = piExpire;
	}

	public String getPiCombType() {
		return this.piCombType;
	}

	public void setPiCombType(String piCombType) {
		this.piCombType = piCombType;
	}

	public String getPiAmtType() {
		return this.piAmtType;
	}

	public void setPiAmtType(String piAmtType) {
		this.piAmtType = piAmtType;
	}

	public String getPiBreakCat() {
		return this.piBreakCat;
	}

	public void setPiBreakCat(String piBreakCat) {
		this.piBreakCat = piBreakCat;
	}

	public String getPiQtyType() {
		return this.piQtyType;
	}

	public void setPiQtyType(String piQtyType) {
		this.piQtyType = piQtyType;
	}

	public Boolean getPiManual() {
		return this.piManual;
	}

	public void setPiManual(Boolean piManual) {
		this.piManual = piManual;
	}

	public Double getPiMaxQty() {
		return this.piMaxQty;
	}

	public void setPiMaxQty(Double piMaxQty) {
		this.piMaxQty = piMaxQty;
	}

	public String getPiCostSet() {
		return this.piCostSet;
	}

	public void setPiCostSet(String piCostSet) {
		this.piCostSet = piCostSet;
	}

	public String getPiDiscAcct() {
		return this.piDiscAcct;
	}

	public void setPiDiscAcct(String piDiscAcct) {
		this.piDiscAcct = piDiscAcct;
	}

	public String getPiDiscSub() {
		return this.piDiscSub;
	}

	public void setPiDiscSub(String piDiscSub) {
		this.piDiscSub = piDiscSub;
	}

	public String getPiDiscProj() {
		return this.piDiscProj;
	}

	public void setPiDiscProj(String piDiscProj) {
		this.piDiscProj = piDiscProj;
	}

	public String getPiListId() {
		return this.piListId;
	}

	public void setPiListId(String piListId) {
		this.piListId = piListId;
	}

	public Boolean getPiConfgDisc() {
		return this.piConfgDisc;
	}

	public void setPiConfgDisc(Boolean piConfgDisc) {
		this.piConfgDisc = piConfgDisc;
	}

	public Double getPiMinNet() {
		return this.piMinNet;
	}

	public void setPiMinNet(Double piMinNet) {
		this.piMinNet = piMinNet;
	}

	public Integer getPiMaxOrd() {
		return this.piMaxOrd;
	}

	public void setPiMaxOrd(Integer piMaxOrd) {
		this.piMaxOrd = piMaxOrd;
	}

	public Double getPiListPrice() {
		return this.piListPrice;
	}

	public void setPiListPrice(Double piListPrice) {
		this.piListPrice = piListPrice;
	}

	public Double getPiMinPrice() {
		return this.piMinPrice;
	}

	public void setPiMinPrice(Double piMinPrice) {
		this.piMinPrice = piMinPrice;
	}

	public Double getPiMaxPrice() {
		return this.piMaxPrice;
	}

	public void setPiMaxPrice(Double piMaxPrice) {
		this.piMaxPrice = piMaxPrice;
	}

	public String getPiUserid() {
		return this.piUserid;
	}

	public void setPiUserid(String piUserid) {
		this.piUserid = piUserid;
	}

	public Date getPiModDate() {
		return this.piModDate;
	}

	public void setPiModDate(Date piModDate) {
		this.piModDate = piModDate;
	}

	public String getPiUser1() {
		return this.piUser1;
	}

	public void setPiUser1(String piUser1) {
		this.piUser1 = piUser1;
	}

	public String getPiUser2() {
		return this.piUser2;
	}

	public void setPiUser2(String piUser2) {
		this.piUser2 = piUser2;
	}

	public String getPiQadc01() {
		return this.piQadc01;
	}

	public void setPiQadc01(String piQadc01) {
		this.piQadc01 = piQadc01;
	}

	public Double getPiQadd01() {
		return this.piQadd01;
	}

	public void setPiQadd01(Double piQadd01) {
		this.piQadd01 = piQadd01;
	}

	public Date getPiDte01() {
		return this.piDte01;
	}

	public void setPiDte01(Date piDte01) {
		this.piDte01 = piDte01;
	}

	public Date getPiDte02() {
		return this.piDte02;
	}

	public void setPiDte02(Date piDte02) {
		this.piDte02 = piDte02;
	}

	public Double getPiDec01() {
		return this.piDec01;
	}

	public void setPiDec01(Double piDec01) {
		this.piDec01 = piDec01;
	}

	public Double getPiDec02() {
		return this.piDec02;
	}

	public void setPiDec02(Double piDec02) {
		this.piDec02 = piDec02;
	}

	public Boolean getPiLog01() {
		return this.piLog01;
	}

	public void setPiLog01(Boolean piLog01) {
		this.piLog01 = piLog01;
	}

	public String getPiChr01() {
		return this.piChr01;
	}

	public void setPiChr01(String piChr01) {
		this.piChr01 = piChr01;
	}

	public String getPiChr02() {
		return this.piChr02;
	}

	public void setPiChr02(String piChr02) {
		this.piChr02 = piChr02;
	}

	public String getPiChr03() {
		return this.piChr03;
	}

	public void setPiChr03(String piChr03) {
		this.piChr03 = piChr03;
	}

	public String getPiChr04() {
		return this.piChr04;
	}

	public void setPiChr04(String piChr04) {
		this.piChr04 = piChr04;
	}

	public String getPiChr05() {
		return this.piChr05;
	}

	public void setPiChr05(String piChr05) {
		this.piChr05 = piChr05;
	}

	public String getPiChr06() {
		return this.piChr06;
	}

	public void setPiChr06(String piChr06) {
		this.piChr06 = piChr06;
	}

	public String getPiChr07() {
		return this.piChr07;
	}

	public void setPiChr07(String piChr07) {
		this.piChr07 = piChr07;
	}

	public String getPiChr08() {
		return this.piChr08;
	}

	public void setPiChr08(String piChr08) {
		this.piChr08 = piChr08;
	}

	public String getPiChr09() {
		return this.piChr09;
	}

	public void setPiChr09(String piChr09) {
		this.piChr09 = piChr09;
	}

	public String getPiChr10() {
		return this.piChr10;
	}

	public void setPiChr10(String piChr10) {
		this.piChr10 = piChr10;
	}

	public String getPiDiscCc() {
		return this.piDiscCc;
	}

	public void setPiDiscCc(String piDiscCc) {
		this.piDiscCc = piDiscCc;
	}

	public String getPiTerms() {
		return this.piTerms;
	}

	public void setPiTerms(String piTerms) {
		this.piTerms = piTerms;
	}

	public Integer getPiCmtindx() {
		return this.piCmtindx;
	}

	public void setPiCmtindx(Integer piCmtindx) {
		this.piCmtindx = piCmtindx;
	}

	public Integer getPiSrchType() {
		return this.piSrchType;
	}

	public void setPiSrchType(Integer piSrchType) {
		this.piSrchType = piSrchType;
	}

	public String getPiAccrCc() {
		return this.piAccrCc;
	}

	public void setPiAccrCc(String piAccrCc) {
		this.piAccrCc = piAccrCc;
	}

	public String getPiAccrProj() {
		return this.piAccrProj;
	}

	public void setPiAccrProj(String piAccrProj) {
		this.piAccrProj = piAccrProj;
	}

	public String getPiAccrAcct() {
		return this.piAccrAcct;
	}

	public void setPiAccrAcct(String piAccrAcct) {
		this.piAccrAcct = piAccrAcct;
	}

	public String getPiAccrSub() {
		return this.piAccrSub;
	}

	public void setPiAccrSub(String piAccrSub) {
		this.piAccrSub = piAccrSub;
	}

	public Boolean getPiPrint() {
		return this.piPrint;
	}

	public void setPiPrint(Boolean piPrint) {
		this.piPrint = piPrint;
	}

	public Double getPiDiscSeq() {
		return this.piDiscSeq;
	}

	public void setPiDiscSeq(Double piDiscSeq) {
		this.piDiscSeq = piDiscSeq;
	}

	public Boolean getPiExtrec() {
		return this.piExtrec;
	}

	public void setPiExtrec(Boolean piExtrec) {
		this.piExtrec = piExtrec;
	}

	public String getPiPromo1() {
		return this.piPromo1;
	}

	public void setPiPromo1(String piPromo1) {
		this.piPromo1 = piPromo1;
	}

	public String getPiPromo2() {
		return this.piPromo2;
	}

	public void setPiPromo2(String piPromo2) {
		this.piPromo2 = piPromo2;
	}

	public String getPiPromo3() {
		return this.piPromo3;
	}

	public void setPiPromo3(String piPromo3) {
		this.piPromo3 = piPromo3;
	}

	public String getPiPromo4() {
		return this.piPromo4;
	}

	public void setPiPromo4(String piPromo4) {
		this.piPromo4 = piPromo4;
	}

	public String getPiPigCode() {
		return this.piPigCode;
	}

	public void setPiPigCode(String piPigCode) {
		this.piPigCode = piPigCode;
	}

	public Double getOidPiMstr() {
		return this.oidPiMstr;
	}

	public void setOidPiMstr(Double oidPiMstr) {
		this.oidPiMstr = oidPiMstr;
	}

}