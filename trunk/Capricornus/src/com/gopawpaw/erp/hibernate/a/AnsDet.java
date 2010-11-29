package com.gopawpaw.erp.hibernate.a;

/**
 * AnsDet entity. @author MyEclipse Persistence Tools
 */
public class AnsDet extends AbstractAnsDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AnsDet() {
	}

	/** minimal constructor */
	public AnsDet(AnsDetId id, Double oidAnsDet) {
		super(id, oidAnsDet);
	}

	/** full constructor */
	public AnsDet(AnsDetId id, Boolean ansInclude, String ansMask,
			String ansSelHigh, String ansUser1, String ansUser2,
			String ansQadc01, Double ansQadd01, Double oidAnsDet) {
		super(id, ansInclude, ansMask, ansSelHigh, ansUser1, ansUser2,
				ansQadc01, ansQadd01, oidAnsDet);
	}

}
