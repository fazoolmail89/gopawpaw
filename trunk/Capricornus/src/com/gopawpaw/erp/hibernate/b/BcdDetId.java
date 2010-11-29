package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * BcdDetId entity. @author MyEclipse Persistence Tools
 */
public class BcdDetId extends AbstractBcdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BcdDetId() {
	}

	/** minimal constructor */
	public BcdDetId(String bcdDomain) {
		super(bcdDomain);
	}

	/** full constructor */
	public BcdDetId(String bcdDomain, String bcdBatch, Date bcdDateSub,
			String bcdTimeSub, String bcdUserid) {
		super(bcdDomain, bcdBatch, bcdDateSub, bcdTimeSub, bcdUserid);
	}

}
