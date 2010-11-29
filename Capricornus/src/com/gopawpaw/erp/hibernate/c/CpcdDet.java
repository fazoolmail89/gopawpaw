package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CpcdDet entity. @author MyEclipse Persistence Tools
 */
public class CpcdDet extends AbstractCpcdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CpcdDet() {
	}

	/** minimal constructor */
	public CpcdDet(CpcdDetId id, Double oidCpcdDet) {
		super(id, oidCpcdDet);
	}

	/** full constructor */
	public CpcdDet(CpcdDetId id, Date cpcdStart, Date cpcdEnd,
			String cpcdChr01, String cpcdChr02, String cpcdChr03,
			String cpcdChr04, Double cpcdDec01, Boolean cpcdLog01,
			String cpcdUser1, String cpcdUser2, Double oidCpcdDet) {
		super(id, cpcdStart, cpcdEnd, cpcdChr01, cpcdChr02, cpcdChr03,
				cpcdChr04, cpcdDec01, cpcdLog01, cpcdUser1, cpcdUser2,
				oidCpcdDet);
	}

}
