package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * AbstractQorMstr entity provides the base persistence definition of the
 * QorMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQorMstr implements java.io.Serializable {

	// Fields

	private QorMstrId id;
	private String qorDiv;
	private String qorGroup;
	private Integer qorPricing;
	private Integer qorType;
	private String qorUser1;
	private String qorUser2;
	private String qorQadc01;
	private String qorQadc02;
	private String qorQadc03;
	private Double qorQadd01;
	private Double qorQadd02;
	private Integer qorQadi01;
	private Integer qorQadi02;
	private Boolean qorQadl01;
	private Boolean qorQadl02;
	private Date qorQadt01;
	private Date qorQadt02;
	private Double oidQorMstr;

	// Constructors

	/** default constructor */
	public AbstractQorMstr() {
	}

	/** minimal constructor */
	public AbstractQorMstr(QorMstrId id, Double oidQorMstr) {
		this.id = id;
		this.oidQorMstr = oidQorMstr;
	}

	/** full constructor */
	public AbstractQorMstr(QorMstrId id, String qorDiv, String qorGroup,
			Integer qorPricing, Integer qorType, String qorUser1,
			String qorUser2, String qorQadc01, String qorQadc02,
			String qorQadc03, Double qorQadd01, Double qorQadd02,
			Integer qorQadi01, Integer qorQadi02, Boolean qorQadl01,
			Boolean qorQadl02, Date qorQadt01, Date qorQadt02, Double oidQorMstr) {
		this.id = id;
		this.qorDiv = qorDiv;
		this.qorGroup = qorGroup;
		this.qorPricing = qorPricing;
		this.qorType = qorType;
		this.qorUser1 = qorUser1;
		this.qorUser2 = qorUser2;
		this.qorQadc01 = qorQadc01;
		this.qorQadc02 = qorQadc02;
		this.qorQadc03 = qorQadc03;
		this.qorQadd01 = qorQadd01;
		this.qorQadd02 = qorQadd02;
		this.qorQadi01 = qorQadi01;
		this.qorQadi02 = qorQadi02;
		this.qorQadl01 = qorQadl01;
		this.qorQadl02 = qorQadl02;
		this.qorQadt01 = qorQadt01;
		this.qorQadt02 = qorQadt02;
		this.oidQorMstr = oidQorMstr;
	}

	// Property accessors

	public QorMstrId getId() {
		return this.id;
	}

	public void setId(QorMstrId id) {
		this.id = id;
	}

	public String getQorDiv() {
		return this.qorDiv;
	}

	public void setQorDiv(String qorDiv) {
		this.qorDiv = qorDiv;
	}

	public String getQorGroup() {
		return this.qorGroup;
	}

	public void setQorGroup(String qorGroup) {
		this.qorGroup = qorGroup;
	}

	public Integer getQorPricing() {
		return this.qorPricing;
	}

	public void setQorPricing(Integer qorPricing) {
		this.qorPricing = qorPricing;
	}

	public Integer getQorType() {
		return this.qorType;
	}

	public void setQorType(Integer qorType) {
		this.qorType = qorType;
	}

	public String getQorUser1() {
		return this.qorUser1;
	}

	public void setQorUser1(String qorUser1) {
		this.qorUser1 = qorUser1;
	}

	public String getQorUser2() {
		return this.qorUser2;
	}

	public void setQorUser2(String qorUser2) {
		this.qorUser2 = qorUser2;
	}

	public String getQorQadc01() {
		return this.qorQadc01;
	}

	public void setQorQadc01(String qorQadc01) {
		this.qorQadc01 = qorQadc01;
	}

	public String getQorQadc02() {
		return this.qorQadc02;
	}

	public void setQorQadc02(String qorQadc02) {
		this.qorQadc02 = qorQadc02;
	}

	public String getQorQadc03() {
		return this.qorQadc03;
	}

	public void setQorQadc03(String qorQadc03) {
		this.qorQadc03 = qorQadc03;
	}

	public Double getQorQadd01() {
		return this.qorQadd01;
	}

	public void setQorQadd01(Double qorQadd01) {
		this.qorQadd01 = qorQadd01;
	}

	public Double getQorQadd02() {
		return this.qorQadd02;
	}

	public void setQorQadd02(Double qorQadd02) {
		this.qorQadd02 = qorQadd02;
	}

	public Integer getQorQadi01() {
		return this.qorQadi01;
	}

	public void setQorQadi01(Integer qorQadi01) {
		this.qorQadi01 = qorQadi01;
	}

	public Integer getQorQadi02() {
		return this.qorQadi02;
	}

	public void setQorQadi02(Integer qorQadi02) {
		this.qorQadi02 = qorQadi02;
	}

	public Boolean getQorQadl01() {
		return this.qorQadl01;
	}

	public void setQorQadl01(Boolean qorQadl01) {
		this.qorQadl01 = qorQadl01;
	}

	public Boolean getQorQadl02() {
		return this.qorQadl02;
	}

	public void setQorQadl02(Boolean qorQadl02) {
		this.qorQadl02 = qorQadl02;
	}

	public Date getQorQadt01() {
		return this.qorQadt01;
	}

	public void setQorQadt01(Date qorQadt01) {
		this.qorQadt01 = qorQadt01;
	}

	public Date getQorQadt02() {
		return this.qorQadt02;
	}

	public void setQorQadt02(Date qorQadt02) {
		this.qorQadt02 = qorQadt02;
	}

	public Double getOidQorMstr() {
		return this.oidQorMstr;
	}

	public void setOidQorMstr(Double oidQorMstr) {
		this.oidQorMstr = oidQorMstr;
	}

}