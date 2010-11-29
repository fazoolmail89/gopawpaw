package com.gopawpaw.erp.hibernate.m;

/**
 * MrppDetId entity. @author MyEclipse Persistence Tools
 */
public class MrppDetId extends AbstractMrppDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MrppDetId() {
	}

	/** full constructor */
	public MrppDetId(String mrppDomain, Integer mrppDemandMrpKeyid,
			Integer mrppSupplyMrpKeyid) {
		super(mrppDomain, mrppDemandMrpKeyid, mrppSupplyMrpKeyid);
	}

}
