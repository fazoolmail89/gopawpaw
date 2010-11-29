package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TzoMstr entity. @author MyEclipse Persistence Tools
 */
public class TzoMstr extends AbstractTzoMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TzoMstr() {
	}

	/** minimal constructor */
	public TzoMstr(TzoMstrId id, Double oidTzoMstr) {
		super(id, oidTzoMstr);
	}

	/** full constructor */
	public TzoMstr(TzoMstrId id, String tzoDesc, Boolean tzoAutoAdj,
			String tzoTzone, String tzoUser1, String tzoUser2, String tzoChr01,
			Boolean tzoLog01, Date tzoDte01, Integer tzoInt01,
			String tzoQadc01, Date tzoQadt01, Integer tzoQadi01,
			Boolean tzoQadl01, String tzoModUserid, Date tzoModDate,
			Double oidTzoMstr) {
		super(id, tzoDesc, tzoAutoAdj, tzoTzone, tzoUser1, tzoUser2, tzoChr01,
				tzoLog01, tzoDte01, tzoInt01, tzoQadc01, tzoQadt01, tzoQadi01,
				tzoQadl01, tzoModUserid, tzoModDate, oidTzoMstr);
	}

}
