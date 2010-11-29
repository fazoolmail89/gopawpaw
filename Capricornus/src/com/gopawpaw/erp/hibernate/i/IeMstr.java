package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IeMstr entity. @author MyEclipse Persistence Tools
 */
public class IeMstr extends AbstractIeMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IeMstr() {
	}

	/** minimal constructor */
	public IeMstr(IeMstrId id, Boolean ieCorrection, String ieOrigDoc,
			Integer ieOrigYear, Integer ieOrigMonth, String ieAffiliation,
			Double oidIeMstr) {
		super(id, ieCorrection, ieOrigDoc, ieOrigYear, ieOrigMonth,
				ieAffiliation, oidIeMstr);
	}

	/** full constructor */
	public IeMstr(IeMstrId id, Boolean ieInclMemo, String ieModeTransp,
			String ieNatTrans, String iePortArrdisp, String iePortTransh,
			String ieStatProc, String ieTermsDeliv, String ieUserid,
			Date ieModDate, String ieRegion, String ieCtryDesdisp,
			String ieChr01, String ieChr02, String ieChr03, String ieChr04,
			String ieChr05, Boolean ieLog01, Boolean ieLog02, String ieQadc01,
			String ieQadc02, String ieQadc03, String ieQadc04, String ieQadc05,
			Boolean ieQadl01, Boolean ieQadl02, String ieUser1, String ieUser2,
			Boolean ieCorrection, String ieOrigDoc, Integer ieOrigYear,
			Integer ieOrigMonth, String ieAffiliation, Double oidIeMstr) {
		super(id, ieInclMemo, ieModeTransp, ieNatTrans, iePortArrdisp,
				iePortTransh, ieStatProc, ieTermsDeliv, ieUserid, ieModDate,
				ieRegion, ieCtryDesdisp, ieChr01, ieChr02, ieChr03, ieChr04,
				ieChr05, ieLog01, ieLog02, ieQadc01, ieQadc02, ieQadc03,
				ieQadc04, ieQadc05, ieQadl01, ieQadl02, ieUser1, ieUser2,
				ieCorrection, ieOrigDoc, ieOrigYear, ieOrigMonth,
				ieAffiliation, oidIeMstr);
	}

}
