package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GriMstr entity. @author MyEclipse Persistence Tools
 */
public class GriMstr extends AbstractGriMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GriMstr() {
	}

	/** minimal constructor */
	public GriMstr(GriMstrId id, Double oidGriMstr) {
		super(id, oidGriMstr);
	}

	/** full constructor */
	public GriMstr(GriMstrId id, Date griDate, String griUserid,
			String griDefprt, Integer griMrgBot, Integer griMrgLeft,
			String griTime, Integer griLabBc, String griFormat,
			String griRound, Boolean griStatus, Boolean griPrtWrk,
			Integer griPer, Integer griYear, Integer griMrgRight,
			Integer griMrgTop, String griTextIx, String griOvrCode,
			String griOvrType, Integer griLabWidth, String griZeroSuppress,
			Boolean griContPg, Boolean griFiltered, Boolean griPaginated,
			String griDesc, String griUser1, String griUser2, String griQadc01,
			Double oidGriMstr) {
		super(id, griDate, griUserid, griDefprt, griMrgBot, griMrgLeft,
				griTime, griLabBc, griFormat, griRound, griStatus, griPrtWrk,
				griPer, griYear, griMrgRight, griMrgTop, griTextIx, griOvrCode,
				griOvrType, griLabWidth, griZeroSuppress, griContPg,
				griFiltered, griPaginated, griDesc, griUser1, griUser2,
				griQadc01, oidGriMstr);
	}

}
