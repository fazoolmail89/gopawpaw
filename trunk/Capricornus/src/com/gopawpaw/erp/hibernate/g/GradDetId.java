package com.gopawpaw.erp.hibernate.g;

/**
 * GradDetId entity. @author MyEclipse Persistence Tools
 */
public class GradDetId extends AbstractGradDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GradDetId() {
	}

	/** minimal constructor */
	public GradDetId(String gradDomain, Double oidGradDet) {
		super(gradDomain, oidGradDet);
	}

	/** full constructor */
	public GradDetId(String gradGlType, String gradAnCode, String gradGlCode,
			String gradUser1, String gradUser2, String gradQadc01,
			String gradDomain, Double oidGradDet) {
		super(gradGlType, gradAnCode, gradGlCode, gradUser1, gradUser2,
				gradQadc01, gradDomain, oidGradDet);
	}

}
