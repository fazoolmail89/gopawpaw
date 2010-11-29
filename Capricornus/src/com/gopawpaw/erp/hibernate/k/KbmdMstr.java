package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KbmdMstr entity. @author MyEclipse Persistence Tools
 */
public class KbmdMstr extends AbstractKbmdMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public KbmdMstr() {
	}

	/** minimal constructor */
	public KbmdMstr(KbmdMstrId id, String kbmdPeriod, Integer kbmdDemand,
			String kbmdModUserid, Date kbmdModDate, String kbmdUser1,
			String kbmdUser2, String kbmdChr01, Double kbmdDec01,
			Boolean kbmdLog01, Integer kbmdInt01, String kbmdQadc01,
			Integer kbmdQadi01, Double kbmdQadd01, Boolean kbmdQadl01,
			Double oidKbmdMstr) {
		super(id, kbmdPeriod, kbmdDemand, kbmdModUserid, kbmdModDate,
				kbmdUser1, kbmdUser2, kbmdChr01, kbmdDec01, kbmdLog01,
				kbmdInt01, kbmdQadc01, kbmdQadi01, kbmdQadd01, kbmdQadl01,
				oidKbmdMstr);
	}

	/** full constructor */
	public KbmdMstr(KbmdMstrId id, String kbmdPeriod, Integer kbmdDemand,
			String kbmdModUserid, Date kbmdModDate, String kbmdUser1,
			String kbmdUser2, String kbmdChr01, Double kbmdDec01,
			Date kbmdDte01, Boolean kbmdLog01, Integer kbmdInt01,
			String kbmdQadc01, Integer kbmdQadi01, Double kbmdQadd01,
			Boolean kbmdQadl01, Date kbmdQadt01, Double oidKbmdMstr) {
		super(id, kbmdPeriod, kbmdDemand, kbmdModUserid, kbmdModDate,
				kbmdUser1, kbmdUser2, kbmdChr01, kbmdDec01, kbmdDte01,
				kbmdLog01, kbmdInt01, kbmdQadc01, kbmdQadi01, kbmdQadd01,
				kbmdQadl01, kbmdQadt01, oidKbmdMstr);
	}

}
