package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWtxMstr entity provides the base persistence definition of the
 * WtxMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWtxMstr implements java.io.Serializable {

	// Fields

	private WtxMstrId id;
	private String wtxAcct;
	private String wtxCc;
	private Boolean wtxChargeType;
	private Double wtxChargeAmt;
	private String wtxInvoice;
	private String wtxModUserid;
	private Date wtxModDate;
	private Boolean wtxPrinted;
	private Double wtxRetAmt;
	private String wtxRsnCode;
	private Date wtxSetDate;
	private String wtxSub;
	private Double wtxTaxableAmt;
	private Double wtxTaxPct;
	private Double wtxTotAmt;
	private Double wtxTotPaid;
	private Double wtxVatAmt;
	private Date wtxVoDate;
	private Double wtxWtAmt;
	private String wtxUser1;
	private String wtxUser2;
	private String wtxUserc03;
	private String wtxUserc04;
	private String wtxUserc05;
	private Double wtxUserd01;
	private Double wtxUserd02;
	private Integer wtxUseri01;
	private Integer wtxUseri02;
	private Boolean wtxUserl01;
	private Boolean wtxUserl02;
	private Date wtxUsert01;
	private Date wtxUsert02;
	private String wtxQadc01;
	private String wtxQadc02;
	private String wtxQadc03;
	private String wtxQadc04;
	private String wtxQadc05;
	private Double wtxQadd01;
	private Double wtxQadd02;
	private Integer wtxQadi01;
	private Integer wtxQadi02;
	private Boolean wtxQadl01;
	private Boolean wtxQadl02;
	private Date wtxQadt01;
	private Date wtxQadt02;
	private Date wtxPaidDate;
	private Double oidWtxMstr;

	// Constructors

	/** default constructor */
	public AbstractWtxMstr() {
	}

	/** minimal constructor */
	public AbstractWtxMstr(WtxMstrId id, String wtxAcct, String wtxCc,
			Boolean wtxChargeType, Double wtxChargeAmt, String wtxInvoice,
			String wtxModUserid, Date wtxModDate, Boolean wtxPrinted,
			Double wtxRetAmt, String wtxRsnCode, String wtxSub,
			Double wtxTaxableAmt, Double wtxTaxPct, Double wtxTotAmt,
			Double wtxTotPaid, Double wtxVatAmt, Date wtxVoDate,
			Double wtxWtAmt, String wtxUser1, String wtxUser2,
			String wtxUserc03, String wtxUserc04, String wtxUserc05,
			Double wtxUserd01, Double wtxUserd02, Integer wtxUseri01,
			Integer wtxUseri02, Boolean wtxUserl01, Boolean wtxUserl02,
			String wtxQadc01, String wtxQadc02, String wtxQadc03,
			String wtxQadc04, String wtxQadc05, Double wtxQadd01,
			Double wtxQadd02, Integer wtxQadi01, Integer wtxQadi02,
			Boolean wtxQadl01, Boolean wtxQadl02, Double oidWtxMstr) {
		this.id = id;
		this.wtxAcct = wtxAcct;
		this.wtxCc = wtxCc;
		this.wtxChargeType = wtxChargeType;
		this.wtxChargeAmt = wtxChargeAmt;
		this.wtxInvoice = wtxInvoice;
		this.wtxModUserid = wtxModUserid;
		this.wtxModDate = wtxModDate;
		this.wtxPrinted = wtxPrinted;
		this.wtxRetAmt = wtxRetAmt;
		this.wtxRsnCode = wtxRsnCode;
		this.wtxSub = wtxSub;
		this.wtxTaxableAmt = wtxTaxableAmt;
		this.wtxTaxPct = wtxTaxPct;
		this.wtxTotAmt = wtxTotAmt;
		this.wtxTotPaid = wtxTotPaid;
		this.wtxVatAmt = wtxVatAmt;
		this.wtxVoDate = wtxVoDate;
		this.wtxWtAmt = wtxWtAmt;
		this.wtxUser1 = wtxUser1;
		this.wtxUser2 = wtxUser2;
		this.wtxUserc03 = wtxUserc03;
		this.wtxUserc04 = wtxUserc04;
		this.wtxUserc05 = wtxUserc05;
		this.wtxUserd01 = wtxUserd01;
		this.wtxUserd02 = wtxUserd02;
		this.wtxUseri01 = wtxUseri01;
		this.wtxUseri02 = wtxUseri02;
		this.wtxUserl01 = wtxUserl01;
		this.wtxUserl02 = wtxUserl02;
		this.wtxQadc01 = wtxQadc01;
		this.wtxQadc02 = wtxQadc02;
		this.wtxQadc03 = wtxQadc03;
		this.wtxQadc04 = wtxQadc04;
		this.wtxQadc05 = wtxQadc05;
		this.wtxQadd01 = wtxQadd01;
		this.wtxQadd02 = wtxQadd02;
		this.wtxQadi01 = wtxQadi01;
		this.wtxQadi02 = wtxQadi02;
		this.wtxQadl01 = wtxQadl01;
		this.wtxQadl02 = wtxQadl02;
		this.oidWtxMstr = oidWtxMstr;
	}

	/** full constructor */
	public AbstractWtxMstr(WtxMstrId id, String wtxAcct, String wtxCc,
			Boolean wtxChargeType, Double wtxChargeAmt, String wtxInvoice,
			String wtxModUserid, Date wtxModDate, Boolean wtxPrinted,
			Double wtxRetAmt, String wtxRsnCode, Date wtxSetDate,
			String wtxSub, Double wtxTaxableAmt, Double wtxTaxPct,
			Double wtxTotAmt, Double wtxTotPaid, Double wtxVatAmt,
			Date wtxVoDate, Double wtxWtAmt, String wtxUser1, String wtxUser2,
			String wtxUserc03, String wtxUserc04, String wtxUserc05,
			Double wtxUserd01, Double wtxUserd02, Integer wtxUseri01,
			Integer wtxUseri02, Boolean wtxUserl01, Boolean wtxUserl02,
			Date wtxUsert01, Date wtxUsert02, String wtxQadc01,
			String wtxQadc02, String wtxQadc03, String wtxQadc04,
			String wtxQadc05, Double wtxQadd01, Double wtxQadd02,
			Integer wtxQadi01, Integer wtxQadi02, Boolean wtxQadl01,
			Boolean wtxQadl02, Date wtxQadt01, Date wtxQadt02,
			Date wtxPaidDate, Double oidWtxMstr) {
		this.id = id;
		this.wtxAcct = wtxAcct;
		this.wtxCc = wtxCc;
		this.wtxChargeType = wtxChargeType;
		this.wtxChargeAmt = wtxChargeAmt;
		this.wtxInvoice = wtxInvoice;
		this.wtxModUserid = wtxModUserid;
		this.wtxModDate = wtxModDate;
		this.wtxPrinted = wtxPrinted;
		this.wtxRetAmt = wtxRetAmt;
		this.wtxRsnCode = wtxRsnCode;
		this.wtxSetDate = wtxSetDate;
		this.wtxSub = wtxSub;
		this.wtxTaxableAmt = wtxTaxableAmt;
		this.wtxTaxPct = wtxTaxPct;
		this.wtxTotAmt = wtxTotAmt;
		this.wtxTotPaid = wtxTotPaid;
		this.wtxVatAmt = wtxVatAmt;
		this.wtxVoDate = wtxVoDate;
		this.wtxWtAmt = wtxWtAmt;
		this.wtxUser1 = wtxUser1;
		this.wtxUser2 = wtxUser2;
		this.wtxUserc03 = wtxUserc03;
		this.wtxUserc04 = wtxUserc04;
		this.wtxUserc05 = wtxUserc05;
		this.wtxUserd01 = wtxUserd01;
		this.wtxUserd02 = wtxUserd02;
		this.wtxUseri01 = wtxUseri01;
		this.wtxUseri02 = wtxUseri02;
		this.wtxUserl01 = wtxUserl01;
		this.wtxUserl02 = wtxUserl02;
		this.wtxUsert01 = wtxUsert01;
		this.wtxUsert02 = wtxUsert02;
		this.wtxQadc01 = wtxQadc01;
		this.wtxQadc02 = wtxQadc02;
		this.wtxQadc03 = wtxQadc03;
		this.wtxQadc04 = wtxQadc04;
		this.wtxQadc05 = wtxQadc05;
		this.wtxQadd01 = wtxQadd01;
		this.wtxQadd02 = wtxQadd02;
		this.wtxQadi01 = wtxQadi01;
		this.wtxQadi02 = wtxQadi02;
		this.wtxQadl01 = wtxQadl01;
		this.wtxQadl02 = wtxQadl02;
		this.wtxQadt01 = wtxQadt01;
		this.wtxQadt02 = wtxQadt02;
		this.wtxPaidDate = wtxPaidDate;
		this.oidWtxMstr = oidWtxMstr;
	}

	// Property accessors

	public WtxMstrId getId() {
		return this.id;
	}

	public void setId(WtxMstrId id) {
		this.id = id;
	}

	public String getWtxAcct() {
		return this.wtxAcct;
	}

	public void setWtxAcct(String wtxAcct) {
		this.wtxAcct = wtxAcct;
	}

	public String getWtxCc() {
		return this.wtxCc;
	}

	public void setWtxCc(String wtxCc) {
		this.wtxCc = wtxCc;
	}

	public Boolean getWtxChargeType() {
		return this.wtxChargeType;
	}

	public void setWtxChargeType(Boolean wtxChargeType) {
		this.wtxChargeType = wtxChargeType;
	}

	public Double getWtxChargeAmt() {
		return this.wtxChargeAmt;
	}

	public void setWtxChargeAmt(Double wtxChargeAmt) {
		this.wtxChargeAmt = wtxChargeAmt;
	}

	public String getWtxInvoice() {
		return this.wtxInvoice;
	}

	public void setWtxInvoice(String wtxInvoice) {
		this.wtxInvoice = wtxInvoice;
	}

	public String getWtxModUserid() {
		return this.wtxModUserid;
	}

	public void setWtxModUserid(String wtxModUserid) {
		this.wtxModUserid = wtxModUserid;
	}

	public Date getWtxModDate() {
		return this.wtxModDate;
	}

	public void setWtxModDate(Date wtxModDate) {
		this.wtxModDate = wtxModDate;
	}

	public Boolean getWtxPrinted() {
		return this.wtxPrinted;
	}

	public void setWtxPrinted(Boolean wtxPrinted) {
		this.wtxPrinted = wtxPrinted;
	}

	public Double getWtxRetAmt() {
		return this.wtxRetAmt;
	}

	public void setWtxRetAmt(Double wtxRetAmt) {
		this.wtxRetAmt = wtxRetAmt;
	}

	public String getWtxRsnCode() {
		return this.wtxRsnCode;
	}

	public void setWtxRsnCode(String wtxRsnCode) {
		this.wtxRsnCode = wtxRsnCode;
	}

	public Date getWtxSetDate() {
		return this.wtxSetDate;
	}

	public void setWtxSetDate(Date wtxSetDate) {
		this.wtxSetDate = wtxSetDate;
	}

	public String getWtxSub() {
		return this.wtxSub;
	}

	public void setWtxSub(String wtxSub) {
		this.wtxSub = wtxSub;
	}

	public Double getWtxTaxableAmt() {
		return this.wtxTaxableAmt;
	}

	public void setWtxTaxableAmt(Double wtxTaxableAmt) {
		this.wtxTaxableAmt = wtxTaxableAmt;
	}

	public Double getWtxTaxPct() {
		return this.wtxTaxPct;
	}

	public void setWtxTaxPct(Double wtxTaxPct) {
		this.wtxTaxPct = wtxTaxPct;
	}

	public Double getWtxTotAmt() {
		return this.wtxTotAmt;
	}

	public void setWtxTotAmt(Double wtxTotAmt) {
		this.wtxTotAmt = wtxTotAmt;
	}

	public Double getWtxTotPaid() {
		return this.wtxTotPaid;
	}

	public void setWtxTotPaid(Double wtxTotPaid) {
		this.wtxTotPaid = wtxTotPaid;
	}

	public Double getWtxVatAmt() {
		return this.wtxVatAmt;
	}

	public void setWtxVatAmt(Double wtxVatAmt) {
		this.wtxVatAmt = wtxVatAmt;
	}

	public Date getWtxVoDate() {
		return this.wtxVoDate;
	}

	public void setWtxVoDate(Date wtxVoDate) {
		this.wtxVoDate = wtxVoDate;
	}

	public Double getWtxWtAmt() {
		return this.wtxWtAmt;
	}

	public void setWtxWtAmt(Double wtxWtAmt) {
		this.wtxWtAmt = wtxWtAmt;
	}

	public String getWtxUser1() {
		return this.wtxUser1;
	}

	public void setWtxUser1(String wtxUser1) {
		this.wtxUser1 = wtxUser1;
	}

	public String getWtxUser2() {
		return this.wtxUser2;
	}

	public void setWtxUser2(String wtxUser2) {
		this.wtxUser2 = wtxUser2;
	}

	public String getWtxUserc03() {
		return this.wtxUserc03;
	}

	public void setWtxUserc03(String wtxUserc03) {
		this.wtxUserc03 = wtxUserc03;
	}

	public String getWtxUserc04() {
		return this.wtxUserc04;
	}

	public void setWtxUserc04(String wtxUserc04) {
		this.wtxUserc04 = wtxUserc04;
	}

	public String getWtxUserc05() {
		return this.wtxUserc05;
	}

	public void setWtxUserc05(String wtxUserc05) {
		this.wtxUserc05 = wtxUserc05;
	}

	public Double getWtxUserd01() {
		return this.wtxUserd01;
	}

	public void setWtxUserd01(Double wtxUserd01) {
		this.wtxUserd01 = wtxUserd01;
	}

	public Double getWtxUserd02() {
		return this.wtxUserd02;
	}

	public void setWtxUserd02(Double wtxUserd02) {
		this.wtxUserd02 = wtxUserd02;
	}

	public Integer getWtxUseri01() {
		return this.wtxUseri01;
	}

	public void setWtxUseri01(Integer wtxUseri01) {
		this.wtxUseri01 = wtxUseri01;
	}

	public Integer getWtxUseri02() {
		return this.wtxUseri02;
	}

	public void setWtxUseri02(Integer wtxUseri02) {
		this.wtxUseri02 = wtxUseri02;
	}

	public Boolean getWtxUserl01() {
		return this.wtxUserl01;
	}

	public void setWtxUserl01(Boolean wtxUserl01) {
		this.wtxUserl01 = wtxUserl01;
	}

	public Boolean getWtxUserl02() {
		return this.wtxUserl02;
	}

	public void setWtxUserl02(Boolean wtxUserl02) {
		this.wtxUserl02 = wtxUserl02;
	}

	public Date getWtxUsert01() {
		return this.wtxUsert01;
	}

	public void setWtxUsert01(Date wtxUsert01) {
		this.wtxUsert01 = wtxUsert01;
	}

	public Date getWtxUsert02() {
		return this.wtxUsert02;
	}

	public void setWtxUsert02(Date wtxUsert02) {
		this.wtxUsert02 = wtxUsert02;
	}

	public String getWtxQadc01() {
		return this.wtxQadc01;
	}

	public void setWtxQadc01(String wtxQadc01) {
		this.wtxQadc01 = wtxQadc01;
	}

	public String getWtxQadc02() {
		return this.wtxQadc02;
	}

	public void setWtxQadc02(String wtxQadc02) {
		this.wtxQadc02 = wtxQadc02;
	}

	public String getWtxQadc03() {
		return this.wtxQadc03;
	}

	public void setWtxQadc03(String wtxQadc03) {
		this.wtxQadc03 = wtxQadc03;
	}

	public String getWtxQadc04() {
		return this.wtxQadc04;
	}

	public void setWtxQadc04(String wtxQadc04) {
		this.wtxQadc04 = wtxQadc04;
	}

	public String getWtxQadc05() {
		return this.wtxQadc05;
	}

	public void setWtxQadc05(String wtxQadc05) {
		this.wtxQadc05 = wtxQadc05;
	}

	public Double getWtxQadd01() {
		return this.wtxQadd01;
	}

	public void setWtxQadd01(Double wtxQadd01) {
		this.wtxQadd01 = wtxQadd01;
	}

	public Double getWtxQadd02() {
		return this.wtxQadd02;
	}

	public void setWtxQadd02(Double wtxQadd02) {
		this.wtxQadd02 = wtxQadd02;
	}

	public Integer getWtxQadi01() {
		return this.wtxQadi01;
	}

	public void setWtxQadi01(Integer wtxQadi01) {
		this.wtxQadi01 = wtxQadi01;
	}

	public Integer getWtxQadi02() {
		return this.wtxQadi02;
	}

	public void setWtxQadi02(Integer wtxQadi02) {
		this.wtxQadi02 = wtxQadi02;
	}

	public Boolean getWtxQadl01() {
		return this.wtxQadl01;
	}

	public void setWtxQadl01(Boolean wtxQadl01) {
		this.wtxQadl01 = wtxQadl01;
	}

	public Boolean getWtxQadl02() {
		return this.wtxQadl02;
	}

	public void setWtxQadl02(Boolean wtxQadl02) {
		this.wtxQadl02 = wtxQadl02;
	}

	public Date getWtxQadt01() {
		return this.wtxQadt01;
	}

	public void setWtxQadt01(Date wtxQadt01) {
		this.wtxQadt01 = wtxQadt01;
	}

	public Date getWtxQadt02() {
		return this.wtxQadt02;
	}

	public void setWtxQadt02(Date wtxQadt02) {
		this.wtxQadt02 = wtxQadt02;
	}

	public Date getWtxPaidDate() {
		return this.wtxPaidDate;
	}

	public void setWtxPaidDate(Date wtxPaidDate) {
		this.wtxPaidDate = wtxPaidDate;
	}

	public Double getOidWtxMstr() {
		return this.oidWtxMstr;
	}

	public void setOidWtxMstr(Double oidWtxMstr) {
		this.oidWtxMstr = oidWtxMstr;
	}

}