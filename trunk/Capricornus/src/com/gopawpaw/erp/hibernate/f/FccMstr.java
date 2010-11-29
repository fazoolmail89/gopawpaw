package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FccMstr entity. @author MyEclipse Persistence Tools
 */
public class FccMstr extends AbstractFccMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FccMstr() {
	}

	/** minimal constructor */
	public FccMstr(FccMstrId id, Double oidFccMstr) {
		super(id, oidFccMstr);
	}

	/** full constructor */
	public FccMstr(FccMstrId id, String fccProdLine, String fccChr01,
			String fccChr02, String fccChr03, String fccChr04, Double fccDec01,
			Double fccDec02, Double fccDec03, Date fccDte01, Date fccDte02,
			Date fccDte03, Boolean fccLog01, Boolean fccLog02,
			Boolean fccLog03, String fccQadc01, String fccQadc02,
			String fccQadc03, String fccQadc04, Date fccQadt01, Date fccQadt02,
			Date fccQadt03, Double fccQadd01, Double fccQadd02,
			Double fccQadd03, Boolean fccQadl01, Boolean fccQadl02,
			Boolean fccQadl03, Date fccModDate, String fccModUserid,
			String fccUser1, String fccUser2, Double oidFccMstr) {
		super(id, fccProdLine, fccChr01, fccChr02, fccChr03, fccChr04,
				fccDec01, fccDec02, fccDec03, fccDte01, fccDte02, fccDte03,
				fccLog01, fccLog02, fccLog03, fccQadc01, fccQadc02, fccQadc03,
				fccQadc04, fccQadt01, fccQadt02, fccQadt03, fccQadd01,
				fccQadd02, fccQadd03, fccQadl01, fccQadl02, fccQadl03,
				fccModDate, fccModUserid, fccUser1, fccUser2, oidFccMstr);
	}

}
