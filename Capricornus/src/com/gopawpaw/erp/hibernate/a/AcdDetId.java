package com.gopawpaw.erp.hibernate.a;

/**
 * AcdDetId entity. @author MyEclipse Persistence Tools
 */
public class AcdDetId extends AbstractAcdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AcdDetId() {
	}

	/** minimal constructor */
	public AcdDetId(String acdDomain) {
		super(acdDomain);
	}

	/** full constructor */
	public AcdDetId(String acdDomain, String acdAcc, String acdSub,
			String acdCc, String acdProject, String acdEntity, Integer acdYear,
			Integer acdPer) {
		super(acdDomain, acdAcc, acdSub, acdCc, acdProject, acdEntity, acdYear,
				acdPer);
	}

}
