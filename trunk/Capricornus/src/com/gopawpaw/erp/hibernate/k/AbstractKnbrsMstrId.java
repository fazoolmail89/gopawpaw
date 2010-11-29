package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKnbrsMstrId entity provides the base persistence definition of the
 * KnbrsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbrsMstrId implements java.io.Serializable {

	// Fields

	private String knbrsDomain;
	private String knbrsDispatchId;

	// Constructors

	/** default constructor */
	public AbstractKnbrsMstrId() {
	}

	/** full constructor */
	public AbstractKnbrsMstrId(String knbrsDomain, String knbrsDispatchId) {
		this.knbrsDomain = knbrsDomain;
		this.knbrsDispatchId = knbrsDispatchId;
	}

	// Property accessors

	public String getKnbrsDomain() {
		return this.knbrsDomain;
	}

	public void setKnbrsDomain(String knbrsDomain) {
		this.knbrsDomain = knbrsDomain;
	}

	public String getKnbrsDispatchId() {
		return this.knbrsDispatchId;
	}

	public void setKnbrsDispatchId(String knbrsDispatchId) {
		this.knbrsDispatchId = knbrsDispatchId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKnbrsMstrId))
			return false;
		AbstractKnbrsMstrId castOther = (AbstractKnbrsMstrId) other;

		return ((this.getKnbrsDomain() == castOther.getKnbrsDomain()) || (this
				.getKnbrsDomain() != null
				&& castOther.getKnbrsDomain() != null && this.getKnbrsDomain()
				.equals(castOther.getKnbrsDomain())))
				&& ((this.getKnbrsDispatchId() == castOther
						.getKnbrsDispatchId()) || (this.getKnbrsDispatchId() != null
						&& castOther.getKnbrsDispatchId() != null && this
						.getKnbrsDispatchId().equals(
								castOther.getKnbrsDispatchId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKnbrsDomain() == null ? 0 : this.getKnbrsDomain()
						.hashCode());
		result = 37
				* result
				+ (getKnbrsDispatchId() == null ? 0 : this.getKnbrsDispatchId()
						.hashCode());
		return result;
	}

}