package com.gopawpaw.erp.hibernate.d;

/**
 * DjrcDetId entity. @author MyEclipse Persistence Tools
 */
public class DjrcDetId extends AbstractDjrcDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DjrcDetId() {
	}

	/** full constructor */
	public DjrcDetId(String djrcDomain, String djrcCode, String djrcType,
			Integer djrcOrder, String djrcElement) {
		super(djrcDomain, djrcCode, djrcType, djrcOrder, djrcElement);
	}

}
