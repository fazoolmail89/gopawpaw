package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * ApmrMstr entity. @author MyEclipse Persistence Tools
 */
public class ApmrMstr extends AbstractApmrMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ApmrMstr() {
	}

	/** minimal constructor */
	public ApmrMstr(ApmrMstrId id, Double oidApmrMstr) {
		super(id, oidApmrMstr);
	}

	/** full constructor */
	public ApmrMstr(ApmrMstrId id, Integer apmrPricing, Integer apmrRule,
			Integer apmrType, String apmrUser1, String apmrUser2,
			String apmrQadc01, String apmrQadc02, String apmrQadc03,
			Double apmrQadd01, Double apmrQadd02, Integer apmrQadi01,
			Integer apmrQadi02, Boolean apmrQadl01, Boolean apmrQadl02,
			Date apmrQadt01, Date apmrQadt02, Double oidApmrMstr) {
		super(id, apmrPricing, apmrRule, apmrType, apmrUser1, apmrUser2,
				apmrQadc01, apmrQadc02, apmrQadc03, apmrQadd01, apmrQadd02,
				apmrQadi01, apmrQadi02, apmrQadl01, apmrQadl02, apmrQadt01,
				apmrQadt02, oidApmrMstr);
	}

}
