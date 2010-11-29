package com.gopawpaw.erp.hibernate.b;

/**
 * BgMstrId entity. @author MyEclipse Persistence Tools
 */
public class BgMstrId extends AbstractBgMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BgMstrId() {
	}

	/** minimal constructor */
	public BgMstrId(String bgDomain) {
		super(bgDomain);
	}

	/** full constructor */
	public BgMstrId(String bgDomain, String bgCode, String bgEntity,
			String bgAcc, String bgSub, String bgCc, Integer bgFpos,
			String bgProject) {
		super(bgDomain, bgCode, bgEntity, bgAcc, bgSub, bgCc, bgFpos, bgProject);
	}

}
