package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TblMstr entity. @author MyEclipse Persistence Tools
 */
public class TblMstr extends AbstractTblMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TblMstr() {
	}

	/** minimal constructor */
	public TblMstr(TblMstrId id, Double oidTblMstr) {
		super(id, oidTblMstr);
	}

	/** full constructor */
	public TblMstr(TblMstrId id, Date tblStart, Date tblEnd, String tblRef,
			String tblRmks, String tblUser1, String tblUser2, String tblChr01,
			String tblChr02, String tblChr03, String tblChr04, String tblChr05,
			Date tblDte01, Date tblDte02, Double tblDec01, Double tblDec02,
			Boolean tblLog01, Boolean tblLog02, String tblQadc01,
			String tblQadc02, Date tblQadd01, Date tblQadd02,
			Double tblQadde01, Double tblQadde02, Boolean tblQadl01,
			Boolean tblQadl02, String tblModUserid, Date tblModDate,
			Double oidTblMstr) {
		super(id, tblStart, tblEnd, tblRef, tblRmks, tblUser1, tblUser2,
				tblChr01, tblChr02, tblChr03, tblChr04, tblChr05, tblDte01,
				tblDte02, tblDec01, tblDec02, tblLog01, tblLog02, tblQadc01,
				tblQadc02, tblQadd01, tblQadd02, tblQadde01, tblQadde02,
				tblQadl01, tblQadl02, tblModUserid, tblModDate, oidTblMstr);
	}

}
