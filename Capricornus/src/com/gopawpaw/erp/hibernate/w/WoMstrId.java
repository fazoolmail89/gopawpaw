package com.gopawpaw.erp.hibernate.w;

/**
 * WoMstrId entity. @author MyEclipse Persistence Tools
 */
public class WoMstrId extends AbstractWoMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WoMstrId() {
	}

	/** minimal constructor */
	public WoMstrId(String woDomain, String woNbr) {
		super(woDomain, woNbr);
	}

	/** full constructor */
	public WoMstrId(String woDomain, String woNbr, String woLot) {
		super(woDomain, woNbr, woLot);
	}

}
