package com.gopawpaw.erp.hibernate.g;

/**
 * GrasDet entity. @author MyEclipse Persistence Tools
 */
public class GrasDet extends AbstractGrasDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrasDet() {
	}

	/** minimal constructor */
	public GrasDet(GrasDetId id, Double oidGrasDet) {
		super(id, oidGrasDet);
	}

	/** full constructor */
	public GrasDet(GrasDetId id, String grasUser1, String grasUser2,
			String grasQadc01, Double oidGrasDet) {
		super(id, grasUser1, grasUser2, grasQadc01, oidGrasDet);
	}

}
