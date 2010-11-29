package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SpdDet entity. @author MyEclipse Persistence Tools
 */
public class SpdDet extends AbstractSpdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SpdDet() {
	}

	/** minimal constructor */
	public SpdDet(SpdDetId id, Double oidSpdDet) {
		super(id, oidSpdDet);
	}

	/** full constructor */
	public SpdDet(SpdDetId id, Double spdCommPct, String spdUser1,
			String spdUser2, String spdChr01, String spdChr02, String spdChr03,
			String spdChr04, String spdChr05, Date spdDte01, Date spdDte02,
			Double spdDec01, Double spdDec02, String spdUserid,
			Date spdModDate, Double oidSpdDet) {
		super(id, spdCommPct, spdUser1, spdUser2, spdChr01, spdChr02, spdChr03,
				spdChr04, spdChr05, spdDte01, spdDte02, spdDec01, spdDec02,
				spdUserid, spdModDate, oidSpdDet);
	}

}
