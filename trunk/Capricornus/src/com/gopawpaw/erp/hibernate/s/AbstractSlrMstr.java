package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSlrMstr entity provides the base persistence definition of the
 * SlrMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSlrMstr implements java.io.Serializable {

	// Fields

	private SlrMstrId id;
	private String slrAttribute;
	private Boolean slrLscActive;
	private Date slrModDate;
	private String slrModUserid;
	private String slrQadc01;
	private String slrQadc02;
	private Double slrQadd01;
	private Double slrQadd02;
	private Integer slrQadi01;
	private Boolean slrQadl01;
	private Date slrQadt01;
	private Date slrQadt02;
	private String slrUserc01;
	private String slrUserc02;
	private Double slrUserd01;
	private Integer slrUseri01;
	private Boolean slrUserl01;
	private Date slrUsert01;
	private Double oidSlrMstr;

	// Constructors

	/** default constructor */
	public AbstractSlrMstr() {
	}

	/** minimal constructor */
	public AbstractSlrMstr(SlrMstrId id, String slrAttribute,
			Boolean slrLscActive, Date slrModDate, String slrModUserid,
			String slrQadc01, String slrQadc02, Double slrQadd01,
			Double slrQadd02, Integer slrQadi01, Boolean slrQadl01,
			String slrUserc01, String slrUserc02, Double slrUserd01,
			Integer slrUseri01, Boolean slrUserl01, Double oidSlrMstr) {
		this.id = id;
		this.slrAttribute = slrAttribute;
		this.slrLscActive = slrLscActive;
		this.slrModDate = slrModDate;
		this.slrModUserid = slrModUserid;
		this.slrQadc01 = slrQadc01;
		this.slrQadc02 = slrQadc02;
		this.slrQadd01 = slrQadd01;
		this.slrQadd02 = slrQadd02;
		this.slrQadi01 = slrQadi01;
		this.slrQadl01 = slrQadl01;
		this.slrUserc01 = slrUserc01;
		this.slrUserc02 = slrUserc02;
		this.slrUserd01 = slrUserd01;
		this.slrUseri01 = slrUseri01;
		this.slrUserl01 = slrUserl01;
		this.oidSlrMstr = oidSlrMstr;
	}

	/** full constructor */
	public AbstractSlrMstr(SlrMstrId id, String slrAttribute,
			Boolean slrLscActive, Date slrModDate, String slrModUserid,
			String slrQadc01, String slrQadc02, Double slrQadd01,
			Double slrQadd02, Integer slrQadi01, Boolean slrQadl01,
			Date slrQadt01, Date slrQadt02, String slrUserc01,
			String slrUserc02, Double slrUserd01, Integer slrUseri01,
			Boolean slrUserl01, Date slrUsert01, Double oidSlrMstr) {
		this.id = id;
		this.slrAttribute = slrAttribute;
		this.slrLscActive = slrLscActive;
		this.slrModDate = slrModDate;
		this.slrModUserid = slrModUserid;
		this.slrQadc01 = slrQadc01;
		this.slrQadc02 = slrQadc02;
		this.slrQadd01 = slrQadd01;
		this.slrQadd02 = slrQadd02;
		this.slrQadi01 = slrQadi01;
		this.slrQadl01 = slrQadl01;
		this.slrQadt01 = slrQadt01;
		this.slrQadt02 = slrQadt02;
		this.slrUserc01 = slrUserc01;
		this.slrUserc02 = slrUserc02;
		this.slrUserd01 = slrUserd01;
		this.slrUseri01 = slrUseri01;
		this.slrUserl01 = slrUserl01;
		this.slrUsert01 = slrUsert01;
		this.oidSlrMstr = oidSlrMstr;
	}

	// Property accessors

	public SlrMstrId getId() {
		return this.id;
	}

	public void setId(SlrMstrId id) {
		this.id = id;
	}

	public String getSlrAttribute() {
		return this.slrAttribute;
	}

	public void setSlrAttribute(String slrAttribute) {
		this.slrAttribute = slrAttribute;
	}

	public Boolean getSlrLscActive() {
		return this.slrLscActive;
	}

	public void setSlrLscActive(Boolean slrLscActive) {
		this.slrLscActive = slrLscActive;
	}

	public Date getSlrModDate() {
		return this.slrModDate;
	}

	public void setSlrModDate(Date slrModDate) {
		this.slrModDate = slrModDate;
	}

	public String getSlrModUserid() {
		return this.slrModUserid;
	}

	public void setSlrModUserid(String slrModUserid) {
		this.slrModUserid = slrModUserid;
	}

	public String getSlrQadc01() {
		return this.slrQadc01;
	}

	public void setSlrQadc01(String slrQadc01) {
		this.slrQadc01 = slrQadc01;
	}

	public String getSlrQadc02() {
		return this.slrQadc02;
	}

	public void setSlrQadc02(String slrQadc02) {
		this.slrQadc02 = slrQadc02;
	}

	public Double getSlrQadd01() {
		return this.slrQadd01;
	}

	public void setSlrQadd01(Double slrQadd01) {
		this.slrQadd01 = slrQadd01;
	}

	public Double getSlrQadd02() {
		return this.slrQadd02;
	}

	public void setSlrQadd02(Double slrQadd02) {
		this.slrQadd02 = slrQadd02;
	}

	public Integer getSlrQadi01() {
		return this.slrQadi01;
	}

	public void setSlrQadi01(Integer slrQadi01) {
		this.slrQadi01 = slrQadi01;
	}

	public Boolean getSlrQadl01() {
		return this.slrQadl01;
	}

	public void setSlrQadl01(Boolean slrQadl01) {
		this.slrQadl01 = slrQadl01;
	}

	public Date getSlrQadt01() {
		return this.slrQadt01;
	}

	public void setSlrQadt01(Date slrQadt01) {
		this.slrQadt01 = slrQadt01;
	}

	public Date getSlrQadt02() {
		return this.slrQadt02;
	}

	public void setSlrQadt02(Date slrQadt02) {
		this.slrQadt02 = slrQadt02;
	}

	public String getSlrUserc01() {
		return this.slrUserc01;
	}

	public void setSlrUserc01(String slrUserc01) {
		this.slrUserc01 = slrUserc01;
	}

	public String getSlrUserc02() {
		return this.slrUserc02;
	}

	public void setSlrUserc02(String slrUserc02) {
		this.slrUserc02 = slrUserc02;
	}

	public Double getSlrUserd01() {
		return this.slrUserd01;
	}

	public void setSlrUserd01(Double slrUserd01) {
		this.slrUserd01 = slrUserd01;
	}

	public Integer getSlrUseri01() {
		return this.slrUseri01;
	}

	public void setSlrUseri01(Integer slrUseri01) {
		this.slrUseri01 = slrUseri01;
	}

	public Boolean getSlrUserl01() {
		return this.slrUserl01;
	}

	public void setSlrUserl01(Boolean slrUserl01) {
		this.slrUserl01 = slrUserl01;
	}

	public Date getSlrUsert01() {
		return this.slrUsert01;
	}

	public void setSlrUsert01(Date slrUsert01) {
		this.slrUsert01 = slrUsert01;
	}

	public Double getOidSlrMstr() {
		return this.oidSlrMstr;
	}

	public void setOidSlrMstr(Double oidSlrMstr) {
		this.oidSlrMstr = oidSlrMstr;
	}

}