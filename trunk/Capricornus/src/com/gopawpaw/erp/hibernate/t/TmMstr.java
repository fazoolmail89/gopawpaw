package com.gopawpaw.erp.hibernate.t;

/**
 * TmMstr entity. @author MyEclipse Persistence Tools
 */
public class TmMstr extends AbstractTmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TmMstr() {
	}

	/** minimal constructor */
	public TmMstr(TmMstrId id, Integer tmNoUnits, Double oidTmMstr) {
		super(id, tmNoUnits, oidTmMstr);
	}

	/** full constructor */
	public TmMstr(TmMstrId id, String tmDesc, String tmType,
			Double tmMaxweight, String tmWeightUm, Double tmMaxcube,
			String tmCubeUm, Double tmHeight, Double tmWidth, Double tmLength,
			Integer tmPallets, Double tmGrossWt, String tmRateCode,
			Integer tmCmtindx, Double tmLoadLt, Double tmUnloadLt,
			Integer tmNoUnits, String tmUser1, String tmUser2, String tmQadc01,
			Double oidTmMstr) {
		super(id, tmDesc, tmType, tmMaxweight, tmWeightUm, tmMaxcube, tmCubeUm,
				tmHeight, tmWidth, tmLength, tmPallets, tmGrossWt, tmRateCode,
				tmCmtindx, tmLoadLt, tmUnloadLt, tmNoUnits, tmUser1, tmUser2,
				tmQadc01, oidTmMstr);
	}

}
