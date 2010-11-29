package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAnsDet entity provides the base persistence definition of the AnsDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAnsDet implements java.io.Serializable {

	// Fields

	private AnsDetId id;
	private Boolean ansInclude;
	private String ansMask;
	private String ansSelHigh;
	private String ansUser1;
	private String ansUser2;
	private String ansQadc01;
	private Double ansQadd01;
	private Double oidAnsDet;

	// Constructors

	/** default constructor */
	public AbstractAnsDet() {
	}

	/** minimal constructor */
	public AbstractAnsDet(AnsDetId id, Double oidAnsDet) {
		this.id = id;
		this.oidAnsDet = oidAnsDet;
	}

	/** full constructor */
	public AbstractAnsDet(AnsDetId id, Boolean ansInclude, String ansMask,
			String ansSelHigh, String ansUser1, String ansUser2,
			String ansQadc01, Double ansQadd01, Double oidAnsDet) {
		this.id = id;
		this.ansInclude = ansInclude;
		this.ansMask = ansMask;
		this.ansSelHigh = ansSelHigh;
		this.ansUser1 = ansUser1;
		this.ansUser2 = ansUser2;
		this.ansQadc01 = ansQadc01;
		this.ansQadd01 = ansQadd01;
		this.oidAnsDet = oidAnsDet;
	}

	// Property accessors

	public AnsDetId getId() {
		return this.id;
	}

	public void setId(AnsDetId id) {
		this.id = id;
	}

	public Boolean getAnsInclude() {
		return this.ansInclude;
	}

	public void setAnsInclude(Boolean ansInclude) {
		this.ansInclude = ansInclude;
	}

	public String getAnsMask() {
		return this.ansMask;
	}

	public void setAnsMask(String ansMask) {
		this.ansMask = ansMask;
	}

	public String getAnsSelHigh() {
		return this.ansSelHigh;
	}

	public void setAnsSelHigh(String ansSelHigh) {
		this.ansSelHigh = ansSelHigh;
	}

	public String getAnsUser1() {
		return this.ansUser1;
	}

	public void setAnsUser1(String ansUser1) {
		this.ansUser1 = ansUser1;
	}

	public String getAnsUser2() {
		return this.ansUser2;
	}

	public void setAnsUser2(String ansUser2) {
		this.ansUser2 = ansUser2;
	}

	public String getAnsQadc01() {
		return this.ansQadc01;
	}

	public void setAnsQadc01(String ansQadc01) {
		this.ansQadc01 = ansQadc01;
	}

	public Double getAnsQadd01() {
		return this.ansQadd01;
	}

	public void setAnsQadd01(Double ansQadd01) {
		this.ansQadd01 = ansQadd01;
	}

	public Double getOidAnsDet() {
		return this.oidAnsDet;
	}

	public void setOidAnsDet(Double oidAnsDet) {
		this.oidAnsDet = oidAnsDet;
	}

}