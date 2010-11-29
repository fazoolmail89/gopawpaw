package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KnbiMstr entity. @author MyEclipse Persistence Tools
 */
public class KnbiMstr extends AbstractKnbiMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbiMstr() {
	}

	/** full constructor */
	public KnbiMstr(KnbiMstrId id, Double knbiKeyid, String knbiRouting,
			String knbiBomCode, Date knbiModDate, String knbiModUserid,
			String knbiUser1, String knbiUser2, String knbiQadc01,
			String knbiQadc02, Integer knbiCmtindx, Double knbiMinEpeInterval,
			String knbiRunOutMaterial, Integer knbiRunOutOption,
			Double knbiRunOutQtyPer, String knbiRunOutQtyperUm,
			Double knbiRunOutQuantity, String knbiRunOutQtyUm,
			Double knbiRunOutSetup, Integer knbiAvgInvMethod,
			Double knbiCostAlloc, String knbiContType, Double knbiUmConv,
			Double oidKnbiMstr) {
		super(id, knbiKeyid, knbiRouting, knbiBomCode, knbiModDate,
				knbiModUserid, knbiUser1, knbiUser2, knbiQadc01, knbiQadc02,
				knbiCmtindx, knbiMinEpeInterval, knbiRunOutMaterial,
				knbiRunOutOption, knbiRunOutQtyPer, knbiRunOutQtyperUm,
				knbiRunOutQuantity, knbiRunOutQtyUm, knbiRunOutSetup,
				knbiAvgInvMethod, knbiCostAlloc, knbiContType, knbiUmConv,
				oidKnbiMstr);
	}

}
