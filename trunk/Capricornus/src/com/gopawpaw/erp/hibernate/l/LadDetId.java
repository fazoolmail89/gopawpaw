package com.gopawpaw.erp.hibernate.l;

/**
 * LadDetId entity. @author MyEclipse Persistence Tools
 */
public class LadDetId extends AbstractLadDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LadDetId() {
	}

	/** minimal constructor */
	public LadDetId(String ladDomain) {
		super(ladDomain);
	}

	/** full constructor */
	public LadDetId(String ladDomain, String ladDataset, String ladNbr,
			String ladLine, String ladPart, String ladSite, String ladLoc,
			String ladLot, String ladRef) {
		super(ladDomain, ladDataset, ladNbr, ladLine, ladPart, ladSite, ladLoc,
				ladLot, ladRef);
	}

}
