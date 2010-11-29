package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GltDet entity. @author MyEclipse Persistence Tools
 */
public class GltDet extends AbstractGltDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GltDet() {
	}

	/** minimal constructor */
	public GltDet(GltDetId id, Double gltEntrExrate, Integer gltPer,
			Integer gltYear, Boolean gltCorrection, String gltDyCode,
			String gltDyNum, Double gltExRate2, String gltExRatetype,
			Double gltEnExrate2, Integer gltExruSeq, Integer gltEnExruSeq,
			String gltSrcDesc, Double oidGltDet) {
		super(id, gltEntrExrate, gltPer, gltYear, gltCorrection, gltDyCode,
				gltDyNum, gltExRate2, gltExRatetype, gltEnExrate2, gltExruSeq,
				gltEnExruSeq, gltSrcDesc, oidGltDet);
	}

	/** full constructor */
	public GltDet(GltDetId id, String gltEntity, String gltAcct, String gltCc,
			String gltDesc, Date gltDate, Date gltEffdate, Double gltAmt,
			String gltUserid, String gltProject, String gltBatch,
			String gltCurr, Double gltCurrAmt, Boolean gltUnb,
			String gltTrType, String gltError, Double gltExRate,
			String gltAddr, String gltDoc, String gltDocType, String gltUser1,
			String gltUser2, String gltFxInd, String gltSub, Double gltEcurAmt,
			Double gltEnExrate, Double gltEntrExrate, Integer gltPer,
			Integer gltYear, String gltQadc01, Boolean gltCorrection,
			String gltDyCode, String gltDyNum, Double gltExRate2,
			String gltExRatetype, Double gltEnExrate2, Integer gltExruSeq,
			Integer gltEnExruSeq, String gltSrcDesc, Double oidGltDet) {
		super(id, gltEntity, gltAcct, gltCc, gltDesc, gltDate, gltEffdate,
				gltAmt, gltUserid, gltProject, gltBatch, gltCurr, gltCurrAmt,
				gltUnb, gltTrType, gltError, gltExRate, gltAddr, gltDoc,
				gltDocType, gltUser1, gltUser2, gltFxInd, gltSub, gltEcurAmt,
				gltEnExrate, gltEntrExrate, gltPer, gltYear, gltQadc01,
				gltCorrection, gltDyCode, gltDyNum, gltExRate2, gltExRatetype,
				gltEnExrate2, gltExruSeq, gltEnExruSeq, gltSrcDesc, oidGltDet);
	}

}
