package com.gopawpaw.erp.hibernate.p;

/**
 * PtqaDet entity. @author MyEclipse Persistence Tools
 */
public class PtqaDet extends AbstractPtqaDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtqaDet() {
	}

	/** minimal constructor */
	public PtqaDet(PtqaDetId id, Double oidPtqaDet) {
		super(id, oidPtqaDet);
	}

	/** full constructor */
	public PtqaDet(PtqaDetId id, Double ptqaQty, String ptqaUm,
			Double ptqaInterval, Double ptqaConfPct, Integer ptqaCmtindx,
			String ptqaUser1, String ptqaUser2, String ptqaChr01,
			String ptqaChr02, String ptqaChr03, String ptqaChr04,
			String ptqaChr05, Double ptqaDec01, Double ptqaDec02,
			Boolean ptqaLog01, Boolean ptqaLog02, Double oidPtqaDet) {
		super(id, ptqaQty, ptqaUm, ptqaInterval, ptqaConfPct, ptqaCmtindx,
				ptqaUser1, ptqaUser2, ptqaChr01, ptqaChr02, ptqaChr03,
				ptqaChr04, ptqaChr05, ptqaDec01, ptqaDec02, ptqaLog01,
				ptqaLog02, oidPtqaDet);
	}

}
