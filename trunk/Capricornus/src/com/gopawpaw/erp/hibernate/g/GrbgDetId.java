package com.gopawpaw.erp.hibernate.g;

/**
 * GrbgDetId entity. @author MyEclipse Persistence Tools
 */
public class GrbgDetId extends AbstractGrbgDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrbgDetId() {
	}

	/** minimal constructor */
	public GrbgDetId(String grbgDomain) {
		super(grbgDomain);
	}

	/** full constructor */
	public GrbgDetId(String grbgDomain, String grbgCode, Integer grbgYear,
			Integer grbgPer, String grbgAcc, String grbgSub, String grbgCc,
			String grbgEntity, String grbgProject) {
		super(grbgDomain, grbgCode, grbgYear, grbgPer, grbgAcc, grbgSub,
				grbgCc, grbgEntity, grbgProject);
	}

}
