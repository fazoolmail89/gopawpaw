package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * ShmMstr entity. @author MyEclipse Persistence Tools
 */
public class ShmMstr extends AbstractShmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShmMstr() {
	}

	/** minimal constructor */
	public ShmMstr(ShmMstrId id, Integer shmNoUnits, Double oidShmMstr) {
		super(id, shmNoUnits, oidShmMstr);
	}

	/** full constructor */
	public ShmMstr(ShmMstrId id, Date shmEnd, Double shmLoadLt,
			Double shmTransit, Double shmUnldLt, String shmShipDay,
			String shmRecDay, Integer shmCmtindx, Integer shmNoUnits,
			String shmUser1, String shmUser2, String shmQadc01,
			Double oidShmMstr) {
		super(id, shmEnd, shmLoadLt, shmTransit, shmUnldLt, shmShipDay,
				shmRecDay, shmCmtindx, shmNoUnits, shmUser1, shmUser2,
				shmQadc01, oidShmMstr);
	}

}
