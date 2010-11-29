package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IfsMstr entity. @author MyEclipse Persistence Tools
 */
public class IfsMstr extends AbstractIfsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IfsMstr() {
	}

	/** minimal constructor */
	public IfsMstr(IfsMstrId id, Double oidIfsMstr) {
		super(id, oidIfsMstr);
	}

	/** full constructor */
	public IfsMstr(IfsMstrId id, Integer ifsGrpId, Integer ifsDocErrCnt,
			Integer ifsDocTotCnt, Integer ifsQadi03, Integer ifsQadi04,
			Integer ifsLstDocProc, Date ifsModDate, String ifsUserid,
			String ifsSessHndl, String ifsSessStat, String ifsSessTyp,
			Date ifsStartDate, String ifsStartTime, String ifsStartUserid,
			String ifsUnitWrkTyp, String ifsUser1, String ifsUser2,
			Double ifsDec01, Double ifsDec02, Integer ifsInt01,
			Integer ifsInt02, Boolean ifsLog01, Boolean ifsLog02,
			Date ifsDte01, Date ifsDte02, String ifsQadc01, String ifsQadc02,
			String ifsQadc03, String ifsQadc04, Double ifsQadd01,
			Double ifsQadd02, Integer ifsQadi01, Integer ifsQadi02,
			Boolean ifsQadl01, Boolean ifsQadl02, Date ifsQadt01,
			Date ifsQadt02, String ifsFilename, Double oidIfsMstr) {
		super(id, ifsGrpId, ifsDocErrCnt, ifsDocTotCnt, ifsQadi03, ifsQadi04,
				ifsLstDocProc, ifsModDate, ifsUserid, ifsSessHndl, ifsSessStat,
				ifsSessTyp, ifsStartDate, ifsStartTime, ifsStartUserid,
				ifsUnitWrkTyp, ifsUser1, ifsUser2, ifsDec01, ifsDec02,
				ifsInt01, ifsInt02, ifsLog01, ifsLog02, ifsDte01, ifsDte02,
				ifsQadc01, ifsQadc02, ifsQadc03, ifsQadc04, ifsQadd01,
				ifsQadd02, ifsQadi01, ifsQadi02, ifsQadl01, ifsQadl02,
				ifsQadt01, ifsQadt02, ifsFilename, oidIfsMstr);
	}

}
