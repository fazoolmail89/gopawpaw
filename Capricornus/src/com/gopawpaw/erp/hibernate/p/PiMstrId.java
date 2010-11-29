package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PiMstrId entity. @author MyEclipse Persistence Tools
 */
public class PiMstrId extends AbstractPiMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PiMstrId() {
	}

	/** minimal constructor */
	public PiMstrId(String piDomain, String piList, String piCsCode,
			String piPartCode, String piCurr, String piUm) {
		super(piDomain, piList, piCsCode, piPartCode, piCurr, piUm);
	}

	/** full constructor */
	public PiMstrId(String piDomain, String piList, String piCsType,
			String piCsCode, String piPartType, String piPartCode,
			String piCurr, String piUm, Date piStart) {
		super(piDomain, piList, piCsType, piCsCode, piPartType, piPartCode,
				piCurr, piUm, piStart);
	}

}
