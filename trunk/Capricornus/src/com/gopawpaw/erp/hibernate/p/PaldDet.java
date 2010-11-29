package com.gopawpaw.erp.hibernate.p;

/**
 * PaldDet entity. @author MyEclipse Persistence Tools
 */
public class PaldDet extends AbstractPaldDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PaldDet() {
	}

	/** minimal constructor */
	public PaldDet(PaldDetId id, Double oidPaldDet) {
		super(id, oidPaldDet);
	}

	/** full constructor */
	public PaldDet(PaldDetId id, String paldDesc, Double paldHeight,
			Integer paldNbrLay, String paldUm, Integer paldUnitLay,
			String paldUser1, String paldUser2, Double paldWeight,
			String paldChr01, String paldChr02, String paldChr03,
			String paldChr04, String paldChr05, Double paldDec01,
			Double paldDec02, String paldHghtUm, String paldWghtUm,
			Double oidPaldDet) {
		super(id, paldDesc, paldHeight, paldNbrLay, paldUm, paldUnitLay,
				paldUser1, paldUser2, paldWeight, paldChr01, paldChr02,
				paldChr03, paldChr04, paldChr05, paldDec01, paldDec02,
				paldHghtUm, paldWghtUm, oidPaldDet);
	}

}
