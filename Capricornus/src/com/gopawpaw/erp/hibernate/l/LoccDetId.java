package com.gopawpaw.erp.hibernate.l;

/**
 * LoccDetId entity. @author MyEclipse Persistence Tools
 */
public class LoccDetId extends AbstractLoccDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public LoccDetId() {
	}

	/** full constructor */
	public LoccDetId(String loccDomain, String loccSite, String loccLoc,
			String loccAddr) {
		super(loccDomain, loccSite, loccLoc, loccAddr);
	}

}
