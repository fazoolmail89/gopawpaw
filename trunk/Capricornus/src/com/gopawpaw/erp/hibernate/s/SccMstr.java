package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SccMstr entity. @author MyEclipse Persistence Tools
 */
public class SccMstr extends AbstractSccMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SccMstr() {
	}

	/** full constructor */
	public SccMstr(SccMstrId id, Boolean sccActive, Boolean sccUseCurrent,
			Integer sccShipLt, Integer sccSchedType, Boolean sccIncludeSo,
			Boolean sccIncludeSched, Boolean sccIncludeRma,
			Boolean sccIncludeMo, Boolean sccIncludeDo, String sccQadc01,
			String sccQadc02, String sccModUserid, Date sccModDate,
			String sccUser1, String sccUser2, Double oidSccMstr) {
		super(id, sccActive, sccUseCurrent, sccShipLt, sccSchedType,
				sccIncludeSo, sccIncludeSched, sccIncludeRma, sccIncludeMo,
				sccIncludeDo, sccQadc01, sccQadc02, sccModUserid, sccModDate,
				sccUser1, sccUser2, oidSccMstr);
	}

}
