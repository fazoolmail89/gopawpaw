package com.gopawpaw.erp.hibernate.g;

/**
 * GrhdDet entity. @author MyEclipse Persistence Tools
 */
public class GrhdDet extends AbstractGrhdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrhdDet() {
	}

	/** minimal constructor */
	public GrhdDet(GrhdDetId id, Double oidGrhdDet) {
		super(id, oidGrhdDet);
	}

	/** full constructor */
	public GrhdDet(GrhdDetId id, Boolean grhdExplode, Integer grhdPriority,
			Integer grhdSubIndent, String grhdUser1, String grhdUser2,
			String grhdQadc01, Double oidGrhdDet) {
		super(id, grhdExplode, grhdPriority, grhdSubIndent, grhdUser1,
				grhdUser2, grhdQadc01, oidGrhdDet);
	}

}
