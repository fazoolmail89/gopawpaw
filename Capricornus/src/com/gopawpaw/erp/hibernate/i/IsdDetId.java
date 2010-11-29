package com.gopawpaw.erp.hibernate.i;

/**
 * IsdDetId entity. @author MyEclipse Persistence Tools
 */
public class IsdDetId extends AbstractIsdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IsdDetId() {
	}

	/** minimal constructor */
	public IsdDetId(String isdDomain) {
		super(isdDomain);
	}

	/** full constructor */
	public IsdDetId(String isdDomain, String isdStatus, String isdTrType,
			String isdType) {
		super(isdDomain, isdStatus, isdTrType, isdType);
	}

}
