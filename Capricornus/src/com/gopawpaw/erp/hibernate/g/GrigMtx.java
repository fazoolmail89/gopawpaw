package com.gopawpaw.erp.hibernate.g;

/**
 * GrigMtx entity. @author MyEclipse Persistence Tools
 */
public class GrigMtx extends AbstractGrigMtx implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrigMtx() {
	}

	/** minimal constructor */
	public GrigMtx(GrigMtxId id, Double oidGrigMtx) {
		super(id, oidGrigMtx);
	}

	/** full constructor */
	public GrigMtx(GrigMtxId id, Double grigAmt, String grigAmtTxt,
			Boolean grigPrint, String grigType, String grigUser1,
			String grigUser2, String grigQadc01, Double oidGrigMtx) {
		super(id, grigAmt, grigAmtTxt, grigPrint, grigType, grigUser1,
				grigUser2, grigQadc01, oidGrigMtx);
	}

}
