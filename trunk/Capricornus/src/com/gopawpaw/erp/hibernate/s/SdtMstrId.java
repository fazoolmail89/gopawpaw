package com.gopawpaw.erp.hibernate.s;

/**
 * SdtMstrId entity. @author MyEclipse Persistence Tools
 */
public class SdtMstrId extends AbstractSdtMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SdtMstrId() {
	}

	/** full constructor */
	public SdtMstrId(String sdtDomain, String sdtCode) {
		super(sdtDomain, sdtCode);
	}

}
