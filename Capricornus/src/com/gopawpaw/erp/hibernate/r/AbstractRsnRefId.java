package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRsnRefId entity provides the base persistence definition of the
 * RsnRefId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRsnRefId implements java.io.Serializable {

	// Fields

	private String rsnDomain;
	private String rsnCode;
	private String rsnType;

	// Constructors

	/** default constructor */
	public AbstractRsnRefId() {
	}

	/** minimal constructor */
	public AbstractRsnRefId(String rsnDomain) {
		this.rsnDomain = rsnDomain;
	}

	/** full constructor */
	public AbstractRsnRefId(String rsnDomain, String rsnCode, String rsnType) {
		this.rsnDomain = rsnDomain;
		this.rsnCode = rsnCode;
		this.rsnType = rsnType;
	}

	// Property accessors

	public String getRsnDomain() {
		return this.rsnDomain;
	}

	public void setRsnDomain(String rsnDomain) {
		this.rsnDomain = rsnDomain;
	}

	public String getRsnCode() {
		return this.rsnCode;
	}

	public void setRsnCode(String rsnCode) {
		this.rsnCode = rsnCode;
	}

	public String getRsnType() {
		return this.rsnType;
	}

	public void setRsnType(String rsnType) {
		this.rsnType = rsnType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRsnRefId))
			return false;
		AbstractRsnRefId castOther = (AbstractRsnRefId) other;

		return ((this.getRsnDomain() == castOther.getRsnDomain()) || (this
				.getRsnDomain() != null
				&& castOther.getRsnDomain() != null && this.getRsnDomain()
				.equals(castOther.getRsnDomain())))
				&& ((this.getRsnCode() == castOther.getRsnCode()) || (this
						.getRsnCode() != null
						&& castOther.getRsnCode() != null && this.getRsnCode()
						.equals(castOther.getRsnCode())))
				&& ((this.getRsnType() == castOther.getRsnType()) || (this
						.getRsnType() != null
						&& castOther.getRsnType() != null && this.getRsnType()
						.equals(castOther.getRsnType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRsnDomain() == null ? 0 : this.getRsnDomain().hashCode());
		result = 37 * result
				+ (getRsnCode() == null ? 0 : this.getRsnCode().hashCode());
		result = 37 * result
				+ (getRsnType() == null ? 0 : this.getRsnType().hashCode());
		return result;
	}

}