package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PclMstr entity. @author MyEclipse Persistence Tools
 */
public class PclMstr extends AbstractPclMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PclMstr() {
	}

	/** minimal constructor */
	public PclMstr(PclMstrId id, String pclDesc, String pclUser1,
			String pclUser2, String pclUserid, Integer pclIndex,
			Integer pclBsnUnit, Double oidPclMstr) {
		super(id, pclDesc, pclUser1, pclUser2, pclUserid, pclIndex, pclBsnUnit,
				oidPclMstr);
	}

	/** full constructor */
	public PclMstr(PclMstrId id, String pclDesc, String pclUser1,
			String pclUser2, Date pclModDate, String pclUserid,
			Integer pclIndex, Integer pclBsnUnit, String pclQadc01,
			Double oidPclMstr) {
		super(id, pclDesc, pclUser1, pclUser2, pclModDate, pclUserid, pclIndex,
				pclBsnUnit, pclQadc01, oidPclMstr);
	}

}
