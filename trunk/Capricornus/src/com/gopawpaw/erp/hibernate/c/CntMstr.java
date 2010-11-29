package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CntMstr entity. @author MyEclipse Persistence Tools
 */
public class CntMstr extends AbstractCntMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CntMstr() {
	}

	/** minimal constructor */
	public CntMstr(CntMstrId id, Double oidCntMstr) {
		super(id, oidCntMstr);
	}

	/** full constructor */
	public CntMstr(CntMstrId id, Integer cntOraId1, Integer cntOraId2,
			Integer cntTime, String cntUser1, String cntUser2,
			String cntQadc01, Integer cntQadi01, Double cntQadd01,
			Boolean cntQadl01, Date cntQadt01, Date cntDate, Double oidCntMstr) {
		super(id, cntOraId1, cntOraId2, cntTime, cntUser1, cntUser2, cntQadc01,
				cntQadi01, cntQadd01, cntQadl01, cntQadt01, cntDate, oidCntMstr);
	}

}
