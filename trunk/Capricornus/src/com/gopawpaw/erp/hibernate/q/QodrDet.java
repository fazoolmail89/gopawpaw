package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * QodrDet entity. @author MyEclipse Persistence Tools
 */
public class QodrDet extends AbstractQodrDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QodrDet() {
	}

	/** minimal constructor */
	public QodrDet(QodrDetId id, Double oidQodrDet) {
		super(id, oidQodrDet);
	}

	/** full constructor */
	public QodrDet(QodrDetId id, String qodrDiv, String qodrGroup,
			Integer qodrPricing, Integer qodrType, String qodrUser1,
			String qodrUser2, String qodrQadc01, String qodrQadc02,
			String qodrQadc03, Double qodrQadd01, Double qodrQadd02,
			Integer qodrQadi01, Integer qodrQadi02, Boolean qodrQadl01,
			Boolean qodrQadl02, Date qodrQadt01, Date qodrQadt02,
			Double oidQodrDet) {
		super(id, qodrDiv, qodrGroup, qodrPricing, qodrType, qodrUser1,
				qodrUser2, qodrQadc01, qodrQadc02, qodrQadc03, qodrQadd01,
				qodrQadd02, qodrQadi01, qodrQadi02, qodrQadl01, qodrQadl02,
				qodrQadt01, qodrQadt02, oidQodrDet);
	}

}
