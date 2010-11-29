package com.gopawpaw.erp.hibernate.g;

/**
 * GrvDet entity. @author MyEclipse Persistence Tools
 */
public class GrvDet extends AbstractGrvDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrvDet() {
	}

	/** minimal constructor */
	public GrvDet(GrvDetId id, Double oidGrvDet) {
		super(id, oidGrvDet);
	}

	/** full constructor */
	public GrvDet(GrvDetId id, String grvUser1, String grvUser2,
			String grvQadc01, Double oidGrvDet) {
		super(id, grvUser1, grvUser2, grvQadc01, oidGrvDet);
	}

}
