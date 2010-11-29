package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PqMstr entity. @author MyEclipse Persistence Tools
 */
public class PqMstr extends AbstractPqMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PqMstr() {
	}

	/** minimal constructor */
	public PqMstr(PqMstrId id, Double oidPqMstr) {
		super(id, oidPqMstr);
	}

	/** full constructor */
	public PqMstr(PqMstrId id, Double pqQtyPer, Integer pqLead,
			Integer pqLtOff, Date pqEnd, String pqUser1, String pqUser2,
			String pqQadc01, Double oidPqMstr) {
		super(id, pqQtyPer, pqLead, pqLtOff, pqEnd, pqUser1, pqUser2, pqQadc01,
				oidPqMstr);
	}

}
