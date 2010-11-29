package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FktMstr entity. @author MyEclipse Persistence Tools
 */
public class FktMstr extends AbstractFktMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FktMstr() {
	}

	/** minimal constructor */
	public FktMstr(FktMstrId id, Double oidFktMstr) {
		super(id, oidFktMstr);
	}

	/** full constructor */
	public FktMstr(FktMstrId id, String fktBomCode, Boolean fktInUse,
			String fktEngCode, String fktCurrSite, String fktCurrLoc,
			String fktLoc, Date fktModDate, String fktPart,
			Boolean fktComplete, String fktRev, String fktType, String fktSite,
			Boolean fktOrder, String fktChr01, String fktChr02,
			String fktChr03, String fktChr04, Double fktDec01, Double fktDec02,
			Double fktDec03, Date fktDte01, Date fktDte02, Date fktDte03,
			Boolean fktLog01, Boolean fktLog02, Boolean fktLog03,
			String fktQadc01, String fktQadc02, String fktQadc03,
			String fktQadc04, Date fktQadd01, Date fktQadd02, Date fktQadd03,
			Double fktQadde01, Double fktQadde02, Double fktQadde03,
			Boolean fktQadl01, Boolean fktQadl02, Boolean fktQadl03,
			Date fktEffDate, String fktModUserid, String fktUser1,
			String fktUser2, Double oidFktMstr) {
		super(id, fktBomCode, fktInUse, fktEngCode, fktCurrSite, fktCurrLoc,
				fktLoc, fktModDate, fktPart, fktComplete, fktRev, fktType,
				fktSite, fktOrder, fktChr01, fktChr02, fktChr03, fktChr04,
				fktDec01, fktDec02, fktDec03, fktDte01, fktDte02, fktDte03,
				fktLog01, fktLog02, fktLog03, fktQadc01, fktQadc02, fktQadc03,
				fktQadc04, fktQadd01, fktQadd02, fktQadd03, fktQadde01,
				fktQadde02, fktQadde03, fktQadl01, fktQadl02, fktQadl03,
				fktEffDate, fktModUserid, fktUser1, fktUser2, oidFktMstr);
	}

}
