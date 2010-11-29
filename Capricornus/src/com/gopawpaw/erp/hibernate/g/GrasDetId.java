package com.gopawpaw.erp.hibernate.g;

/**
 * GrasDetId entity. @author MyEclipse Persistence Tools
 */
public class GrasDetId extends AbstractGrasDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrasDetId() {
	}

	/** minimal constructor */
	public GrasDetId(String grasDomain) {
		super(grasDomain);
	}

	/** full constructor */
	public GrasDetId(String grasDomain, String grasAnCode, String grasGlType,
			Boolean grasInclude, String grasSelLow, String grasSelHigh) {
		super(grasDomain, grasAnCode, grasGlType, grasInclude, grasSelLow,
				grasSelHigh);
	}

}
