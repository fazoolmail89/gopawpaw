package com.gopawpaw.erp.hibernate.k;

/**
 * KbtrdDetId entity. @author MyEclipse Persistence Tools
 */
public class KbtrdDetId extends AbstractKbtrdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KbtrdDetId() {
	}

	/** full constructor */
	public KbtrdDetId(String kbtrdDomain, String kbtrdDataset,
			Integer kbtrdKbtrTransNbr, Integer kbtrdTrTrnbr) {
		super(kbtrdDomain, kbtrdDataset, kbtrdKbtrTransNbr, kbtrdTrTrnbr);
	}

}
