package com.gopawpaw.erp.hibernate.s;

/**
 * SdtdDetId entity. @author MyEclipse Persistence Tools
 */
public class SdtdDetId extends AbstractSdtdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SdtdDetId() {
	}

	/** full constructor */
	public SdtdDetId(String sdtdDomain, String sdtdCode, String sdtdTime) {
		super(sdtdDomain, sdtdCode, sdtdTime);
	}

}
