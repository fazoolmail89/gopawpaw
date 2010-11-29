package com.gopawpaw.erp.hibernate.a;

/**
 * AcdfMstrId entity. @author MyEclipse Persistence Tools
 */
public class AcdfMstrId extends AbstractAcdfMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AcdfMstrId() {
	}

	/** full constructor */
	public AcdfMstrId(String acdfDomain, String acdfModule, String acdfType,
			String acdfKey1, String acdfKey2, String acdfKey3, String acdfKey4,
			String acdfKey5, String acdfKey6) {
		super(acdfDomain, acdfModule, acdfType, acdfKey1, acdfKey2, acdfKey3,
				acdfKey4, acdfKey5, acdfKey6);
	}

}
