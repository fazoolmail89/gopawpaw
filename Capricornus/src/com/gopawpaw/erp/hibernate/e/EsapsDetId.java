package com.gopawpaw.erp.hibernate.e;

/**
 * EsapsDetId entity. @author MyEclipse Persistence Tools
 */
public class EsapsDetId extends AbstractEsapsDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsapsDetId() {
	}

	/** full constructor */
	public EsapsDetId(Double oidEsapMstr, Double oidEsapsDetParent,
			Integer esapsOrder) {
		super(oidEsapMstr, oidEsapsDetParent, esapsOrder);
	}

}
