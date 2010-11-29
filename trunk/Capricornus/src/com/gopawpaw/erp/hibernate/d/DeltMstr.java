package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DeltMstr entity. @author MyEclipse Persistence Tools
 */
public class DeltMstr extends AbstractDeltMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DeltMstr() {
	}

	/** minimal constructor */
	public DeltMstr(DeltMstrId id, Integer deltTransit, String deltUserc01,
			String deltUserc02, Double deltUserd01, Integer deltUseri01,
			Boolean deltUserl01, String deltQadc01, Double deltQadd01,
			Integer deltQadi01, Boolean deltQadl01, String deltModUserid,
			Double oidDeltMstr) {
		super(id, deltTransit, deltUserc01, deltUserc02, deltUserd01,
				deltUseri01, deltUserl01, deltQadc01, deltQadd01, deltQadi01,
				deltQadl01, deltModUserid, oidDeltMstr);
	}

	/** full constructor */
	public DeltMstr(DeltMstrId id, Integer deltTransit, String deltUserc01,
			String deltUserc02, Double deltUserd01, Date deltUsert01,
			Integer deltUseri01, Boolean deltUserl01, String deltQadc01,
			Double deltQadd01, Integer deltQadi01, Boolean deltQadl01,
			Date deltQadt01, Date deltModDate, String deltModUserid,
			Double oidDeltMstr) {
		super(id, deltTransit, deltUserc01, deltUserc02, deltUserd01,
				deltUsert01, deltUseri01, deltUserl01, deltQadc01, deltQadd01,
				deltQadi01, deltQadl01, deltQadt01, deltModDate, deltModUserid,
				oidDeltMstr);
	}

}
