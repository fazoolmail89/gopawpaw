package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VerMstr entity. @author MyEclipse Persistence Tools
 */
public class VerMstr extends AbstractVerMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VerMstr() {
	}

	/** minimal constructor */
	public VerMstr(VerMstrId id, Double oidVerMstr) {
		super(id, oidVerMstr);
	}

	/** full constructor */
	public VerMstr(VerMstrId id, Boolean verActiveFlag, Date verStart,
			Date verEnd, String verAsnLeadtime, Integer verDaysEarly,
			Integer verDaysLate, Boolean verUseShippct, Double verOvershipPct,
			Double verUndershipPct, Boolean verUseShipqty,
			Integer verOvershipQty, Integer verUndershipQty,
			Boolean verUseShippctCost, Double verOvershipPctCost,
			Boolean verUseShipqtyCost, Double verOvershipQtyCost,
			String verContact, String verEmailAddress, String verModUserid,
			Date verModDate, String verUser1, String verUser2, String verUser3,
			String verUser4, String verQadc01, String verQadc02,
			String verQadc03, String verQadc04, Double verQadd01,
			Double verQadd02, Boolean verQadl01, Boolean verQadl02,
			Date verQadt02, Date verQadt01, Integer verQadi01,
			Integer verQadi02, Double oidVerMstr) {
		super(id, verActiveFlag, verStart, verEnd, verAsnLeadtime,
				verDaysEarly, verDaysLate, verUseShippct, verOvershipPct,
				verUndershipPct, verUseShipqty, verOvershipQty,
				verUndershipQty, verUseShippctCost, verOvershipPctCost,
				verUseShipqtyCost, verOvershipQtyCost, verContact,
				verEmailAddress, verModUserid, verModDate, verUser1, verUser2,
				verUser3, verUser4, verQadc01, verQadc02, verQadc03, verQadc04,
				verQadd01, verQadd02, verQadl01, verQadl02, verQadt02,
				verQadt01, verQadi01, verQadi02, oidVerMstr);
	}

}
