package com.gopawpaw.erp.hibernate.e;

/**
 * EmsgMstrId entity. @author MyEclipse Persistence Tools
 */
public class EmsgMstrId extends AbstractEmsgMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EmsgMstrId() {
	}

	/** minimal constructor */
	public EmsgMstrId(String emsgDomain) {
		super(emsgDomain);
	}

	/** full constructor */
	public EmsgMstrId(String emsgDomain, Integer emsgTrnbr) {
		super(emsgDomain, emsgTrnbr);
	}

}
