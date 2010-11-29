package com.gopawpaw.erp.hibernate.f;

/**
 * FabaDetId entity. @author MyEclipse Persistence Tools
 */
public class FabaDetId extends AbstractFabaDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FabaDetId() {
	}

	/** full constructor */
	public FabaDetId(String fabaDomain, String fabaFaId, String fabaAcctype,
			Integer fabaGlseq) {
		super(fabaDomain, fabaFaId, fabaAcctype, fabaGlseq);
	}

}
