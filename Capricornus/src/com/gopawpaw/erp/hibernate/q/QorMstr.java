package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * QorMstr entity. @author MyEclipse Persistence Tools
 */
public class QorMstr extends AbstractQorMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QorMstr() {
	}

	/** minimal constructor */
	public QorMstr(QorMstrId id, Double oidQorMstr) {
		super(id, oidQorMstr);
	}

	/** full constructor */
	public QorMstr(QorMstrId id, String qorDiv, String qorGroup,
			Integer qorPricing, Integer qorType, String qorUser1,
			String qorUser2, String qorQadc01, String qorQadc02,
			String qorQadc03, Double qorQadd01, Double qorQadd02,
			Integer qorQadi01, Integer qorQadi02, Boolean qorQadl01,
			Boolean qorQadl02, Date qorQadt01, Date qorQadt02, Double oidQorMstr) {
		super(id, qorDiv, qorGroup, qorPricing, qorType, qorUser1, qorUser2,
				qorQadc01, qorQadc02, qorQadc03, qorQadd01, qorQadd02,
				qorQadi01, qorQadi02, qorQadl01, qorQadl02, qorQadt01,
				qorQadt02, oidQorMstr);
	}

}
