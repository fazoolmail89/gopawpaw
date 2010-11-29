package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFabchdDetId entity provides the base persistence definition of the
 * FabchdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFabchdDetId implements java.io.Serializable {

	// Fields

	private String fabchdDomain;
	private String fabchdFabchId;
	private String fabchdFaId;

	// Constructors

	/** default constructor */
	public AbstractFabchdDetId() {
	}

	/** full constructor */
	public AbstractFabchdDetId(String fabchdDomain, String fabchdFabchId,
			String fabchdFaId) {
		this.fabchdDomain = fabchdDomain;
		this.fabchdFabchId = fabchdFabchId;
		this.fabchdFaId = fabchdFaId;
	}

	// Property accessors

	public String getFabchdDomain() {
		return this.fabchdDomain;
	}

	public void setFabchdDomain(String fabchdDomain) {
		this.fabchdDomain = fabchdDomain;
	}

	public String getFabchdFabchId() {
		return this.fabchdFabchId;
	}

	public void setFabchdFabchId(String fabchdFabchId) {
		this.fabchdFabchId = fabchdFabchId;
	}

	public String getFabchdFaId() {
		return this.fabchdFaId;
	}

	public void setFabchdFaId(String fabchdFaId) {
		this.fabchdFaId = fabchdFaId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFabchdDetId))
			return false;
		AbstractFabchdDetId castOther = (AbstractFabchdDetId) other;

		return ((this.getFabchdDomain() == castOther.getFabchdDomain()) || (this
				.getFabchdDomain() != null
				&& castOther.getFabchdDomain() != null && this
				.getFabchdDomain().equals(castOther.getFabchdDomain())))
				&& ((this.getFabchdFabchId() == castOther.getFabchdFabchId()) || (this
						.getFabchdFabchId() != null
						&& castOther.getFabchdFabchId() != null && this
						.getFabchdFabchId()
						.equals(castOther.getFabchdFabchId())))
				&& ((this.getFabchdFaId() == castOther.getFabchdFaId()) || (this
						.getFabchdFaId() != null
						&& castOther.getFabchdFaId() != null && this
						.getFabchdFaId().equals(castOther.getFabchdFaId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFabchdDomain() == null ? 0 : this.getFabchdDomain()
						.hashCode());
		result = 37
				* result
				+ (getFabchdFabchId() == null ? 0 : this.getFabchdFabchId()
						.hashCode());
		result = 37
				* result
				+ (getFabchdFaId() == null ? 0 : this.getFabchdFaId()
						.hashCode());
		return result;
	}

}