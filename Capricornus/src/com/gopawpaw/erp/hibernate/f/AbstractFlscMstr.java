package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFlscMstr entity provides the base persistence definition of the
 * FlscMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlscMstr implements java.io.Serializable {

	// Fields

	private FlscMstrId id;
	private Date flscStartDate;
	private String flscPeriodCode;
	private String flscSchUm;
	private String flscDesc;
	private Boolean flscFlexFences;
	private Boolean flscPhysicalUsage;
	private Boolean flscTimeUsage;
	private Boolean flscDailyTimeUsage;
	private Boolean flscEntryMode;
	private Date flscModDate;
	private String flscUser1;
	private String flscUser2;
	private String flscUserc03;
	private Double flscUserd01;
	private Integer flscUseri01;
	private String flscModUserid;
	private Boolean flscUserl01;
	private Date flscUsert01;
	private String flscQadc01;
	private String flscQadc02;
	private String flscQadc03;
	private Double flscQadd01;
	private Integer flscQadi01;
	private Boolean flscQadl01;
	private Date flscQadt01;
	private String flscSchMeasurement;
	private String flscRateExpression;
	private String flscQadc04;
	private String flscQadc05;
	private String flscQadc06;
	private Double flscQadd02;
	private Integer flscQadi02;
	private Boolean flscQadl02;
	private Date flscQadt02;
	private Double oidFlscMstr;

	// Constructors

	/** default constructor */
	public AbstractFlscMstr() {
	}

	/** minimal constructor */
	public AbstractFlscMstr(FlscMstrId id, Date flscStartDate,
			String flscPeriodCode, String flscSchUm, String flscDesc,
			Boolean flscFlexFences, Boolean flscPhysicalUsage,
			Boolean flscTimeUsage, Boolean flscDailyTimeUsage,
			Boolean flscEntryMode, Date flscModDate, String flscUser1,
			String flscUser2, String flscUserc03, Double flscUserd01,
			Integer flscUseri01, String flscModUserid, Boolean flscUserl01,
			String flscQadc01, String flscQadc02, String flscQadc03,
			Double flscQadd01, Integer flscQadi01, Boolean flscQadl01,
			String flscSchMeasurement, String flscRateExpression,
			String flscQadc04, String flscQadc05, String flscQadc06,
			Double flscQadd02, Integer flscQadi02, Boolean flscQadl02,
			Double oidFlscMstr) {
		this.id = id;
		this.flscStartDate = flscStartDate;
		this.flscPeriodCode = flscPeriodCode;
		this.flscSchUm = flscSchUm;
		this.flscDesc = flscDesc;
		this.flscFlexFences = flscFlexFences;
		this.flscPhysicalUsage = flscPhysicalUsage;
		this.flscTimeUsage = flscTimeUsage;
		this.flscDailyTimeUsage = flscDailyTimeUsage;
		this.flscEntryMode = flscEntryMode;
		this.flscModDate = flscModDate;
		this.flscUser1 = flscUser1;
		this.flscUser2 = flscUser2;
		this.flscUserc03 = flscUserc03;
		this.flscUserd01 = flscUserd01;
		this.flscUseri01 = flscUseri01;
		this.flscModUserid = flscModUserid;
		this.flscUserl01 = flscUserl01;
		this.flscQadc01 = flscQadc01;
		this.flscQadc02 = flscQadc02;
		this.flscQadc03 = flscQadc03;
		this.flscQadd01 = flscQadd01;
		this.flscQadi01 = flscQadi01;
		this.flscQadl01 = flscQadl01;
		this.flscSchMeasurement = flscSchMeasurement;
		this.flscRateExpression = flscRateExpression;
		this.flscQadc04 = flscQadc04;
		this.flscQadc05 = flscQadc05;
		this.flscQadc06 = flscQadc06;
		this.flscQadd02 = flscQadd02;
		this.flscQadi02 = flscQadi02;
		this.flscQadl02 = flscQadl02;
		this.oidFlscMstr = oidFlscMstr;
	}

	/** full constructor */
	public AbstractFlscMstr(FlscMstrId id, Date flscStartDate,
			String flscPeriodCode, String flscSchUm, String flscDesc,
			Boolean flscFlexFences, Boolean flscPhysicalUsage,
			Boolean flscTimeUsage, Boolean flscDailyTimeUsage,
			Boolean flscEntryMode, Date flscModDate, String flscUser1,
			String flscUser2, String flscUserc03, Double flscUserd01,
			Integer flscUseri01, String flscModUserid, Boolean flscUserl01,
			Date flscUsert01, String flscQadc01, String flscQadc02,
			String flscQadc03, Double flscQadd01, Integer flscQadi01,
			Boolean flscQadl01, Date flscQadt01, String flscSchMeasurement,
			String flscRateExpression, String flscQadc04, String flscQadc05,
			String flscQadc06, Double flscQadd02, Integer flscQadi02,
			Boolean flscQadl02, Date flscQadt02, Double oidFlscMstr) {
		this.id = id;
		this.flscStartDate = flscStartDate;
		this.flscPeriodCode = flscPeriodCode;
		this.flscSchUm = flscSchUm;
		this.flscDesc = flscDesc;
		this.flscFlexFences = flscFlexFences;
		this.flscPhysicalUsage = flscPhysicalUsage;
		this.flscTimeUsage = flscTimeUsage;
		this.flscDailyTimeUsage = flscDailyTimeUsage;
		this.flscEntryMode = flscEntryMode;
		this.flscModDate = flscModDate;
		this.flscUser1 = flscUser1;
		this.flscUser2 = flscUser2;
		this.flscUserc03 = flscUserc03;
		this.flscUserd01 = flscUserd01;
		this.flscUseri01 = flscUseri01;
		this.flscModUserid = flscModUserid;
		this.flscUserl01 = flscUserl01;
		this.flscUsert01 = flscUsert01;
		this.flscQadc01 = flscQadc01;
		this.flscQadc02 = flscQadc02;
		this.flscQadc03 = flscQadc03;
		this.flscQadd01 = flscQadd01;
		this.flscQadi01 = flscQadi01;
		this.flscQadl01 = flscQadl01;
		this.flscQadt01 = flscQadt01;
		this.flscSchMeasurement = flscSchMeasurement;
		this.flscRateExpression = flscRateExpression;
		this.flscQadc04 = flscQadc04;
		this.flscQadc05 = flscQadc05;
		this.flscQadc06 = flscQadc06;
		this.flscQadd02 = flscQadd02;
		this.flscQadi02 = flscQadi02;
		this.flscQadl02 = flscQadl02;
		this.flscQadt02 = flscQadt02;
		this.oidFlscMstr = oidFlscMstr;
	}

	// Property accessors

	public FlscMstrId getId() {
		return this.id;
	}

	public void setId(FlscMstrId id) {
		this.id = id;
	}

	public Date getFlscStartDate() {
		return this.flscStartDate;
	}

	public void setFlscStartDate(Date flscStartDate) {
		this.flscStartDate = flscStartDate;
	}

	public String getFlscPeriodCode() {
		return this.flscPeriodCode;
	}

	public void setFlscPeriodCode(String flscPeriodCode) {
		this.flscPeriodCode = flscPeriodCode;
	}

	public String getFlscSchUm() {
		return this.flscSchUm;
	}

	public void setFlscSchUm(String flscSchUm) {
		this.flscSchUm = flscSchUm;
	}

	public String getFlscDesc() {
		return this.flscDesc;
	}

	public void setFlscDesc(String flscDesc) {
		this.flscDesc = flscDesc;
	}

	public Boolean getFlscFlexFences() {
		return this.flscFlexFences;
	}

	public void setFlscFlexFences(Boolean flscFlexFences) {
		this.flscFlexFences = flscFlexFences;
	}

	public Boolean getFlscPhysicalUsage() {
		return this.flscPhysicalUsage;
	}

	public void setFlscPhysicalUsage(Boolean flscPhysicalUsage) {
		this.flscPhysicalUsage = flscPhysicalUsage;
	}

	public Boolean getFlscTimeUsage() {
		return this.flscTimeUsage;
	}

	public void setFlscTimeUsage(Boolean flscTimeUsage) {
		this.flscTimeUsage = flscTimeUsage;
	}

	public Boolean getFlscDailyTimeUsage() {
		return this.flscDailyTimeUsage;
	}

	public void setFlscDailyTimeUsage(Boolean flscDailyTimeUsage) {
		this.flscDailyTimeUsage = flscDailyTimeUsage;
	}

	public Boolean getFlscEntryMode() {
		return this.flscEntryMode;
	}

	public void setFlscEntryMode(Boolean flscEntryMode) {
		this.flscEntryMode = flscEntryMode;
	}

	public Date getFlscModDate() {
		return this.flscModDate;
	}

	public void setFlscModDate(Date flscModDate) {
		this.flscModDate = flscModDate;
	}

	public String getFlscUser1() {
		return this.flscUser1;
	}

	public void setFlscUser1(String flscUser1) {
		this.flscUser1 = flscUser1;
	}

	public String getFlscUser2() {
		return this.flscUser2;
	}

	public void setFlscUser2(String flscUser2) {
		this.flscUser2 = flscUser2;
	}

	public String getFlscUserc03() {
		return this.flscUserc03;
	}

	public void setFlscUserc03(String flscUserc03) {
		this.flscUserc03 = flscUserc03;
	}

	public Double getFlscUserd01() {
		return this.flscUserd01;
	}

	public void setFlscUserd01(Double flscUserd01) {
		this.flscUserd01 = flscUserd01;
	}

	public Integer getFlscUseri01() {
		return this.flscUseri01;
	}

	public void setFlscUseri01(Integer flscUseri01) {
		this.flscUseri01 = flscUseri01;
	}

	public String getFlscModUserid() {
		return this.flscModUserid;
	}

	public void setFlscModUserid(String flscModUserid) {
		this.flscModUserid = flscModUserid;
	}

	public Boolean getFlscUserl01() {
		return this.flscUserl01;
	}

	public void setFlscUserl01(Boolean flscUserl01) {
		this.flscUserl01 = flscUserl01;
	}

	public Date getFlscUsert01() {
		return this.flscUsert01;
	}

	public void setFlscUsert01(Date flscUsert01) {
		this.flscUsert01 = flscUsert01;
	}

	public String getFlscQadc01() {
		return this.flscQadc01;
	}

	public void setFlscQadc01(String flscQadc01) {
		this.flscQadc01 = flscQadc01;
	}

	public String getFlscQadc02() {
		return this.flscQadc02;
	}

	public void setFlscQadc02(String flscQadc02) {
		this.flscQadc02 = flscQadc02;
	}

	public String getFlscQadc03() {
		return this.flscQadc03;
	}

	public void setFlscQadc03(String flscQadc03) {
		this.flscQadc03 = flscQadc03;
	}

	public Double getFlscQadd01() {
		return this.flscQadd01;
	}

	public void setFlscQadd01(Double flscQadd01) {
		this.flscQadd01 = flscQadd01;
	}

	public Integer getFlscQadi01() {
		return this.flscQadi01;
	}

	public void setFlscQadi01(Integer flscQadi01) {
		this.flscQadi01 = flscQadi01;
	}

	public Boolean getFlscQadl01() {
		return this.flscQadl01;
	}

	public void setFlscQadl01(Boolean flscQadl01) {
		this.flscQadl01 = flscQadl01;
	}

	public Date getFlscQadt01() {
		return this.flscQadt01;
	}

	public void setFlscQadt01(Date flscQadt01) {
		this.flscQadt01 = flscQadt01;
	}

	public String getFlscSchMeasurement() {
		return this.flscSchMeasurement;
	}

	public void setFlscSchMeasurement(String flscSchMeasurement) {
		this.flscSchMeasurement = flscSchMeasurement;
	}

	public String getFlscRateExpression() {
		return this.flscRateExpression;
	}

	public void setFlscRateExpression(String flscRateExpression) {
		this.flscRateExpression = flscRateExpression;
	}

	public String getFlscQadc04() {
		return this.flscQadc04;
	}

	public void setFlscQadc04(String flscQadc04) {
		this.flscQadc04 = flscQadc04;
	}

	public String getFlscQadc05() {
		return this.flscQadc05;
	}

	public void setFlscQadc05(String flscQadc05) {
		this.flscQadc05 = flscQadc05;
	}

	public String getFlscQadc06() {
		return this.flscQadc06;
	}

	public void setFlscQadc06(String flscQadc06) {
		this.flscQadc06 = flscQadc06;
	}

	public Double getFlscQadd02() {
		return this.flscQadd02;
	}

	public void setFlscQadd02(Double flscQadd02) {
		this.flscQadd02 = flscQadd02;
	}

	public Integer getFlscQadi02() {
		return this.flscQadi02;
	}

	public void setFlscQadi02(Integer flscQadi02) {
		this.flscQadi02 = flscQadi02;
	}

	public Boolean getFlscQadl02() {
		return this.flscQadl02;
	}

	public void setFlscQadl02(Boolean flscQadl02) {
		this.flscQadl02 = flscQadl02;
	}

	public Date getFlscQadt02() {
		return this.flscQadt02;
	}

	public void setFlscQadt02(Date flscQadt02) {
		this.flscQadt02 = flscQadt02;
	}

	public Double getOidFlscMstr() {
		return this.oidFlscMstr;
	}

	public void setOidFlscMstr(Double oidFlscMstr) {
		this.oidFlscMstr = oidFlscMstr;
	}

}