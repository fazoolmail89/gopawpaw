package com.gopawpaw.erp.hibernate.f;

/**
 * FsdDetId entity. @author MyEclipse Persistence Tools
 */
public class FsdDetId extends AbstractFsdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FsdDetId() {
	}

	/** minimal constructor */
	public FsdDetId(String fsdDomain) {
		super(fsdDomain);
	}

	/** full constructor */
	public FsdDetId(String fsdDomain, String fsdNbr, String fsdFile,
			Integer fsdFileLine, String fsdPart, Integer fsdLine) {
		super(fsdDomain, fsdNbr, fsdFile, fsdFileLine, fsdPart, fsdLine);
	}

}
