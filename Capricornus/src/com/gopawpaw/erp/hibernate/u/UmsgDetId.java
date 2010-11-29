package com.gopawpaw.erp.hibernate.u;

/**
 * UmsgDetId entity. @author MyEclipse Persistence Tools
 */
public class UmsgDetId extends AbstractUmsgDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public UmsgDetId() {
	}

	/** minimal constructor */
	public UmsgDetId(String umsgDomain) {
		super(umsgDomain);
	}

	/** full constructor */
	public UmsgDetId(String umsgDomain, String umsgLang, String umsgSite,
			String umsgAddr, String umsgCallPgm, Integer umsgNbr,
			Integer umsgSeq) {
		super(umsgDomain, umsgLang, umsgSite, umsgAddr, umsgCallPgm, umsgNbr,
				umsgSeq);
	}

}
