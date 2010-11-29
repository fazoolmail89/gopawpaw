package com.gopawpaw.erp.hibernate.w;

/**
 * WltMstrId entity. @author MyEclipse Persistence Tools
 */
public class WltMstrId extends AbstractWltMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public WltMstrId() {
	}

	/** minimal constructor */
	public WltMstrId(String wltDomain, Integer wltTrnbr, Integer wltProdbyOp,
			String wltPart) {
		super(wltDomain, wltTrnbr, wltProdbyOp, wltPart);
	}

	/** full constructor */
	public WltMstrId(String wltDomain, String wltTrType, Integer wltTrnbr,
			Boolean wltPrconsInd, String wltMtlType, String wltProdbyId,
			Integer wltProdbyOp, String wltPart, String wltLotser, String wltRef) {
		super(wltDomain, wltTrType, wltTrnbr, wltPrconsInd, wltMtlType,
				wltProdbyId, wltProdbyOp, wltPart, wltLotser, wltRef);
	}

}
