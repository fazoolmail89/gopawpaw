package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGisiMstrId entity provides the base persistence definition of the
 * GisiMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGisiMstrId implements java.io.Serializable {

	// Fields

	private String gisiDomain;
	private String gisiAppCode;
	private String gisiModelName;
	private String gisiSite;
	private String gisiPart;

	// Constructors

	/** default constructor */
	public AbstractGisiMstrId() {
	}

	/** full constructor */
	public AbstractGisiMstrId(String gisiDomain, String gisiAppCode,
			String gisiModelName, String gisiSite, String gisiPart) {
		this.gisiDomain = gisiDomain;
		this.gisiAppCode = gisiAppCode;
		this.gisiModelName = gisiModelName;
		this.gisiSite = gisiSite;
		this.gisiPart = gisiPart;
	}

	// Property accessors

	public String getGisiDomain() {
		return this.gisiDomain;
	}

	public void setGisiDomain(String gisiDomain) {
		this.gisiDomain = gisiDomain;
	}

	public String getGisiAppCode() {
		return this.gisiAppCode;
	}

	public void setGisiAppCode(String gisiAppCode) {
		this.gisiAppCode = gisiAppCode;
	}

	public String getGisiModelName() {
		return this.gisiModelName;
	}

	public void setGisiModelName(String gisiModelName) {
		this.gisiModelName = gisiModelName;
	}

	public String getGisiSite() {
		return this.gisiSite;
	}

	public void setGisiSite(String gisiSite) {
		this.gisiSite = gisiSite;
	}

	public String getGisiPart() {
		return this.gisiPart;
	}

	public void setGisiPart(String gisiPart) {
		this.gisiPart = gisiPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGisiMstrId))
			return false;
		AbstractGisiMstrId castOther = (AbstractGisiMstrId) other;

		return ((this.getGisiDomain() == castOther.getGisiDomain()) || (this
				.getGisiDomain() != null
				&& castOther.getGisiDomain() != null && this.getGisiDomain()
				.equals(castOther.getGisiDomain())))
				&& ((this.getGisiAppCode() == castOther.getGisiAppCode()) || (this
						.getGisiAppCode() != null
						&& castOther.getGisiAppCode() != null && this
						.getGisiAppCode().equals(castOther.getGisiAppCode())))
				&& ((this.getGisiModelName() == castOther.getGisiModelName()) || (this
						.getGisiModelName() != null
						&& castOther.getGisiModelName() != null && this
						.getGisiModelName()
						.equals(castOther.getGisiModelName())))
				&& ((this.getGisiSite() == castOther.getGisiSite()) || (this
						.getGisiSite() != null
						&& castOther.getGisiSite() != null && this
						.getGisiSite().equals(castOther.getGisiSite())))
				&& ((this.getGisiPart() == castOther.getGisiPart()) || (this
						.getGisiPart() != null
						&& castOther.getGisiPart() != null && this
						.getGisiPart().equals(castOther.getGisiPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGisiDomain() == null ? 0 : this.getGisiDomain()
						.hashCode());
		result = 37
				* result
				+ (getGisiAppCode() == null ? 0 : this.getGisiAppCode()
						.hashCode());
		result = 37
				* result
				+ (getGisiModelName() == null ? 0 : this.getGisiModelName()
						.hashCode());
		result = 37 * result
				+ (getGisiSite() == null ? 0 : this.getGisiSite().hashCode());
		result = 37 * result
				+ (getGisiPart() == null ? 0 : this.getGisiPart().hashCode());
		return result;
	}

}