package com.gopawpaw.erp.hibernate.c;

/**
 * ChgMstr entity. @author MyEclipse Persistence Tools
 */
public class ChgMstr extends AbstractChgMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ChgMstr() {
	}

	/** minimal constructor */
	public ChgMstr(ChgMstrId id, Double oidChgMstr) {
		super(id, oidChgMstr);
	}

	/** full constructor */
	public ChgMstr(ChgMstrId id, Double chgTime, Double chgStart,
			String chgUser1, String chgChr01, String chgChr02, String chgChr03,
			String chgChr04, String chgChr05, Double chgDec01, String chgUser2,
			Double oidChgMstr) {
		super(id, chgTime, chgStart, chgUser1, chgChr01, chgChr02, chgChr03,
				chgChr04, chgChr05, chgDec01, chgUser2, oidChgMstr);
	}

}
