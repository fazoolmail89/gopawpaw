package com.gopawpaw.erp.hibernate.v;

/**
 * VodDetId entity. @author MyEclipse Persistence Tools
 */
public class VodDetId extends AbstractVodDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VodDetId() {
	}

	/** minimal constructor */
	public VodDetId(String vodDomain) {
		super(vodDomain);
	}

	/** full constructor */
	public VodDetId(String vodDomain, String vodRef, Integer vodLn) {
		super(vodDomain, vodRef, vodLn);
	}

}
