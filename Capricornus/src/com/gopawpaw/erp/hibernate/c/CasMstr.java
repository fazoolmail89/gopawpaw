package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CasMstr entity. @author MyEclipse Persistence Tools
 */
public class CasMstr extends AbstractCasMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CasMstr() {
	}

	/** minimal constructor */
	public CasMstr(CasMstrId id, Double oidCasMstr) {
		super(id, oidCasMstr);
	}

	/** full constructor */
	public CasMstr(CasMstrId id, String casDesc, Integer casId, String casProg,
			Boolean casReq, String casNxtStat, String casChr01,
			String casChr02, Boolean casLog01, Boolean casLog02, Date casDte01,
			Date casDte02, Double casDec01, Double casDec02, String casChr03,
			String casUser1, String casUser2, Boolean casField,
			Boolean casHold, Boolean casReview, Boolean casWait,
			String casNxtQue, String casQadc01, String casQadc02,
			Boolean casQadl01, Boolean casQadl02, String casModUserid,
			Date casModDate, Double oidCasMstr) {
		super(id, casDesc, casId, casProg, casReq, casNxtStat, casChr01,
				casChr02, casLog01, casLog02, casDte01, casDte02, casDec01,
				casDec02, casChr03, casUser1, casUser2, casField, casHold,
				casReview, casWait, casNxtQue, casQadc01, casQadc02, casQadl01,
				casQadl02, casModUserid, casModDate, oidCasMstr);
	}

}
