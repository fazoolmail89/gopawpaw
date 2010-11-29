package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIpMstrId entity provides the base persistence definition of the
 * IpMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIpMstrId implements java.io.Serializable {

	// Fields

	private String ipDomain;
	private String ipPart;
	private String ipRouting;
	private Integer ipOp;

	// Constructors

	/** default constructor */
	public AbstractIpMstrId() {
	}

	/** minimal constructor */
	public AbstractIpMstrId(String ipDomain) {
		this.ipDomain = ipDomain;
	}

	/** full constructor */
	public AbstractIpMstrId(String ipDomain, String ipPart, String ipRouting,
			Integer ipOp) {
		this.ipDomain = ipDomain;
		this.ipPart = ipPart;
		this.ipRouting = ipRouting;
		this.ipOp = ipOp;
	}

	// Property accessors

	public String getIpDomain() {
		return this.ipDomain;
	}

	public void setIpDomain(String ipDomain) {
		this.ipDomain = ipDomain;
	}

	public String getIpPart() {
		return this.ipPart;
	}

	public void setIpPart(String ipPart) {
		this.ipPart = ipPart;
	}

	public String getIpRouting() {
		return this.ipRouting;
	}

	public void setIpRouting(String ipRouting) {
		this.ipRouting = ipRouting;
	}

	public Integer getIpOp() {
		return this.ipOp;
	}

	public void setIpOp(Integer ipOp) {
		this.ipOp = ipOp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIpMstrId))
			return false;
		AbstractIpMstrId castOther = (AbstractIpMstrId) other;

		return ((this.getIpDomain() == castOther.getIpDomain()) || (this
				.getIpDomain() != null
				&& castOther.getIpDomain() != null && this.getIpDomain()
				.equals(castOther.getIpDomain())))
				&& ((this.getIpPart() == castOther.getIpPart()) || (this
						.getIpPart() != null
						&& castOther.getIpPart() != null && this.getIpPart()
						.equals(castOther.getIpPart())))
				&& ((this.getIpRouting() == castOther.getIpRouting()) || (this
						.getIpRouting() != null
						&& castOther.getIpRouting() != null && this
						.getIpRouting().equals(castOther.getIpRouting())))
				&& ((this.getIpOp() == castOther.getIpOp()) || (this.getIpOp() != null
						&& castOther.getIpOp() != null && this.getIpOp()
						.equals(castOther.getIpOp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIpDomain() == null ? 0 : this.getIpDomain().hashCode());
		result = 37 * result
				+ (getIpPart() == null ? 0 : this.getIpPart().hashCode());
		result = 37 * result
				+ (getIpRouting() == null ? 0 : this.getIpRouting().hashCode());
		result = 37 * result
				+ (getIpOp() == null ? 0 : this.getIpOp().hashCode());
		return result;
	}

}