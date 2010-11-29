package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EucCtrl entity. @author MyEclipse Persistence Tools
 */
public class EucCtrl extends AbstractEucCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EucCtrl() {
	}

	/** minimal constructor */
	public EucCtrl(Double oidEucCtrl) {
		super(oidEucCtrl);
	}

	/** full constructor */
	public EucCtrl(Integer eucNbr, String eucUser1, String eucUser2,
			Integer eucQadi02, String eucModUserid, Date eucModDate,
			String eucChr01, Integer eucInt01, Date eucDte01, Boolean eucLog01,
			String eucQadc01, Integer eucQadi01, Date eucQadt01,
			Boolean eucQadl01, Boolean eucCreateIsb, Boolean eucQadl02,
			Double oidEucCtrl) {
		super(eucNbr, eucUser1, eucUser2, eucQadi02, eucModUserid, eucModDate,
				eucChr01, eucInt01, eucDte01, eucLog01, eucQadc01, eucQadi01,
				eucQadt01, eucQadl01, eucCreateIsb, eucQadl02, oidEucCtrl);
	}

}
