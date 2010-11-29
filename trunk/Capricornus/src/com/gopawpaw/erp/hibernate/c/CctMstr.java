package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CctMstr entity. @author MyEclipse Persistence Tools
 */
public class CctMstr extends AbstractCctMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CctMstr() {
	}

	/** minimal constructor */
	public CctMstr(CctMstrId id, Boolean cctContainerType, String cctDesc1,
			String cctDesc2, String cctDesc3, String cctDesc4, String cctPrgm,
			String cctModUserid, String cctUserc01, String cctUserc02,
			String cctQadc01, String cctQadc02, Double oidCctMstr) {
		super(id, cctContainerType, cctDesc1, cctDesc2, cctDesc3, cctDesc4,
				cctPrgm, cctModUserid, cctUserc01, cctUserc02, cctQadc01,
				cctQadc02, oidCctMstr);
	}

	/** full constructor */
	public CctMstr(CctMstrId id, Boolean cctContainerType, String cctDesc1,
			String cctDesc2, String cctDesc3, String cctDesc4, String cctPrgm,
			String cctModUserid, Date cctModDate, String cctUserc01,
			String cctUserc02, String cctQadc01, String cctQadc02,
			Double oidCctMstr) {
		super(id, cctContainerType, cctDesc1, cctDesc2, cctDesc3, cctDesc4,
				cctPrgm, cctModUserid, cctModDate, cctUserc01, cctUserc02,
				cctQadc01, cctQadc02, oidCctMstr);
	}

}
