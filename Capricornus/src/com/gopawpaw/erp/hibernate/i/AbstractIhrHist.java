package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIhrHist entity provides the base persistence definition of the
 * IhrHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIhrHist implements java.io.Serializable {

	// Fields

	private IhrHistId id;
	private String ihrDiv;
	private String ihrGroup;
	private Integer ihrPricing;
	private Integer ihrType;
	private String ihrUser1;
	private String ihrUser2;
	private String ihrQadc01;
	private String ihrQadc02;
	private String ihrQadc03;
	private Double ihrQadd01;
	private Double ihrQadd02;
	private Integer ihrQadi01;
	private Integer ihrQadi02;
	private Boolean ihrQadl01;
	private Boolean ihrQadl02;
	private Date ihrQadt01;
	private Date ihrQadt02;
	private Double oidIhrHist;

	// Constructors

	/** default constructor */
	public AbstractIhrHist() {
	}

	/** minimal constructor */
	public AbstractIhrHist(IhrHistId id, Double oidIhrHist) {
		this.id = id;
		this.oidIhrHist = oidIhrHist;
	}

	/** full constructor */
	public AbstractIhrHist(IhrHistId id, String ihrDiv, String ihrGroup,
			Integer ihrPricing, Integer ihrType, String ihrUser1,
			String ihrUser2, String ihrQadc01, String ihrQadc02,
			String ihrQadc03, Double ihrQadd01, Double ihrQadd02,
			Integer ihrQadi01, Integer ihrQadi02, Boolean ihrQadl01,
			Boolean ihrQadl02, Date ihrQadt01, Date ihrQadt02, Double oidIhrHist) {
		this.id = id;
		this.ihrDiv = ihrDiv;
		this.ihrGroup = ihrGroup;
		this.ihrPricing = ihrPricing;
		this.ihrType = ihrType;
		this.ihrUser1 = ihrUser1;
		this.ihrUser2 = ihrUser2;
		this.ihrQadc01 = ihrQadc01;
		this.ihrQadc02 = ihrQadc02;
		this.ihrQadc03 = ihrQadc03;
		this.ihrQadd01 = ihrQadd01;
		this.ihrQadd02 = ihrQadd02;
		this.ihrQadi01 = ihrQadi01;
		this.ihrQadi02 = ihrQadi02;
		this.ihrQadl01 = ihrQadl01;
		this.ihrQadl02 = ihrQadl02;
		this.ihrQadt01 = ihrQadt01;
		this.ihrQadt02 = ihrQadt02;
		this.oidIhrHist = oidIhrHist;
	}

	// Property accessors

	public IhrHistId getId() {
		return this.id;
	}

	public void setId(IhrHistId id) {
		this.id = id;
	}

	public String getIhrDiv() {
		return this.ihrDiv;
	}

	public void setIhrDiv(String ihrDiv) {
		this.ihrDiv = ihrDiv;
	}

	public String getIhrGroup() {
		return this.ihrGroup;
	}

	public void setIhrGroup(String ihrGroup) {
		this.ihrGroup = ihrGroup;
	}

	public Integer getIhrPricing() {
		return this.ihrPricing;
	}

	public void setIhrPricing(Integer ihrPricing) {
		this.ihrPricing = ihrPricing;
	}

	public Integer getIhrType() {
		return this.ihrType;
	}

	public void setIhrType(Integer ihrType) {
		this.ihrType = ihrType;
	}

	public String getIhrUser1() {
		return this.ihrUser1;
	}

	public void setIhrUser1(String ihrUser1) {
		this.ihrUser1 = ihrUser1;
	}

	public String getIhrUser2() {
		return this.ihrUser2;
	}

	public void setIhrUser2(String ihrUser2) {
		this.ihrUser2 = ihrUser2;
	}

	public String getIhrQadc01() {
		return this.ihrQadc01;
	}

	public void setIhrQadc01(String ihrQadc01) {
		this.ihrQadc01 = ihrQadc01;
	}

	public String getIhrQadc02() {
		return this.ihrQadc02;
	}

	public void setIhrQadc02(String ihrQadc02) {
		this.ihrQadc02 = ihrQadc02;
	}

	public String getIhrQadc03() {
		return this.ihrQadc03;
	}

	public void setIhrQadc03(String ihrQadc03) {
		this.ihrQadc03 = ihrQadc03;
	}

	public Double getIhrQadd01() {
		return this.ihrQadd01;
	}

	public void setIhrQadd01(Double ihrQadd01) {
		this.ihrQadd01 = ihrQadd01;
	}

	public Double getIhrQadd02() {
		return this.ihrQadd02;
	}

	public void setIhrQadd02(Double ihrQadd02) {
		this.ihrQadd02 = ihrQadd02;
	}

	public Integer getIhrQadi01() {
		return this.ihrQadi01;
	}

	public void setIhrQadi01(Integer ihrQadi01) {
		this.ihrQadi01 = ihrQadi01;
	}

	public Integer getIhrQadi02() {
		return this.ihrQadi02;
	}

	public void setIhrQadi02(Integer ihrQadi02) {
		this.ihrQadi02 = ihrQadi02;
	}

	public Boolean getIhrQadl01() {
		return this.ihrQadl01;
	}

	public void setIhrQadl01(Boolean ihrQadl01) {
		this.ihrQadl01 = ihrQadl01;
	}

	public Boolean getIhrQadl02() {
		return this.ihrQadl02;
	}

	public void setIhrQadl02(Boolean ihrQadl02) {
		this.ihrQadl02 = ihrQadl02;
	}

	public Date getIhrQadt01() {
		return this.ihrQadt01;
	}

	public void setIhrQadt01(Date ihrQadt01) {
		this.ihrQadt01 = ihrQadt01;
	}

	public Date getIhrQadt02() {
		return this.ihrQadt02;
	}

	public void setIhrQadt02(Date ihrQadt02) {
		this.ihrQadt02 = ihrQadt02;
	}

	public Double getOidIhrHist() {
		return this.oidIhrHist;
	}

	public void setOidIhrHist(Double oidIhrHist) {
		this.oidIhrHist = oidIhrHist;
	}

}