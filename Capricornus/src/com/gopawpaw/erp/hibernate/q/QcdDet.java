package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * QcdDet entity. @author MyEclipse Persistence Tools
 */
public class QcdDet extends AbstractQcdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QcdDet() {
	}

	/** minimal constructor */
	public QcdDet(QcdDetId id, Double oidQcdDet) {
		super(id, oidQcdDet);
	}

	/** full constructor */
	public QcdDet(QcdDetId id, String qcdNbr, Date qcdIssDate,
			Double qcdQtyReq, Double qcdQtyIss, Integer qcdCmtindx,
			String qcdUser1, String qcdUser2, String qcdChr01, String qcdChr02,
			String qcdChr03, String qcdChr04, String qcdChr05, Date qcdDte01,
			Date qcdDte02, Double qcdDec01, Double qcdDec02, Boolean qcdLog01,
			Double oidQcdDet) {
		super(id, qcdNbr, qcdIssDate, qcdQtyReq, qcdQtyIss, qcdCmtindx,
				qcdUser1, qcdUser2, qcdChr01, qcdChr02, qcdChr03, qcdChr04,
				qcdChr05, qcdDte01, qcdDte02, qcdDec01, qcdDec02, qcdLog01,
				oidQcdDet);
	}

}
