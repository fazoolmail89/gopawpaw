package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RqdaDet entity. @author MyEclipse Persistence Tools
 */
public class RqdaDet extends AbstractRqdaDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqdaDet() {
	}

	/** minimal constructor */
	public RqdaDet(RqdaDetId id, Double oidRqdaDet) {
		super(id, oidRqdaDet);
	}

	/** full constructor */
	public RqdaDet(RqdaDetId id, String rqdaAction, Date rqdaDate,
			Integer rqdaTime, String rqdaEntUserid, String rqdaChr01,
			String rqdaChr02, String rqdaChr03, String rqdaChr04,
			String rqdaQadc01, String rqdaQadc02, String rqdaQadc03,
			String rqdaQadc04, Double oidRqdaDet) {
		super(id, rqdaAction, rqdaDate, rqdaTime, rqdaEntUserid, rqdaChr01,
				rqdaChr02, rqdaChr03, rqdaChr04, rqdaQadc01, rqdaQadc02,
				rqdaQadc03, rqdaQadc04, oidRqdaDet);
	}

}
