package com.gopawpaw.erp.hibernate.a;

/**
 * AnsDetId entity. @author MyEclipse Persistence Tools
 */
public class AnsDetId extends AbstractAnsDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AnsDetId() {
	}

	/** minimal constructor */
	public AnsDetId(String ansDomain) {
		super(ansDomain);
	}

	/** full constructor */
	public AnsDetId(String ansDomain, String ansType, String ansCode,
			String ansField, String ansSelLow) {
		super(ansDomain, ansType, ansCode, ansField, ansSelLow);
	}

}
