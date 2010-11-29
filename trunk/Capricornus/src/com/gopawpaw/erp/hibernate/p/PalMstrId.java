package com.gopawpaw.erp.hibernate.p;

/**
 * PalMstrId entity. @author MyEclipse Persistence Tools
 */
public class PalMstrId extends AbstractPalMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PalMstrId() {
	}

	/** minimal constructor */
	public PalMstrId(String palDomain) {
		super(palDomain);
	}

	/** full constructor */
	public PalMstrId(String palDomain, String palPallet) {
		super(palDomain, palPallet);
	}

}
