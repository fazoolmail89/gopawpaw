package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAbsiMstrId entity provides the base persistence definition of the
 * AbsiMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbsiMstrId implements java.io.Serializable {

	// Fields

	private String absiDomain;
	private String absiShipfrom;
	private String absiAbsId;

	// Constructors

	/** default constructor */
	public AbstractAbsiMstrId() {
	}

	/** full constructor */
	public AbstractAbsiMstrId(String absiDomain, String absiShipfrom,
			String absiAbsId) {
		this.absiDomain = absiDomain;
		this.absiShipfrom = absiShipfrom;
		this.absiAbsId = absiAbsId;
	}

	// Property accessors

	public String getAbsiDomain() {
		return this.absiDomain;
	}

	public void setAbsiDomain(String absiDomain) {
		this.absiDomain = absiDomain;
	}

	public String getAbsiShipfrom() {
		return this.absiShipfrom;
	}

	public void setAbsiShipfrom(String absiShipfrom) {
		this.absiShipfrom = absiShipfrom;
	}

	public String getAbsiAbsId() {
		return this.absiAbsId;
	}

	public void setAbsiAbsId(String absiAbsId) {
		this.absiAbsId = absiAbsId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAbsiMstrId))
			return false;
		AbstractAbsiMstrId castOther = (AbstractAbsiMstrId) other;

		return ((this.getAbsiDomain() == castOther.getAbsiDomain()) || (this
				.getAbsiDomain() != null
				&& castOther.getAbsiDomain() != null && this.getAbsiDomain()
				.equals(castOther.getAbsiDomain())))
				&& ((this.getAbsiShipfrom() == castOther.getAbsiShipfrom()) || (this
						.getAbsiShipfrom() != null
						&& castOther.getAbsiShipfrom() != null && this
						.getAbsiShipfrom().equals(castOther.getAbsiShipfrom())))
				&& ((this.getAbsiAbsId() == castOther.getAbsiAbsId()) || (this
						.getAbsiAbsId() != null
						&& castOther.getAbsiAbsId() != null && this
						.getAbsiAbsId().equals(castOther.getAbsiAbsId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAbsiDomain() == null ? 0 : this.getAbsiDomain()
						.hashCode());
		result = 37
				* result
				+ (getAbsiShipfrom() == null ? 0 : this.getAbsiShipfrom()
						.hashCode());
		result = 37 * result
				+ (getAbsiAbsId() == null ? 0 : this.getAbsiAbsId().hashCode());
		return result;
	}

}