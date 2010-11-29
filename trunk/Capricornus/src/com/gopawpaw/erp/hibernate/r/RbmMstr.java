package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RbmMstr entity. @author MyEclipse Persistence Tools
 */
public class RbmMstr extends AbstractRbmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RbmMstr() {
	}

	/** minimal constructor */
	public RbmMstr(RbmMstrId id, Double oidRbmMstr) {
		super(id, oidRbmMstr);
	}

	/** full constructor */
	public RbmMstr(RbmMstrId id, Date rbmEff, Double rbmNewprice,
			String rbmRsn, String rbmStatus, String rbmArNbr,
			Integer rbmCmtindx, String rbmUser1, String rbmUser2,
			String rbmQadc01, Double oidRbmMstr) {
		super(id, rbmEff, rbmNewprice, rbmRsn, rbmStatus, rbmArNbr, rbmCmtindx,
				rbmUser1, rbmUser2, rbmQadc01, oidRbmMstr);
	}

}
