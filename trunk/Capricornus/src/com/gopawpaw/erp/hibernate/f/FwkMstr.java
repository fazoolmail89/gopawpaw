package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FwkMstr entity. @author MyEclipse Persistence Tools
 */
public class FwkMstr extends AbstractFwkMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FwkMstr() {
	}

	/** minimal constructor */
	public FwkMstr(FwkMstrId id, Double oidFwkMstr) {
		super(id, oidFwkMstr);
	}

	/** full constructor */
	public FwkMstr(FwkMstrId id, String fwkDesc, String fwkEgsType,
			String fwkFcgCode, Boolean fwkFixedLabor, Boolean fwkFixedPrice,
			Boolean fwkRepairCtr, String fwkChr01, String fwkChr02,
			String fwkChr03, String fwkChr04, Double fwkDec01, Double fwkDec02,
			Double fwkDec03, Date fwkDte01, Date fwkDte02, Date fwkDte03,
			Boolean fwkLog01, Boolean fwkLog02, Boolean fwkLog03,
			String fwkQadc01, String fwkQadc02, String fwkQadc03,
			String fwkQadc04, Date fwkQadd01, Date fwkQadd02, Date fwkQadd03,
			Double fwkQadde01, Double fwkQadde02, Double fwkQadde03,
			Boolean fwkQadl01, Boolean fwkQadl02, Boolean fwkQadl03,
			String fwkUser1, String fwkUser2, String fwkModUserid,
			String fwkModDate, Double oidFwkMstr) {
		super(id, fwkDesc, fwkEgsType, fwkFcgCode, fwkFixedLabor,
				fwkFixedPrice, fwkRepairCtr, fwkChr01, fwkChr02, fwkChr03,
				fwkChr04, fwkDec01, fwkDec02, fwkDec03, fwkDte01, fwkDte02,
				fwkDte03, fwkLog01, fwkLog02, fwkLog03, fwkQadc01, fwkQadc02,
				fwkQadc03, fwkQadc04, fwkQadd01, fwkQadd02, fwkQadd03,
				fwkQadde01, fwkQadde02, fwkQadde03, fwkQadl01, fwkQadl02,
				fwkQadl03, fwkUser1, fwkUser2, fwkModUserid, fwkModDate,
				oidFwkMstr);
	}

}
