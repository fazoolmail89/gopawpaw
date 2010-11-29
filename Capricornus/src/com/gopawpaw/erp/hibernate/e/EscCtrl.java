package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EscCtrl entity. @author MyEclipse Persistence Tools
 */
public class EscCtrl extends AbstractEscCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EscCtrl() {
	}

	/** minimal constructor */
	public EscCtrl(EscCtrlId id, Double oidEscCtrl) {
		super(id, oidEscCtrl);
	}

	/** full constructor */
	public EscCtrl(EscCtrlId id, String escEsPrefix, Integer escNbr,
			String escUser1, String escUser2, String escModUserid,
			Date escModDate, String escChr01, String escChr02, Date escDte01,
			Boolean escLog01, Integer escInt01, String escQadc01,
			String escQadc02, Date escQadt01, Boolean escQadl01,
			Integer escQadi01, String escRrcPre, Integer escRrcNbr,
			Double oidEscCtrl) {
		super(id, escEsPrefix, escNbr, escUser1, escUser2, escModUserid,
				escModDate, escChr01, escChr02, escDte01, escLog01, escInt01,
				escQadc01, escQadc02, escQadt01, escQadl01, escQadi01,
				escRrcPre, escRrcNbr, oidEscCtrl);
	}

}
