package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * ShpdHist entity. @author MyEclipse Persistence Tools
 */
public class ShpdHist extends AbstractShpdHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShpdHist() {
	}

	/** full constructor */
	public ShpdHist(ShpdHistId id, String shpdStatusCode, String shpdRsnCode,
			Boolean shpdAcceptable, String shpdRsnType, String shpdQadc01,
			String shpdQadc02, String shpdModUserid, Date shpdModDate,
			String shpdUser1, String shpdUser2, Double oidShpdHist) {
		super(id, shpdStatusCode, shpdRsnCode, shpdAcceptable, shpdRsnType,
				shpdQadc01, shpdQadc02, shpdModUserid, shpdModDate, shpdUser1,
				shpdUser2, oidShpdHist);
	}

}
