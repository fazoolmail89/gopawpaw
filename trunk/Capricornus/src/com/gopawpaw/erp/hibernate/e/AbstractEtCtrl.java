package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEtCtrl entity provides the base persistence definition of the EtCtrl
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEtCtrl implements java.io.Serializable {

	// Fields

	private String etDomain;
	private String etBaseCurr;
	private String etConvAcct;
	private String etConvCc;
	private String etQadc05;
	private Date etGlEffDt;
	private Date etQadt04;
	private Boolean etQadl04;
	private Boolean etPrintDc;
	private Boolean etShowDiff;
	private Boolean etStartConv;
	private Boolean etQadl05;
	private Boolean etRateActive;
	private Integer etQadi04;
	private String etUser1;
	private String etUser2;
	private Double etQadd01;
	private Double etQadd02;
	private Double etQadd03;
	private Integer etQadi01;
	private Integer etQadi02;
	private Integer etQadi03;
	private Boolean etQadl01;
	private Boolean etQadl02;
	private Boolean etQadl03;
	private String etQadc01;
	private String etQadc02;
	private String etQadc03;
	private Date etQadt01;
	private Date etQadt02;
	private Date etQadt03;
	private String etConvSub;
	private Double oidEtCtrl;

	// Constructors

	/** default constructor */
	public AbstractEtCtrl() {
	}

	/** minimal constructor */
	public AbstractEtCtrl(String etBaseCurr, String etConvAcct,
			String etConvCc, String etQadc05, Date etGlEffDt, Boolean etQadl04,
			Boolean etPrintDc, Boolean etShowDiff, Boolean etStartConv,
			Boolean etQadl05, Boolean etRateActive, Integer etQadi04,
			String etUser1, String etUser2, Double etQadd01, Double etQadd02,
			Double etQadd03, Integer etQadi01, Integer etQadi02,
			Integer etQadi03, Boolean etQadl01, Boolean etQadl02,
			Boolean etQadl03, String etQadc01, String etQadc02,
			String etQadc03, Double oidEtCtrl) {
		this.etBaseCurr = etBaseCurr;
		this.etConvAcct = etConvAcct;
		this.etConvCc = etConvCc;
		this.etQadc05 = etQadc05;
		this.etGlEffDt = etGlEffDt;
		this.etQadl04 = etQadl04;
		this.etPrintDc = etPrintDc;
		this.etShowDiff = etShowDiff;
		this.etStartConv = etStartConv;
		this.etQadl05 = etQadl05;
		this.etRateActive = etRateActive;
		this.etQadi04 = etQadi04;
		this.etUser1 = etUser1;
		this.etUser2 = etUser2;
		this.etQadd01 = etQadd01;
		this.etQadd02 = etQadd02;
		this.etQadd03 = etQadd03;
		this.etQadi01 = etQadi01;
		this.etQadi02 = etQadi02;
		this.etQadi03 = etQadi03;
		this.etQadl01 = etQadl01;
		this.etQadl02 = etQadl02;
		this.etQadl03 = etQadl03;
		this.etQadc01 = etQadc01;
		this.etQadc02 = etQadc02;
		this.etQadc03 = etQadc03;
		this.oidEtCtrl = oidEtCtrl;
	}

	/** full constructor */
	public AbstractEtCtrl(String etBaseCurr, String etConvAcct,
			String etConvCc, String etQadc05, Date etGlEffDt, Date etQadt04,
			Boolean etQadl04, Boolean etPrintDc, Boolean etShowDiff,
			Boolean etStartConv, Boolean etQadl05, Boolean etRateActive,
			Integer etQadi04, String etUser1, String etUser2, Double etQadd01,
			Double etQadd02, Double etQadd03, Integer etQadi01,
			Integer etQadi02, Integer etQadi03, Boolean etQadl01,
			Boolean etQadl02, Boolean etQadl03, String etQadc01,
			String etQadc02, String etQadc03, Date etQadt01, Date etQadt02,
			Date etQadt03, String etConvSub, Double oidEtCtrl) {
		this.etBaseCurr = etBaseCurr;
		this.etConvAcct = etConvAcct;
		this.etConvCc = etConvCc;
		this.etQadc05 = etQadc05;
		this.etGlEffDt = etGlEffDt;
		this.etQadt04 = etQadt04;
		this.etQadl04 = etQadl04;
		this.etPrintDc = etPrintDc;
		this.etShowDiff = etShowDiff;
		this.etStartConv = etStartConv;
		this.etQadl05 = etQadl05;
		this.etRateActive = etRateActive;
		this.etQadi04 = etQadi04;
		this.etUser1 = etUser1;
		this.etUser2 = etUser2;
		this.etQadd01 = etQadd01;
		this.etQadd02 = etQadd02;
		this.etQadd03 = etQadd03;
		this.etQadi01 = etQadi01;
		this.etQadi02 = etQadi02;
		this.etQadi03 = etQadi03;
		this.etQadl01 = etQadl01;
		this.etQadl02 = etQadl02;
		this.etQadl03 = etQadl03;
		this.etQadc01 = etQadc01;
		this.etQadc02 = etQadc02;
		this.etQadc03 = etQadc03;
		this.etQadt01 = etQadt01;
		this.etQadt02 = etQadt02;
		this.etQadt03 = etQadt03;
		this.etConvSub = etConvSub;
		this.oidEtCtrl = oidEtCtrl;
	}

	// Property accessors

	public String getEtDomain() {
		return this.etDomain;
	}

	public void setEtDomain(String etDomain) {
		this.etDomain = etDomain;
	}

	public String getEtBaseCurr() {
		return this.etBaseCurr;
	}

	public void setEtBaseCurr(String etBaseCurr) {
		this.etBaseCurr = etBaseCurr;
	}

	public String getEtConvAcct() {
		return this.etConvAcct;
	}

	public void setEtConvAcct(String etConvAcct) {
		this.etConvAcct = etConvAcct;
	}

	public String getEtConvCc() {
		return this.etConvCc;
	}

	public void setEtConvCc(String etConvCc) {
		this.etConvCc = etConvCc;
	}

	public String getEtQadc05() {
		return this.etQadc05;
	}

	public void setEtQadc05(String etQadc05) {
		this.etQadc05 = etQadc05;
	}

	public Date getEtGlEffDt() {
		return this.etGlEffDt;
	}

	public void setEtGlEffDt(Date etGlEffDt) {
		this.etGlEffDt = etGlEffDt;
	}

	public Date getEtQadt04() {
		return this.etQadt04;
	}

	public void setEtQadt04(Date etQadt04) {
		this.etQadt04 = etQadt04;
	}

	public Boolean getEtQadl04() {
		return this.etQadl04;
	}

	public void setEtQadl04(Boolean etQadl04) {
		this.etQadl04 = etQadl04;
	}

	public Boolean getEtPrintDc() {
		return this.etPrintDc;
	}

	public void setEtPrintDc(Boolean etPrintDc) {
		this.etPrintDc = etPrintDc;
	}

	public Boolean getEtShowDiff() {
		return this.etShowDiff;
	}

	public void setEtShowDiff(Boolean etShowDiff) {
		this.etShowDiff = etShowDiff;
	}

	public Boolean getEtStartConv() {
		return this.etStartConv;
	}

	public void setEtStartConv(Boolean etStartConv) {
		this.etStartConv = etStartConv;
	}

	public Boolean getEtQadl05() {
		return this.etQadl05;
	}

	public void setEtQadl05(Boolean etQadl05) {
		this.etQadl05 = etQadl05;
	}

	public Boolean getEtRateActive() {
		return this.etRateActive;
	}

	public void setEtRateActive(Boolean etRateActive) {
		this.etRateActive = etRateActive;
	}

	public Integer getEtQadi04() {
		return this.etQadi04;
	}

	public void setEtQadi04(Integer etQadi04) {
		this.etQadi04 = etQadi04;
	}

	public String getEtUser1() {
		return this.etUser1;
	}

	public void setEtUser1(String etUser1) {
		this.etUser1 = etUser1;
	}

	public String getEtUser2() {
		return this.etUser2;
	}

	public void setEtUser2(String etUser2) {
		this.etUser2 = etUser2;
	}

	public Double getEtQadd01() {
		return this.etQadd01;
	}

	public void setEtQadd01(Double etQadd01) {
		this.etQadd01 = etQadd01;
	}

	public Double getEtQadd02() {
		return this.etQadd02;
	}

	public void setEtQadd02(Double etQadd02) {
		this.etQadd02 = etQadd02;
	}

	public Double getEtQadd03() {
		return this.etQadd03;
	}

	public void setEtQadd03(Double etQadd03) {
		this.etQadd03 = etQadd03;
	}

	public Integer getEtQadi01() {
		return this.etQadi01;
	}

	public void setEtQadi01(Integer etQadi01) {
		this.etQadi01 = etQadi01;
	}

	public Integer getEtQadi02() {
		return this.etQadi02;
	}

	public void setEtQadi02(Integer etQadi02) {
		this.etQadi02 = etQadi02;
	}

	public Integer getEtQadi03() {
		return this.etQadi03;
	}

	public void setEtQadi03(Integer etQadi03) {
		this.etQadi03 = etQadi03;
	}

	public Boolean getEtQadl01() {
		return this.etQadl01;
	}

	public void setEtQadl01(Boolean etQadl01) {
		this.etQadl01 = etQadl01;
	}

	public Boolean getEtQadl02() {
		return this.etQadl02;
	}

	public void setEtQadl02(Boolean etQadl02) {
		this.etQadl02 = etQadl02;
	}

	public Boolean getEtQadl03() {
		return this.etQadl03;
	}

	public void setEtQadl03(Boolean etQadl03) {
		this.etQadl03 = etQadl03;
	}

	public String getEtQadc01() {
		return this.etQadc01;
	}

	public void setEtQadc01(String etQadc01) {
		this.etQadc01 = etQadc01;
	}

	public String getEtQadc02() {
		return this.etQadc02;
	}

	public void setEtQadc02(String etQadc02) {
		this.etQadc02 = etQadc02;
	}

	public String getEtQadc03() {
		return this.etQadc03;
	}

	public void setEtQadc03(String etQadc03) {
		this.etQadc03 = etQadc03;
	}

	public Date getEtQadt01() {
		return this.etQadt01;
	}

	public void setEtQadt01(Date etQadt01) {
		this.etQadt01 = etQadt01;
	}

	public Date getEtQadt02() {
		return this.etQadt02;
	}

	public void setEtQadt02(Date etQadt02) {
		this.etQadt02 = etQadt02;
	}

	public Date getEtQadt03() {
		return this.etQadt03;
	}

	public void setEtQadt03(Date etQadt03) {
		this.etQadt03 = etQadt03;
	}

	public String getEtConvSub() {
		return this.etConvSub;
	}

	public void setEtConvSub(String etConvSub) {
		this.etConvSub = etConvSub;
	}

	public Double getOidEtCtrl() {
		return this.oidEtCtrl;
	}

	public void setOidEtCtrl(Double oidEtCtrl) {
		this.oidEtCtrl = oidEtCtrl;
	}

}