package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * ExrRate entity. @author MyEclipse Persistence Tools
 */
public class ExrRate extends AbstractExrRate implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ExrRate() {
	}

	/** minimal constructor */
	public ExrRate(ExrRateId id, Date exrEndDate, Double exrRate,
			Double exrRate2, String exrModUserid, Date exrModDate,
			String exrUser1, String exrUser2, String exrQadc01,
			Double exrQadd01, Boolean exrQadl01, Double oidExrRate) {
		super(id, exrEndDate, exrRate, exrRate2, exrModUserid, exrModDate,
				exrUser1, exrUser2, exrQadc01, exrQadd01, exrQadl01, oidExrRate);
	}

	/** full constructor */
	public ExrRate(ExrRateId id, Date exrEndDate, Double exrRate,
			Double exrRate2, String exrModUserid, Date exrModDate,
			String exrUser1, String exrUser2, String exrQadc01,
			Double exrQadd01, Boolean exrQadl01, Date exrQadt01,
			Double oidExrRate) {
		super(id, exrEndDate, exrRate, exrRate2, exrModUserid, exrModDate,
				exrUser1, exrUser2, exrQadc01, exrQadd01, exrQadl01, exrQadt01,
				oidExrRate);
	}

}
