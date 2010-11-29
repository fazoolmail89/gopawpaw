package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGlcCal entity provides the base persistence definition of the GlcCal
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlcCal implements java.io.Serializable {

	// Fields

	private GlcCalId id;
	private Date glcStart;
	private Date glcEnd;
	private Boolean glcQad01;
	private Boolean glcQad04;
	private Boolean glcQad03;
	private String glcQad02;
	private String glcUser1;
	private String glcUser2;
	private Boolean glcYrEnd;
	private Double oidGlcCal;

	// Constructors

	/** default constructor */
	public AbstractGlcCal() {
	}

	/** minimal constructor */
	public AbstractGlcCal(GlcCalId id, Boolean glcYrEnd, Double oidGlcCal) {
		this.id = id;
		this.glcYrEnd = glcYrEnd;
		this.oidGlcCal = oidGlcCal;
	}

	/** full constructor */
	public AbstractGlcCal(GlcCalId id, Date glcStart, Date glcEnd,
			Boolean glcQad01, Boolean glcQad04, Boolean glcQad03,
			String glcQad02, String glcUser1, String glcUser2,
			Boolean glcYrEnd, Double oidGlcCal) {
		this.id = id;
		this.glcStart = glcStart;
		this.glcEnd = glcEnd;
		this.glcQad01 = glcQad01;
		this.glcQad04 = glcQad04;
		this.glcQad03 = glcQad03;
		this.glcQad02 = glcQad02;
		this.glcUser1 = glcUser1;
		this.glcUser2 = glcUser2;
		this.glcYrEnd = glcYrEnd;
		this.oidGlcCal = oidGlcCal;
	}

	// Property accessors

	public GlcCalId getId() {
		return this.id;
	}

	public void setId(GlcCalId id) {
		this.id = id;
	}

	public Date getGlcStart() {
		return this.glcStart;
	}

	public void setGlcStart(Date glcStart) {
		this.glcStart = glcStart;
	}

	public Date getGlcEnd() {
		return this.glcEnd;
	}

	public void setGlcEnd(Date glcEnd) {
		this.glcEnd = glcEnd;
	}

	public Boolean getGlcQad01() {
		return this.glcQad01;
	}

	public void setGlcQad01(Boolean glcQad01) {
		this.glcQad01 = glcQad01;
	}

	public Boolean getGlcQad04() {
		return this.glcQad04;
	}

	public void setGlcQad04(Boolean glcQad04) {
		this.glcQad04 = glcQad04;
	}

	public Boolean getGlcQad03() {
		return this.glcQad03;
	}

	public void setGlcQad03(Boolean glcQad03) {
		this.glcQad03 = glcQad03;
	}

	public String getGlcQad02() {
		return this.glcQad02;
	}

	public void setGlcQad02(String glcQad02) {
		this.glcQad02 = glcQad02;
	}

	public String getGlcUser1() {
		return this.glcUser1;
	}

	public void setGlcUser1(String glcUser1) {
		this.glcUser1 = glcUser1;
	}

	public String getGlcUser2() {
		return this.glcUser2;
	}

	public void setGlcUser2(String glcUser2) {
		this.glcUser2 = glcUser2;
	}

	public Boolean getGlcYrEnd() {
		return this.glcYrEnd;
	}

	public void setGlcYrEnd(Boolean glcYrEnd) {
		this.glcYrEnd = glcYrEnd;
	}

	public Double getOidGlcCal() {
		return this.oidGlcCal;
	}

	public void setOidGlcCal(Double oidGlcCal) {
		this.oidGlcCal = oidGlcCal;
	}

}