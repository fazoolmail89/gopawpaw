package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GraMstr entity. @author MyEclipse Persistence Tools
 */
public class GraMstr extends AbstractGraMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GraMstr() {
	}

	/** minimal constructor */
	public GraMstr(GraMstrId id, Double oidGraMstr) {
		super(id, oidGraMstr);
	}

	/** full constructor */
	public GraMstr(GraMstrId id, String graGlType, Boolean graLink,
			String graDesc, String graAddId, Date graAddDate, String graModId,
			Date graModDate, String graGroup, Boolean graStatus,
			Integer graCmtindx, String graUser1, String graUser2,
			String graQadc01, Double oidGraMstr) {
		super(id, graGlType, graLink, graDesc, graAddId, graAddDate, graModId,
				graModDate, graGroup, graStatus, graCmtindx, graUser1,
				graUser2, graQadc01, oidGraMstr);
	}

}
