package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AlMstr entity. @author MyEclipse Persistence Tools
 */
public class AlMstr extends AbstractAlMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AlMstr() {
	}

	/** minimal constructor */
	public AlMstr(AlMstrId id, Double oidAlMstr) {
		super(id, oidAlMstr);
	}

	/** full constructor */
	public AlMstr(AlMstrId id, String alDesc, String alUser1, String alUser2,
			String alUserid, Date alQad01, Double oidAlMstr) {
		super(id, alDesc, alUser1, alUser2, alUserid, alQad01, oidAlMstr);
	}

}
