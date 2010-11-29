package com.gopawpaw.erp.hibernate.g;

/**
 * GrtxDet entity. @author MyEclipse Persistence Tools
 */
public class GrtxDet extends AbstractGrtxDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrtxDet() {
	}

	/** minimal constructor */
	public GrtxDet(GrtxDetId id, Double oidGrtxDet) {
		super(id, oidGrtxDet);
	}

	/** full constructor */
	public GrtxDet(GrtxDetId id, String grtxText, String grtxUser1,
			String grtxUser2, String grtxFmtTxt, String grtxQadc01,
			Double oidGrtxDet) {
		super(id, grtxText, grtxUser1, grtxUser2, grtxFmtTxt, grtxQadc01,
				oidGrtxDet);
	}

}
