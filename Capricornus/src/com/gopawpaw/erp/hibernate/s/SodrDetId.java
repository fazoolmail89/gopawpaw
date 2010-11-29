package com.gopawpaw.erp.hibernate.s;

/**
 * SodrDetId entity. @author MyEclipse Persistence Tools
 */
public class SodrDetId extends AbstractSodrDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SodrDetId() {
	}

	/** minimal constructor */
	public SodrDetId(String sodrDomain) {
		super(sodrDomain);
	}

	/** full constructor */
	public SodrDetId(String sodrDomain, String sodrNbr, Integer sodrLine,
			Integer sodrSeq) {
		super(sodrDomain, sodrNbr, sodrLine, sodrSeq);
	}

}
