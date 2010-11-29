package com.gopawpaw.erp.hibernate.v;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractVdMstr entity provides the base persistence definition of the VdMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVdMstr implements java.io.Serializable {

	// Fields

	private VdMstrId id;
	private String vdCrTerms;
	private String vdBuyer;
	private Double vdDiscPct;
	private String vdShipvia;
	private Boolean vdPartial;
	private String vdRmks;
	private String vdApAcct;
	private String vdApCc;
	private String vdPurAcct;
	private String vdPurCc;
	private String vdPurCntct;
	private String vdApCntct;
	private Boolean vd1099;
	private String vdSort;
	private Date vdLastCk;
	private Double vdBalance;
	private Boolean vdHold;
	private String vdTaxId;
	private Boolean vdTaxable;
	private String vdUser1;
	private String vdUser2;
	private String vdCurr;
	private String vdLang;
	private String vdVtId;
	private String vdChr01;
	private String vdChr02;
	private String vdChr03;
	private String vdChr04;
	private String vdChr05;
	private String vdChr06;
	private String vdChr07;
	private String vdChr08;
	private String vdChr09;
	private String vdChr10;
	private Date vdDte01;
	private Date vdDte02;
	private Double vdDec01;
	private Double vdDec02;
	private Boolean vdLog01;
	private String vdFob;
	private String vdDebtor;
	private String vdBank;
	private String vdCkfrm;
	private Boolean vdPaySpec;
	private String vdRemit;
	private String vdType;
	private String vdUserid;
	private Date vdModDate;
	private Double vdPrepay;
	private String vdConrepLogic;
	private String vdPrList;
	private Double vdDrftBal;
	private Double vdLcBal;
	private String vdPrList2;
	private Boolean vdFixPr;
	private String vdFrList;
	private BigDecimal vdFrMinWt;
	private String vdFrTerms;
	private String vdTidNotice;
	private String vdPromo;
	private Boolean vdMiscCr;
	private Boolean vdRcvSoPrice;
	private Boolean vdRcvHeldSo;
	private Boolean vdTpUsePct;
	private Double vdTpPct;
	private String vdExRatetype;
	private String vdDb;
	private String vdQadc01;
	private String vdQadc02;
	private String vdQadc03;
	private String vdQadc04;
	private Double vdQadd01;
	private Double vdQadd02;
	private Boolean vdQadl01;
	private Boolean vdQadl02;
	private Date vdQadt01;
	private Date vdQadt02;
	private Integer vdQadi01;
	private Integer vdQadi02;
	private Boolean vdQadl03;
	private Boolean vdQadl04;
	private String vdApSub;
	private String vdPurSub;
	private String vdTotTermsCode;
	private Double oidVdMstr;

	// Constructors

	/** default constructor */
	public AbstractVdMstr() {
	}

	/** minimal constructor */
	public AbstractVdMstr(VdMstrId id, String vdTidNotice, String vdPromo,
			Boolean vdMiscCr, Boolean vdRcvSoPrice, Boolean vdRcvHeldSo,
			Boolean vdTpUsePct, Double vdTpPct, String vdExRatetype,
			String vdTotTermsCode, Double oidVdMstr) {
		this.id = id;
		this.vdTidNotice = vdTidNotice;
		this.vdPromo = vdPromo;
		this.vdMiscCr = vdMiscCr;
		this.vdRcvSoPrice = vdRcvSoPrice;
		this.vdRcvHeldSo = vdRcvHeldSo;
		this.vdTpUsePct = vdTpUsePct;
		this.vdTpPct = vdTpPct;
		this.vdExRatetype = vdExRatetype;
		this.vdTotTermsCode = vdTotTermsCode;
		this.oidVdMstr = oidVdMstr;
	}

	/** full constructor */
	public AbstractVdMstr(VdMstrId id, String vdCrTerms, String vdBuyer,
			Double vdDiscPct, String vdShipvia, Boolean vdPartial,
			String vdRmks, String vdApAcct, String vdApCc, String vdPurAcct,
			String vdPurCc, String vdPurCntct, String vdApCntct,
			Boolean vd1099, String vdSort, Date vdLastCk, Double vdBalance,
			Boolean vdHold, String vdTaxId, Boolean vdTaxable, String vdUser1,
			String vdUser2, String vdCurr, String vdLang, String vdVtId,
			String vdChr01, String vdChr02, String vdChr03, String vdChr04,
			String vdChr05, String vdChr06, String vdChr07, String vdChr08,
			String vdChr09, String vdChr10, Date vdDte01, Date vdDte02,
			Double vdDec01, Double vdDec02, Boolean vdLog01, String vdFob,
			String vdDebtor, String vdBank, String vdCkfrm, Boolean vdPaySpec,
			String vdRemit, String vdType, String vdUserid, Date vdModDate,
			Double vdPrepay, String vdConrepLogic, String vdPrList,
			Double vdDrftBal, Double vdLcBal, String vdPrList2,
			Boolean vdFixPr, String vdFrList, BigDecimal vdFrMinWt,
			String vdFrTerms, String vdTidNotice, String vdPromo,
			Boolean vdMiscCr, Boolean vdRcvSoPrice, Boolean vdRcvHeldSo,
			Boolean vdTpUsePct, Double vdTpPct, String vdExRatetype,
			String vdDb, String vdQadc01, String vdQadc02, String vdQadc03,
			String vdQadc04, Double vdQadd01, Double vdQadd02,
			Boolean vdQadl01, Boolean vdQadl02, Date vdQadt01, Date vdQadt02,
			Integer vdQadi01, Integer vdQadi02, Boolean vdQadl03,
			Boolean vdQadl04, String vdApSub, String vdPurSub,
			String vdTotTermsCode, Double oidVdMstr) {
		this.id = id;
		this.vdCrTerms = vdCrTerms;
		this.vdBuyer = vdBuyer;
		this.vdDiscPct = vdDiscPct;
		this.vdShipvia = vdShipvia;
		this.vdPartial = vdPartial;
		this.vdRmks = vdRmks;
		this.vdApAcct = vdApAcct;
		this.vdApCc = vdApCc;
		this.vdPurAcct = vdPurAcct;
		this.vdPurCc = vdPurCc;
		this.vdPurCntct = vdPurCntct;
		this.vdApCntct = vdApCntct;
		this.vd1099 = vd1099;
		this.vdSort = vdSort;
		this.vdLastCk = vdLastCk;
		this.vdBalance = vdBalance;
		this.vdHold = vdHold;
		this.vdTaxId = vdTaxId;
		this.vdTaxable = vdTaxable;
		this.vdUser1 = vdUser1;
		this.vdUser2 = vdUser2;
		this.vdCurr = vdCurr;
		this.vdLang = vdLang;
		this.vdVtId = vdVtId;
		this.vdChr01 = vdChr01;
		this.vdChr02 = vdChr02;
		this.vdChr03 = vdChr03;
		this.vdChr04 = vdChr04;
		this.vdChr05 = vdChr05;
		this.vdChr06 = vdChr06;
		this.vdChr07 = vdChr07;
		this.vdChr08 = vdChr08;
		this.vdChr09 = vdChr09;
		this.vdChr10 = vdChr10;
		this.vdDte01 = vdDte01;
		this.vdDte02 = vdDte02;
		this.vdDec01 = vdDec01;
		this.vdDec02 = vdDec02;
		this.vdLog01 = vdLog01;
		this.vdFob = vdFob;
		this.vdDebtor = vdDebtor;
		this.vdBank = vdBank;
		this.vdCkfrm = vdCkfrm;
		this.vdPaySpec = vdPaySpec;
		this.vdRemit = vdRemit;
		this.vdType = vdType;
		this.vdUserid = vdUserid;
		this.vdModDate = vdModDate;
		this.vdPrepay = vdPrepay;
		this.vdConrepLogic = vdConrepLogic;
		this.vdPrList = vdPrList;
		this.vdDrftBal = vdDrftBal;
		this.vdLcBal = vdLcBal;
		this.vdPrList2 = vdPrList2;
		this.vdFixPr = vdFixPr;
		this.vdFrList = vdFrList;
		this.vdFrMinWt = vdFrMinWt;
		this.vdFrTerms = vdFrTerms;
		this.vdTidNotice = vdTidNotice;
		this.vdPromo = vdPromo;
		this.vdMiscCr = vdMiscCr;
		this.vdRcvSoPrice = vdRcvSoPrice;
		this.vdRcvHeldSo = vdRcvHeldSo;
		this.vdTpUsePct = vdTpUsePct;
		this.vdTpPct = vdTpPct;
		this.vdExRatetype = vdExRatetype;
		this.vdDb = vdDb;
		this.vdQadc01 = vdQadc01;
		this.vdQadc02 = vdQadc02;
		this.vdQadc03 = vdQadc03;
		this.vdQadc04 = vdQadc04;
		this.vdQadd01 = vdQadd01;
		this.vdQadd02 = vdQadd02;
		this.vdQadl01 = vdQadl01;
		this.vdQadl02 = vdQadl02;
		this.vdQadt01 = vdQadt01;
		this.vdQadt02 = vdQadt02;
		this.vdQadi01 = vdQadi01;
		this.vdQadi02 = vdQadi02;
		this.vdQadl03 = vdQadl03;
		this.vdQadl04 = vdQadl04;
		this.vdApSub = vdApSub;
		this.vdPurSub = vdPurSub;
		this.vdTotTermsCode = vdTotTermsCode;
		this.oidVdMstr = oidVdMstr;
	}

	// Property accessors

	public VdMstrId getId() {
		return this.id;
	}

	public void setId(VdMstrId id) {
		this.id = id;
	}

	public String getVdCrTerms() {
		return this.vdCrTerms;
	}

	public void setVdCrTerms(String vdCrTerms) {
		this.vdCrTerms = vdCrTerms;
	}

	public String getVdBuyer() {
		return this.vdBuyer;
	}

	public void setVdBuyer(String vdBuyer) {
		this.vdBuyer = vdBuyer;
	}

	public Double getVdDiscPct() {
		return this.vdDiscPct;
	}

	public void setVdDiscPct(Double vdDiscPct) {
		this.vdDiscPct = vdDiscPct;
	}

	public String getVdShipvia() {
		return this.vdShipvia;
	}

	public void setVdShipvia(String vdShipvia) {
		this.vdShipvia = vdShipvia;
	}

	public Boolean getVdPartial() {
		return this.vdPartial;
	}

	public void setVdPartial(Boolean vdPartial) {
		this.vdPartial = vdPartial;
	}

	public String getVdRmks() {
		return this.vdRmks;
	}

	public void setVdRmks(String vdRmks) {
		this.vdRmks = vdRmks;
	}

	public String getVdApAcct() {
		return this.vdApAcct;
	}

	public void setVdApAcct(String vdApAcct) {
		this.vdApAcct = vdApAcct;
	}

	public String getVdApCc() {
		return this.vdApCc;
	}

	public void setVdApCc(String vdApCc) {
		this.vdApCc = vdApCc;
	}

	public String getVdPurAcct() {
		return this.vdPurAcct;
	}

	public void setVdPurAcct(String vdPurAcct) {
		this.vdPurAcct = vdPurAcct;
	}

	public String getVdPurCc() {
		return this.vdPurCc;
	}

	public void setVdPurCc(String vdPurCc) {
		this.vdPurCc = vdPurCc;
	}

	public String getVdPurCntct() {
		return this.vdPurCntct;
	}

	public void setVdPurCntct(String vdPurCntct) {
		this.vdPurCntct = vdPurCntct;
	}

	public String getVdApCntct() {
		return this.vdApCntct;
	}

	public void setVdApCntct(String vdApCntct) {
		this.vdApCntct = vdApCntct;
	}

	public Boolean getVd1099() {
		return this.vd1099;
	}

	public void setVd1099(Boolean vd1099) {
		this.vd1099 = vd1099;
	}

	public String getVdSort() {
		return this.vdSort;
	}

	public void setVdSort(String vdSort) {
		this.vdSort = vdSort;
	}

	public Date getVdLastCk() {
		return this.vdLastCk;
	}

	public void setVdLastCk(Date vdLastCk) {
		this.vdLastCk = vdLastCk;
	}

	public Double getVdBalance() {
		return this.vdBalance;
	}

	public void setVdBalance(Double vdBalance) {
		this.vdBalance = vdBalance;
	}

	public Boolean getVdHold() {
		return this.vdHold;
	}

	public void setVdHold(Boolean vdHold) {
		this.vdHold = vdHold;
	}

	public String getVdTaxId() {
		return this.vdTaxId;
	}

	public void setVdTaxId(String vdTaxId) {
		this.vdTaxId = vdTaxId;
	}

	public Boolean getVdTaxable() {
		return this.vdTaxable;
	}

	public void setVdTaxable(Boolean vdTaxable) {
		this.vdTaxable = vdTaxable;
	}

	public String getVdUser1() {
		return this.vdUser1;
	}

	public void setVdUser1(String vdUser1) {
		this.vdUser1 = vdUser1;
	}

	public String getVdUser2() {
		return this.vdUser2;
	}

	public void setVdUser2(String vdUser2) {
		this.vdUser2 = vdUser2;
	}

	public String getVdCurr() {
		return this.vdCurr;
	}

	public void setVdCurr(String vdCurr) {
		this.vdCurr = vdCurr;
	}

	public String getVdLang() {
		return this.vdLang;
	}

	public void setVdLang(String vdLang) {
		this.vdLang = vdLang;
	}

	public String getVdVtId() {
		return this.vdVtId;
	}

	public void setVdVtId(String vdVtId) {
		this.vdVtId = vdVtId;
	}

	public String getVdChr01() {
		return this.vdChr01;
	}

	public void setVdChr01(String vdChr01) {
		this.vdChr01 = vdChr01;
	}

	public String getVdChr02() {
		return this.vdChr02;
	}

	public void setVdChr02(String vdChr02) {
		this.vdChr02 = vdChr02;
	}

	public String getVdChr03() {
		return this.vdChr03;
	}

	public void setVdChr03(String vdChr03) {
		this.vdChr03 = vdChr03;
	}

	public String getVdChr04() {
		return this.vdChr04;
	}

	public void setVdChr04(String vdChr04) {
		this.vdChr04 = vdChr04;
	}

	public String getVdChr05() {
		return this.vdChr05;
	}

	public void setVdChr05(String vdChr05) {
		this.vdChr05 = vdChr05;
	}

	public String getVdChr06() {
		return this.vdChr06;
	}

	public void setVdChr06(String vdChr06) {
		this.vdChr06 = vdChr06;
	}

	public String getVdChr07() {
		return this.vdChr07;
	}

	public void setVdChr07(String vdChr07) {
		this.vdChr07 = vdChr07;
	}

	public String getVdChr08() {
		return this.vdChr08;
	}

	public void setVdChr08(String vdChr08) {
		this.vdChr08 = vdChr08;
	}

	public String getVdChr09() {
		return this.vdChr09;
	}

	public void setVdChr09(String vdChr09) {
		this.vdChr09 = vdChr09;
	}

	public String getVdChr10() {
		return this.vdChr10;
	}

	public void setVdChr10(String vdChr10) {
		this.vdChr10 = vdChr10;
	}

	public Date getVdDte01() {
		return this.vdDte01;
	}

	public void setVdDte01(Date vdDte01) {
		this.vdDte01 = vdDte01;
	}

	public Date getVdDte02() {
		return this.vdDte02;
	}

	public void setVdDte02(Date vdDte02) {
		this.vdDte02 = vdDte02;
	}

	public Double getVdDec01() {
		return this.vdDec01;
	}

	public void setVdDec01(Double vdDec01) {
		this.vdDec01 = vdDec01;
	}

	public Double getVdDec02() {
		return this.vdDec02;
	}

	public void setVdDec02(Double vdDec02) {
		this.vdDec02 = vdDec02;
	}

	public Boolean getVdLog01() {
		return this.vdLog01;
	}

	public void setVdLog01(Boolean vdLog01) {
		this.vdLog01 = vdLog01;
	}

	public String getVdFob() {
		return this.vdFob;
	}

	public void setVdFob(String vdFob) {
		this.vdFob = vdFob;
	}

	public String getVdDebtor() {
		return this.vdDebtor;
	}

	public void setVdDebtor(String vdDebtor) {
		this.vdDebtor = vdDebtor;
	}

	public String getVdBank() {
		return this.vdBank;
	}

	public void setVdBank(String vdBank) {
		this.vdBank = vdBank;
	}

	public String getVdCkfrm() {
		return this.vdCkfrm;
	}

	public void setVdCkfrm(String vdCkfrm) {
		this.vdCkfrm = vdCkfrm;
	}

	public Boolean getVdPaySpec() {
		return this.vdPaySpec;
	}

	public void setVdPaySpec(Boolean vdPaySpec) {
		this.vdPaySpec = vdPaySpec;
	}

	public String getVdRemit() {
		return this.vdRemit;
	}

	public void setVdRemit(String vdRemit) {
		this.vdRemit = vdRemit;
	}

	public String getVdType() {
		return this.vdType;
	}

	public void setVdType(String vdType) {
		this.vdType = vdType;
	}

	public String getVdUserid() {
		return this.vdUserid;
	}

	public void setVdUserid(String vdUserid) {
		this.vdUserid = vdUserid;
	}

	public Date getVdModDate() {
		return this.vdModDate;
	}

	public void setVdModDate(Date vdModDate) {
		this.vdModDate = vdModDate;
	}

	public Double getVdPrepay() {
		return this.vdPrepay;
	}

	public void setVdPrepay(Double vdPrepay) {
		this.vdPrepay = vdPrepay;
	}

	public String getVdConrepLogic() {
		return this.vdConrepLogic;
	}

	public void setVdConrepLogic(String vdConrepLogic) {
		this.vdConrepLogic = vdConrepLogic;
	}

	public String getVdPrList() {
		return this.vdPrList;
	}

	public void setVdPrList(String vdPrList) {
		this.vdPrList = vdPrList;
	}

	public Double getVdDrftBal() {
		return this.vdDrftBal;
	}

	public void setVdDrftBal(Double vdDrftBal) {
		this.vdDrftBal = vdDrftBal;
	}

	public Double getVdLcBal() {
		return this.vdLcBal;
	}

	public void setVdLcBal(Double vdLcBal) {
		this.vdLcBal = vdLcBal;
	}

	public String getVdPrList2() {
		return this.vdPrList2;
	}

	public void setVdPrList2(String vdPrList2) {
		this.vdPrList2 = vdPrList2;
	}

	public Boolean getVdFixPr() {
		return this.vdFixPr;
	}

	public void setVdFixPr(Boolean vdFixPr) {
		this.vdFixPr = vdFixPr;
	}

	public String getVdFrList() {
		return this.vdFrList;
	}

	public void setVdFrList(String vdFrList) {
		this.vdFrList = vdFrList;
	}

	public BigDecimal getVdFrMinWt() {
		return this.vdFrMinWt;
	}

	public void setVdFrMinWt(BigDecimal vdFrMinWt) {
		this.vdFrMinWt = vdFrMinWt;
	}

	public String getVdFrTerms() {
		return this.vdFrTerms;
	}

	public void setVdFrTerms(String vdFrTerms) {
		this.vdFrTerms = vdFrTerms;
	}

	public String getVdTidNotice() {
		return this.vdTidNotice;
	}

	public void setVdTidNotice(String vdTidNotice) {
		this.vdTidNotice = vdTidNotice;
	}

	public String getVdPromo() {
		return this.vdPromo;
	}

	public void setVdPromo(String vdPromo) {
		this.vdPromo = vdPromo;
	}

	public Boolean getVdMiscCr() {
		return this.vdMiscCr;
	}

	public void setVdMiscCr(Boolean vdMiscCr) {
		this.vdMiscCr = vdMiscCr;
	}

	public Boolean getVdRcvSoPrice() {
		return this.vdRcvSoPrice;
	}

	public void setVdRcvSoPrice(Boolean vdRcvSoPrice) {
		this.vdRcvSoPrice = vdRcvSoPrice;
	}

	public Boolean getVdRcvHeldSo() {
		return this.vdRcvHeldSo;
	}

	public void setVdRcvHeldSo(Boolean vdRcvHeldSo) {
		this.vdRcvHeldSo = vdRcvHeldSo;
	}

	public Boolean getVdTpUsePct() {
		return this.vdTpUsePct;
	}

	public void setVdTpUsePct(Boolean vdTpUsePct) {
		this.vdTpUsePct = vdTpUsePct;
	}

	public Double getVdTpPct() {
		return this.vdTpPct;
	}

	public void setVdTpPct(Double vdTpPct) {
		this.vdTpPct = vdTpPct;
	}

	public String getVdExRatetype() {
		return this.vdExRatetype;
	}

	public void setVdExRatetype(String vdExRatetype) {
		this.vdExRatetype = vdExRatetype;
	}

	public String getVdDb() {
		return this.vdDb;
	}

	public void setVdDb(String vdDb) {
		this.vdDb = vdDb;
	}

	public String getVdQadc01() {
		return this.vdQadc01;
	}

	public void setVdQadc01(String vdQadc01) {
		this.vdQadc01 = vdQadc01;
	}

	public String getVdQadc02() {
		return this.vdQadc02;
	}

	public void setVdQadc02(String vdQadc02) {
		this.vdQadc02 = vdQadc02;
	}

	public String getVdQadc03() {
		return this.vdQadc03;
	}

	public void setVdQadc03(String vdQadc03) {
		this.vdQadc03 = vdQadc03;
	}

	public String getVdQadc04() {
		return this.vdQadc04;
	}

	public void setVdQadc04(String vdQadc04) {
		this.vdQadc04 = vdQadc04;
	}

	public Double getVdQadd01() {
		return this.vdQadd01;
	}

	public void setVdQadd01(Double vdQadd01) {
		this.vdQadd01 = vdQadd01;
	}

	public Double getVdQadd02() {
		return this.vdQadd02;
	}

	public void setVdQadd02(Double vdQadd02) {
		this.vdQadd02 = vdQadd02;
	}

	public Boolean getVdQadl01() {
		return this.vdQadl01;
	}

	public void setVdQadl01(Boolean vdQadl01) {
		this.vdQadl01 = vdQadl01;
	}

	public Boolean getVdQadl02() {
		return this.vdQadl02;
	}

	public void setVdQadl02(Boolean vdQadl02) {
		this.vdQadl02 = vdQadl02;
	}

	public Date getVdQadt01() {
		return this.vdQadt01;
	}

	public void setVdQadt01(Date vdQadt01) {
		this.vdQadt01 = vdQadt01;
	}

	public Date getVdQadt02() {
		return this.vdQadt02;
	}

	public void setVdQadt02(Date vdQadt02) {
		this.vdQadt02 = vdQadt02;
	}

	public Integer getVdQadi01() {
		return this.vdQadi01;
	}

	public void setVdQadi01(Integer vdQadi01) {
		this.vdQadi01 = vdQadi01;
	}

	public Integer getVdQadi02() {
		return this.vdQadi02;
	}

	public void setVdQadi02(Integer vdQadi02) {
		this.vdQadi02 = vdQadi02;
	}

	public Boolean getVdQadl03() {
		return this.vdQadl03;
	}

	public void setVdQadl03(Boolean vdQadl03) {
		this.vdQadl03 = vdQadl03;
	}

	public Boolean getVdQadl04() {
		return this.vdQadl04;
	}

	public void setVdQadl04(Boolean vdQadl04) {
		this.vdQadl04 = vdQadl04;
	}

	public String getVdApSub() {
		return this.vdApSub;
	}

	public void setVdApSub(String vdApSub) {
		this.vdApSub = vdApSub;
	}

	public String getVdPurSub() {
		return this.vdPurSub;
	}

	public void setVdPurSub(String vdPurSub) {
		this.vdPurSub = vdPurSub;
	}

	public String getVdTotTermsCode() {
		return this.vdTotTermsCode;
	}

	public void setVdTotTermsCode(String vdTotTermsCode) {
		this.vdTotTermsCode = vdTotTermsCode;
	}

	public Double getOidVdMstr() {
		return this.oidVdMstr;
	}

	public void setOidVdMstr(Double oidVdMstr) {
		this.oidVdMstr = oidVdMstr;
	}

}