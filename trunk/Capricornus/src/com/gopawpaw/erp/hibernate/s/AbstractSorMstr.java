package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSorMstr entity provides the base persistence definition of the
 * SorMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSorMstr implements java.io.Serializable {

	// Fields

	private SorMstrId id;
	private String sorDiv;
	private String sorGroup;
	private Integer sorPricing;
	private Integer sorType;
	private String sorUser1;
	private String sorUser2;
	private String sorQadc01;
	private String sorQadc02;
	private String sorQadc03;
	private Double sorQadd01;
	private Double sorQadd02;
	private Integer sorQadi01;
	private Integer sorQadi02;
	private Boolean sorQadl01;
	private Boolean sorQadl02;
	private Date sorQadt01;
	private Date sorQadt02;
	private Double oidSorMstr;

	// Constructors

	/** default constructor */
	public AbstractSorMstr() {
	}

	/** minimal constructor */
	public AbstractSorMstr(SorMstrId id, Double oidSorMstr) {
		this.id = id;
		this.oidSorMstr = oidSorMstr;
	}

	/** full constructor */
	public AbstractSorMstr(SorMstrId id, String sorDiv, String sorGroup,
			Integer sorPricing, Integer sorType, String sorUser1,
			String sorUser2, String sorQadc01, String sorQadc02,
			String sorQadc03, Double sorQadd01, Double sorQadd02,
			Integer sorQadi01, Integer sorQadi02, Boolean sorQadl01,
			Boolean sorQadl02, Date sorQadt01, Date sorQadt02, Double oidSorMstr) {
		this.id = id;
		this.sorDiv = sorDiv;
		this.sorGroup = sorGroup;
		this.sorPricing = sorPricing;
		this.sorType = sorType;
		this.sorUser1 = sorUser1;
		this.sorUser2 = sorUser2;
		this.sorQadc01 = sorQadc01;
		this.sorQadc02 = sorQadc02;
		this.sorQadc03 = sorQadc03;
		this.sorQadd01 = sorQadd01;
		this.sorQadd02 = sorQadd02;
		this.sorQadi01 = sorQadi01;
		this.sorQadi02 = sorQadi02;
		this.sorQadl01 = sorQadl01;
		this.sorQadl02 = sorQadl02;
		this.sorQadt01 = sorQadt01;
		this.sorQadt02 = sorQadt02;
		this.oidSorMstr = oidSorMstr;
	}

	// Property accessors

	public SorMstrId getId() {
		return this.id;
	}

	public void setId(SorMstrId id) {
		this.id = id;
	}

	public String getSorDiv() {
		return this.sorDiv;
	}

	public void setSorDiv(String sorDiv) {
		this.sorDiv = sorDiv;
	}

	public String getSorGroup() {
		return this.sorGroup;
	}

	public void setSorGroup(String sorGroup) {
		this.sorGroup = sorGroup;
	}

	public Integer getSorPricing() {
		return this.sorPricing;
	}

	public void setSorPricing(Integer sorPricing) {
		this.sorPricing = sorPricing;
	}

	public Integer getSorType() {
		return this.sorType;
	}

	public void setSorType(Integer sorType) {
		this.sorType = sorType;
	}

	public String getSorUser1() {
		return this.sorUser1;
	}

	public void setSorUser1(String sorUser1) {
		this.sorUser1 = sorUser1;
	}

	public String getSorUser2() {
		return this.sorUser2;
	}

	public void setSorUser2(String sorUser2) {
		this.sorUser2 = sorUser2;
	}

	public String getSorQadc01() {
		return this.sorQadc01;
	}

	public void setSorQadc01(String sorQadc01) {
		this.sorQadc01 = sorQadc01;
	}

	public String getSorQadc02() {
		return this.sorQadc02;
	}

	public void setSorQadc02(String sorQadc02) {
		this.sorQadc02 = sorQadc02;
	}

	public String getSorQadc03() {
		return this.sorQadc03;
	}

	public void setSorQadc03(String sorQadc03) {
		this.sorQadc03 = sorQadc03;
	}

	public Double getSorQadd01() {
		return this.sorQadd01;
	}

	public void setSorQadd01(Double sorQadd01) {
		this.sorQadd01 = sorQadd01;
	}

	public Double getSorQadd02() {
		return this.sorQadd02;
	}

	public void setSorQadd02(Double sorQadd02) {
		this.sorQadd02 = sorQadd02;
	}

	public Integer getSorQadi01() {
		return this.sorQadi01;
	}

	public void setSorQadi01(Integer sorQadi01) {
		this.sorQadi01 = sorQadi01;
	}

	public Integer getSorQadi02() {
		return this.sorQadi02;
	}

	public void setSorQadi02(Integer sorQadi02) {
		this.sorQadi02 = sorQadi02;
	}

	public Boolean getSorQadl01() {
		return this.sorQadl01;
	}

	public void setSorQadl01(Boolean sorQadl01) {
		this.sorQadl01 = sorQadl01;
	}

	public Boolean getSorQadl02() {
		return this.sorQadl02;
	}

	public void setSorQadl02(Boolean sorQadl02) {
		this.sorQadl02 = sorQadl02;
	}

	public Date getSorQadt01() {
		return this.sorQadt01;
	}

	public void setSorQadt01(Date sorQadt01) {
		this.sorQadt01 = sorQadt01;
	}

	public Date getSorQadt02() {
		return this.sorQadt02;
	}

	public void setSorQadt02(Date sorQadt02) {
		this.sorQadt02 = sorQadt02;
	}

	public Double getOidSorMstr() {
		return this.oidSorMstr;
	}

	public void setOidSorMstr(Double oidSorMstr) {
		this.oidSorMstr = oidSorMstr;
	}

}