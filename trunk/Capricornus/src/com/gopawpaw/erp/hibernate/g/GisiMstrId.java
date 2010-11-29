package com.gopawpaw.erp.hibernate.g;

/**
 * GisiMstrId entity. @author MyEclipse Persistence Tools
 */
public class GisiMstrId extends AbstractGisiMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GisiMstrId() {
	}

	/** full constructor */
	public GisiMstrId(String gisiDomain, String gisiAppCode,
			String gisiModelName, String gisiSite, String gisiPart) {
		super(gisiDomain, gisiAppCode, gisiModelName, gisiSite, gisiPart);
	}

}
