package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EcdDet entity. @author MyEclipse Persistence Tools
 */
public class EcdDet extends AbstractEcdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EcdDet() {
	}

	/** minimal constructor */
	public EcdDet(EcdDetId id, Double oidEcdDet, String ecdBreakCat) {
		super(id, oidEcdDet, ecdBreakCat);
	}

	/** full constructor */
	public EcdDet(EcdDetId id, String ecdOldRev, String ecdNewRev,
			Date ecdStart, Date ecdEnd, String ecdUser1, String ecdUser2,
			Integer ecdCmtindx, String ecdInvDspn, String ecdProdline,
			String ecdGroup, String ecdStatus, String ecdDraw,
			String ecdPartType, String ecdDsgnGrp, String ecdDrwgLoc,
			String ecdDrwgSize, String ecdProcess, Boolean ecdQad01,
			Date ecdQad02, String ecdQad03, String ecdQad04, String ecdQad05,
			Date ecdModDate, String ecdUserid, Double oidEcdDet,
			String ecdBreakCat) {
		super(id, ecdOldRev, ecdNewRev, ecdStart, ecdEnd, ecdUser1, ecdUser2,
				ecdCmtindx, ecdInvDspn, ecdProdline, ecdGroup, ecdStatus,
				ecdDraw, ecdPartType, ecdDsgnGrp, ecdDrwgLoc, ecdDrwgSize,
				ecdProcess, ecdQad01, ecdQad02, ecdQad03, ecdQad04, ecdQad05,
				ecdModDate, ecdUserid, oidEcdDet, ecdBreakCat);
	}

}
