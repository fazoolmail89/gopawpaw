package com.gopawpaw.erp.hibernate.g;

/**
 * GricDetId entity. @author MyEclipse Persistence Tools
 */
public class GricDetId extends AbstractGricDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GricDetId() {
	}

	/** minimal constructor */
	public GricDetId(String gricDomain) {
		super(gricDomain);
	}

	/** full constructor */
	public GricDetId(String gricDomain, Integer gricRunId, Integer gricCol) {
		super(gricDomain, gricRunId, gricCol);
	}

}
