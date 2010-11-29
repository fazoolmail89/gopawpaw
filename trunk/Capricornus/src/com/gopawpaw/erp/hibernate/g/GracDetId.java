package com.gopawpaw.erp.hibernate.g;

/**
 * GracDetId entity. @author MyEclipse Persistence Tools
 */
public class GracDetId extends AbstractGracDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GracDetId() {
	}

	/** minimal constructor */
	public GracDetId(String gracDomain) {
		super(gracDomain);
	}

	/** full constructor */
	public GracDetId(String gracDomain, Integer gracYear, Integer gracPer,
			String gracAcc, String gracSub, String gracCc, String gracEntity,
			String gracProject) {
		super(gracDomain, gracYear, gracPer, gracAcc, gracSub, gracCc,
				gracEntity, gracProject);
	}

}
