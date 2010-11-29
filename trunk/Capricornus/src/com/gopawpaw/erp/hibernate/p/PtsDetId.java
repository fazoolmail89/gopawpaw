package com.gopawpaw.erp.hibernate.p;

/**
 * PtsDetId entity. @author MyEclipse Persistence Tools
 */
public class PtsDetId extends AbstractPtsDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtsDetId() {
	}

	/** minimal constructor */
	public PtsDetId(String ptsDomain) {
		super(ptsDomain);
	}

	/** full constructor */
	public PtsDetId(String ptsDomain, String ptsPart, String ptsPar,
			String ptsSubPart) {
		super(ptsDomain, ptsPart, ptsPar, ptsSubPart);
	}

}
