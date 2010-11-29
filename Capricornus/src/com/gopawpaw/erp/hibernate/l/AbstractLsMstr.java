package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLsMstr entity provides the base persistence definition of the LsMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLsMstr implements java.io.Serializable {

	// Fields

	private LsMstrId id;
	private String lsUser1;
	private String lsUser2;
	private String lsQadc01;
	private String lsAppOwner;
	private Double lsDec01;
	private Double lsDec02;
	private Integer lsInt01;
	private Integer lsInt02;
	private Boolean lsLog01;
	private Boolean lsLog02;
	private Date lsDte01;
	private Date lsDte02;
	private String lsQadc02;
	private String lsQadc03;
	private String lsQadc04;
	private Double lsQadd01;
	private Double lsQadd02;
	private Integer lsQadi01;
	private Integer lsQadi02;
	private Boolean lsQadl01;
	private Boolean lsQadl02;
	private Date lsQadt01;
	private Date lsQadt02;
	private Double oidLsMstr;

	// Constructors

	/** default constructor */
	public AbstractLsMstr() {
	}

	/** minimal constructor */
	public AbstractLsMstr(LsMstrId id, Double oidLsMstr) {
		this.id = id;
		this.oidLsMstr = oidLsMstr;
	}

	/** full constructor */
	public AbstractLsMstr(LsMstrId id, String lsUser1, String lsUser2,
			String lsQadc01, String lsAppOwner, Double lsDec01, Double lsDec02,
			Integer lsInt01, Integer lsInt02, Boolean lsLog01, Boolean lsLog02,
			Date lsDte01, Date lsDte02, String lsQadc02, String lsQadc03,
			String lsQadc04, Double lsQadd01, Double lsQadd02,
			Integer lsQadi01, Integer lsQadi02, Boolean lsQadl01,
			Boolean lsQadl02, Date lsQadt01, Date lsQadt02, Double oidLsMstr) {
		this.id = id;
		this.lsUser1 = lsUser1;
		this.lsUser2 = lsUser2;
		this.lsQadc01 = lsQadc01;
		this.lsAppOwner = lsAppOwner;
		this.lsDec01 = lsDec01;
		this.lsDec02 = lsDec02;
		this.lsInt01 = lsInt01;
		this.lsInt02 = lsInt02;
		this.lsLog01 = lsLog01;
		this.lsLog02 = lsLog02;
		this.lsDte01 = lsDte01;
		this.lsDte02 = lsDte02;
		this.lsQadc02 = lsQadc02;
		this.lsQadc03 = lsQadc03;
		this.lsQadc04 = lsQadc04;
		this.lsQadd01 = lsQadd01;
		this.lsQadd02 = lsQadd02;
		this.lsQadi01 = lsQadi01;
		this.lsQadi02 = lsQadi02;
		this.lsQadl01 = lsQadl01;
		this.lsQadl02 = lsQadl02;
		this.lsQadt01 = lsQadt01;
		this.lsQadt02 = lsQadt02;
		this.oidLsMstr = oidLsMstr;
	}

	// Property accessors

	public LsMstrId getId() {
		return this.id;
	}

	public void setId(LsMstrId id) {
		this.id = id;
	}

	public String getLsUser1() {
		return this.lsUser1;
	}

	public void setLsUser1(String lsUser1) {
		this.lsUser1 = lsUser1;
	}

	public String getLsUser2() {
		return this.lsUser2;
	}

	public void setLsUser2(String lsUser2) {
		this.lsUser2 = lsUser2;
	}

	public String getLsQadc01() {
		return this.lsQadc01;
	}

	public void setLsQadc01(String lsQadc01) {
		this.lsQadc01 = lsQadc01;
	}

	public String getLsAppOwner() {
		return this.lsAppOwner;
	}

	public void setLsAppOwner(String lsAppOwner) {
		this.lsAppOwner = lsAppOwner;
	}

	public Double getLsDec01() {
		return this.lsDec01;
	}

	public void setLsDec01(Double lsDec01) {
		this.lsDec01 = lsDec01;
	}

	public Double getLsDec02() {
		return this.lsDec02;
	}

	public void setLsDec02(Double lsDec02) {
		this.lsDec02 = lsDec02;
	}

	public Integer getLsInt01() {
		return this.lsInt01;
	}

	public void setLsInt01(Integer lsInt01) {
		this.lsInt01 = lsInt01;
	}

	public Integer getLsInt02() {
		return this.lsInt02;
	}

	public void setLsInt02(Integer lsInt02) {
		this.lsInt02 = lsInt02;
	}

	public Boolean getLsLog01() {
		return this.lsLog01;
	}

	public void setLsLog01(Boolean lsLog01) {
		this.lsLog01 = lsLog01;
	}

	public Boolean getLsLog02() {
		return this.lsLog02;
	}

	public void setLsLog02(Boolean lsLog02) {
		this.lsLog02 = lsLog02;
	}

	public Date getLsDte01() {
		return this.lsDte01;
	}

	public void setLsDte01(Date lsDte01) {
		this.lsDte01 = lsDte01;
	}

	public Date getLsDte02() {
		return this.lsDte02;
	}

	public void setLsDte02(Date lsDte02) {
		this.lsDte02 = lsDte02;
	}

	public String getLsQadc02() {
		return this.lsQadc02;
	}

	public void setLsQadc02(String lsQadc02) {
		this.lsQadc02 = lsQadc02;
	}

	public String getLsQadc03() {
		return this.lsQadc03;
	}

	public void setLsQadc03(String lsQadc03) {
		this.lsQadc03 = lsQadc03;
	}

	public String getLsQadc04() {
		return this.lsQadc04;
	}

	public void setLsQadc04(String lsQadc04) {
		this.lsQadc04 = lsQadc04;
	}

	public Double getLsQadd01() {
		return this.lsQadd01;
	}

	public void setLsQadd01(Double lsQadd01) {
		this.lsQadd01 = lsQadd01;
	}

	public Double getLsQadd02() {
		return this.lsQadd02;
	}

	public void setLsQadd02(Double lsQadd02) {
		this.lsQadd02 = lsQadd02;
	}

	public Integer getLsQadi01() {
		return this.lsQadi01;
	}

	public void setLsQadi01(Integer lsQadi01) {
		this.lsQadi01 = lsQadi01;
	}

	public Integer getLsQadi02() {
		return this.lsQadi02;
	}

	public void setLsQadi02(Integer lsQadi02) {
		this.lsQadi02 = lsQadi02;
	}

	public Boolean getLsQadl01() {
		return this.lsQadl01;
	}

	public void setLsQadl01(Boolean lsQadl01) {
		this.lsQadl01 = lsQadl01;
	}

	public Boolean getLsQadl02() {
		return this.lsQadl02;
	}

	public void setLsQadl02(Boolean lsQadl02) {
		this.lsQadl02 = lsQadl02;
	}

	public Date getLsQadt01() {
		return this.lsQadt01;
	}

	public void setLsQadt01(Date lsQadt01) {
		this.lsQadt01 = lsQadt01;
	}

	public Date getLsQadt02() {
		return this.lsQadt02;
	}

	public void setLsQadt02(Date lsQadt02) {
		this.lsQadt02 = lsQadt02;
	}

	public Double getOidLsMstr() {
		return this.oidLsMstr;
	}

	public void setOidLsMstr(Double oidLsMstr) {
		this.oidLsMstr = oidLsMstr;
	}

}