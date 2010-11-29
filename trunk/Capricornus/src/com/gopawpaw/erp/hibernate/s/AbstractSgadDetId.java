package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSgadDetId entity provides the base persistence definition of the
 * SgadDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSgadDetId implements java.io.Serializable {

	// Fields

	private String sgadDomain;
	private String sgadGrp;
	private Boolean sgadIsSrc;
	private String sgadAddr;

	// Constructors

	/** default constructor */
	public AbstractSgadDetId() {
	}

	/** full constructor */
	public AbstractSgadDetId(String sgadDomain, String sgadGrp,
			Boolean sgadIsSrc, String sgadAddr) {
		this.sgadDomain = sgadDomain;
		this.sgadGrp = sgadGrp;
		this.sgadIsSrc = sgadIsSrc;
		this.sgadAddr = sgadAddr;
	}

	// Property accessors

	public String getSgadDomain() {
		return this.sgadDomain;
	}

	public void setSgadDomain(String sgadDomain) {
		this.sgadDomain = sgadDomain;
	}

	public String getSgadGrp() {
		return this.sgadGrp;
	}

	public void setSgadGrp(String sgadGrp) {
		this.sgadGrp = sgadGrp;
	}

	public Boolean getSgadIsSrc() {
		return this.sgadIsSrc;
	}

	public void setSgadIsSrc(Boolean sgadIsSrc) {
		this.sgadIsSrc = sgadIsSrc;
	}

	public String getSgadAddr() {
		return this.sgadAddr;
	}

	public void setSgadAddr(String sgadAddr) {
		this.sgadAddr = sgadAddr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSgadDetId))
			return false;
		AbstractSgadDetId castOther = (AbstractSgadDetId) other;

		return ((this.getSgadDomain() == castOther.getSgadDomain()) || (this
				.getSgadDomain() != null
				&& castOther.getSgadDomain() != null && this.getSgadDomain()
				.equals(castOther.getSgadDomain())))
				&& ((this.getSgadGrp() == castOther.getSgadGrp()) || (this
						.getSgadGrp() != null
						&& castOther.getSgadGrp() != null && this.getSgadGrp()
						.equals(castOther.getSgadGrp())))
				&& ((this.getSgadIsSrc() == castOther.getSgadIsSrc()) || (this
						.getSgadIsSrc() != null
						&& castOther.getSgadIsSrc() != null && this
						.getSgadIsSrc().equals(castOther.getSgadIsSrc())))
				&& ((this.getSgadAddr() == castOther.getSgadAddr()) || (this
						.getSgadAddr() != null
						&& castOther.getSgadAddr() != null && this
						.getSgadAddr().equals(castOther.getSgadAddr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSgadDomain() == null ? 0 : this.getSgadDomain()
						.hashCode());
		result = 37 * result
				+ (getSgadGrp() == null ? 0 : this.getSgadGrp().hashCode());
		result = 37 * result
				+ (getSgadIsSrc() == null ? 0 : this.getSgadIsSrc().hashCode());
		result = 37 * result
				+ (getSgadAddr() == null ? 0 : this.getSgadAddr().hashCode());
		return result;
	}

}