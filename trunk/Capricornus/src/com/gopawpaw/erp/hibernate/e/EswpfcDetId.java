package com.gopawpaw.erp.hibernate.e;

/**
 * EswpfcDetId entity. @author MyEclipse Persistence Tools
 */
public class EswpfcDetId extends AbstractEswpfcDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EswpfcDetId() {
	}

	/** full constructor */
	public EswpfcDetId(Double oidEswpfsDet, Double oidEswpfilDet,
			String eswpfcValue) {
		super(oidEswpfsDet, oidEswpfilDet, eswpfcValue);
	}

}
