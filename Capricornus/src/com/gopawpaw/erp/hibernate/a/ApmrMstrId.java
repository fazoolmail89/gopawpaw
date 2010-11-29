package com.gopawpaw.erp.hibernate.a;

/**
 * ApmrMstrId entity. @author MyEclipse Persistence Tools
 */
public class ApmrMstrId extends AbstractApmrMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ApmrMstrId() {
	}

	/** minimal constructor */
	public ApmrMstrId(String apmrDomain) {
		super(apmrDomain);
	}

	/** full constructor */
	public ApmrMstrId(String apmrDomain, Integer apmrSeq) {
		super(apmrDomain, apmrSeq);
	}

}
