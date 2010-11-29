package com.gopawpaw.erp.hibernate.a;

/**
 * AnlDet entity. @author MyEclipse Persistence Tools
 */
public class AnlDet extends AbstractAnlDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AnlDet() {
	}

	/** minimal constructor */
	public AnlDet(AnlDetId id, Double oidAnlDet) {
		super(id, oidAnlDet);
	}

	/** full constructor */
	public AnlDet(AnlDetId id, String anlDesc, String anlUser1,
			String anlUser2, String anlQadc01, Double anlQadd01,
			Double oidAnlDet) {
		super(id, anlDesc, anlUser1, anlUser2, anlQadc01, anlQadd01, oidAnlDet);
	}

}
