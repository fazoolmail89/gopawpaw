package com.gopawpaw.erp.hibernate.e;

/**
 * EsapfcDetId entity. @author MyEclipse Persistence Tools
 */
public class EsapfcDetId extends AbstractEsapfcDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsapfcDetId() {
	}

	/** full constructor */
	public EsapfcDetId(Double oidEsapfsDet, Double oidEsapfilDet,
			String esapfcValue) {
		super(oidEsapfsDet, oidEsapfilDet, esapfcValue);
	}

}
