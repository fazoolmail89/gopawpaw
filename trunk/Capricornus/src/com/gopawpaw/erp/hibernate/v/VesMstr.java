package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VesMstr entity. @author MyEclipse Persistence Tools
 */
public class VesMstr extends AbstractVesMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VesMstr() {
	}

	/** minimal constructor */
	public VesMstr(VesMstrId id, String vesCommCode, Double oidVesMstr) {
		super(id, vesCommCode, oidVesMstr);
	}

	/** full constructor */
	public VesMstr(VesMstrId id, String vesCommCode, Double vesRcvdQty,
			Integer vesOccuranceCount, String vesDb, String vesModUserid,
			Date vesModDate, String vesUser1, String vesUser2, String vesUser3,
			String vesUser4, String vesQadc01, String vesQadc02,
			String vesQadc03, String vesQadc04, Double vesQadd01,
			Double vesQadd02, Boolean vesQadl01, Boolean vesQadl02,
			Date vesQadt01, Date vesQadt02, Integer vesQadi01,
			Integer vesQadi02, Double oidVesMstr) {
		super(id, vesCommCode, vesRcvdQty, vesOccuranceCount, vesDb,
				vesModUserid, vesModDate, vesUser1, vesUser2, vesUser3,
				vesUser4, vesQadc01, vesQadc02, vesQadc03, vesQadc04,
				vesQadd01, vesQadd02, vesQadl01, vesQadl02, vesQadt01,
				vesQadt02, vesQadi01, vesQadi02, oidVesMstr);
	}

}
