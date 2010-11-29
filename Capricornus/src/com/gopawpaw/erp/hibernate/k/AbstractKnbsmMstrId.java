package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKnbsmMstrId entity provides the base persistence definition of the
 * KnbsmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbsmMstrId implements java.io.Serializable {

	// Fields

	private String knbsmDomain;
	private String knbsmSite;
	private String knbsmSupermarketId;

	// Constructors

	/** default constructor */
	public AbstractKnbsmMstrId() {
	}

	/** full constructor */
	public AbstractKnbsmMstrId(String knbsmDomain, String knbsmSite,
			String knbsmSupermarketId) {
		this.knbsmDomain = knbsmDomain;
		this.knbsmSite = knbsmSite;
		this.knbsmSupermarketId = knbsmSupermarketId;
	}

	// Property accessors

	public String getKnbsmDomain() {
		return this.knbsmDomain;
	}

	public void setKnbsmDomain(String knbsmDomain) {
		this.knbsmDomain = knbsmDomain;
	}

	public String getKnbsmSite() {
		return this.knbsmSite;
	}

	public void setKnbsmSite(String knbsmSite) {
		this.knbsmSite = knbsmSite;
	}

	public String getKnbsmSupermarketId() {
		return this.knbsmSupermarketId;
	}

	public void setKnbsmSupermarketId(String knbsmSupermarketId) {
		this.knbsmSupermarketId = knbsmSupermarketId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKnbsmMstrId))
			return false;
		AbstractKnbsmMstrId castOther = (AbstractKnbsmMstrId) other;

		return ((this.getKnbsmDomain() == castOther.getKnbsmDomain()) || (this
				.getKnbsmDomain() != null
				&& castOther.getKnbsmDomain() != null && this.getKnbsmDomain()
				.equals(castOther.getKnbsmDomain())))
				&& ((this.getKnbsmSite() == castOther.getKnbsmSite()) || (this
						.getKnbsmSite() != null
						&& castOther.getKnbsmSite() != null && this
						.getKnbsmSite().equals(castOther.getKnbsmSite())))
				&& ((this.getKnbsmSupermarketId() == castOther
						.getKnbsmSupermarketId()) || (this
						.getKnbsmSupermarketId() != null
						&& castOther.getKnbsmSupermarketId() != null && this
						.getKnbsmSupermarketId().equals(
								castOther.getKnbsmSupermarketId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKnbsmDomain() == null ? 0 : this.getKnbsmDomain()
						.hashCode());
		result = 37 * result
				+ (getKnbsmSite() == null ? 0 : this.getKnbsmSite().hashCode());
		result = 37
				* result
				+ (getKnbsmSupermarketId() == null ? 0 : this
						.getKnbsmSupermarketId().hashCode());
		return result;
	}

}