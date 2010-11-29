package com.gopawpaw.erp.hibernate.m;

/**
 * MrpDetId entity. @author MyEclipse Persistence Tools
 */
public class MrpDetId extends AbstractMrpDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MrpDetId() {
	}

	/** minimal constructor */
	public MrpDetId(String mrpDomain) {
		super(mrpDomain);
	}

	/** full constructor */
	public MrpDetId(String mrpDomain, String mrpDataset, String mrpPart,
			String mrpNbr, String mrpLine, String mrpLine2) {
		super(mrpDomain, mrpDataset, mrpPart, mrpNbr, mrpLine, mrpLine2);
	}

}
