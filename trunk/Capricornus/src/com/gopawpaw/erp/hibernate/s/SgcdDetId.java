package com.gopawpaw.erp.hibernate.s;

/**
 * SgcdDetId entity. @author MyEclipse Persistence Tools
 */
public class SgcdDetId extends AbstractSgcdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SgcdDetId() {
	}

	/** full constructor */
	public SgcdDetId(String sgcdDomain, String sgcdGrp, String sgcdInvMov,
			Integer sgcdSeq) {
		super(sgcdDomain, sgcdGrp, sgcdInvMov, sgcdSeq);
	}

}
