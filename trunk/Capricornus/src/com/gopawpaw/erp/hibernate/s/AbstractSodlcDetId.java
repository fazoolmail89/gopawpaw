package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSodlcDetId entity provides the base persistence definition of the
 * SodlcDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSodlcDetId implements java.io.Serializable {

	// Fields

	private String sodlcDomain;
	private String sodlcOrder;
	private Integer sodlcOrdLine;
	private Integer sodlcLcLine;

	// Constructors

	/** default constructor */
	public AbstractSodlcDetId() {
	}

	/** full constructor */
	public AbstractSodlcDetId(String sodlcDomain, String sodlcOrder,
			Integer sodlcOrdLine, Integer sodlcLcLine) {
		this.sodlcDomain = sodlcDomain;
		this.sodlcOrder = sodlcOrder;
		this.sodlcOrdLine = sodlcOrdLine;
		this.sodlcLcLine = sodlcLcLine;
	}

	// Property accessors

	public String getSodlcDomain() {
		return this.sodlcDomain;
	}

	public void setSodlcDomain(String sodlcDomain) {
		this.sodlcDomain = sodlcDomain;
	}

	public String getSodlcOrder() {
		return this.sodlcOrder;
	}

	public void setSodlcOrder(String sodlcOrder) {
		this.sodlcOrder = sodlcOrder;
	}

	public Integer getSodlcOrdLine() {
		return this.sodlcOrdLine;
	}

	public void setSodlcOrdLine(Integer sodlcOrdLine) {
		this.sodlcOrdLine = sodlcOrdLine;
	}

	public Integer getSodlcLcLine() {
		return this.sodlcLcLine;
	}

	public void setSodlcLcLine(Integer sodlcLcLine) {
		this.sodlcLcLine = sodlcLcLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSodlcDetId))
			return false;
		AbstractSodlcDetId castOther = (AbstractSodlcDetId) other;

		return ((this.getSodlcDomain() == castOther.getSodlcDomain()) || (this
				.getSodlcDomain() != null
				&& castOther.getSodlcDomain() != null && this.getSodlcDomain()
				.equals(castOther.getSodlcDomain())))
				&& ((this.getSodlcOrder() == castOther.getSodlcOrder()) || (this
						.getSodlcOrder() != null
						&& castOther.getSodlcOrder() != null && this
						.getSodlcOrder().equals(castOther.getSodlcOrder())))
				&& ((this.getSodlcOrdLine() == castOther.getSodlcOrdLine()) || (this
						.getSodlcOrdLine() != null
						&& castOther.getSodlcOrdLine() != null && this
						.getSodlcOrdLine().equals(castOther.getSodlcOrdLine())))
				&& ((this.getSodlcLcLine() == castOther.getSodlcLcLine()) || (this
						.getSodlcLcLine() != null
						&& castOther.getSodlcLcLine() != null && this
						.getSodlcLcLine().equals(castOther.getSodlcLcLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSodlcDomain() == null ? 0 : this.getSodlcDomain()
						.hashCode());
		result = 37
				* result
				+ (getSodlcOrder() == null ? 0 : this.getSodlcOrder()
						.hashCode());
		result = 37
				* result
				+ (getSodlcOrdLine() == null ? 0 : this.getSodlcOrdLine()
						.hashCode());
		result = 37
				* result
				+ (getSodlcLcLine() == null ? 0 : this.getSodlcLcLine()
						.hashCode());
		return result;
	}

}