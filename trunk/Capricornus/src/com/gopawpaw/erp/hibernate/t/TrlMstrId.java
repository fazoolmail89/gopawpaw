package com.gopawpaw.erp.hibernate.t;

/**
 * TrlMstrId entity. @author MyEclipse Persistence Tools
 */
public class TrlMstrId extends AbstractTrlMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TrlMstrId() {
	}

	/** minimal constructor */
	public TrlMstrId(String trlDomain) {
		super(trlDomain);
	}

	/** full constructor */
	public TrlMstrId(String trlDomain, String trlCode) {
		super(trlDomain, trlCode);
	}

}
