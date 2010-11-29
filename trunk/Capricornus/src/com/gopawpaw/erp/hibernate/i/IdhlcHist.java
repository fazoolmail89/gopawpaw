package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IdhlcHist entity. @author MyEclipse Persistence Tools
 */
public class IdhlcHist extends AbstractIdhlcHist implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IdhlcHist() {
	}

	/** minimal constructor */
	public IdhlcHist(IdhlcHistId id, String idhlcTrl,
			String idhlcChargeCategory, String idhlcPart, Double idhlcPrice,
			String idhlcChargeType, Double idhlcQtyInv, String idhlcUm,
			String idhlcDesc, String idhlcDesc1, String idhlcDesc2,
			String idhlcFrClass, Double idhlcFrWt, String idhlcFrWtUm,
			String idhlcProdline, Boolean idhlcTaxable, String idhlcTaxc,
			String idhlcTaxEnv, String idhlcTaxUsage, String idhlcAcct,
			String idhlcSub, String idhlcCc, String idhlcProject,
			String idhlcModUserid, String idhlcUserc01, String idhlcUserc02,
			String idhlcQadc01, String idhlcQadc02, Double oidIdhlcHist) {
		super(id, idhlcTrl, idhlcChargeCategory, idhlcPart, idhlcPrice,
				idhlcChargeType, idhlcQtyInv, idhlcUm, idhlcDesc, idhlcDesc1,
				idhlcDesc2, idhlcFrClass, idhlcFrWt, idhlcFrWtUm,
				idhlcProdline, idhlcTaxable, idhlcTaxc, idhlcTaxEnv,
				idhlcTaxUsage, idhlcAcct, idhlcSub, idhlcCc, idhlcProject,
				idhlcModUserid, idhlcUserc01, idhlcUserc02, idhlcQadc01,
				idhlcQadc02, oidIdhlcHist);
	}

	/** full constructor */
	public IdhlcHist(IdhlcHistId id, String idhlcTrl,
			String idhlcChargeCategory, String idhlcPart, Double idhlcPrice,
			String idhlcChargeType, Double idhlcQtyInv, String idhlcUm,
			String idhlcDesc, String idhlcDesc1, String idhlcDesc2,
			String idhlcFrClass, Double idhlcFrWt, String idhlcFrWtUm,
			String idhlcProdline, Boolean idhlcTaxable, String idhlcTaxc,
			String idhlcTaxEnv, String idhlcTaxUsage, String idhlcAcct,
			String idhlcSub, String idhlcCc, String idhlcProject,
			String idhlcModUserid, Date idhlcModDate, String idhlcUserc01,
			String idhlcUserc02, String idhlcQadc01, String idhlcQadc02,
			Double oidIdhlcHist) {
		super(id, idhlcTrl, idhlcChargeCategory, idhlcPart, idhlcPrice,
				idhlcChargeType, idhlcQtyInv, idhlcUm, idhlcDesc, idhlcDesc1,
				idhlcDesc2, idhlcFrClass, idhlcFrWt, idhlcFrWtUm,
				idhlcProdline, idhlcTaxable, idhlcTaxc, idhlcTaxEnv,
				idhlcTaxUsage, idhlcAcct, idhlcSub, idhlcCc, idhlcProject,
				idhlcModUserid, idhlcModDate, idhlcUserc01, idhlcUserc02,
				idhlcQadc01, idhlcQadc02, oidIdhlcHist);
	}

}
