package com.gopawpaw.erp.hibernate.e;

/**
 * EgcCtrlId entity. @author MyEclipse Persistence Tools
 */
public class EgcCtrlId extends AbstractEgcCtrlId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EgcCtrlId() {
	}

	/** minimal constructor */
	public EgcCtrlId(String egcDomain) {
		super(egcDomain);
	}

	/** full constructor */
	public EgcCtrlId(String egcDomain, Integer egcIndex) {
		super(egcDomain, egcIndex);
	}

}
