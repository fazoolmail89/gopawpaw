package com.gopawpaw.erp.hibernate.a;

/**
 * ActMstr entity. @author MyEclipse Persistence Tools
 */
public class ActMstr extends AbstractActMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ActMstr() {
	}

	/** minimal constructor */
	public ActMstr(ActMstrId id, Double oidActMstr) {
		super(id, oidActMstr);
	}

	/** full constructor */
	public ActMstr(ActMstrId id, String actUser1, String actUser2,
			String actQadc01, String actChargeType, Integer actOrdMult,
			Double oidActMstr) {
		super(id, actUser1, actUser2, actQadc01, actChargeType, actOrdMult,
				oidActMstr);
	}

}
