package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * QodDet entity. @author MyEclipse Persistence Tools
 */
public class QodDet extends AbstractQodDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QodDet() {
	}

	/** minimal constructor */
	public QodDet(QodDetId id, Boolean qodBonus, Boolean qodManualFrList,
			Double oidQodDet) {
		super(id, qodBonus, qodManualFrList, oidQodDet);
	}

	/** full constructor */
	public QodDet(QodDetId id, Date qodDueDate, Date qodPerDate,
			Date qodReqDate, String qodPart, String qodLoc, String qodType,
			Double qodPrice, Double qodStdCost, String qodAcct,
			Boolean qodAbnormal, Boolean qodTaxable, String qodSerial,
			String qodDesc, String qodUm, String qodCc, String qodQad01,
			String qodLot, Double qodUmConv, String qodFaNbr,
			Double qodDiscPct, String qodProject, Integer qodCmtindx,
			String qodCustpart, Integer qodQad02, String qodStatus,
			String qodXslspsn, String qodCommPct, String qodDscAcct,
			String qodDscCc, Double qodListPr, String qodUser1,
			String qodUser2, Double qodQtyQuot, Double qodQtyRel,
			Double qodRelChg, String qodRsnLost, Boolean qodPst,
			Double qodFstRate, Double qodFstTax, Double qodPstTax,
			Boolean qodTaxIn, Boolean qodQad03, String qodTaxc,
			Boolean qodFstList, String qodSite, Boolean qodQobStd,
			Date qodQobRev, String qodProdline, String qodChr01,
			String qodChr02, String qodChr03, String qodChr04, String qodChr05,
			String qodChr06, String qodChr07, String qodChr08, String qodChr09,
			String qodChr10, Date qodDte01, Date qodDte02, Double qodDec01,
			Double qodDec02, Boolean qodLog01, Double qodTaxMax,
			Double qodFrRate, String qodSlspsn, Double qodFrChg,
			String qodFrClass, Double qodFrWt, String qodFrWtUm,
			Boolean qodFixPr, String qodTaxUsage, String qodTaxEnv,
			String qodFrList, Double qodCrtInt, Date qodPricingDt,
			Boolean qodBonus, String qodCfgType, String qodDiv,
			Integer qodPlPriority, String qodPrig1, String qodPrig2,
			String qodSub, String qodDscSub, String qodDscProject,
			Boolean qodManualFrList, Double oidQodDet) {
		super(id, qodDueDate, qodPerDate, qodReqDate, qodPart, qodLoc, qodType,
				qodPrice, qodStdCost, qodAcct, qodAbnormal, qodTaxable,
				qodSerial, qodDesc, qodUm, qodCc, qodQad01, qodLot, qodUmConv,
				qodFaNbr, qodDiscPct, qodProject, qodCmtindx, qodCustpart,
				qodQad02, qodStatus, qodXslspsn, qodCommPct, qodDscAcct,
				qodDscCc, qodListPr, qodUser1, qodUser2, qodQtyQuot, qodQtyRel,
				qodRelChg, qodRsnLost, qodPst, qodFstRate, qodFstTax,
				qodPstTax, qodTaxIn, qodQad03, qodTaxc, qodFstList, qodSite,
				qodQobStd, qodQobRev, qodProdline, qodChr01, qodChr02,
				qodChr03, qodChr04, qodChr05, qodChr06, qodChr07, qodChr08,
				qodChr09, qodChr10, qodDte01, qodDte02, qodDec01, qodDec02,
				qodLog01, qodTaxMax, qodFrRate, qodSlspsn, qodFrChg,
				qodFrClass, qodFrWt, qodFrWtUm, qodFixPr, qodTaxUsage,
				qodTaxEnv, qodFrList, qodCrtInt, qodPricingDt, qodBonus,
				qodCfgType, qodDiv, qodPlPriority, qodPrig1, qodPrig2, qodSub,
				qodDscSub, qodDscProject, qodManualFrList, oidQodDet);
	}

}
