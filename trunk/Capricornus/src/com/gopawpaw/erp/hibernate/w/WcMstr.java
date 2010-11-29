package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WcMstr entity. @author MyEclipse Persistence Tools
 */
public class WcMstr extends AbstractWcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WcMstr() {
	}

	/** minimal constructor */
	public WcMstr(WcMstrId id, Double oidWcMstr) {
		super(id, oidWcMstr);
	}

	/** full constructor */
	public WcMstr(WcMstrId id, String wcDesc, String wcDept, Double wcQad01,
			Double wcMchWkctr, Integer wcMchOp, Double wcMenMch,
			Double wcLbrRate, Double wcBdnRate, Double wcBdnPct,
			Double wcMchBdn, Double wcQueue, Double wcWait, String wcWkLoc,
			Double wcPctUtil, Double wcPctEff, Double wcQad02, String wcUser1,
			String wcUser2, Double wcSetupMen, Double wcSetupRte,
			String wcUserid, Date wcModDate, Double wcBdnSurate,
			Double wcBdnSupct, Double wcMchSubdn, String wcFsmType,
			String wcQadc01, String wcQadc02, String wcQadc03, Double wcQade01,
			Double wcQade02, Boolean wcQadl01, String wcChr01, String wcChr02,
			String wcChr03, Double wcDec01, Double wcDec02, Boolean wcLog01,
			Double oidWcMstr) {
		super(id, wcDesc, wcDept, wcQad01, wcMchWkctr, wcMchOp, wcMenMch,
				wcLbrRate, wcBdnRate, wcBdnPct, wcMchBdn, wcQueue, wcWait,
				wcWkLoc, wcPctUtil, wcPctEff, wcQad02, wcUser1, wcUser2,
				wcSetupMen, wcSetupRte, wcUserid, wcModDate, wcBdnSurate,
				wcBdnSupct, wcMchSubdn, wcFsmType, wcQadc01, wcQadc02,
				wcQadc03, wcQade01, wcQade02, wcQadl01, wcChr01, wcChr02,
				wcChr03, wcDec01, wcDec02, wcLog01, oidWcMstr);
	}

}
