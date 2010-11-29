package com.gopawpaw.erp.hibernate.g;

/**
 * GritWkf entity. @author MyEclipse Persistence Tools
 */
public class GritWkf extends AbstractGritWkf implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GritWkf() {
	}

	/** minimal constructor */
	public GritWkf(GritWkfId id, Double oidGritWkf) {
		super(id, oidGritWkf);
	}

	/** full constructor */
	public GritWkf(GritWkfId id, String gritDesc, String gritMarker,
			String gritGlType, String gritAnCode, String gritUser1,
			String gritUser2, String gritQadc01, Double oidGritWkf) {
		super(id, gritDesc, gritMarker, gritGlType, gritAnCode, gritUser1,
				gritUser2, gritQadc01, oidGritWkf);
	}

}
