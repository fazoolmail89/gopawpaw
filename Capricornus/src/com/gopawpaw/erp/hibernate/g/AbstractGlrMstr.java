package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGlrMstr entity provides the base persistence definition of the
 * GlrMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlrMstr implements java.io.Serializable {

	// Fields

	private GlrMstrId id;
	private String glrTitle;
	private String glrUser1;
	private String glrUser2;
	private String glrQadc01;
	private Double oidGlrMstr;

	// Constructors

	/** default constructor */
	public AbstractGlrMstr() {
	}

	/** minimal constructor */
	public AbstractGlrMstr(GlrMstrId id, Double oidGlrMstr) {
		this.id = id;
		this.oidGlrMstr = oidGlrMstr;
	}

	/** full constructor */
	public AbstractGlrMstr(GlrMstrId id, String glrTitle, String glrUser1,
			String glrUser2, String glrQadc01, Double oidGlrMstr) {
		this.id = id;
		this.glrTitle = glrTitle;
		this.glrUser1 = glrUser1;
		this.glrUser2 = glrUser2;
		this.glrQadc01 = glrQadc01;
		this.oidGlrMstr = oidGlrMstr;
	}

	// Property accessors

	public GlrMstrId getId() {
		return this.id;
	}

	public void setId(GlrMstrId id) {
		this.id = id;
	}

	public String getGlrTitle() {
		return this.glrTitle;
	}

	public void setGlrTitle(String glrTitle) {
		this.glrTitle = glrTitle;
	}

	public String getGlrUser1() {
		return this.glrUser1;
	}

	public void setGlrUser1(String glrUser1) {
		this.glrUser1 = glrUser1;
	}

	public String getGlrUser2() {
		return this.glrUser2;
	}

	public void setGlrUser2(String glrUser2) {
		this.glrUser2 = glrUser2;
	}

	public String getGlrQadc01() {
		return this.glrQadc01;
	}

	public void setGlrQadc01(String glrQadc01) {
		this.glrQadc01 = glrQadc01;
	}

	public Double getOidGlrMstr() {
		return this.oidGlrMstr;
	}

	public void setOidGlrMstr(Double oidGlrMstr) {
		this.oidGlrMstr = oidGlrMstr;
	}

}