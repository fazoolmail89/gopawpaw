package com.gopawpaw.erp.hibernate.p;

/**
 * PihHistId entity. @author MyEclipse Persistence Tools
 */
public class PihHistId extends AbstractPihHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PihHistId() {
	}

	/** minimal constructor */
	public PihHistId(String pihDomain) {
		super(pihDomain);
	}

	/** full constructor */
	public PihHistId(String pihDomain, Integer pihDocType, String pihNbr,
			Integer pihLine, Boolean pihConfgDisc, String pihSource,
			String pihListId, String pihAmtType, String pihParent,
			String pihFeature, String pihOption) {
		super(pihDomain, pihDocType, pihNbr, pihLine, pihConfgDisc, pihSource,
				pihListId, pihAmtType, pihParent, pihFeature, pihOption);
	}

}
