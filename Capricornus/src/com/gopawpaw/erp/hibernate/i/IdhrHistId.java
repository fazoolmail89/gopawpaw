package com.gopawpaw.erp.hibernate.i;

/**
 * IdhrHistId entity. @author MyEclipse Persistence Tools
 */
public class IdhrHistId extends AbstractIdhrHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IdhrHistId() {
	}

	/** minimal constructor */
	public IdhrHistId(String idhrDomain) {
		super(idhrDomain);
	}

	/** full constructor */
	public IdhrHistId(String idhrDomain, String idhrInvNbr, String idhrNbr,
			Integer idhrLine, Integer idhrSeq) {
		super(idhrDomain, idhrInvNbr, idhrNbr, idhrLine, idhrSeq);
	}

}
