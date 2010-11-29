package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SpMstr entity. @author MyEclipse Persistence Tools
 */
public class SpMstr extends AbstractSpMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SpMstr() {
	}

	/** minimal constructor */
	public SpMstr(SpMstrId id, Double oidSpMstr) {
		super(id, oidSpMstr);
	}

	/** full constructor */
	public SpMstr(SpMstrId id, String spTerritory, Double spCommPct,
			String spSort, String spUser1, String spUser2, String spChr01,
			String spChr02, String spChr03, String spChr04, String spChr05,
			Date spDte01, Date spDte02, Double spDec01, Double spDec02,
			Boolean spLog01, Double oidSpMstr) {
		super(id, spTerritory, spCommPct, spSort, spUser1, spUser2, spChr01,
				spChr02, spChr03, spChr04, spChr05, spDte01, spDte02, spDec01,
				spDec02, spLog01, oidSpMstr);
	}

}
