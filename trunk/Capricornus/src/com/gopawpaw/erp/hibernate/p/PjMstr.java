package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PjMstr entity. @author MyEclipse Persistence Tools
 */
public class PjMstr extends AbstractPjMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PjMstr() {
	}

	/** minimal constructor */
	public PjMstr(PjMstrId id, Double oidPjMstr) {
		super(id, oidPjMstr);
	}

	/** full constructor */
	public PjMstr(PjMstrId id, String pjDesc, Boolean pjActive, Date pjBegDt,
			Integer pjCmtindx, Date pjComp, Date pjFindate, Date pjRevdate,
			Date pjRevfin, String pjStat, String pjType, String pjUser1,
			String pjUser2, String pjQadc01, Double oidPjMstr) {
		super(id, pjDesc, pjActive, pjBegDt, pjCmtindx, pjComp, pjFindate,
				pjRevdate, pjRevfin, pjStat, pjType, pjUser1, pjUser2,
				pjQadc01, oidPjMstr);
	}

}
