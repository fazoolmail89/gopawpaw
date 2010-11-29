package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractScxRefId entity provides the base persistence definition of the
 * ScxRefId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractScxRefId implements java.io.Serializable {

	// Fields

	private String scxDomain;
	private Integer scxType;
	private String scxShipfrom;
	private String scxShipto;
	private String scxPart;
	private String scxCustref;
	private String scxPo;
	private String scxModelyr;

	// Constructors

	/** default constructor */
	public AbstractScxRefId() {
	}

	/** minimal constructor */
	public AbstractScxRefId(String scxDomain, String scxCustref,
			String scxModelyr) {
		this.scxDomain = scxDomain;
		this.scxCustref = scxCustref;
		this.scxModelyr = scxModelyr;
	}

	/** full constructor */
	public AbstractScxRefId(String scxDomain, Integer scxType,
			String scxShipfrom, String scxShipto, String scxPart,
			String scxCustref, String scxPo, String scxModelyr) {
		this.scxDomain = scxDomain;
		this.scxType = scxType;
		this.scxShipfrom = scxShipfrom;
		this.scxShipto = scxShipto;
		this.scxPart = scxPart;
		this.scxCustref = scxCustref;
		this.scxPo = scxPo;
		this.scxModelyr = scxModelyr;
	}

	// Property accessors

	public String getScxDomain() {
		return this.scxDomain;
	}

	public void setScxDomain(String scxDomain) {
		this.scxDomain = scxDomain;
	}

	public Integer getScxType() {
		return this.scxType;
	}

	public void setScxType(Integer scxType) {
		this.scxType = scxType;
	}

	public String getScxShipfrom() {
		return this.scxShipfrom;
	}

	public void setScxShipfrom(String scxShipfrom) {
		this.scxShipfrom = scxShipfrom;
	}

	public String getScxShipto() {
		return this.scxShipto;
	}

	public void setScxShipto(String scxShipto) {
		this.scxShipto = scxShipto;
	}

	public String getScxPart() {
		return this.scxPart;
	}

	public void setScxPart(String scxPart) {
		this.scxPart = scxPart;
	}

	public String getScxCustref() {
		return this.scxCustref;
	}

	public void setScxCustref(String scxCustref) {
		this.scxCustref = scxCustref;
	}

	public String getScxPo() {
		return this.scxPo;
	}

	public void setScxPo(String scxPo) {
		this.scxPo = scxPo;
	}

	public String getScxModelyr() {
		return this.scxModelyr;
	}

	public void setScxModelyr(String scxModelyr) {
		this.scxModelyr = scxModelyr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractScxRefId))
			return false;
		AbstractScxRefId castOther = (AbstractScxRefId) other;

		return ((this.getScxDomain() == castOther.getScxDomain()) || (this
				.getScxDomain() != null
				&& castOther.getScxDomain() != null && this.getScxDomain()
				.equals(castOther.getScxDomain())))
				&& ((this.getScxType() == castOther.getScxType()) || (this
						.getScxType() != null
						&& castOther.getScxType() != null && this.getScxType()
						.equals(castOther.getScxType())))
				&& ((this.getScxShipfrom() == castOther.getScxShipfrom()) || (this
						.getScxShipfrom() != null
						&& castOther.getScxShipfrom() != null && this
						.getScxShipfrom().equals(castOther.getScxShipfrom())))
				&& ((this.getScxShipto() == castOther.getScxShipto()) || (this
						.getScxShipto() != null
						&& castOther.getScxShipto() != null && this
						.getScxShipto().equals(castOther.getScxShipto())))
				&& ((this.getScxPart() == castOther.getScxPart()) || (this
						.getScxPart() != null
						&& castOther.getScxPart() != null && this.getScxPart()
						.equals(castOther.getScxPart())))
				&& ((this.getScxCustref() == castOther.getScxCustref()) || (this
						.getScxCustref() != null
						&& castOther.getScxCustref() != null && this
						.getScxCustref().equals(castOther.getScxCustref())))
				&& ((this.getScxPo() == castOther.getScxPo()) || (this
						.getScxPo() != null
						&& castOther.getScxPo() != null && this.getScxPo()
						.equals(castOther.getScxPo())))
				&& ((this.getScxModelyr() == castOther.getScxModelyr()) || (this
						.getScxModelyr() != null
						&& castOther.getScxModelyr() != null && this
						.getScxModelyr().equals(castOther.getScxModelyr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getScxDomain() == null ? 0 : this.getScxDomain().hashCode());
		result = 37 * result
				+ (getScxType() == null ? 0 : this.getScxType().hashCode());
		result = 37
				* result
				+ (getScxShipfrom() == null ? 0 : this.getScxShipfrom()
						.hashCode());
		result = 37 * result
				+ (getScxShipto() == null ? 0 : this.getScxShipto().hashCode());
		result = 37 * result
				+ (getScxPart() == null ? 0 : this.getScxPart().hashCode());
		result = 37
				* result
				+ (getScxCustref() == null ? 0 : this.getScxCustref()
						.hashCode());
		result = 37 * result
				+ (getScxPo() == null ? 0 : this.getScxPo().hashCode());
		result = 37
				* result
				+ (getScxModelyr() == null ? 0 : this.getScxModelyr()
						.hashCode());
		return result;
	}

}