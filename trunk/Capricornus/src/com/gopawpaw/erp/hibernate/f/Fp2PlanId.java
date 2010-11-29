package com.gopawpaw.erp.hibernate.f;

/**
 * Fp2PlanId entity. @author MyEclipse Persistence Tools
 */
public class Fp2PlanId extends AbstractFp2PlanId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Fp2PlanId() {
	}

	/** minimal constructor */
	public Fp2PlanId(String fp2Domain) {
		super(fp2Domain);
	}

	/** full constructor */
	public Fp2PlanId(String fp2Domain, String fp2Site, String fp2Part,
			Integer fp2Year) {
		super(fp2Domain, fp2Site, fp2Part, fp2Year);
	}

}
