package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SttqdDet entity. @author MyEclipse Persistence Tools
 */
public class SttqdDet extends AbstractSttqdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SttqdDet() {
	}

	/** full constructor */
	public SttqdDet(SttqdDetId id, Boolean sttqdAcceptable,
			Boolean sttqdActive, Double sttqdMaxValue, Double sttqdMinValue,
			String sttqdTrackingMeasure, Boolean sttqdUsePercent,
			Date sttqdModDate, String sttqdModUserid, String sttqdUser1,
			String sttqdUser2, String sttqdQadc01, String sttqdQadc02,
			Double oidSttqdDet) {
		super(id, sttqdAcceptable, sttqdActive, sttqdMaxValue, sttqdMinValue,
				sttqdTrackingMeasure, sttqdUsePercent, sttqdModDate,
				sttqdModUserid, sttqdUser1, sttqdUser2, sttqdQadc01,
				sttqdQadc02, oidSttqdDet);
	}

}
