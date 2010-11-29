package com.gopawpaw.erp.hibernate.p;

/**
 * PalMstr entity. @author MyEclipse Persistence Tools
 */
public class PalMstr extends AbstractPalMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PalMstr() {
	}

	/** minimal constructor */
	public PalMstr(PalMstrId id, Double oidPalMstr) {
		super(id, oidPalMstr);
	}

	/** full constructor */
	public PalMstr(PalMstrId id, String palDesc, Integer palUnitLay,
			String palUm, Integer palNbrLay, Double palHeight,
			Double palWeight, String palUser1, String palUser2,
			String palChr01, String palChr03, String palChr04, String palChr05,
			Double palDec01, Double palDec02, String palChr02,
			String palHghtUm, String palWghtUm, Double oidPalMstr) {
		super(id, palDesc, palUnitLay, palUm, palNbrLay, palHeight, palWeight,
				palUser1, palUser2, palChr01, palChr03, palChr04, palChr05,
				palDec01, palDec02, palChr02, palHghtUm, palWghtUm, oidPalMstr);
	}

}
