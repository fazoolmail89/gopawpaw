package com.gopawpaw.erp.hibernate.g;

/**
 * GrqdDet entity. @author MyEclipse Persistence Tools
 */
public class GrqdDet extends AbstractGrqdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrqdDet() {
	}

	/** minimal constructor */
	public GrqdDet(GrqdDetId id, Double oidGrqdDet) {
		super(id, oidGrqdDet);
	}

	/** full constructor */
	public GrqdDet(GrqdDetId id, Integer grqdPerStart, String grqdUser1,
			String grqdUser2, Integer grqdPerEnd, String grqdQadc01,
			Double oidGrqdDet) {
		super(id, grqdPerStart, grqdUser1, grqdUser2, grqdPerEnd, grqdQadc01,
				oidGrqdDet);
	}

}
