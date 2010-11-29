package com.gopawpaw.erp.hibernate.a;

/**
 * AcxMstrId entity. @author MyEclipse Persistence Tools
 */
public class AcxMstrId extends AbstractAcxMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AcxMstrId() {
	}

	/** minimal constructor */
	public AcxMstrId(String acxDomain) {
		super(acxDomain);
	}

	/** full constructor */
	public AcxMstrId(String acxDomain, String acxEntity, String acxToEnt,
			String acxAcc, String acxSub, String acxCc) {
		super(acxDomain, acxEntity, acxToEnt, acxAcc, acxSub, acxCc);
	}

}
