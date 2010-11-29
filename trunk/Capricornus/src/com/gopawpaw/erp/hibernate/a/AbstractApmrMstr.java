package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractApmrMstr entity provides the base persistence definition of the
 * ApmrMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractApmrMstr implements java.io.Serializable {

	// Fields

	private ApmrMstrId id;
	private Integer apmrPricing;
	private Integer apmrRule;
	private Integer apmrType;
	private String apmrUser1;
	private String apmrUser2;
	private String apmrQadc01;
	private String apmrQadc02;
	private String apmrQadc03;
	private Double apmrQadd01;
	private Double apmrQadd02;
	private Integer apmrQadi01;
	private Integer apmrQadi02;
	private Boolean apmrQadl01;
	private Boolean apmrQadl02;
	private Date apmrQadt01;
	private Date apmrQadt02;
	private Double oidApmrMstr;

	// Constructors

	/** default constructor */
	public AbstractApmrMstr() {
	}

	/** minimal constructor */
	public AbstractApmrMstr(ApmrMstrId id, Double oidApmrMstr) {
		this.id = id;
		this.oidApmrMstr = oidApmrMstr;
	}

	/** full constructor */
	public AbstractApmrMstr(ApmrMstrId id, Integer apmrPricing,
			Integer apmrRule, Integer apmrType, String apmrUser1,
			String apmrUser2, String apmrQadc01, String apmrQadc02,
			String apmrQadc03, Double apmrQadd01, Double apmrQadd02,
			Integer apmrQadi01, Integer apmrQadi02, Boolean apmrQadl01,
			Boolean apmrQadl02, Date apmrQadt01, Date apmrQadt02,
			Double oidApmrMstr) {
		this.id = id;
		this.apmrPricing = apmrPricing;
		this.apmrRule = apmrRule;
		this.apmrType = apmrType;
		this.apmrUser1 = apmrUser1;
		this.apmrUser2 = apmrUser2;
		this.apmrQadc01 = apmrQadc01;
		this.apmrQadc02 = apmrQadc02;
		this.apmrQadc03 = apmrQadc03;
		this.apmrQadd01 = apmrQadd01;
		this.apmrQadd02 = apmrQadd02;
		this.apmrQadi01 = apmrQadi01;
		this.apmrQadi02 = apmrQadi02;
		this.apmrQadl01 = apmrQadl01;
		this.apmrQadl02 = apmrQadl02;
		this.apmrQadt01 = apmrQadt01;
		this.apmrQadt02 = apmrQadt02;
		this.oidApmrMstr = oidApmrMstr;
	}

	// Property accessors

	public ApmrMstrId getId() {
		return this.id;
	}

	public void setId(ApmrMstrId id) {
		this.id = id;
	}

	public Integer getApmrPricing() {
		return this.apmrPricing;
	}

	public void setApmrPricing(Integer apmrPricing) {
		this.apmrPricing = apmrPricing;
	}

	public Integer getApmrRule() {
		return this.apmrRule;
	}

	public void setApmrRule(Integer apmrRule) {
		this.apmrRule = apmrRule;
	}

	public Integer getApmrType() {
		return this.apmrType;
	}

	public void setApmrType(Integer apmrType) {
		this.apmrType = apmrType;
	}

	public String getApmrUser1() {
		return this.apmrUser1;
	}

	public void setApmrUser1(String apmrUser1) {
		this.apmrUser1 = apmrUser1;
	}

	public String getApmrUser2() {
		return this.apmrUser2;
	}

	public void setApmrUser2(String apmrUser2) {
		this.apmrUser2 = apmrUser2;
	}

	public String getApmrQadc01() {
		return this.apmrQadc01;
	}

	public void setApmrQadc01(String apmrQadc01) {
		this.apmrQadc01 = apmrQadc01;
	}

	public String getApmrQadc02() {
		return this.apmrQadc02;
	}

	public void setApmrQadc02(String apmrQadc02) {
		this.apmrQadc02 = apmrQadc02;
	}

	public String getApmrQadc03() {
		return this.apmrQadc03;
	}

	public void setApmrQadc03(String apmrQadc03) {
		this.apmrQadc03 = apmrQadc03;
	}

	public Double getApmrQadd01() {
		return this.apmrQadd01;
	}

	public void setApmrQadd01(Double apmrQadd01) {
		this.apmrQadd01 = apmrQadd01;
	}

	public Double getApmrQadd02() {
		return this.apmrQadd02;
	}

	public void setApmrQadd02(Double apmrQadd02) {
		this.apmrQadd02 = apmrQadd02;
	}

	public Integer getApmrQadi01() {
		return this.apmrQadi01;
	}

	public void setApmrQadi01(Integer apmrQadi01) {
		this.apmrQadi01 = apmrQadi01;
	}

	public Integer getApmrQadi02() {
		return this.apmrQadi02;
	}

	public void setApmrQadi02(Integer apmrQadi02) {
		this.apmrQadi02 = apmrQadi02;
	}

	public Boolean getApmrQadl01() {
		return this.apmrQadl01;
	}

	public void setApmrQadl01(Boolean apmrQadl01) {
		this.apmrQadl01 = apmrQadl01;
	}

	public Boolean getApmrQadl02() {
		return this.apmrQadl02;
	}

	public void setApmrQadl02(Boolean apmrQadl02) {
		this.apmrQadl02 = apmrQadl02;
	}

	public Date getApmrQadt01() {
		return this.apmrQadt01;
	}

	public void setApmrQadt01(Date apmrQadt01) {
		this.apmrQadt01 = apmrQadt01;
	}

	public Date getApmrQadt02() {
		return this.apmrQadt02;
	}

	public void setApmrQadt02(Date apmrQadt02) {
		this.apmrQadt02 = apmrQadt02;
	}

	public Double getOidApmrMstr() {
		return this.oidApmrMstr;
	}

	public void setOidApmrMstr(Double oidApmrMstr) {
		this.oidApmrMstr = oidApmrMstr;
	}

}