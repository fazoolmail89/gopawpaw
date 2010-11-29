package com.gopawpaw.erp.hibernate.a;

/**
 * AnxDet entity. @author MyEclipse Persistence Tools
 */
public class AnxDet extends AbstractAnxDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AnxDet() {
	}

	/** minimal constructor */
	public AnxDet(AnxDetId id, Double oidAnxDet) {
		super(id, oidAnxDet);
	}

	/** full constructor */
	public AnxDet(AnxDetId id, Boolean anxActive, String anxUser1,
			String anxUser2, String anxQadc01, Double anxQadd01,
			Double oidAnxDet) {
		super(id, anxActive, anxUser1, anxUser2, anxQadc01, anxQadd01,
				oidAnxDet);
	}

}
