package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAbscDet entity provides the base persistence definition of the
 * AbscDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbscDet implements java.io.Serializable {

	// Fields

	private AbscDetId id;
	private String abscCarrier;
	private String abscUser1;
	private String abscUser2;
	private String abscQadc01;
	private Double oidAbscDet;

	// Constructors

	/** default constructor */
	public AbstractAbscDet() {
	}

	/** minimal constructor */
	public AbstractAbscDet(AbscDetId id, String abscCarrier, Double oidAbscDet) {
		this.id = id;
		this.abscCarrier = abscCarrier;
		this.oidAbscDet = oidAbscDet;
	}

	/** full constructor */
	public AbstractAbscDet(AbscDetId id, String abscCarrier, String abscUser1,
			String abscUser2, String abscQadc01, Double oidAbscDet) {
		this.id = id;
		this.abscCarrier = abscCarrier;
		this.abscUser1 = abscUser1;
		this.abscUser2 = abscUser2;
		this.abscQadc01 = abscQadc01;
		this.oidAbscDet = oidAbscDet;
	}

	// Property accessors

	public AbscDetId getId() {
		return this.id;
	}

	public void setId(AbscDetId id) {
		this.id = id;
	}

	public String getAbscCarrier() {
		return this.abscCarrier;
	}

	public void setAbscCarrier(String abscCarrier) {
		this.abscCarrier = abscCarrier;
	}

	public String getAbscUser1() {
		return this.abscUser1;
	}

	public void setAbscUser1(String abscUser1) {
		this.abscUser1 = abscUser1;
	}

	public String getAbscUser2() {
		return this.abscUser2;
	}

	public void setAbscUser2(String abscUser2) {
		this.abscUser2 = abscUser2;
	}

	public String getAbscQadc01() {
		return this.abscQadc01;
	}

	public void setAbscQadc01(String abscQadc01) {
		this.abscQadc01 = abscQadc01;
	}

	public Double getOidAbscDet() {
		return this.oidAbscDet;
	}

	public void setOidAbscDet(Double oidAbscDet) {
		this.oidAbscDet = oidAbscDet;
	}

}