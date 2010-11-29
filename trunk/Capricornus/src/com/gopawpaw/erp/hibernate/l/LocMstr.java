package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LocMstr entity. @author MyEclipse Persistence Tools
 */
public class LocMstr extends AbstractLocMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LocMstr() {
	}

	/** minimal constructor */
	public LocMstr(LocMstrId id, Date locDate, Boolean locSingle,
			String locType, String locPhysAddr, Boolean locXferOwnership,
			Double oidLocMstr) {
		super(id, locDate, locSingle, locType, locPhysAddr, locXferOwnership,
				oidLocMstr);
	}

	/** full constructor */
	public LocMstr(LocMstrId id, Boolean locQad01, Date locDate,
			Boolean locPerm, String locQadc01, String locQadc02,
			String locProject, String locStatus, String locUser1,
			String locUser2, Boolean locSingle, String locType, String locDesc,
			Double locCap, String locCapUm, String locPhysAddr,
			Boolean locXferOwnership, Double oidLocMstr) {
		super(id, locQad01, locDate, locPerm, locQadc01, locQadc02, locProject,
				locStatus, locUser1, locUser2, locSingle, locType, locDesc,
				locCap, locCapUm, locPhysAddr, locXferOwnership, oidLocMstr);
	}

}
