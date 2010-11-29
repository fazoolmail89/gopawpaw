package com.gopawpaw.erp.hibernate.s;

/**
 * ShpdHistId entity. @author MyEclipse Persistence Tools
 */
public class ShpdHistId extends AbstractShpdHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShpdHistId() {
	}

	/** full constructor */
	public ShpdHistId(String shpdDomain, Integer shpdTranId,
			Integer shpdMeasurementType, Integer shpdMeasSubtype) {
		super(shpdDomain, shpdTranId, shpdMeasurementType, shpdMeasSubtype);
	}

}
