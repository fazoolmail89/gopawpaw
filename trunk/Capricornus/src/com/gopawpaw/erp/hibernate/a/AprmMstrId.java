package com.gopawpaw.erp.hibernate.a;

/**
 * AprmMstrId entity. @author MyEclipse Persistence Tools
 */
public class AprmMstrId extends AbstractAprmMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AprmMstrId() {
	}

	/** minimal constructor */
	public AprmMstrId(String aprmDomain) {
		super(aprmDomain);
	}

	/** full constructor */
	public AprmMstrId(String aprmDomain, String aprmAppId, String aprmDocStd,
			String aprmMthdName, Integer aprmSeq) {
		super(aprmDomain, aprmAppId, aprmDocStd, aprmMthdName, aprmSeq);
	}

}
