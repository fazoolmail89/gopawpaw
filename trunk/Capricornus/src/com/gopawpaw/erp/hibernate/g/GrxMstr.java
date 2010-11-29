package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GrxMstr entity. @author MyEclipse Persistence Tools
 */
public class GrxMstr extends AbstractGrxMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrxMstr() {
	}

	/** minimal constructor */
	public GrxMstr(GrxMstrId id, Double oidGrxMstr) {
		super(id, oidGrxMstr);
	}

	/** full constructor */
	public GrxMstr(GrxMstrId id, String grxDesc, String grxAddId,
			Date grxAddDate, String grxModId, Date grxModDate,
			String grxRpGroup, Boolean grxStatus, Integer grxCmtindx,
			String grxRowGroup, String grxColGroup, String grxRound,
			String grxFormat, String grxDefprt, Integer grxMrgTop,
			Integer grxMrgBot, String grxUser1, String grxUser2,
			Integer grxLabBc, String grxMtGroup, String grxCtlGl,
			String grxCtlAc, Boolean grxContPg, Integer grxMrgLeft,
			Integer grxMrgRight, String grxTextIx, String grxZeroSuppress,
			String grxQadc01, Double oidGrxMstr) {
		super(id, grxDesc, grxAddId, grxAddDate, grxModId, grxModDate,
				grxRpGroup, grxStatus, grxCmtindx, grxRowGroup, grxColGroup,
				grxRound, grxFormat, grxDefprt, grxMrgTop, grxMrgBot, grxUser1,
				grxUser2, grxLabBc, grxMtGroup, grxCtlGl, grxCtlAc, grxContPg,
				grxMrgLeft, grxMrgRight, grxTextIx, grxZeroSuppress, grxQadc01,
				oidGrxMstr);
	}

}
