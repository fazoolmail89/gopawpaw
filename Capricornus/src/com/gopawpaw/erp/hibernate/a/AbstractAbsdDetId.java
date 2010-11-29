package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAbsdDetId entity provides the base persistence definition of the
 * AbsdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbsdDetId implements java.io.Serializable {

	// Fields

	private String absdDomain;
	private String absdAbsId;
	private String absdShipfrom;
	private Integer absdFldSeq;

	// Constructors

	/** default constructor */
	public AbstractAbsdDetId() {
	}

	/** full constructor */
	public AbstractAbsdDetId(String absdDomain, String absdAbsId,
			String absdShipfrom, Integer absdFldSeq) {
		this.absdDomain = absdDomain;
		this.absdAbsId = absdAbsId;
		this.absdShipfrom = absdShipfrom;
		this.absdFldSeq = absdFldSeq;
	}

	// Property accessors

	public String getAbsdDomain() {
		return this.absdDomain;
	}

	public void setAbsdDomain(String absdDomain) {
		this.absdDomain = absdDomain;
	}

	public String getAbsdAbsId() {
		return this.absdAbsId;
	}

	public void setAbsdAbsId(String absdAbsId) {
		this.absdAbsId = absdAbsId;
	}

	public String getAbsdShipfrom() {
		return this.absdShipfrom;
	}

	public void setAbsdShipfrom(String absdShipfrom) {
		this.absdShipfrom = absdShipfrom;
	}

	public Integer getAbsdFldSeq() {
		return this.absdFldSeq;
	}

	public void setAbsdFldSeq(Integer absdFldSeq) {
		this.absdFldSeq = absdFldSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAbsdDetId))
			return false;
		AbstractAbsdDetId castOther = (AbstractAbsdDetId) other;

		return ((this.getAbsdDomain() == castOther.getAbsdDomain()) || (this
				.getAbsdDomain() != null
				&& castOther.getAbsdDomain() != null && this.getAbsdDomain()
				.equals(castOther.getAbsdDomain())))
				&& ((this.getAbsdAbsId() == castOther.getAbsdAbsId()) || (this
						.getAbsdAbsId() != null
						&& castOther.getAbsdAbsId() != null && this
						.getAbsdAbsId().equals(castOther.getAbsdAbsId())))
				&& ((this.getAbsdShipfrom() == castOther.getAbsdShipfrom()) || (this
						.getAbsdShipfrom() != null
						&& castOther.getAbsdShipfrom() != null && this
						.getAbsdShipfrom().equals(castOther.getAbsdShipfrom())))
				&& ((this.getAbsdFldSeq() == castOther.getAbsdFldSeq()) || (this
						.getAbsdFldSeq() != null
						&& castOther.getAbsdFldSeq() != null && this
						.getAbsdFldSeq().equals(castOther.getAbsdFldSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAbsdDomain() == null ? 0 : this.getAbsdDomain()
						.hashCode());
		result = 37 * result
				+ (getAbsdAbsId() == null ? 0 : this.getAbsdAbsId().hashCode());
		result = 37
				* result
				+ (getAbsdShipfrom() == null ? 0 : this.getAbsdShipfrom()
						.hashCode());
		result = 37
				* result
				+ (getAbsdFldSeq() == null ? 0 : this.getAbsdFldSeq()
						.hashCode());
		return result;
	}

}