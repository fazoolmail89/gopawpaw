package com.gopawpaw.erp.hibernate.a;

/**
 * AldDetId entity. @author MyEclipse Persistence Tools
 */
public class AldDetId extends AbstractAldDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AldDetId() {
	}

	/** minimal constructor */
	public AldDetId(String aldDomain) {
		super(aldDomain);
	}

	/** full constructor */
	public AldDetId(String aldDomain, String aldCode, String aldAcc,
			String aldSub, String aldCc, String aldProject) {
		super(aldDomain, aldCode, aldAcc, aldSub, aldCc, aldProject);
	}

}
