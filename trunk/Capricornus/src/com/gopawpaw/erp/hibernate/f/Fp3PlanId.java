package com.gopawpaw.erp.hibernate.f;

/**
 * Fp3PlanId entity. @author MyEclipse Persistence Tools
 */
public class Fp3PlanId extends AbstractFp3PlanId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Fp3PlanId() {
	}

	/** minimal constructor */
	public Fp3PlanId(String fp3Domain) {
		super(fp3Domain);
	}

	/** full constructor */
	public Fp3PlanId(String fp3Domain, String fp3Site, String fp3Part,
			Integer fp3Year) {
		super(fp3Domain, fp3Site, fp3Part, fp3Year);
	}

}
