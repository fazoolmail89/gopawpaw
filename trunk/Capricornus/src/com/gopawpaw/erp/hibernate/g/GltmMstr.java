package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GltmMstr entity. @author MyEclipse Persistence Tools
 */
public class GltmMstr extends AbstractGltmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GltmMstr() {
	}

	/** minimal constructor */
	public GltmMstr(GltmMstrId id, Date gltmEffDt, String gltmRef,
			Boolean gltmRflag, Integer gltmLine, String gltmModUserid,
			Date gltmModDate, String gltmUser1, String gltmUser2,
			Double gltmUserd01, Integer gltmUseri01, Boolean gltmUserl01,
			String gltmQadc01, String gltmQadc02, Double gltmQadd01,
			Integer gltmQadi01, Boolean gltmQadl01, Double oidGltmMstr) {
		super(id, gltmEffDt, gltmRef, gltmRflag, gltmLine, gltmModUserid,
				gltmModDate, gltmUser1, gltmUser2, gltmUserd01, gltmUseri01,
				gltmUserl01, gltmQadc01, gltmQadc02, gltmQadd01, gltmQadi01,
				gltmQadl01, oidGltmMstr);
	}

	/** full constructor */
	public GltmMstr(GltmMstrId id, Date gltmEffDt, String gltmRef,
			Boolean gltmRflag, Integer gltmLine, String gltmModUserid,
			Date gltmModDate, String gltmUser1, String gltmUser2,
			Double gltmUserd01, Integer gltmUseri01, Boolean gltmUserl01,
			Date gltmUsert01, String gltmQadc01, String gltmQadc02,
			Double gltmQadd01, Integer gltmQadi01, Boolean gltmQadl01,
			Date gltmQadt01, Double oidGltmMstr) {
		super(id, gltmEffDt, gltmRef, gltmRflag, gltmLine, gltmModUserid,
				gltmModDate, gltmUser1, gltmUser2, gltmUserd01, gltmUseri01,
				gltmUserl01, gltmUsert01, gltmQadc01, gltmQadc02, gltmQadd01,
				gltmQadi01, gltmQadl01, gltmQadt01, oidGltmMstr);
	}

}
