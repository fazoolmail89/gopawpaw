package com.gopawpaw.erp.hibernate.v;

/**
 * VpoDetId entity. @author MyEclipse Persistence Tools
 */
public class VpoDetId extends AbstractVpoDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VpoDetId() {
	}

	/** minimal constructor */
	public VpoDetId(String vpoDomain) {
		super(vpoDomain);
	}

	/** full constructor */
	public VpoDetId(String vpoDomain, String vpoRef, String vpoPo) {
		super(vpoDomain, vpoRef, vpoPo);
	}

}
