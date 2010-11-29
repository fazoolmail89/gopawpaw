package com.gopawpaw.erp.hibernate.w;

/**
 * WodDetId entity. @author MyEclipse Persistence Tools
 */
public class WodDetId extends AbstractWodDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WodDetId() {
	}

	/** minimal constructor */
	public WodDetId(String wodDomain) {
		super(wodDomain);
	}

	/** full constructor */
	public WodDetId(String wodDomain, String wodLot, String wodPart,
			Integer wodOp) {
		super(wodDomain, wodLot, wodPart, wodOp);
	}

}
