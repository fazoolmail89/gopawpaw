package com.gopawpaw.erp.hibernate.g;

/**
 * GrvDetId entity. @author MyEclipse Persistence Tools
 */
public class GrvDetId extends AbstractGrvDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrvDetId() {
	}

	/** minimal constructor */
	public GrvDetId(String grvDomain) {
		super(grvDomain);
	}

	/** full constructor */
	public GrvDetId(String grvDomain, String grvAcc, String grvSub,
			String grvCc, String grvEntity, String grvProject) {
		super(grvDomain, grvAcc, grvSub, grvCc, grvEntity, grvProject);
	}

}
