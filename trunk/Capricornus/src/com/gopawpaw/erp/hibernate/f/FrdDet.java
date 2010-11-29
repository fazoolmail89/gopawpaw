package com.gopawpaw.erp.hibernate.f;

/**
 * FrdDet entity. @author MyEclipse Persistence Tools
 */
public class FrdDet extends AbstractFrdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FrdDet() {
	}

	/** minimal constructor */
	public FrdDet(FrdDetId id, Double oidFrdDet) {
		super(id, oidFrdDet);
	}

	/** full constructor */
	public FrdDet(FrdDetId id, Double frdRate, String frdUser1,
			String frdUser2, String frdQadc01, Double oidFrdDet) {
		super(id, frdRate, frdUser1, frdUser2, frdQadc01, oidFrdDet);
	}

}
