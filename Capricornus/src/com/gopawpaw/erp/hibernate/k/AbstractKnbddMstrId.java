package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKnbddMstrId entity provides the base persistence definition of the
 * KnbddMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbddMstrId implements java.io.Serializable {

	// Fields

	private String knbddDomain;
	private String knbddDocumentType;
	private String knbddDocumentName;

	// Constructors

	/** default constructor */
	public AbstractKnbddMstrId() {
	}

	/** full constructor */
	public AbstractKnbddMstrId(String knbddDomain, String knbddDocumentType,
			String knbddDocumentName) {
		this.knbddDomain = knbddDomain;
		this.knbddDocumentType = knbddDocumentType;
		this.knbddDocumentName = knbddDocumentName;
	}

	// Property accessors

	public String getKnbddDomain() {
		return this.knbddDomain;
	}

	public void setKnbddDomain(String knbddDomain) {
		this.knbddDomain = knbddDomain;
	}

	public String getKnbddDocumentType() {
		return this.knbddDocumentType;
	}

	public void setKnbddDocumentType(String knbddDocumentType) {
		this.knbddDocumentType = knbddDocumentType;
	}

	public String getKnbddDocumentName() {
		return this.knbddDocumentName;
	}

	public void setKnbddDocumentName(String knbddDocumentName) {
		this.knbddDocumentName = knbddDocumentName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKnbddMstrId))
			return false;
		AbstractKnbddMstrId castOther = (AbstractKnbddMstrId) other;

		return ((this.getKnbddDomain() == castOther.getKnbddDomain()) || (this
				.getKnbddDomain() != null
				&& castOther.getKnbddDomain() != null && this.getKnbddDomain()
				.equals(castOther.getKnbddDomain())))
				&& ((this.getKnbddDocumentType() == castOther
						.getKnbddDocumentType()) || (this
						.getKnbddDocumentType() != null
						&& castOther.getKnbddDocumentType() != null && this
						.getKnbddDocumentType().equals(
								castOther.getKnbddDocumentType())))
				&& ((this.getKnbddDocumentName() == castOther
						.getKnbddDocumentName()) || (this
						.getKnbddDocumentName() != null
						&& castOther.getKnbddDocumentName() != null && this
						.getKnbddDocumentName().equals(
								castOther.getKnbddDocumentName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKnbddDomain() == null ? 0 : this.getKnbddDomain()
						.hashCode());
		result = 37
				* result
				+ (getKnbddDocumentType() == null ? 0 : this
						.getKnbddDocumentType().hashCode());
		result = 37
				* result
				+ (getKnbddDocumentName() == null ? 0 : this
						.getKnbddDocumentName().hashCode());
		return result;
	}

}