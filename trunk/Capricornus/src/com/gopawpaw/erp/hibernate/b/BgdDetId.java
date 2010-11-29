package com.gopawpaw.erp.hibernate.b;

/**
 * BgdDetId entity. @author MyEclipse Persistence Tools
 */
public class BgdDetId extends AbstractBgdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BgdDetId() {
	}

	/** minimal constructor */
	public BgdDetId(String bgdDomain) {
		super(bgdDomain);
	}

	/** full constructor */
	public BgdDetId(String bgdDomain, String bgdCode, String bgdEntity,
			String bgdAcc, String bgdSub, String bgdCc, Integer bgdFpos,
			String bgdProject, Integer bgdYear, Integer bgdPer) {
		super(bgdDomain, bgdCode, bgdEntity, bgdAcc, bgdSub, bgdCc, bgdFpos,
				bgdProject, bgdYear, bgdPer);
	}

}
