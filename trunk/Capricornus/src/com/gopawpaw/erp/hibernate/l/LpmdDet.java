package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LpmdDet entity. @author MyEclipse Persistence Tools
 */
public class LpmdDet extends AbstractLpmdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LpmdDet() {
	}

	/** minimal constructor */
	public LpmdDet(LpmdDetId id, String lpmdModUserid, Date lpmdModDate,
			String lpmdQadc01, String lpmdQadc02, Double lpmdQadd01,
			String lpmdAccessType, Double oidLpmdDet) {
		super(id, lpmdModUserid, lpmdModDate, lpmdQadc01, lpmdQadc02,
				lpmdQadd01, lpmdAccessType, oidLpmdDet);
	}

	/** full constructor */
	public LpmdDet(LpmdDetId id, String lpmdModUserid, Date lpmdModDate,
			String lpmdQadc01, String lpmdQadc02, Double lpmdQadd01,
			Date lpmdQadt01, String lpmdAccessType, Double oidLpmdDet) {
		super(id, lpmdModUserid, lpmdModDate, lpmdQadc01, lpmdQadc02,
				lpmdQadd01, lpmdQadt01, lpmdAccessType, oidLpmdDet);
	}

}
