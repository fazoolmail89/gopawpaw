package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SbicCtl entity. @author MyEclipse Persistence Tools
 */
public class SbicCtl extends AbstractSbicCtl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SbicCtl() {
	}

	/** minimal constructor */
	public SbicCtl(Double oidSbicCtl) {
		super(oidSbicCtl);
	}

	/** full constructor */
	public SbicCtl(Boolean sbicActive, String sbicPrefix, Integer sbicIndex1,
			Integer sbicNextSb, String sbicUser1, String sbicUser2,
			String sbicUser3, String sbicUser4, String sbicQadc01,
			String sbicQadc02, String sbicQadc03, String sbicQadc04,
			Integer sbicQadi01, Integer sbicQadi02, Integer sbicQadi03,
			Integer sbicQadi04, Double sbicQadd01, Double sbicQadd02,
			Double sbicQadd03, Double sbicQadd04, Boolean sbicQadl01,
			Boolean sbicQadl02, Boolean sbicQadl03, Boolean sbicQadl04,
			Date sbicQadt01, Date sbicQadt02, Date sbicQadt03, Date sbicQadt04,
			Double oidSbicCtl) {
		super(sbicActive, sbicPrefix, sbicIndex1, sbicNextSb, sbicUser1,
				sbicUser2, sbicUser3, sbicUser4, sbicQadc01, sbicQadc02,
				sbicQadc03, sbicQadc04, sbicQadi01, sbicQadi02, sbicQadi03,
				sbicQadi04, sbicQadd01, sbicQadd02, sbicQadd03, sbicQadd04,
				sbicQadl01, sbicQadl02, sbicQadl03, sbicQadl04, sbicQadt01,
				sbicQadt02, sbicQadt03, sbicQadt04, oidSbicCtl);
	}

}
