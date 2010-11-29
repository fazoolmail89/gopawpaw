package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIdhrHist entity provides the base persistence definition of the
 * IdhrHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIdhrHist implements java.io.Serializable {

	// Fields

	private IdhrHistId id;
	private String idhrDiv;
	private String idhrGroup;
	private Integer idhrPricing;
	private Integer idhrType;
	private String idhrUser1;
	private String idhrUser2;
	private String idhrQadc01;
	private String idhrQadc02;
	private String idhrQadc03;
	private Double idhrQadd01;
	private Double idhrQadd02;
	private Integer idhrQadi01;
	private Integer idhrQadi02;
	private Boolean idhrQadl01;
	private Boolean idhrQadl02;
	private Date idhrQadt01;
	private Date idhrQadt02;
	private Double oidIdhrHist;

	// Constructors

	/** default constructor */
	public AbstractIdhrHist() {
	}

	/** minimal constructor */
	public AbstractIdhrHist(IdhrHistId id, Double oidIdhrHist) {
		this.id = id;
		this.oidIdhrHist = oidIdhrHist;
	}

	/** full constructor */
	public AbstractIdhrHist(IdhrHistId id, String idhrDiv, String idhrGroup,
			Integer idhrPricing, Integer idhrType, String idhrUser1,
			String idhrUser2, String idhrQadc01, String idhrQadc02,
			String idhrQadc03, Double idhrQadd01, Double idhrQadd02,
			Integer idhrQadi01, Integer idhrQadi02, Boolean idhrQadl01,
			Boolean idhrQadl02, Date idhrQadt01, Date idhrQadt02,
			Double oidIdhrHist) {
		this.id = id;
		this.idhrDiv = idhrDiv;
		this.idhrGroup = idhrGroup;
		this.idhrPricing = idhrPricing;
		this.idhrType = idhrType;
		this.idhrUser1 = idhrUser1;
		this.idhrUser2 = idhrUser2;
		this.idhrQadc01 = idhrQadc01;
		this.idhrQadc02 = idhrQadc02;
		this.idhrQadc03 = idhrQadc03;
		this.idhrQadd01 = idhrQadd01;
		this.idhrQadd02 = idhrQadd02;
		this.idhrQadi01 = idhrQadi01;
		this.idhrQadi02 = idhrQadi02;
		this.idhrQadl01 = idhrQadl01;
		this.idhrQadl02 = idhrQadl02;
		this.idhrQadt01 = idhrQadt01;
		this.idhrQadt02 = idhrQadt02;
		this.oidIdhrHist = oidIdhrHist;
	}

	// Property accessors

	public IdhrHistId getId() {
		return this.id;
	}

	public void setId(IdhrHistId id) {
		this.id = id;
	}

	public String getIdhrDiv() {
		return this.idhrDiv;
	}

	public void setIdhrDiv(String idhrDiv) {
		this.idhrDiv = idhrDiv;
	}

	public String getIdhrGroup() {
		return this.idhrGroup;
	}

	public void setIdhrGroup(String idhrGroup) {
		this.idhrGroup = idhrGroup;
	}

	public Integer getIdhrPricing() {
		return this.idhrPricing;
	}

	public void setIdhrPricing(Integer idhrPricing) {
		this.idhrPricing = idhrPricing;
	}

	public Integer getIdhrType() {
		return this.idhrType;
	}

	public void setIdhrType(Integer idhrType) {
		this.idhrType = idhrType;
	}

	public String getIdhrUser1() {
		return this.idhrUser1;
	}

	public void setIdhrUser1(String idhrUser1) {
		this.idhrUser1 = idhrUser1;
	}

	public String getIdhrUser2() {
		return this.idhrUser2;
	}

	public void setIdhrUser2(String idhrUser2) {
		this.idhrUser2 = idhrUser2;
	}

	public String getIdhrQadc01() {
		return this.idhrQadc01;
	}

	public void setIdhrQadc01(String idhrQadc01) {
		this.idhrQadc01 = idhrQadc01;
	}

	public String getIdhrQadc02() {
		return this.idhrQadc02;
	}

	public void setIdhrQadc02(String idhrQadc02) {
		this.idhrQadc02 = idhrQadc02;
	}

	public String getIdhrQadc03() {
		return this.idhrQadc03;
	}

	public void setIdhrQadc03(String idhrQadc03) {
		this.idhrQadc03 = idhrQadc03;
	}

	public Double getIdhrQadd01() {
		return this.idhrQadd01;
	}

	public void setIdhrQadd01(Double idhrQadd01) {
		this.idhrQadd01 = idhrQadd01;
	}

	public Double getIdhrQadd02() {
		return this.idhrQadd02;
	}

	public void setIdhrQadd02(Double idhrQadd02) {
		this.idhrQadd02 = idhrQadd02;
	}

	public Integer getIdhrQadi01() {
		return this.idhrQadi01;
	}

	public void setIdhrQadi01(Integer idhrQadi01) {
		this.idhrQadi01 = idhrQadi01;
	}

	public Integer getIdhrQadi02() {
		return this.idhrQadi02;
	}

	public void setIdhrQadi02(Integer idhrQadi02) {
		this.idhrQadi02 = idhrQadi02;
	}

	public Boolean getIdhrQadl01() {
		return this.idhrQadl01;
	}

	public void setIdhrQadl01(Boolean idhrQadl01) {
		this.idhrQadl01 = idhrQadl01;
	}

	public Boolean getIdhrQadl02() {
		return this.idhrQadl02;
	}

	public void setIdhrQadl02(Boolean idhrQadl02) {
		this.idhrQadl02 = idhrQadl02;
	}

	public Date getIdhrQadt01() {
		return this.idhrQadt01;
	}

	public void setIdhrQadt01(Date idhrQadt01) {
		this.idhrQadt01 = idhrQadt01;
	}

	public Date getIdhrQadt02() {
		return this.idhrQadt02;
	}

	public void setIdhrQadt02(Date idhrQadt02) {
		this.idhrQadt02 = idhrQadt02;
	}

	public Double getOidIdhrHist() {
		return this.oidIdhrHist;
	}

	public void setOidIdhrHist(Double oidIdhrHist) {
		this.oidIdhrHist = oidIdhrHist;
	}

}