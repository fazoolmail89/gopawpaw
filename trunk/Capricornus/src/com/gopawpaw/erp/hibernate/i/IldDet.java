package com.gopawpaw.erp.hibernate.i;

import java.math.BigDecimal;
import java.util.Date;

/**
 * IldDet entity. @author MyEclipse Persistence Tools
 */
public class IldDet extends AbstractIldDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IldDet() {
	}

	/** minimal constructor */
	public IldDet(IldDetId id, Double oidIldDet) {
		super(id, oidIldDet);
	}

	/** full constructor */
	public IldDet(IldDetId id, String ildSourceLoc, BigDecimal ildRop,
			BigDecimal ildSftyStk, BigDecimal ildOrdMult, Date ildModDate,
			String ildUserid, String ildUser1, String ildUser2,
			String ildQadc01, Double oidIldDet) {
		super(id, ildSourceLoc, ildRop, ildSftyStk, ildOrdMult, ildModDate,
				ildUserid, ildUser1, ildUser2, ildQadc01, oidIldDet);
	}

}
