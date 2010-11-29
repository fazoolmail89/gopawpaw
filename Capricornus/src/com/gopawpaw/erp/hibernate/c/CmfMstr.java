package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CmfMstr entity. @author MyEclipse Persistence Tools
 */
public class CmfMstr extends AbstractCmfMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CmfMstr() {
	}

	/** minimal constructor */
	public CmfMstr(CmfMstrId id, String cmfDocType, String cmfDocRef,
			String cmfStatus, Date cmfRefDate, Integer cmfRefTime,
			String cmfSoPo, Double oidCmfMstr) {
		super(id, cmfDocType, cmfDocRef, cmfStatus, cmfRefDate, cmfRefTime,
				cmfSoPo, oidCmfMstr);
	}

	/** full constructor */
	public CmfMstr(CmfMstrId id, String cmfDocType, String cmfDocRef,
			String cmfStatus, String cmfModUserid, Date cmfModDate,
			String cmfQadc01, Date cmfRefDate, Integer cmfRefTime,
			String cmfSoPo, String cmfUser1, String cmfUser2, Double oidCmfMstr) {
		super(id, cmfDocType, cmfDocRef, cmfStatus, cmfModUserid, cmfModDate,
				cmfQadc01, cmfRefDate, cmfRefTime, cmfSoPo, cmfUser1, cmfUser2,
				oidCmfMstr);
	}

}
