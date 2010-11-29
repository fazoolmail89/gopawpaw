package com.gopawpaw.erp.hibernate.i;

/**
 * IhrHistId entity. @author MyEclipse Persistence Tools
 */
public class IhrHistId extends AbstractIhrHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IhrHistId() {
	}

	/** minimal constructor */
	public IhrHistId(String ihrDomain) {
		super(ihrDomain);
	}

	/** full constructor */
	public IhrHistId(String ihrDomain, String ihrInvNbr, String ihrNbr,
			Integer ihrSeq) {
		super(ihrDomain, ihrInvNbr, ihrNbr, ihrSeq);
	}

}
