package com.gopawpaw.erp.hibernate.i;

/**
 * IdhlcHistId entity. @author MyEclipse Persistence Tools
 */
public class IdhlcHistId extends AbstractIdhlcHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IdhlcHistId() {
	}

	/** full constructor */
	public IdhlcHistId(String idhlcDomain, String idhlcInvNbr, String idhlcNbr,
			Integer idhlcLine, Integer idhlcSubLine) {
		super(idhlcDomain, idhlcInvNbr, idhlcNbr, idhlcLine, idhlcSubLine);
	}

}
