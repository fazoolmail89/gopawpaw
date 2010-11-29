package com.gopawpaw.erp.hibernate.v;

/**
 * VecdDetId entity. @author MyEclipse Persistence Tools
 */
public class VecdDetId extends AbstractVecdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public VecdDetId() {
	}

	/** full constructor */
	public VecdDetId(String vecdDomain, String vecdCategory,
			Double vecdValueFrom) {
		super(vecdDomain, vecdCategory, vecdValueFrom);
	}

}
