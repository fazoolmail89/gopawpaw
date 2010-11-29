package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LvrDet entity. @author MyEclipse Persistence Tools
 */
public class LvrDet extends AbstractLvrDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LvrDet() {
	}

	/** minimal constructor */
	public LvrDet(String lvrProduct, Integer lvrMsgSev, Integer lvrMsgNbr,
			Integer lvrDirCnt, Integer lvrIndCnt, String lvrSid,
			String lvrType, Double oidLvrDet) {
		super(lvrProduct, lvrMsgSev, lvrMsgNbr, lvrDirCnt, lvrIndCnt, lvrSid,
				lvrType, oidLvrDet);
	}

	/** full constructor */
	public LvrDet(String lvrUserid, String lvrDate, String lvrTime,
			String lvrUser1, String lvrUser2, String lvrQadc01,
			Integer lvrQadi01, Double lvrQadd01, Boolean lvrQadl01,
			Date lvrQadt01, String lvrProduct, Integer lvrMsgSev,
			Integer lvrMsgNbr, Integer lvrDirCnt, Integer lvrIndCnt,
			String lvrSid, String lvrType, Double oidLvrDet) {
		super(lvrUserid, lvrDate, lvrTime, lvrUser1, lvrUser2, lvrQadc01,
				lvrQadi01, lvrQadd01, lvrQadl01, lvrQadt01, lvrProduct,
				lvrMsgSev, lvrMsgNbr, lvrDirCnt, lvrIndCnt, lvrSid, lvrType,
				oidLvrDet);
	}

}
