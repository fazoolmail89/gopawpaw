package com.gopawpaw.erp.hibernate.a;

/**
 * ArtMstrId entity. @author MyEclipse Persistence Tools
 */
public class ArtMstrId extends AbstractArtMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ArtMstrId() {
	}

	/** minimal constructor */
	public ArtMstrId(String artDomain) {
		super(artDomain);
	}

	/** full constructor */
	public ArtMstrId(String artDomain, String artAppId, String artMthdName,
			String artReturnCode) {
		super(artDomain, artAppId, artMthdName, artReturnCode);
	}

}
