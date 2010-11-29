package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRcsMstrId entity provides the base persistence definition of the
 * RcsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRcsMstrId implements java.io.Serializable {

	// Fields

	private String rcsDomain;
	private String rcsShipfrom;
	private String rcsShipto;
	private String rcsRlseId;

	// Constructors

	/** default constructor */
	public AbstractRcsMstrId() {
	}

	/** minimal constructor */
	public AbstractRcsMstrId(String rcsDomain) {
		this.rcsDomain = rcsDomain;
	}

	/** full constructor */
	public AbstractRcsMstrId(String rcsDomain, String rcsShipfrom,
			String rcsShipto, String rcsRlseId) {
		this.rcsDomain = rcsDomain;
		this.rcsShipfrom = rcsShipfrom;
		this.rcsShipto = rcsShipto;
		this.rcsRlseId = rcsRlseId;
	}

	// Property accessors

	public String getRcsDomain() {
		return this.rcsDomain;
	}

	public void setRcsDomain(String rcsDomain) {
		this.rcsDomain = rcsDomain;
	}

	public String getRcsShipfrom() {
		return this.rcsShipfrom;
	}

	public void setRcsShipfrom(String rcsShipfrom) {
		this.rcsShipfrom = rcsShipfrom;
	}

	public String getRcsShipto() {
		return this.rcsShipto;
	}

	public void setRcsShipto(String rcsShipto) {
		this.rcsShipto = rcsShipto;
	}

	public String getRcsRlseId() {
		return this.rcsRlseId;
	}

	public void setRcsRlseId(String rcsRlseId) {
		this.rcsRlseId = rcsRlseId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRcsMstrId))
			return false;
		AbstractRcsMstrId castOther = (AbstractRcsMstrId) other;

		return ((this.getRcsDomain() == castOther.getRcsDomain()) || (this
				.getRcsDomain() != null
				&& castOther.getRcsDomain() != null && this.getRcsDomain()
				.equals(castOther.getRcsDomain())))
				&& ((this.getRcsShipfrom() == castOther.getRcsShipfrom()) || (this
						.getRcsShipfrom() != null
						&& castOther.getRcsShipfrom() != null && this
						.getRcsShipfrom().equals(castOther.getRcsShipfrom())))
				&& ((this.getRcsShipto() == castOther.getRcsShipto()) || (this
						.getRcsShipto() != null
						&& castOther.getRcsShipto() != null && this
						.getRcsShipto().equals(castOther.getRcsShipto())))
				&& ((this.getRcsRlseId() == castOther.getRcsRlseId()) || (this
						.getRcsRlseId() != null
						&& castOther.getRcsRlseId() != null && this
						.getRcsRlseId().equals(castOther.getRcsRlseId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRcsDomain() == null ? 0 : this.getRcsDomain().hashCode());
		result = 37
				* result
				+ (getRcsShipfrom() == null ? 0 : this.getRcsShipfrom()
						.hashCode());
		result = 37 * result
				+ (getRcsShipto() == null ? 0 : this.getRcsShipto().hashCode());
		result = 37 * result
				+ (getRcsRlseId() == null ? 0 : this.getRcsRlseId().hashCode());
		return result;
	}

}