package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TblcMstr entity. @author MyEclipse Persistence Tools
 */
public class TblcMstr extends AbstractTblcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TblcMstr() {
	}

	/** full constructor */
	public TblcMstr(TblcMstrId id, Boolean tblcActive, Boolean tblcDelete,
			String tblcDesc, String tblcUser1, String tblcUser2,
			Date tblcModDate, String tblcModUserid, String tblcQadc01,
			String tblcQadc02, Double oidTblcMstr) {
		super(id, tblcActive, tblcDelete, tblcDesc, tblcUser1, tblcUser2,
				tblcModDate, tblcModUserid, tblcQadc01, tblcQadc02, oidTblcMstr);
	}

}
