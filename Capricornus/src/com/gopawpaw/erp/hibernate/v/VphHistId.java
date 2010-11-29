package com.gopawpaw.erp.hibernate.v;

/**
 * VphHistId entity. @author MyEclipse Persistence Tools
 */
public class VphHistId extends AbstractVphHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public VphHistId() {
	}

	/** minimal constructor */
	public VphHistId(String vphDomain, Integer vphPvodIdLine) {
		super(vphDomain, vphPvodIdLine);
	}

	/** full constructor */
	public VphHistId(String vphDomain, String vphRef, Integer vphPvoId,
			Integer vphPvodIdLine) {
		super(vphDomain, vphRef, vphPvoId, vphPvodIdLine);
	}

}
