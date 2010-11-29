package com.gopawpaw.erp.hibernate.a;

/**
 * AnMstrId entity. @author MyEclipse Persistence Tools
 */
public class AnMstrId extends AbstractAnMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AnMstrId() {
	}

	/** minimal constructor */
	public AnMstrId(String anDomain, String anCode) {
		super(anDomain, anCode);
	}

	/** full constructor */
	public AnMstrId(String anDomain, String anType, String anCode) {
		super(anDomain, anType, anCode);
	}

}
