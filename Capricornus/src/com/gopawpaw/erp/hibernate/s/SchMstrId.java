package com.gopawpaw.erp.hibernate.s;

/**
 * SchMstrId entity. @author MyEclipse Persistence Tools
 */
public class SchMstrId extends AbstractSchMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SchMstrId() {
	}

	/** minimal constructor */
	public SchMstrId(String schDomain) {
		super(schDomain);
	}

	/** full constructor */
	public SchMstrId(String schDomain, Integer schType, String schNbr,
			Integer schLine, String schRlseId) {
		super(schDomain, schType, schNbr, schLine, schRlseId);
	}

}
