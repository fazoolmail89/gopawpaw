package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAnlDet entity provides the base persistence definition of the AnlDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAnlDet implements java.io.Serializable {

	// Fields

	private AnlDetId id;
	private String anlDesc;
	private String anlUser1;
	private String anlUser2;
	private String anlQadc01;
	private Double anlQadd01;
	private Double oidAnlDet;

	// Constructors

	/** default constructor */
	public AbstractAnlDet() {
	}

	/** minimal constructor */
	public AbstractAnlDet(AnlDetId id, Double oidAnlDet) {
		this.id = id;
		this.oidAnlDet = oidAnlDet;
	}

	/** full constructor */
	public AbstractAnlDet(AnlDetId id, String anlDesc, String anlUser1,
			String anlUser2, String anlQadc01, Double anlQadd01,
			Double oidAnlDet) {
		this.id = id;
		this.anlDesc = anlDesc;
		this.anlUser1 = anlUser1;
		this.anlUser2 = anlUser2;
		this.anlQadc01 = anlQadc01;
		this.anlQadd01 = anlQadd01;
		this.oidAnlDet = oidAnlDet;
	}

	// Property accessors

	public AnlDetId getId() {
		return this.id;
	}

	public void setId(AnlDetId id) {
		this.id = id;
	}

	public String getAnlDesc() {
		return this.anlDesc;
	}

	public void setAnlDesc(String anlDesc) {
		this.anlDesc = anlDesc;
	}

	public String getAnlUser1() {
		return this.anlUser1;
	}

	public void setAnlUser1(String anlUser1) {
		this.anlUser1 = anlUser1;
	}

	public String getAnlUser2() {
		return this.anlUser2;
	}

	public void setAnlUser2(String anlUser2) {
		this.anlUser2 = anlUser2;
	}

	public String getAnlQadc01() {
		return this.anlQadc01;
	}

	public void setAnlQadc01(String anlQadc01) {
		this.anlQadc01 = anlQadc01;
	}

	public Double getAnlQadd01() {
		return this.anlQadd01;
	}

	public void setAnlQadd01(Double anlQadd01) {
		this.anlQadd01 = anlQadd01;
	}

	public Double getOidAnlDet() {
		return this.oidAnlDet;
	}

	public void setOidAnlDet(Double oidAnlDet) {
		this.oidAnlDet = oidAnlDet;
	}

}