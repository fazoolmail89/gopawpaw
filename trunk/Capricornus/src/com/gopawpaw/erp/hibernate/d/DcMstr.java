package com.gopawpaw.erp.hibernate.d;

/**
 * DcMstr entity. @author MyEclipse Persistence Tools
 */
public class DcMstr extends AbstractDcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DcMstr() {
	}

	/** minimal constructor */
	public DcMstr(String dcPhyName, Boolean dcUseApp, Double oidDcMstr) {
		super(dcPhyName, dcUseApp, oidDcMstr);
	}

	/** full constructor */
	public DcMstr(String dcPhyName, String dcDir, String dcHost,
			String dcServer, String dcType, String dcNetwork,
			String dcParmfile, String dcChr01, String dcChr02,
			Boolean dcActive, String dcDesc, Integer dcCmtindx, String dcUser1,
			String dcUser2, Boolean dcUseApp, String dcQadc01, String dcQadc02,
			Boolean dcQadl01, Boolean dcQadl02, Double oidDcMstr) {
		super(dcPhyName, dcDir, dcHost, dcServer, dcType, dcNetwork,
				dcParmfile, dcChr01, dcChr02, dcActive, dcDesc, dcCmtindx,
				dcUser1, dcUser2, dcUseApp, dcQadc01, dcQadc02, dcQadl01,
				dcQadl02, oidDcMstr);
	}

}
