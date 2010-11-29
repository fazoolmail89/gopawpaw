package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbsccDet entity. @author MyEclipse Persistence Tools
 */
public class AbsccDet extends AbstractAbsccDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AbsccDet() {
	}

	/** minimal constructor */
	public AbsccDet(AbsccDetId id, String absccOrder, Integer absccOrdLine,
			String absccContainer, Double absccQty, Double absccContPrice,
			String absccInvNbr, String absccChargeType, String absccRef,
			String absccShipto, Date absccShpDate, Boolean absccConfirmed,
			Boolean absccInvPost, String absccFrClass, Double absccShipWt,
			String absccShipWtUm, String absccSlsAcct, String absccSlsCc,
			String absccTaxc, Boolean absccTaxable, String absccSlsSub,
			String absccProject, String absccModUserid, String absccUserc01,
			String absccUserc02, String absccQadc01, String absccQadc02,
			Double oidAbsccDet) {
		super(id, absccOrder, absccOrdLine, absccContainer, absccQty,
				absccContPrice, absccInvNbr, absccChargeType, absccRef,
				absccShipto, absccShpDate, absccConfirmed, absccInvPost,
				absccFrClass, absccShipWt, absccShipWtUm, absccSlsAcct,
				absccSlsCc, absccTaxc, absccTaxable, absccSlsSub, absccProject,
				absccModUserid, absccUserc01, absccUserc02, absccQadc01,
				absccQadc02, oidAbsccDet);
	}

	/** full constructor */
	public AbsccDet(AbsccDetId id, String absccOrder, Integer absccOrdLine,
			String absccContainer, Double absccQty, Double absccContPrice,
			String absccInvNbr, String absccChargeType, String absccRef,
			String absccShipto, Date absccShpDate, Boolean absccConfirmed,
			Boolean absccInvPost, String absccFrClass, Double absccShipWt,
			String absccShipWtUm, String absccSlsAcct, String absccSlsCc,
			String absccTaxc, Boolean absccTaxable, String absccSlsSub,
			String absccProject, String absccModUserid, Date absccModDate,
			String absccUserc01, String absccUserc02, String absccQadc01,
			String absccQadc02, Double oidAbsccDet) {
		super(id, absccOrder, absccOrdLine, absccContainer, absccQty,
				absccContPrice, absccInvNbr, absccChargeType, absccRef,
				absccShipto, absccShpDate, absccConfirmed, absccInvPost,
				absccFrClass, absccShipWt, absccShipWtUm, absccSlsAcct,
				absccSlsCc, absccTaxc, absccTaxable, absccSlsSub, absccProject,
				absccModUserid, absccModDate, absccUserc01, absccUserc02,
				absccQadc01, absccQadc02, oidAbsccDet);
	}

}
