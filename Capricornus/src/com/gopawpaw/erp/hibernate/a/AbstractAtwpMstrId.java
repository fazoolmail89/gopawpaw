package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAtwpMstrId entity provides the base persistence definition of the
 * AtwpMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtwpMstrId implements java.io.Serializable {

	// Fields

	private String atwpProfileType;
	private String atwpCollection;
	private Double oidAttMstr;

	// Constructors

	/** default constructor */
	public AbstractAtwpMstrId() {
	}

	/** full constructor */
	public AbstractAtwpMstrId(String atwpProfileType, String atwpCollection,
			Double oidAttMstr) {
		this.atwpProfileType = atwpProfileType;
		this.atwpCollection = atwpCollection;
		this.oidAttMstr = oidAttMstr;
	}

	// Property accessors

	public String getAtwpProfileType() {
		return this.atwpProfileType;
	}

	public void setAtwpProfileType(String atwpProfileType) {
		this.atwpProfileType = atwpProfileType;
	}

	public String getAtwpCollection() {
		return this.atwpCollection;
	}

	public void setAtwpCollection(String atwpCollection) {
		this.atwpCollection = atwpCollection;
	}

	public Double getOidAttMstr() {
		return this.oidAttMstr;
	}

	public void setOidAttMstr(Double oidAttMstr) {
		this.oidAttMstr = oidAttMstr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAtwpMstrId))
			return false;
		AbstractAtwpMstrId castOther = (AbstractAtwpMstrId) other;

		return ((this.getAtwpProfileType() == castOther.getAtwpProfileType()) || (this
				.getAtwpProfileType() != null
				&& castOther.getAtwpProfileType() != null && this
				.getAtwpProfileType().equals(castOther.getAtwpProfileType())))
				&& ((this.getAtwpCollection() == castOther.getAtwpCollection()) || (this
						.getAtwpCollection() != null
						&& castOther.getAtwpCollection() != null && this
						.getAtwpCollection().equals(
								castOther.getAtwpCollection())))
				&& ((this.getOidAttMstr() == castOther.getOidAttMstr()) || (this
						.getOidAttMstr() != null
						&& castOther.getOidAttMstr() != null && this
						.getOidAttMstr().equals(castOther.getOidAttMstr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAtwpProfileType() == null ? 0 : this.getAtwpProfileType()
						.hashCode());
		result = 37
				* result
				+ (getAtwpCollection() == null ? 0 : this.getAtwpCollection()
						.hashCode());
		result = 37
				* result
				+ (getOidAttMstr() == null ? 0 : this.getOidAttMstr()
						.hashCode());
		return result;
	}

}