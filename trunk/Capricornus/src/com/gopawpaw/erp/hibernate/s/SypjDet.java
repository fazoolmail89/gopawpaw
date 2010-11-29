package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SypjDet entity. @author MyEclipse Persistence Tools
 */
public class SypjDet extends AbstractSypjDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SypjDet() {
	}

	/** minimal constructor */
	public SypjDet(SypjDetId id, Double oidSypjDet) {
		super(id, oidSypjDet);
	}

	/** full constructor */
	public SypjDet(SypjDetId id, String sypjJoinCrit, String sypjModUserid,
			Date sypjModDate, String sypjUser1, String sypjUser2,
			String sypjChr01, String sypjChr02, Double sypjDec01,
			Double sypjDec02, Integer sypjInt01, Integer sypjInt02,
			Boolean sypjLog01, Boolean sypjLog02, Date sypjDte01,
			Date sypjDte02, String sypjQadc01, String sypjQadc02,
			String sypjQadc03, String sypjQadc04, Double sypjQadd01,
			Double sypjQadd02, Integer sypjQadi01, Integer sypjQadi02,
			Boolean sypjQadl01, Boolean sypjQadl02, Date sypjQadt01,
			Date sypjQadt02, Boolean sypjReqdJoin, Boolean sypjPublJoined,
			Integer sypjSeq, Double oidSypjDet) {
		super(id, sypjJoinCrit, sypjModUserid, sypjModDate, sypjUser1,
				sypjUser2, sypjChr01, sypjChr02, sypjDec01, sypjDec02,
				sypjInt01, sypjInt02, sypjLog01, sypjLog02, sypjDte01,
				sypjDte02, sypjQadc01, sypjQadc02, sypjQadc03, sypjQadc04,
				sypjQadd01, sypjQadd02, sypjQadi01, sypjQadi02, sypjQadl01,
				sypjQadl02, sypjQadt01, sypjQadt02, sypjReqdJoin,
				sypjPublJoined, sypjSeq, oidSypjDet);
	}

}
