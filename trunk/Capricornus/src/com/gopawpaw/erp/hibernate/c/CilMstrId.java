package com.gopawpaw.erp.hibernate.c;

/**
 * CilMstrId entity. @author MyEclipse Persistence Tools
 */
public class CilMstrId extends AbstractCilMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CilMstrId() {
	}

	/** full constructor */
	public CilMstrId(String cilDomain, String cilCorInv, String cilCorSoNbr) {
		super(cilDomain, cilCorInv, cilCorSoNbr);
	}

}
