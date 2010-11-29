package com.gopawpaw.erp.hibernate.t;

/**
 * TrcsDetId entity. @author MyEclipse Persistence Tools
 */
public class TrcsDetId extends AbstractTrcsDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TrcsDetId() {
	}

	/** minimal constructor */
	public TrcsDetId(String trcsDomain) {
		super(trcsDomain);
	}

	/** full constructor */
	public TrcsDetId(String trcsDomain, Integer trcsTrnbr, String trcsSet) {
		super(trcsDomain, trcsTrnbr, trcsSet);
	}

}
