package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GltmdDet entity. @author MyEclipse Persistence Tools
 */
public class GltmdDet extends AbstractGltmdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GltmdDet() {
	}

	/** minimal constructor */
	public GltmdDet(GltmdDetId id, Date gltmdModDate, String gltmdModUserid,
			String gltmdUser1, String gltmdUser2, Double gltmdUserd01,
			Integer gltmdUseri01, Boolean gltmdUserl01, String gltmdQadc01,
			String gltmdQadc02, Double gltmdQadd01, Integer gltmdQadi01,
			Boolean gltmdQadl01, Boolean gltmdConsTrans, Double gltmdConsAmt,
			Double oidGltmdDet) {
		super(id, gltmdModDate, gltmdModUserid, gltmdUser1, gltmdUser2,
				gltmdUserd01, gltmdUseri01, gltmdUserl01, gltmdQadc01,
				gltmdQadc02, gltmdQadd01, gltmdQadi01, gltmdQadl01,
				gltmdConsTrans, gltmdConsAmt, oidGltmdDet);
	}

	/** full constructor */
	public GltmdDet(GltmdDetId id, Date gltmdModDate, String gltmdModUserid,
			String gltmdUser1, String gltmdUser2, Double gltmdUserd01,
			Integer gltmdUseri01, Boolean gltmdUserl01, Date gltmdUsert01,
			String gltmdQadc01, String gltmdQadc02, Double gltmdQadd01,
			Integer gltmdQadi01, Boolean gltmdQadl01, Date gltmdQadt01,
			Boolean gltmdConsTrans, Double gltmdConsAmt, Double oidGltmdDet) {
		super(id, gltmdModDate, gltmdModUserid, gltmdUser1, gltmdUser2,
				gltmdUserd01, gltmdUseri01, gltmdUserl01, gltmdUsert01,
				gltmdQadc01, gltmdQadc02, gltmdQadd01, gltmdQadi01,
				gltmdQadl01, gltmdQadt01, gltmdConsTrans, gltmdConsAmt,
				oidGltmdDet);
	}

}
