package com.gopawpaw.erp.hibernate.e;

/**
 * EscfRefId entity. @author MyEclipse Persistence Tools
 */
public class EscfRefId extends AbstractEscfRefId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EscfRefId() {
	}

	/** full constructor */
	public EscfRefId(Double oidEscatMstr, Double oidEsfilMstr) {
		super(oidEscatMstr, oidEsfilMstr);
	}

}
