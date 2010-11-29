package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * ExruUsage entity. @author MyEclipse Persistence Tools
 */
public class ExruUsage extends AbstractExruUsage implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ExruUsage() {
	}

	/** minimal constructor */
	public ExruUsage(ExruUsageId id, String exruCurr1, String exruCurr2,
			Double exruExRate, Double exruExRate2, Double exruQadd01,
			String exruQadc01, Boolean exruQadl01, Double oidExruUsage) {
		super(id, exruCurr1, exruCurr2, exruExRate, exruExRate2, exruQadd01,
				exruQadc01, exruQadl01, oidExruUsage);
	}

	/** full constructor */
	public ExruUsage(ExruUsageId id, String exruCurr1, String exruCurr2,
			Double exruExRate, Double exruExRate2, Double exruQadd01,
			String exruQadc01, Boolean exruQadl01, Date exruQadt01,
			Double oidExruUsage) {
		super(id, exruCurr1, exruCurr2, exruExRate, exruExRate2, exruQadd01,
				exruQadc01, exruQadl01, exruQadt01, oidExruUsage);
	}

}
