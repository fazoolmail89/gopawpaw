package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FlsdDet entity. @author MyEclipse Persistence Tools
 */
public class FlsdDet extends AbstractFlsdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlsdDet() {
	}

	/** minimal constructor */
	public FlsdDet(FlsdDetId id, Integer flsdDueTime, String flsdPart,
			String flsdFlowWoNbr, String flsdFlowWoLot, String flsdWoNbr,
			String flsdWoLot, String flsdSoNbr, Integer flsdSodLine,
			String flsdNote, Boolean flsdPostedToRep, Boolean flsdClosed,
			Double flsdQtyOrd, Double flsdQtyComp, Integer flsdCmtindx,
			String flsdModUserid, Date flsdModDate, String flsdUser1,
			String flsdUser2, String flsdUserc03, Double flsdUserd01,
			Integer flsdUseri01, Boolean flsdUserl01, String flsdQadc01,
			String flsdQadc02, String flsdQadc03, String flsdQadc04,
			String flsdQadc05, String flsdQadc06, Double flsdQadd01,
			Double flsdQadd02, Integer flsdQadi01, Integer flsdQadi02,
			Boolean flsdQadl01, Boolean flsdQadl02, Integer flsdShift,
			Double flsdKnpdKeyid, Double oidFlsdDet) {
		super(id, flsdDueTime, flsdPart, flsdFlowWoNbr, flsdFlowWoLot,
				flsdWoNbr, flsdWoLot, flsdSoNbr, flsdSodLine, flsdNote,
				flsdPostedToRep, flsdClosed, flsdQtyOrd, flsdQtyComp,
				flsdCmtindx, flsdModUserid, flsdModDate, flsdUser1, flsdUser2,
				flsdUserc03, flsdUserd01, flsdUseri01, flsdUserl01, flsdQadc01,
				flsdQadc02, flsdQadc03, flsdQadc04, flsdQadc05, flsdQadc06,
				flsdQadd01, flsdQadd02, flsdQadi01, flsdQadi02, flsdQadl01,
				flsdQadl02, flsdShift, flsdKnpdKeyid, oidFlsdDet);
	}

	/** full constructor */
	public FlsdDet(FlsdDetId id, Integer flsdDueTime, String flsdPart,
			String flsdFlowWoNbr, String flsdFlowWoLot, String flsdWoNbr,
			String flsdWoLot, String flsdSoNbr, Integer flsdSodLine,
			String flsdNote, Boolean flsdPostedToRep, Boolean flsdClosed,
			Double flsdQtyOrd, Double flsdQtyComp, Integer flsdCmtindx,
			String flsdModUserid, Date flsdModDate, String flsdUser1,
			String flsdUser2, String flsdUserc03, Double flsdUserd01,
			Integer flsdUseri01, Boolean flsdUserl01, Date flsdUsert01,
			String flsdQadc01, String flsdQadc02, String flsdQadc03,
			String flsdQadc04, String flsdQadc05, String flsdQadc06,
			Double flsdQadd01, Double flsdQadd02, Integer flsdQadi01,
			Integer flsdQadi02, Boolean flsdQadl01, Boolean flsdQadl02,
			Date flsdQadt01, Date flsdQadt02, Integer flsdShift,
			Double flsdKnpdKeyid, Double oidFlsdDet) {
		super(id, flsdDueTime, flsdPart, flsdFlowWoNbr, flsdFlowWoLot,
				flsdWoNbr, flsdWoLot, flsdSoNbr, flsdSodLine, flsdNote,
				flsdPostedToRep, flsdClosed, flsdQtyOrd, flsdQtyComp,
				flsdCmtindx, flsdModUserid, flsdModDate, flsdUser1, flsdUser2,
				flsdUserc03, flsdUserd01, flsdUseri01, flsdUserl01,
				flsdUsert01, flsdQadc01, flsdQadc02, flsdQadc03, flsdQadc04,
				flsdQadc05, flsdQadc06, flsdQadd01, flsdQadd02, flsdQadi01,
				flsdQadi02, flsdQadl01, flsdQadl02, flsdQadt01, flsdQadt02,
				flsdShift, flsdKnpdKeyid, oidFlsdDet);
	}

}
