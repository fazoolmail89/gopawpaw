package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DomMstr entity. @author MyEclipse Persistence Tools
 */
public class DomMstr extends AbstractDomMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DomMstr() {
	}

	/** full constructor */
	public DomMstr(String domName, String domType, String domModUserid,
			Date domModDate, String domUser1, String domUser2,
			String domQadc01, String domQadc02, String domSname, String domDb,
			Boolean domActive, Double oidDomMstr) {
		super(domName, domType, domModUserid, domModDate, domUser1, domUser2,
				domQadc01, domQadc02, domSname, domDb, domActive, oidDomMstr);
	}

}
