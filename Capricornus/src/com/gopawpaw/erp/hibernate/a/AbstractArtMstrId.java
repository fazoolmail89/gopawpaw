package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractArtMstrId entity provides the base persistence definition of the
 * ArtMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractArtMstrId implements java.io.Serializable {

	// Fields

	private String artDomain;
	private String artAppId;
	private String artMthdName;
	private String artReturnCode;

	// Constructors

	/** default constructor */
	public AbstractArtMstrId() {
	}

	/** minimal constructor */
	public AbstractArtMstrId(String artDomain) {
		this.artDomain = artDomain;
	}

	/** full constructor */
	public AbstractArtMstrId(String artDomain, String artAppId,
			String artMthdName, String artReturnCode) {
		this.artDomain = artDomain;
		this.artAppId = artAppId;
		this.artMthdName = artMthdName;
		this.artReturnCode = artReturnCode;
	}

	// Property accessors

	public String getArtDomain() {
		return this.artDomain;
	}

	public void setArtDomain(String artDomain) {
		this.artDomain = artDomain;
	}

	public String getArtAppId() {
		return this.artAppId;
	}

	public void setArtAppId(String artAppId) {
		this.artAppId = artAppId;
	}

	public String getArtMthdName() {
		return this.artMthdName;
	}

	public void setArtMthdName(String artMthdName) {
		this.artMthdName = artMthdName;
	}

	public String getArtReturnCode() {
		return this.artReturnCode;
	}

	public void setArtReturnCode(String artReturnCode) {
		this.artReturnCode = artReturnCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractArtMstrId))
			return false;
		AbstractArtMstrId castOther = (AbstractArtMstrId) other;

		return ((this.getArtDomain() == castOther.getArtDomain()) || (this
				.getArtDomain() != null
				&& castOther.getArtDomain() != null && this.getArtDomain()
				.equals(castOther.getArtDomain())))
				&& ((this.getArtAppId() == castOther.getArtAppId()) || (this
						.getArtAppId() != null
						&& castOther.getArtAppId() != null && this
						.getArtAppId().equals(castOther.getArtAppId())))
				&& ((this.getArtMthdName() == castOther.getArtMthdName()) || (this
						.getArtMthdName() != null
						&& castOther.getArtMthdName() != null && this
						.getArtMthdName().equals(castOther.getArtMthdName())))
				&& ((this.getArtReturnCode() == castOther.getArtReturnCode()) || (this
						.getArtReturnCode() != null
						&& castOther.getArtReturnCode() != null && this
						.getArtReturnCode()
						.equals(castOther.getArtReturnCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getArtDomain() == null ? 0 : this.getArtDomain().hashCode());
		result = 37 * result
				+ (getArtAppId() == null ? 0 : this.getArtAppId().hashCode());
		result = 37
				* result
				+ (getArtMthdName() == null ? 0 : this.getArtMthdName()
						.hashCode());
		result = 37
				* result
				+ (getArtReturnCode() == null ? 0 : this.getArtReturnCode()
						.hashCode());
		return result;
	}

}