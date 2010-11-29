package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVpMstrId entity provides the base persistence definition of the
 * VpMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVpMstrId implements java.io.Serializable {

	// Fields

	private String vpDomain;
	private String vpPart;
	private String vpVend;
	private String vpVendPart;

	// Constructors

	/** default constructor */
	public AbstractVpMstrId() {
	}

	/** full constructor */
	public AbstractVpMstrId(String vpDomain, String vpPart, String vpVend,
			String vpVendPart) {
		this.vpDomain = vpDomain;
		this.vpPart = vpPart;
		this.vpVend = vpVend;
		this.vpVendPart = vpVendPart;
	}

	// Property accessors

	public String getVpDomain() {
		return this.vpDomain;
	}

	public void setVpDomain(String vpDomain) {
		this.vpDomain = vpDomain;
	}

	public String getVpPart() {
		return this.vpPart;
	}

	public void setVpPart(String vpPart) {
		this.vpPart = vpPart;
	}

	public String getVpVend() {
		return this.vpVend;
	}

	public void setVpVend(String vpVend) {
		this.vpVend = vpVend;
	}

	public String getVpVendPart() {
		return this.vpVendPart;
	}

	public void setVpVendPart(String vpVendPart) {
		this.vpVendPart = vpVendPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVpMstrId))
			return false;
		AbstractVpMstrId castOther = (AbstractVpMstrId) other;

		return ((this.getVpDomain() == castOther.getVpDomain()) || (this
				.getVpDomain() != null
				&& castOther.getVpDomain() != null && this.getVpDomain()
				.equals(castOther.getVpDomain())))
				&& ((this.getVpPart() == castOther.getVpPart()) || (this
						.getVpPart() != null
						&& castOther.getVpPart() != null && this.getVpPart()
						.equals(castOther.getVpPart())))
				&& ((this.getVpVend() == castOther.getVpVend()) || (this
						.getVpVend() != null
						&& castOther.getVpVend() != null && this.getVpVend()
						.equals(castOther.getVpVend())))
				&& ((this.getVpVendPart() == castOther.getVpVendPart()) || (this
						.getVpVendPart() != null
						&& castOther.getVpVendPart() != null && this
						.getVpVendPart().equals(castOther.getVpVendPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVpDomain() == null ? 0 : this.getVpDomain().hashCode());
		result = 37 * result
				+ (getVpPart() == null ? 0 : this.getVpPart().hashCode());
		result = 37 * result
				+ (getVpVend() == null ? 0 : this.getVpVend().hashCode());
		result = 37
				* result
				+ (getVpVendPart() == null ? 0 : this.getVpVendPart()
						.hashCode());
		return result;
	}

}