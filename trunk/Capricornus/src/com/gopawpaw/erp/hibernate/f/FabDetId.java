package com.gopawpaw.erp.hibernate.f;

/**
 * FabDetId entity. @author MyEclipse Persistence Tools
 */
public class FabDetId extends AbstractFabDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FabDetId() {
	}

	/** full constructor */
	public FabDetId(String fabDomain, String fabFaId, Integer fabFabkSeq,
			String fabFabkId, Integer fabResrv) {
		super(fabDomain, fabFaId, fabFabkSeq, fabFabkId, fabResrv);
	}

}
