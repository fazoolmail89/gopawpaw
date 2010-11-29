package com.gopawpaw.erp.hibernate.a;

/**
 * AudDetId entity. @author MyEclipse Persistence Tools
 */
public class AudDetId extends AbstractAudDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AudDetId() {
	}

	/** minimal constructor */
	public AudDetId(String audDomain) {
		super(audDomain);
	}

	/** full constructor */
	public AudDetId(String audDomain, Integer audEntry) {
		super(audDomain, audEntry);
	}

}
