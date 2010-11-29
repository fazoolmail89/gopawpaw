package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSodrDet entity provides the base persistence definition of the
 * SodrDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSodrDet implements java.io.Serializable {

	// Fields

	private SodrDetId id;
	private String sodrDiv;
	private String sodrGroup;
	private Integer sodrPricing;
	private Integer sodrType;
	private String sodrUser1;
	private String sodrUser2;
	private String sodrQadc01;
	private String sodrQadc02;
	private String sodrQadc03;
	private Double sodrQadd01;
	private Double sodrQadd02;
	private Integer sodrQadi01;
	private Integer sodrQadi02;
	private Boolean sodrQadl01;
	private Boolean sodrQadl02;
	private Date sodrQadt01;
	private Date sodrQadt02;
	private Double oidSodrDet;

	// Constructors

	/** default constructor */
	public AbstractSodrDet() {
	}

	/** minimal constructor */
	public AbstractSodrDet(SodrDetId id, Double oidSodrDet) {
		this.id = id;
		this.oidSodrDet = oidSodrDet;
	}

	/** full constructor */
	public AbstractSodrDet(SodrDetId id, String sodrDiv, String sodrGroup,
			Integer sodrPricing, Integer sodrType, String sodrUser1,
			String sodrUser2, String sodrQadc01, String sodrQadc02,
			String sodrQadc03, Double sodrQadd01, Double sodrQadd02,
			Integer sodrQadi01, Integer sodrQadi02, Boolean sodrQadl01,
			Boolean sodrQadl02, Date sodrQadt01, Date sodrQadt02,
			Double oidSodrDet) {
		this.id = id;
		this.sodrDiv = sodrDiv;
		this.sodrGroup = sodrGroup;
		this.sodrPricing = sodrPricing;
		this.sodrType = sodrType;
		this.sodrUser1 = sodrUser1;
		this.sodrUser2 = sodrUser2;
		this.sodrQadc01 = sodrQadc01;
		this.sodrQadc02 = sodrQadc02;
		this.sodrQadc03 = sodrQadc03;
		this.sodrQadd01 = sodrQadd01;
		this.sodrQadd02 = sodrQadd02;
		this.sodrQadi01 = sodrQadi01;
		this.sodrQadi02 = sodrQadi02;
		this.sodrQadl01 = sodrQadl01;
		this.sodrQadl02 = sodrQadl02;
		this.sodrQadt01 = sodrQadt01;
		this.sodrQadt02 = sodrQadt02;
		this.oidSodrDet = oidSodrDet;
	}

	// Property accessors

	public SodrDetId getId() {
		return this.id;
	}

	public void setId(SodrDetId id) {
		this.id = id;
	}

	public String getSodrDiv() {
		return this.sodrDiv;
	}

	public void setSodrDiv(String sodrDiv) {
		this.sodrDiv = sodrDiv;
	}

	public String getSodrGroup() {
		return this.sodrGroup;
	}

	public void setSodrGroup(String sodrGroup) {
		this.sodrGroup = sodrGroup;
	}

	public Integer getSodrPricing() {
		return this.sodrPricing;
	}

	public void setSodrPricing(Integer sodrPricing) {
		this.sodrPricing = sodrPricing;
	}

	public Integer getSodrType() {
		return this.sodrType;
	}

	public void setSodrType(Integer sodrType) {
		this.sodrType = sodrType;
	}

	public String getSodrUser1() {
		return this.sodrUser1;
	}

	public void setSodrUser1(String sodrUser1) {
		this.sodrUser1 = sodrUser1;
	}

	public String getSodrUser2() {
		return this.sodrUser2;
	}

	public void setSodrUser2(String sodrUser2) {
		this.sodrUser2 = sodrUser2;
	}

	public String getSodrQadc01() {
		return this.sodrQadc01;
	}

	public void setSodrQadc01(String sodrQadc01) {
		this.sodrQadc01 = sodrQadc01;
	}

	public String getSodrQadc02() {
		return this.sodrQadc02;
	}

	public void setSodrQadc02(String sodrQadc02) {
		this.sodrQadc02 = sodrQadc02;
	}

	public String getSodrQadc03() {
		return this.sodrQadc03;
	}

	public void setSodrQadc03(String sodrQadc03) {
		this.sodrQadc03 = sodrQadc03;
	}

	public Double getSodrQadd01() {
		return this.sodrQadd01;
	}

	public void setSodrQadd01(Double sodrQadd01) {
		this.sodrQadd01 = sodrQadd01;
	}

	public Double getSodrQadd02() {
		return this.sodrQadd02;
	}

	public void setSodrQadd02(Double sodrQadd02) {
		this.sodrQadd02 = sodrQadd02;
	}

	public Integer getSodrQadi01() {
		return this.sodrQadi01;
	}

	public void setSodrQadi01(Integer sodrQadi01) {
		this.sodrQadi01 = sodrQadi01;
	}

	public Integer getSodrQadi02() {
		return this.sodrQadi02;
	}

	public void setSodrQadi02(Integer sodrQadi02) {
		this.sodrQadi02 = sodrQadi02;
	}

	public Boolean getSodrQadl01() {
		return this.sodrQadl01;
	}

	public void setSodrQadl01(Boolean sodrQadl01) {
		this.sodrQadl01 = sodrQadl01;
	}

	public Boolean getSodrQadl02() {
		return this.sodrQadl02;
	}

	public void setSodrQadl02(Boolean sodrQadl02) {
		this.sodrQadl02 = sodrQadl02;
	}

	public Date getSodrQadt01() {
		return this.sodrQadt01;
	}

	public void setSodrQadt01(Date sodrQadt01) {
		this.sodrQadt01 = sodrQadt01;
	}

	public Date getSodrQadt02() {
		return this.sodrQadt02;
	}

	public void setSodrQadt02(Date sodrQadt02) {
		this.sodrQadt02 = sodrQadt02;
	}

	public Double getOidSodrDet() {
		return this.oidSodrDet;
	}

	public void setOidSodrDet(Double oidSodrDet) {
		this.oidSodrDet = oidSodrDet;
	}

}