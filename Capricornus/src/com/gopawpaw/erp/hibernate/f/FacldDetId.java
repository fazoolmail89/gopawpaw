package com.gopawpaw.erp.hibernate.f;

/**
 * FacldDetId entity. @author MyEclipse Persistence Tools
 */
public class FacldDetId extends AbstractFacldDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FacldDetId() {
	}

	/** full constructor */
	public FacldDetId(String facldDomain, String facldFaclId,
			Integer facldYear, Integer facldPer) {
		super(facldDomain, facldFaclId, facldYear, facldPer);
	}

}
