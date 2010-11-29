package com.gopawpaw.erp.hibernate.t;

/**
 * TzodDetId entity. @author MyEclipse Persistence Tools
 */
public class TzodDetId extends AbstractTzodDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TzodDetId() {
	}

	/** full constructor */
	public TzodDetId(String tzodTzone, String tzodStdDay, Integer tzodSyear,
			Integer tzodEyear) {
		super(tzodTzone, tzodStdDay, tzodSyear, tzodEyear);
	}

}
