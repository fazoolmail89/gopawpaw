package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EmapDet entity. @author MyEclipse Persistence Tools
 */
public class EmapDet extends AbstractEmapDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EmapDet() {
	}

	/** minimal constructor */
	public EmapDet(EmapDetId id, Double oidEmapDet) {
		super(id, oidEmapDet);
	}

	/** full constructor */
	public EmapDet(EmapDetId id, Boolean emapLineCont, String emapData,
			Date emapModDate, String emapModUserid, String emapUser1,
			String emapUser2, Double emapDec01, Double emapDec02,
			Integer emapInt01, Integer emapInt02, Boolean emapLog01,
			Boolean emapLog02, Date emapDte01, Date emapDte02,
			String emapQadc01, String emapQadc02, String emapQadc03,
			String emapQadc04, Double emapQadd01, Double emapQadd02,
			Integer emapQadi01, Integer emapQadi02, Boolean emapQadl01,
			Boolean emapQadl02, Date emapQadt01, Date emapQadt02,
			Double oidEmapDet) {
		super(id, emapLineCont, emapData, emapModDate, emapModUserid,
				emapUser1, emapUser2, emapDec01, emapDec02, emapInt01,
				emapInt02, emapLog01, emapLog02, emapDte01, emapDte02,
				emapQadc01, emapQadc02, emapQadc03, emapQadc04, emapQadd01,
				emapQadd02, emapQadi01, emapQadi02, emapQadl01, emapQadl02,
				emapQadt01, emapQadt02, oidEmapDet);
	}

}
