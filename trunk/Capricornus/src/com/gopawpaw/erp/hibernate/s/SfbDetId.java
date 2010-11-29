package com.gopawpaw.erp.hibernate.s;

/**
 * SfbDetId entity. @author MyEclipse Persistence Tools
 */
public class SfbDetId extends AbstractSfbDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SfbDetId() {
	}

	/** minimal constructor */
	public SfbDetId(String sfbDomain) {
		super(sfbDomain);
	}

	/** full constructor */
	public SfbDetId(String sfbDomain, String sfbNbr, Integer sfbSoLine,
			Integer sfbPtType, String sfbFisSort, Integer sfbLine) {
		super(sfbDomain, sfbNbr, sfbSoLine, sfbPtType, sfbFisSort, sfbLine);
	}

}
