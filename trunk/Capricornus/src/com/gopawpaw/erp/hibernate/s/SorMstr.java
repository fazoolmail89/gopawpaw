package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SorMstr entity. @author MyEclipse Persistence Tools
 */
public class SorMstr extends AbstractSorMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SorMstr() {
	}

	/** minimal constructor */
	public SorMstr(SorMstrId id, Double oidSorMstr) {
		super(id, oidSorMstr);
	}

	/** full constructor */
	public SorMstr(SorMstrId id, String sorDiv, String sorGroup,
			Integer sorPricing, Integer sorType, String sorUser1,
			String sorUser2, String sorQadc01, String sorQadc02,
			String sorQadc03, Double sorQadd01, Double sorQadd02,
			Integer sorQadi01, Integer sorQadi02, Boolean sorQadl01,
			Boolean sorQadl02, Date sorQadt01, Date sorQadt02, Double oidSorMstr) {
		super(id, sorDiv, sorGroup, sorPricing, sorType, sorUser1, sorUser2,
				sorQadc01, sorQadc02, sorQadc03, sorQadd01, sorQadd02,
				sorQadi01, sorQadi02, sorQadl01, sorQadl02, sorQadt01,
				sorQadt02, oidSorMstr);
	}

}
