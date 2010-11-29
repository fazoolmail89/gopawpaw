package com.gopawpaw.erp.hibernate.m;

/**
 * MfcCtrlId entity. @author MyEclipse Persistence Tools
 */
public class MfcCtrlId extends AbstractMfcCtrlId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MfcCtrlId() {
	}

	/** minimal constructor */
	public MfcCtrlId(String mfcDomain) {
		super(mfcDomain);
	}

	/** full constructor */
	public MfcCtrlId(String mfcDomain, String mfcField) {
		super(mfcDomain, mfcField);
	}

}
