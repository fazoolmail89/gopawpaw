package com.gopawpaw.erp.hibernate.f;

/**
 * FamtrdDetId entity. @author MyEclipse Persistence Tools
 */
public class FamtrdDetId extends AbstractFamtrdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FamtrdDetId() {
	}

	/** full constructor */
	public FamtrdDetId(String famtrdDomain, String famtrdFamtrId,
			Integer famtrdSeq) {
		super(famtrdDomain, famtrdFamtrId, famtrdSeq);
	}

}
