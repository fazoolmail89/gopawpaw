package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FabchdDet entity. @author MyEclipse Persistence Tools
 */
public class FabchdDet extends AbstractFabchdDet implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FabchdDet() {
	}

	/** minimal constructor */
	public FabchdDet(FabchdDetId id, String fabchdDesc, String fabchdFaclsId,
			String fabchdFalocId, Double fabchdPuramt, Date fabchdStartdt,
			String fabchdInsCo, Double fabchdSalvamt, String fabchdInsNbr,
			Double fabchdInsamt, Integer fabchdUplife, Integer fabchdUpper,
			String fabchdUm, Integer fabchdQty, String fabchdUser1,
			String fabchdUser2, String fabchdModUser, Date fabchdModDate,
			String fabchdChr01, Double fabchdDec01, Boolean fabchdLog01,
			Integer fabchdInt01, String fabchdQadc01, Double fabchdQadd01,
			Boolean fabchdQadl01, Integer fabchdQadi01, Double oidFabchdDet) {
		super(id, fabchdDesc, fabchdFaclsId, fabchdFalocId, fabchdPuramt,
				fabchdStartdt, fabchdInsCo, fabchdSalvamt, fabchdInsNbr,
				fabchdInsamt, fabchdUplife, fabchdUpper, fabchdUm, fabchdQty,
				fabchdUser1, fabchdUser2, fabchdModUser, fabchdModDate,
				fabchdChr01, fabchdDec01, fabchdLog01, fabchdInt01,
				fabchdQadc01, fabchdQadd01, fabchdQadl01, fabchdQadi01,
				oidFabchdDet);
	}

	/** full constructor */
	public FabchdDet(FabchdDetId id, String fabchdDesc, String fabchdFaclsId,
			String fabchdFalocId, Double fabchdPuramt, Date fabchdStartdt,
			String fabchdInsCo, Date fabchdInsDate, Double fabchdSalvamt,
			String fabchdInsNbr, Double fabchdInsamt, Integer fabchdUplife,
			Integer fabchdUpper, String fabchdUm, Integer fabchdQty,
			String fabchdUser1, String fabchdUser2, String fabchdModUser,
			Date fabchdModDate, String fabchdChr01, Double fabchdDec01,
			Boolean fabchdLog01, Date fabchdDte01, Integer fabchdInt01,
			String fabchdQadc01, Double fabchdQadd01, Boolean fabchdQadl01,
			Integer fabchdQadi01, Date fabchdQadt01, Double oidFabchdDet) {
		super(id, fabchdDesc, fabchdFaclsId, fabchdFalocId, fabchdPuramt,
				fabchdStartdt, fabchdInsCo, fabchdInsDate, fabchdSalvamt,
				fabchdInsNbr, fabchdInsamt, fabchdUplife, fabchdUpper,
				fabchdUm, fabchdQty, fabchdUser1, fabchdUser2, fabchdModUser,
				fabchdModDate, fabchdChr01, fabchdDec01, fabchdLog01,
				fabchdDte01, fabchdInt01, fabchdQadc01, fabchdQadd01,
				fabchdQadl01, fabchdQadi01, fabchdQadt01, oidFabchdDet);
	}

}
