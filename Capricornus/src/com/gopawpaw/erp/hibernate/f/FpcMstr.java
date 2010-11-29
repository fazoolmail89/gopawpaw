package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FpcMstr entity. @author MyEclipse Persistence Tools
 */
public class FpcMstr extends AbstractFpcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FpcMstr() {
	}

	/** minimal constructor */
	public FpcMstr(FpcMstrId id, Double oidFpcMstr) {
		super(id, oidFpcMstr);
	}

	/** full constructor */
	public FpcMstr(FpcMstrId id, String fpcAmt, String fpcAmtType,
			Date fpcExpire, String fpcMaxPrice, Double fpcMinPrice,
			String fpcMinQty, Date fpcModDate, String fpcSvCode,
			Boolean fpcTaxIn, String fpcUserid, String fpcChr01,
			String fpcChr02, String fpcChr03, String fpcChr04, Double fpcDec01,
			Double fpcDec02, Double fpcDec03, Date fpcDte01, Date fpcDte02,
			Date fpcDte03, Boolean fpcLog01, Boolean fpcLog02,
			Boolean fpcLog03, String fpcQadc01, String fpcQadc02,
			String fpcQadc03, String fpcQadc04, Date fpcQadd01, Date fpcQadd02,
			Date fpcQadd03, Double fpcQadde01, Double fpcQadde02,
			Double fpcQadde03, Boolean fpcQadl01, Boolean fpcQadl02,
			Boolean fpcQadl03, String fpcUser1, String fpcUser2,
			Double oidFpcMstr) {
		super(id, fpcAmt, fpcAmtType, fpcExpire, fpcMaxPrice, fpcMinPrice,
				fpcMinQty, fpcModDate, fpcSvCode, fpcTaxIn, fpcUserid,
				fpcChr01, fpcChr02, fpcChr03, fpcChr04, fpcDec01, fpcDec02,
				fpcDec03, fpcDte01, fpcDte02, fpcDte03, fpcLog01, fpcLog02,
				fpcLog03, fpcQadc01, fpcQadc02, fpcQadc03, fpcQadc04,
				fpcQadd01, fpcQadd02, fpcQadd03, fpcQadde01, fpcQadde02,
				fpcQadde03, fpcQadl01, fpcQadl02, fpcQadl03, fpcUser1,
				fpcUser2, oidFpcMstr);
	}

}
