package com.gopawpaw.erp.hibernate.v;

/**
 * VoMstrId entity. @author MyEclipse Persistence Tools
 */
public class VoMstrId extends AbstractVoMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VoMstrId() {
	}

	/** minimal constructor */
	public VoMstrId(String voDomain) {
		super(voDomain);
	}

	/** full constructor */
	public VoMstrId(String voDomain, String voRef) {
		super(voDomain, voRef);
	}

}
