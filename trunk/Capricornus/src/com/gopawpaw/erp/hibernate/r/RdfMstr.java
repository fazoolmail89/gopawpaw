package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RdfMstr entity. @author MyEclipse Persistence Tools
 */
public class RdfMstr extends AbstractRdfMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RdfMstr() {
	}

	/** minimal constructor */
	public RdfMstr(RdfMstrId id, String rdfBomCode, Double oidRdfMstr) {
		super(id, rdfBomCode, oidRdfMstr);
	}

	/** full constructor */
	public RdfMstr(RdfMstrId id, String rdfGroup, String rdfRtnSite,
			String rdfRtnLoc, String rdfSpareSite, String rdfSpareLoc,
			String rdfSrtnSite, String rdfSrtnLoc, String rdfRtsSite,
			String rdfRtsLoc, String rdfDesc, String rdfUser1, String rdfUser2,
			String rdfScrapSite, String rdfScrapLoc, String rdfAddr,
			String rdfCaType, String rdfEsNbr, Boolean rdfNotify,
			String rdfFax, String rdfEmail, String rdfTransitLoc,
			String rdfTransitSite, Double rdfShipTime, Double rdfRepairDays,
			String rdfBomCode, String rdfRouting, String rdfRrtsLoc,
			String rdfRrtsSite, String rdfRepSite, String rdfRepLoc,
			String rdfChr01, String rdfChr02, String rdfChr03, String rdfChr04,
			String rdfChr05, Double rdfDec01, Double rdfDec02, Date rdfDte01,
			Date rdfDte02, Boolean rdfLog01, Boolean rdfLog02,
			String rdfQadc01, String rdfQadc02, String rdfQadc03,
			Date rdfQadt01, Double rdfQade01, Double rdfQade02,
			Boolean rdfQadl01, Boolean rdfQadl02, Date rdfModDate,
			String rdfModUserid, Double oidRdfMstr) {
		super(id, rdfGroup, rdfRtnSite, rdfRtnLoc, rdfSpareSite, rdfSpareLoc,
				rdfSrtnSite, rdfSrtnLoc, rdfRtsSite, rdfRtsLoc, rdfDesc,
				rdfUser1, rdfUser2, rdfScrapSite, rdfScrapLoc, rdfAddr,
				rdfCaType, rdfEsNbr, rdfNotify, rdfFax, rdfEmail,
				rdfTransitLoc, rdfTransitSite, rdfShipTime, rdfRepairDays,
				rdfBomCode, rdfRouting, rdfRrtsLoc, rdfRrtsSite, rdfRepSite,
				rdfRepLoc, rdfChr01, rdfChr02, rdfChr03, rdfChr04, rdfChr05,
				rdfDec01, rdfDec02, rdfDte01, rdfDte02, rdfLog01, rdfLog02,
				rdfQadc01, rdfQadc02, rdfQadc03, rdfQadt01, rdfQade01,
				rdfQade02, rdfQadl01, rdfQadl02, rdfModDate, rdfModUserid,
				oidRdfMstr);
	}

}
