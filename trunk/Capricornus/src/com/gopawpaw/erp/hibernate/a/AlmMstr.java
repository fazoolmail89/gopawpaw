package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AlmMstr entity. @author MyEclipse Persistence Tools
 */
public class AlmMstr extends AbstractAlmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AlmMstr() {
	}

	/** minimal constructor */
	public AlmMstr(AlmMstrId id, Double oidAlmMstr) {
		super(id, oidAlmMstr);
	}

	/** full constructor */
	public AlmMstr(AlmMstrId id, String almLead, Double almSeq, Integer almLen,
			String almTrail, String almPgm, String almUserid, Date almDate,
			String almUser1, String almUser2, String almQadc01,
			Double oidAlmMstr) {
		super(id, almLead, almSeq, almLen, almTrail, almPgm, almUserid,
				almDate, almUser1, almUser2, almQadc01, oidAlmMstr);
	}

}
