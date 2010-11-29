package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDjrcDetId entity provides the base persistence definition of the
 * DjrcDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDjrcDetId implements java.io.Serializable {

	// Fields

	private String djrcDomain;
	private String djrcCode;
	private String djrcType;
	private Integer djrcOrder;
	private String djrcElement;

	// Constructors

	/** default constructor */
	public AbstractDjrcDetId() {
	}

	/** full constructor */
	public AbstractDjrcDetId(String djrcDomain, String djrcCode,
			String djrcType, Integer djrcOrder, String djrcElement) {
		this.djrcDomain = djrcDomain;
		this.djrcCode = djrcCode;
		this.djrcType = djrcType;
		this.djrcOrder = djrcOrder;
		this.djrcElement = djrcElement;
	}

	// Property accessors

	public String getDjrcDomain() {
		return this.djrcDomain;
	}

	public void setDjrcDomain(String djrcDomain) {
		this.djrcDomain = djrcDomain;
	}

	public String getDjrcCode() {
		return this.djrcCode;
	}

	public void setDjrcCode(String djrcCode) {
		this.djrcCode = djrcCode;
	}

	public String getDjrcType() {
		return this.djrcType;
	}

	public void setDjrcType(String djrcType) {
		this.djrcType = djrcType;
	}

	public Integer getDjrcOrder() {
		return this.djrcOrder;
	}

	public void setDjrcOrder(Integer djrcOrder) {
		this.djrcOrder = djrcOrder;
	}

	public String getDjrcElement() {
		return this.djrcElement;
	}

	public void setDjrcElement(String djrcElement) {
		this.djrcElement = djrcElement;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDjrcDetId))
			return false;
		AbstractDjrcDetId castOther = (AbstractDjrcDetId) other;

		return ((this.getDjrcDomain() == castOther.getDjrcDomain()) || (this
				.getDjrcDomain() != null
				&& castOther.getDjrcDomain() != null && this.getDjrcDomain()
				.equals(castOther.getDjrcDomain())))
				&& ((this.getDjrcCode() == castOther.getDjrcCode()) || (this
						.getDjrcCode() != null
						&& castOther.getDjrcCode() != null && this
						.getDjrcCode().equals(castOther.getDjrcCode())))
				&& ((this.getDjrcType() == castOther.getDjrcType()) || (this
						.getDjrcType() != null
						&& castOther.getDjrcType() != null && this
						.getDjrcType().equals(castOther.getDjrcType())))
				&& ((this.getDjrcOrder() == castOther.getDjrcOrder()) || (this
						.getDjrcOrder() != null
						&& castOther.getDjrcOrder() != null && this
						.getDjrcOrder().equals(castOther.getDjrcOrder())))
				&& ((this.getDjrcElement() == castOther.getDjrcElement()) || (this
						.getDjrcElement() != null
						&& castOther.getDjrcElement() != null && this
						.getDjrcElement().equals(castOther.getDjrcElement())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDjrcDomain() == null ? 0 : this.getDjrcDomain()
						.hashCode());
		result = 37 * result
				+ (getDjrcCode() == null ? 0 : this.getDjrcCode().hashCode());
		result = 37 * result
				+ (getDjrcType() == null ? 0 : this.getDjrcType().hashCode());
		result = 37 * result
				+ (getDjrcOrder() == null ? 0 : this.getDjrcOrder().hashCode());
		result = 37
				* result
				+ (getDjrcElement() == null ? 0 : this.getDjrcElement()
						.hashCode());
		return result;
	}

}