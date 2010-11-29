package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCacCtrl entity provides the base persistence definition of the
 * CacCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCacCtrl implements java.io.Serializable {

	// Fields

	private String cacDomain;
	private Integer cacNbr;
	private String cacUser1;
	private String cacUser2;
	private Integer cacQadi01;
	private String cacQadc01;
	private String cacQadc02;
	private Boolean cacQadl01;
	private Boolean cacQadl02;
	private String cacModUserid;
	private Date cacModDate;
	private Boolean cacUpdIsb;
	private Integer cacQuote;
	private Integer cacQuoteDays;
	private String cacQuotePre;
	private String cacQuoteQue;
	private String cacExRatetype;
	private Double oidCacCtrl;

	// Constructors

	/** default constructor */
	public AbstractCacCtrl() {
	}

	/** minimal constructor */
	public AbstractCacCtrl(String cacExRatetype, Double oidCacCtrl) {
		this.cacExRatetype = cacExRatetype;
		this.oidCacCtrl = oidCacCtrl;
	}

	/** full constructor */
	public AbstractCacCtrl(Integer cacNbr, String cacUser1, String cacUser2,
			Integer cacQadi01, String cacQadc01, String cacQadc02,
			Boolean cacQadl01, Boolean cacQadl02, String cacModUserid,
			Date cacModDate, Boolean cacUpdIsb, Integer cacQuote,
			Integer cacQuoteDays, String cacQuotePre, String cacQuoteQue,
			String cacExRatetype, Double oidCacCtrl) {
		this.cacNbr = cacNbr;
		this.cacUser1 = cacUser1;
		this.cacUser2 = cacUser2;
		this.cacQadi01 = cacQadi01;
		this.cacQadc01 = cacQadc01;
		this.cacQadc02 = cacQadc02;
		this.cacQadl01 = cacQadl01;
		this.cacQadl02 = cacQadl02;
		this.cacModUserid = cacModUserid;
		this.cacModDate = cacModDate;
		this.cacUpdIsb = cacUpdIsb;
		this.cacQuote = cacQuote;
		this.cacQuoteDays = cacQuoteDays;
		this.cacQuotePre = cacQuotePre;
		this.cacQuoteQue = cacQuoteQue;
		this.cacExRatetype = cacExRatetype;
		this.oidCacCtrl = oidCacCtrl;
	}

	// Property accessors

	public String getCacDomain() {
		return this.cacDomain;
	}

	public void setCacDomain(String cacDomain) {
		this.cacDomain = cacDomain;
	}

	public Integer getCacNbr() {
		return this.cacNbr;
	}

	public void setCacNbr(Integer cacNbr) {
		this.cacNbr = cacNbr;
	}

	public String getCacUser1() {
		return this.cacUser1;
	}

	public void setCacUser1(String cacUser1) {
		this.cacUser1 = cacUser1;
	}

	public String getCacUser2() {
		return this.cacUser2;
	}

	public void setCacUser2(String cacUser2) {
		this.cacUser2 = cacUser2;
	}

	public Integer getCacQadi01() {
		return this.cacQadi01;
	}

	public void setCacQadi01(Integer cacQadi01) {
		this.cacQadi01 = cacQadi01;
	}

	public String getCacQadc01() {
		return this.cacQadc01;
	}

	public void setCacQadc01(String cacQadc01) {
		this.cacQadc01 = cacQadc01;
	}

	public String getCacQadc02() {
		return this.cacQadc02;
	}

	public void setCacQadc02(String cacQadc02) {
		this.cacQadc02 = cacQadc02;
	}

	public Boolean getCacQadl01() {
		return this.cacQadl01;
	}

	public void setCacQadl01(Boolean cacQadl01) {
		this.cacQadl01 = cacQadl01;
	}

	public Boolean getCacQadl02() {
		return this.cacQadl02;
	}

	public void setCacQadl02(Boolean cacQadl02) {
		this.cacQadl02 = cacQadl02;
	}

	public String getCacModUserid() {
		return this.cacModUserid;
	}

	public void setCacModUserid(String cacModUserid) {
		this.cacModUserid = cacModUserid;
	}

	public Date getCacModDate() {
		return this.cacModDate;
	}

	public void setCacModDate(Date cacModDate) {
		this.cacModDate = cacModDate;
	}

	public Boolean getCacUpdIsb() {
		return this.cacUpdIsb;
	}

	public void setCacUpdIsb(Boolean cacUpdIsb) {
		this.cacUpdIsb = cacUpdIsb;
	}

	public Integer getCacQuote() {
		return this.cacQuote;
	}

	public void setCacQuote(Integer cacQuote) {
		this.cacQuote = cacQuote;
	}

	public Integer getCacQuoteDays() {
		return this.cacQuoteDays;
	}

	public void setCacQuoteDays(Integer cacQuoteDays) {
		this.cacQuoteDays = cacQuoteDays;
	}

	public String getCacQuotePre() {
		return this.cacQuotePre;
	}

	public void setCacQuotePre(String cacQuotePre) {
		this.cacQuotePre = cacQuotePre;
	}

	public String getCacQuoteQue() {
		return this.cacQuoteQue;
	}

	public void setCacQuoteQue(String cacQuoteQue) {
		this.cacQuoteQue = cacQuoteQue;
	}

	public String getCacExRatetype() {
		return this.cacExRatetype;
	}

	public void setCacExRatetype(String cacExRatetype) {
		this.cacExRatetype = cacExRatetype;
	}

	public Double getOidCacCtrl() {
		return this.oidCacCtrl;
	}

	public void setOidCacCtrl(Double oidCacCtrl) {
		this.oidCacCtrl = oidCacCtrl;
	}

}