package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DalMstr entity. @author MyEclipse Persistence Tools
 */
public class DalMstr extends AbstractDalMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DalMstr() {
	}

	/** minimal constructor */
	public DalMstr(DalMstrId id, Double oidDalMstr) {
		super(id, oidDalMstr);
	}

	/** full constructor */
	public DalMstr(DalMstrId id, String dalListDesc, String dalModUserid,
			Date dalModDate, String dalUser1, String dalUser2, String dalChr01,
			String dalChr02, Double dalDec01, Double dalDec02,
			Integer dalInt01, Integer dalInt02, Boolean dalLog01,
			Boolean dalLog02, Date dalDte01, Date dalDte02, String dalQadc01,
			String dalQadc02, String dalQadc03, String dalQadc04,
			Double dalQadd01, Double dalQadd02, Integer dalQadi01,
			Integer dalQadi02, Boolean dalQadl01, Boolean dalQadl02,
			Date dalQadt01, Date dalQadt02, Double oidDalMstr) {
		super(id, dalListDesc, dalModUserid, dalModDate, dalUser1, dalUser2,
				dalChr01, dalChr02, dalDec01, dalDec02, dalInt01, dalInt02,
				dalLog01, dalLog02, dalDte01, dalDte02, dalQadc01, dalQadc02,
				dalQadc03, dalQadc04, dalQadd01, dalQadd02, dalQadi01,
				dalQadi02, dalQadl01, dalQadl02, dalQadt01, dalQadt02,
				oidDalMstr);
	}

}
