package com.gopawpaw.erp.hibernate.f;

/**
 * Fp1PlanId entity. @author MyEclipse Persistence Tools
 */
public class Fp1PlanId extends AbstractFp1PlanId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Fp1PlanId() {
	}

	/** minimal constructor */
	public Fp1PlanId(String fp1Domain) {
		super(fp1Domain);
	}

	/** full constructor */
	public Fp1PlanId(String fp1Domain, String fp1Site, String fp1Part,
			Integer fp1Year) {
		super(fp1Domain, fp1Site, fp1Part, fp1Year);
	}

}
