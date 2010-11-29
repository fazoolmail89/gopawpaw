package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * ErawDet entity. @author MyEclipse Persistence Tools
 */
public class ErawDet extends AbstractErawDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ErawDet() {
	}

	/** minimal constructor */
	public ErawDet(ErawDetId id, Double oidErawDet) {
		super(id, oidErawDet);
	}

	/** full constructor */
	public ErawDet(ErawDetId id, Date erawModDate, String erawModUserid,
			String erawData, String erawUser1, String erawUser2,
			Double erawDec01, Double erawDec02, Integer erawInt01,
			Integer erawInt02, Boolean erawLog01, Boolean erawLog02,
			Date erawDte01, Date erawDte02, String erawQadc01,
			String erawQadc02, String erawQadc03, String erawQadc04,
			Double erawQadd01, Double erawQadd02, Integer erawQadi01,
			Integer erawQadi02, Boolean erawQadl01, Boolean erawQadl02,
			Date erawQadt01, Date erawQadt02, Boolean erawLineCont,
			Double oidErawDet) {
		super(id, erawModDate, erawModUserid, erawData, erawUser1, erawUser2,
				erawDec01, erawDec02, erawInt01, erawInt02, erawLog01,
				erawLog02, erawDte01, erawDte02, erawQadc01, erawQadc02,
				erawQadc03, erawQadc04, erawQadd01, erawQadd02, erawQadi01,
				erawQadi02, erawQadl01, erawQadl02, erawQadt01, erawQadt02,
				erawLineCont, oidErawDet);
	}

}
