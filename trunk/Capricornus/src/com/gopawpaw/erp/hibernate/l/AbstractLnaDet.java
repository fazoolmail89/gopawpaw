package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLnaDet entity provides the base persistence definition of the LnaDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLnaDet implements java.io.Serializable {

	// Fields

	private LnaDetId id;
	private Double lnaAllocation;
	private String lnaQadc01;
	private String lnaQadc02;
	private Double lnaQadd01;
	private Double lnaQadd02;
	private Integer lnaQadi01;
	private Integer lnaQadi02;
	private Boolean lnaQadl01;
	private Boolean lnaQadl02;
	private Date lnaQadt01;
	private Date lnaQadt02;
	private String lnaUser1;
	private String lnaUser2;
	private String lnaChr01;
	private String lnaChr02;
	private Double lnaDec01;
	private Double lnaDec02;
	private Date lnaDte01;
	private Date lnaDte02;
	private Boolean lnaLog01;
	private Boolean lnaLog02;
	private Double oidLnaDet;

	// Constructors

	/** default constructor */
	public AbstractLnaDet() {
	}

	/** minimal constructor */
	public AbstractLnaDet(LnaDetId id, String lnaQadc01, String lnaQadc02,
			String lnaUser1, String lnaUser2, String lnaChr01, String lnaChr02,
			Double oidLnaDet) {
		this.id = id;
		this.lnaQadc01 = lnaQadc01;
		this.lnaQadc02 = lnaQadc02;
		this.lnaUser1 = lnaUser1;
		this.lnaUser2 = lnaUser2;
		this.lnaChr01 = lnaChr01;
		this.lnaChr02 = lnaChr02;
		this.oidLnaDet = oidLnaDet;
	}

	/** full constructor */
	public AbstractLnaDet(LnaDetId id, Double lnaAllocation, String lnaQadc01,
			String lnaQadc02, Double lnaQadd01, Double lnaQadd02,
			Integer lnaQadi01, Integer lnaQadi02, Boolean lnaQadl01,
			Boolean lnaQadl02, Date lnaQadt01, Date lnaQadt02, String lnaUser1,
			String lnaUser2, String lnaChr01, String lnaChr02, Double lnaDec01,
			Double lnaDec02, Date lnaDte01, Date lnaDte02, Boolean lnaLog01,
			Boolean lnaLog02, Double oidLnaDet) {
		this.id = id;
		this.lnaAllocation = lnaAllocation;
		this.lnaQadc01 = lnaQadc01;
		this.lnaQadc02 = lnaQadc02;
		this.lnaQadd01 = lnaQadd01;
		this.lnaQadd02 = lnaQadd02;
		this.lnaQadi01 = lnaQadi01;
		this.lnaQadi02 = lnaQadi02;
		this.lnaQadl01 = lnaQadl01;
		this.lnaQadl02 = lnaQadl02;
		this.lnaQadt01 = lnaQadt01;
		this.lnaQadt02 = lnaQadt02;
		this.lnaUser1 = lnaUser1;
		this.lnaUser2 = lnaUser2;
		this.lnaChr01 = lnaChr01;
		this.lnaChr02 = lnaChr02;
		this.lnaDec01 = lnaDec01;
		this.lnaDec02 = lnaDec02;
		this.lnaDte01 = lnaDte01;
		this.lnaDte02 = lnaDte02;
		this.lnaLog01 = lnaLog01;
		this.lnaLog02 = lnaLog02;
		this.oidLnaDet = oidLnaDet;
	}

	// Property accessors

	public LnaDetId getId() {
		return this.id;
	}

	public void setId(LnaDetId id) {
		this.id = id;
	}

	public Double getLnaAllocation() {
		return this.lnaAllocation;
	}

	public void setLnaAllocation(Double lnaAllocation) {
		this.lnaAllocation = lnaAllocation;
	}

	public String getLnaQadc01() {
		return this.lnaQadc01;
	}

	public void setLnaQadc01(String lnaQadc01) {
		this.lnaQadc01 = lnaQadc01;
	}

	public String getLnaQadc02() {
		return this.lnaQadc02;
	}

	public void setLnaQadc02(String lnaQadc02) {
		this.lnaQadc02 = lnaQadc02;
	}

	public Double getLnaQadd01() {
		return this.lnaQadd01;
	}

	public void setLnaQadd01(Double lnaQadd01) {
		this.lnaQadd01 = lnaQadd01;
	}

	public Double getLnaQadd02() {
		return this.lnaQadd02;
	}

	public void setLnaQadd02(Double lnaQadd02) {
		this.lnaQadd02 = lnaQadd02;
	}

	public Integer getLnaQadi01() {
		return this.lnaQadi01;
	}

	public void setLnaQadi01(Integer lnaQadi01) {
		this.lnaQadi01 = lnaQadi01;
	}

	public Integer getLnaQadi02() {
		return this.lnaQadi02;
	}

	public void setLnaQadi02(Integer lnaQadi02) {
		this.lnaQadi02 = lnaQadi02;
	}

	public Boolean getLnaQadl01() {
		return this.lnaQadl01;
	}

	public void setLnaQadl01(Boolean lnaQadl01) {
		this.lnaQadl01 = lnaQadl01;
	}

	public Boolean getLnaQadl02() {
		return this.lnaQadl02;
	}

	public void setLnaQadl02(Boolean lnaQadl02) {
		this.lnaQadl02 = lnaQadl02;
	}

	public Date getLnaQadt01() {
		return this.lnaQadt01;
	}

	public void setLnaQadt01(Date lnaQadt01) {
		this.lnaQadt01 = lnaQadt01;
	}

	public Date getLnaQadt02() {
		return this.lnaQadt02;
	}

	public void setLnaQadt02(Date lnaQadt02) {
		this.lnaQadt02 = lnaQadt02;
	}

	public String getLnaUser1() {
		return this.lnaUser1;
	}

	public void setLnaUser1(String lnaUser1) {
		this.lnaUser1 = lnaUser1;
	}

	public String getLnaUser2() {
		return this.lnaUser2;
	}

	public void setLnaUser2(String lnaUser2) {
		this.lnaUser2 = lnaUser2;
	}

	public String getLnaChr01() {
		return this.lnaChr01;
	}

	public void setLnaChr01(String lnaChr01) {
		this.lnaChr01 = lnaChr01;
	}

	public String getLnaChr02() {
		return this.lnaChr02;
	}

	public void setLnaChr02(String lnaChr02) {
		this.lnaChr02 = lnaChr02;
	}

	public Double getLnaDec01() {
		return this.lnaDec01;
	}

	public void setLnaDec01(Double lnaDec01) {
		this.lnaDec01 = lnaDec01;
	}

	public Double getLnaDec02() {
		return this.lnaDec02;
	}

	public void setLnaDec02(Double lnaDec02) {
		this.lnaDec02 = lnaDec02;
	}

	public Date getLnaDte01() {
		return this.lnaDte01;
	}

	public void setLnaDte01(Date lnaDte01) {
		this.lnaDte01 = lnaDte01;
	}

	public Date getLnaDte02() {
		return this.lnaDte02;
	}

	public void setLnaDte02(Date lnaDte02) {
		this.lnaDte02 = lnaDte02;
	}

	public Boolean getLnaLog01() {
		return this.lnaLog01;
	}

	public void setLnaLog01(Boolean lnaLog01) {
		this.lnaLog01 = lnaLog01;
	}

	public Boolean getLnaLog02() {
		return this.lnaLog02;
	}

	public void setLnaLog02(Boolean lnaLog02) {
		this.lnaLog02 = lnaLog02;
	}

	public Double getOidLnaDet() {
		return this.oidLnaDet;
	}

	public void setOidLnaDet(Double oidLnaDet) {
		this.oidLnaDet = oidLnaDet;
	}

}