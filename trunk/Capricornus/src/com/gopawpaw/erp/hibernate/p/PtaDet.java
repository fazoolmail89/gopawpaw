package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PtaDet entity. @author MyEclipse Persistence Tools
 */
public class PtaDet extends AbstractPtaDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtaDet() {
	}

	/** minimal constructor */
	public PtaDet(PtaDetId id, Double oidPtaDet) {
		super(id, oidPtaDet);
	}

	/** full constructor */
	public PtaDet(PtaDetId id, String ptaAssocUm, Double ptaAssocQty,
			Double ptaNetPrice, String ptaPriType, Double ptaMinOrd,
			Double ptaQtyMult, Double ptaMaxQty, Date ptaExpire,
			String ptaUser1, String ptaUser2, String ptaQadc01,
			String ptaQadc02, Double ptaQadd01, Double ptaQadd02,
			Boolean ptaQadl01, Date ptaDte01, Date ptaDte02, Double ptaDec01,
			Double ptaDec02, Boolean ptaLog01, String ptaChr01,
			String ptaChr02, String ptaChr03, String ptaChr04, String ptaChr05,
			String ptaChr06, String ptaChr07, String ptaChr08, String ptaChr09,
			String ptaChr10, Integer ptaCmtindx, Boolean ptaExtrec,
			Double oidPtaDet) {
		super(id, ptaAssocUm, ptaAssocQty, ptaNetPrice, ptaPriType, ptaMinOrd,
				ptaQtyMult, ptaMaxQty, ptaExpire, ptaUser1, ptaUser2,
				ptaQadc01, ptaQadc02, ptaQadd01, ptaQadd02, ptaQadl01,
				ptaDte01, ptaDte02, ptaDec01, ptaDec02, ptaLog01, ptaChr01,
				ptaChr02, ptaChr03, ptaChr04, ptaChr05, ptaChr06, ptaChr07,
				ptaChr08, ptaChr09, ptaChr10, ptaCmtindx, ptaExtrec, oidPtaDet);
	}

}
