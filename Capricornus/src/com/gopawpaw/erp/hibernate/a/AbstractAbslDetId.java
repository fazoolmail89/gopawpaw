package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAbslDetId entity provides the base persistence definition of the
 * AbslDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbslDetId implements java.io.Serializable {

	// Fields

	private String abslDomain;
	private String abslAbsId;
	private String abslAbsShipfrom;
	private String abslOrder;
	private Integer abslOrdLine;
	private Integer abslLcLine;

	// Constructors

	/** default constructor */
	public AbstractAbslDetId() {
	}

	/** full constructor */
	public AbstractAbslDetId(String abslDomain, String abslAbsId,
			String abslAbsShipfrom, String abslOrder, Integer abslOrdLine,
			Integer abslLcLine) {
		this.abslDomain = abslDomain;
		this.abslAbsId = abslAbsId;
		this.abslAbsShipfrom = abslAbsShipfrom;
		this.abslOrder = abslOrder;
		this.abslOrdLine = abslOrdLine;
		this.abslLcLine = abslLcLine;
	}

	// Property accessors

	public String getAbslDomain() {
		return this.abslDomain;
	}

	public void setAbslDomain(String abslDomain) {
		this.abslDomain = abslDomain;
	}

	public String getAbslAbsId() {
		return this.abslAbsId;
	}

	public void setAbslAbsId(String abslAbsId) {
		this.abslAbsId = abslAbsId;
	}

	public String getAbslAbsShipfrom() {
		return this.abslAbsShipfrom;
	}

	public void setAbslAbsShipfrom(String abslAbsShipfrom) {
		this.abslAbsShipfrom = abslAbsShipfrom;
	}

	public String getAbslOrder() {
		return this.abslOrder;
	}

	public void setAbslOrder(String abslOrder) {
		this.abslOrder = abslOrder;
	}

	public Integer getAbslOrdLine() {
		return this.abslOrdLine;
	}

	public void setAbslOrdLine(Integer abslOrdLine) {
		this.abslOrdLine = abslOrdLine;
	}

	public Integer getAbslLcLine() {
		return this.abslLcLine;
	}

	public void setAbslLcLine(Integer abslLcLine) {
		this.abslLcLine = abslLcLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAbslDetId))
			return false;
		AbstractAbslDetId castOther = (AbstractAbslDetId) other;

		return ((this.getAbslDomain() == castOther.getAbslDomain()) || (this
				.getAbslDomain() != null
				&& castOther.getAbslDomain() != null && this.getAbslDomain()
				.equals(castOther.getAbslDomain())))
				&& ((this.getAbslAbsId() == castOther.getAbslAbsId()) || (this
						.getAbslAbsId() != null
						&& castOther.getAbslAbsId() != null && this
						.getAbslAbsId().equals(castOther.getAbslAbsId())))
				&& ((this.getAbslAbsShipfrom() == castOther
						.getAbslAbsShipfrom()) || (this.getAbslAbsShipfrom() != null
						&& castOther.getAbslAbsShipfrom() != null && this
						.getAbslAbsShipfrom().equals(
								castOther.getAbslAbsShipfrom())))
				&& ((this.getAbslOrder() == castOther.getAbslOrder()) || (this
						.getAbslOrder() != null
						&& castOther.getAbslOrder() != null && this
						.getAbslOrder().equals(castOther.getAbslOrder())))
				&& ((this.getAbslOrdLine() == castOther.getAbslOrdLine()) || (this
						.getAbslOrdLine() != null
						&& castOther.getAbslOrdLine() != null && this
						.getAbslOrdLine().equals(castOther.getAbslOrdLine())))
				&& ((this.getAbslLcLine() == castOther.getAbslLcLine()) || (this
						.getAbslLcLine() != null
						&& castOther.getAbslLcLine() != null && this
						.getAbslLcLine().equals(castOther.getAbslLcLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAbslDomain() == null ? 0 : this.getAbslDomain()
						.hashCode());
		result = 37 * result
				+ (getAbslAbsId() == null ? 0 : this.getAbslAbsId().hashCode());
		result = 37
				* result
				+ (getAbslAbsShipfrom() == null ? 0 : this.getAbslAbsShipfrom()
						.hashCode());
		result = 37 * result
				+ (getAbslOrder() == null ? 0 : this.getAbslOrder().hashCode());
		result = 37
				* result
				+ (getAbslOrdLine() == null ? 0 : this.getAbslOrdLine()
						.hashCode());
		result = 37
				* result
				+ (getAbslLcLine() == null ? 0 : this.getAbslLcLine()
						.hashCode());
		return result;
	}

}