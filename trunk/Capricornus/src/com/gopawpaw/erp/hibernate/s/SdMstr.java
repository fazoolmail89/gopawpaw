package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SdMstr entity. @author MyEclipse Persistence Tools
 */
public class SdMstr extends AbstractSdMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SdMstr() {
	}

	/** minimal constructor */
	public SdMstr(SdMstrId id, Double oidSdMstr) {
		super(id, oidSdMstr);
	}

	/** full constructor */
	public SdMstr(SdMstrId id, String sdCurr, Double sdDiscPct, String sdAcct,
			String sdCc, String sdCust, String sdLsType, String sdProdline,
			Date sdExpire, String sdChr01, String sdQad01, String sdQad02,
			String sdChr02, String sdUser1, String sdUser2, String sdSub,
			Double oidSdMstr) {
		super(id, sdCurr, sdDiscPct, sdAcct, sdCc, sdCust, sdLsType,
				sdProdline, sdExpire, sdChr01, sdQad01, sdQad02, sdChr02,
				sdUser1, sdUser2, sdSub, oidSdMstr);
	}

}
