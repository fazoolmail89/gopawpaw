package com.gopawpaw.erp.hibernate.g;

/**
 * GralDet entity. @author MyEclipse Persistence Tools
 */
public class GralDet extends AbstractGralDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GralDet() {
	}

	/** minimal constructor */
	public GralDet(GralDetId id, Double oidGralDet) {
		super(id, oidGralDet);
	}

	/** full constructor */
	public GralDet(GralDetId id, String gralUser1, String gralUser2,
			String gralQadc01, Double oidGralDet) {
		super(id, gralUser1, gralUser2, gralQadc01, oidGralDet);
	}

}
