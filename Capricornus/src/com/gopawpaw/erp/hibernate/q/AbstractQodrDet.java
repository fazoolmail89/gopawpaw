package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * AbstractQodrDet entity provides the base persistence definition of the
 * QodrDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQodrDet implements java.io.Serializable {

	// Fields

	private QodrDetId id;
	private String qodrDiv;
	private String qodrGroup;
	private Integer qodrPricing;
	private Integer qodrType;
	private String qodrUser1;
	private String qodrUser2;
	private String qodrQadc01;
	private String qodrQadc02;
	private String qodrQadc03;
	private Double qodrQadd01;
	private Double qodrQadd02;
	private Integer qodrQadi01;
	private Integer qodrQadi02;
	private Boolean qodrQadl01;
	private Boolean qodrQadl02;
	private Date qodrQadt01;
	private Date qodrQadt02;
	private Double oidQodrDet;

	// Constructors

	/** default constructor */
	public AbstractQodrDet() {
	}

	/** minimal constructor */
	public AbstractQodrDet(QodrDetId id, Double oidQodrDet) {
		this.id = id;
		this.oidQodrDet = oidQodrDet;
	}

	/** full constructor */
	public AbstractQodrDet(QodrDetId id, String qodrDiv, String qodrGroup,
			Integer qodrPricing, Integer qodrType, String qodrUser1,
			String qodrUser2, String qodrQadc01, String qodrQadc02,
			String qodrQadc03, Double qodrQadd01, Double qodrQadd02,
			Integer qodrQadi01, Integer qodrQadi02, Boolean qodrQadl01,
			Boolean qodrQadl02, Date qodrQadt01, Date qodrQadt02,
			Double oidQodrDet) {
		this.id = id;
		this.qodrDiv = qodrDiv;
		this.qodrGroup = qodrGroup;
		this.qodrPricing = qodrPricing;
		this.qodrType = qodrType;
		this.qodrUser1 = qodrUser1;
		this.qodrUser2 = qodrUser2;
		this.qodrQadc01 = qodrQadc01;
		this.qodrQadc02 = qodrQadc02;
		this.qodrQadc03 = qodrQadc03;
		this.qodrQadd01 = qodrQadd01;
		this.qodrQadd02 = qodrQadd02;
		this.qodrQadi01 = qodrQadi01;
		this.qodrQadi02 = qodrQadi02;
		this.qodrQadl01 = qodrQadl01;
		this.qodrQadl02 = qodrQadl02;
		this.qodrQadt01 = qodrQadt01;
		this.qodrQadt02 = qodrQadt02;
		this.oidQodrDet = oidQodrDet;
	}

	// Property accessors

	public QodrDetId getId() {
		return this.id;
	}

	public void setId(QodrDetId id) {
		this.id = id;
	}

	public String getQodrDiv() {
		return this.qodrDiv;
	}

	public void setQodrDiv(String qodrDiv) {
		this.qodrDiv = qodrDiv;
	}

	public String getQodrGroup() {
		return this.qodrGroup;
	}

	public void setQodrGroup(String qodrGroup) {
		this.qodrGroup = qodrGroup;
	}

	public Integer getQodrPricing() {
		return this.qodrPricing;
	}

	public void setQodrPricing(Integer qodrPricing) {
		this.qodrPricing = qodrPricing;
	}

	public Integer getQodrType() {
		return this.qodrType;
	}

	public void setQodrType(Integer qodrType) {
		this.qodrType = qodrType;
	}

	public String getQodrUser1() {
		return this.qodrUser1;
	}

	public void setQodrUser1(String qodrUser1) {
		this.qodrUser1 = qodrUser1;
	}

	public String getQodrUser2() {
		return this.qodrUser2;
	}

	public void setQodrUser2(String qodrUser2) {
		this.qodrUser2 = qodrUser2;
	}

	public String getQodrQadc01() {
		return this.qodrQadc01;
	}

	public void setQodrQadc01(String qodrQadc01) {
		this.qodrQadc01 = qodrQadc01;
	}

	public String getQodrQadc02() {
		return this.qodrQadc02;
	}

	public void setQodrQadc02(String qodrQadc02) {
		this.qodrQadc02 = qodrQadc02;
	}

	public String getQodrQadc03() {
		return this.qodrQadc03;
	}

	public void setQodrQadc03(String qodrQadc03) {
		this.qodrQadc03 = qodrQadc03;
	}

	public Double getQodrQadd01() {
		return this.qodrQadd01;
	}

	public void setQodrQadd01(Double qodrQadd01) {
		this.qodrQadd01 = qodrQadd01;
	}

	public Double getQodrQadd02() {
		return this.qodrQadd02;
	}

	public void setQodrQadd02(Double qodrQadd02) {
		this.qodrQadd02 = qodrQadd02;
	}

	public Integer getQodrQadi01() {
		return this.qodrQadi01;
	}

	public void setQodrQadi01(Integer qodrQadi01) {
		this.qodrQadi01 = qodrQadi01;
	}

	public Integer getQodrQadi02() {
		return this.qodrQadi02;
	}

	public void setQodrQadi02(Integer qodrQadi02) {
		this.qodrQadi02 = qodrQadi02;
	}

	public Boolean getQodrQadl01() {
		return this.qodrQadl01;
	}

	public void setQodrQadl01(Boolean qodrQadl01) {
		this.qodrQadl01 = qodrQadl01;
	}

	public Boolean getQodrQadl02() {
		return this.qodrQadl02;
	}

	public void setQodrQadl02(Boolean qodrQadl02) {
		this.qodrQadl02 = qodrQadl02;
	}

	public Date getQodrQadt01() {
		return this.qodrQadt01;
	}

	public void setQodrQadt01(Date qodrQadt01) {
		this.qodrQadt01 = qodrQadt01;
	}

	public Date getQodrQadt02() {
		return this.qodrQadt02;
	}

	public void setQodrQadt02(Date qodrQadt02) {
		this.qodrQadt02 = qodrQadt02;
	}

	public Double getOidQodrDet() {
		return this.oidQodrDet;
	}

	public void setOidQodrDet(Double oidQodrDet) {
		this.oidQodrDet = oidQodrDet;
	}

}