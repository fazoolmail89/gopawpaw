package com.gopawpaw.erp.hibernate.g;

/**
 * GltmMstrId entity. @author MyEclipse Persistence Tools
 */
public class GltmMstrId extends AbstractGltmMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GltmMstrId() {
	}

	/** full constructor */
	public GltmMstrId(String gltmDomain, String gltmEntity, String gltmAcct,
			Integer gltmMatchNbr) {
		super(gltmDomain, gltmEntity, gltmAcct, gltmMatchNbr);
	}

}
