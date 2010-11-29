package com.gopawpaw.erp.hibernate.a;

/**
 * AcmMstrId entity. @author MyEclipse Persistence Tools
 */
public class AcmMstrId extends AbstractAcmMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AcmMstrId() {
	}

	/** minimal constructor */
	public AcmMstrId(String acmMethod, String acmDomain, Double oidAcmMstr) {
		super(acmMethod, acmDomain, oidAcmMstr);
	}

	/** full constructor */
	public AcmMstrId(String acmSite, String acmPart, String acmProdLine,
			String acmMethod, String acmUser1, String acmUser2,
			String acmQadc01, String acmDomain, Double oidAcmMstr) {
		super(acmSite, acmPart, acmProdLine, acmMethod, acmUser1, acmUser2,
				acmQadc01, acmDomain, oidAcmMstr);
	}

}
