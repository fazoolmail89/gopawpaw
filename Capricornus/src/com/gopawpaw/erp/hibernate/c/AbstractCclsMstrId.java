package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCclsMstrId entity provides the base persistence definition of the
 * CclsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCclsMstrId implements java.io.Serializable {

	// Fields

	private String cclsDomain;
	private String cclsShipfrom;
	private String cclsShipto;

	// Constructors

	/** default constructor */
	public AbstractCclsMstrId() {
	}

	/** full constructor */
	public AbstractCclsMstrId(String cclsDomain, String cclsShipfrom,
			String cclsShipto) {
		this.cclsDomain = cclsDomain;
		this.cclsShipfrom = cclsShipfrom;
		this.cclsShipto = cclsShipto;
	}

	// Property accessors

	public String getCclsDomain() {
		return this.cclsDomain;
	}

	public void setCclsDomain(String cclsDomain) {
		this.cclsDomain = cclsDomain;
	}

	public String getCclsShipfrom() {
		return this.cclsShipfrom;
	}

	public void setCclsShipfrom(String cclsShipfrom) {
		this.cclsShipfrom = cclsShipfrom;
	}

	public String getCclsShipto() {
		return this.cclsShipto;
	}

	public void setCclsShipto(String cclsShipto) {
		this.cclsShipto = cclsShipto;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCclsMstrId))
			return false;
		AbstractCclsMstrId castOther = (AbstractCclsMstrId) other;

		return ((this.getCclsDomain() == castOther.getCclsDomain()) || (this
				.getCclsDomain() != null
				&& castOther.getCclsDomain() != null && this.getCclsDomain()
				.equals(castOther.getCclsDomain())))
				&& ((this.getCclsShipfrom() == castOther.getCclsShipfrom()) || (this
						.getCclsShipfrom() != null
						&& castOther.getCclsShipfrom() != null && this
						.getCclsShipfrom().equals(castOther.getCclsShipfrom())))
				&& ((this.getCclsShipto() == castOther.getCclsShipto()) || (this
						.getCclsShipto() != null
						&& castOther.getCclsShipto() != null && this
						.getCclsShipto().equals(castOther.getCclsShipto())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCclsDomain() == null ? 0 : this.getCclsDomain()
						.hashCode());
		result = 37
				* result
				+ (getCclsShipfrom() == null ? 0 : this.getCclsShipfrom()
						.hashCode());
		result = 37
				* result
				+ (getCclsShipto() == null ? 0 : this.getCclsShipto()
						.hashCode());
		return result;
	}

}