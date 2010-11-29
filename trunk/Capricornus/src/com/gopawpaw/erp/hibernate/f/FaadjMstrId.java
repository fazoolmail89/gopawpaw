package com.gopawpaw.erp.hibernate.f;

/**
 * FaadjMstrId entity. @author MyEclipse Persistence Tools
 */
public class FaadjMstrId extends AbstractFaadjMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FaadjMstrId() {
	}

	/** full constructor */
	public FaadjMstrId(String faadjDomain, String faadjFaId,
			String faadjFabkId, Integer faadjResrv) {
		super(faadjDomain, faadjFaId, faadjFabkId, faadjResrv);
	}

}
