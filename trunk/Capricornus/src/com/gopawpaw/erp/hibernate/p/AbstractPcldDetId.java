package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPcldDetId entity provides the base persistence definition of the
 * PcldDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPcldDetId implements java.io.Serializable {

	// Fields

	private String pcldDomain;
	private String pcldGroup;
	private String pcldId;

	// Constructors

	/** default constructor */
	public AbstractPcldDetId() {
	}

	/** full constructor */
	public AbstractPcldDetId(String pcldDomain, String pcldGroup, String pcldId) {
		this.pcldDomain = pcldDomain;
		this.pcldGroup = pcldGroup;
		this.pcldId = pcldId;
	}

	// Property accessors

	public String getPcldDomain() {
		return this.pcldDomain;
	}

	public void setPcldDomain(String pcldDomain) {
		this.pcldDomain = pcldDomain;
	}

	public String getPcldGroup() {
		return this.pcldGroup;
	}

	public void setPcldGroup(String pcldGroup) {
		this.pcldGroup = pcldGroup;
	}

	public String getPcldId() {
		return this.pcldId;
	}

	public void setPcldId(String pcldId) {
		this.pcldId = pcldId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPcldDetId))
			return false;
		AbstractPcldDetId castOther = (AbstractPcldDetId) other;

		return ((this.getPcldDomain() == castOther.getPcldDomain()) || (this
				.getPcldDomain() != null
				&& castOther.getPcldDomain() != null && this.getPcldDomain()
				.equals(castOther.getPcldDomain())))
				&& ((this.getPcldGroup() == castOther.getPcldGroup()) || (this
						.getPcldGroup() != null
						&& castOther.getPcldGroup() != null && this
						.getPcldGroup().equals(castOther.getPcldGroup())))
				&& ((this.getPcldId() == castOther.getPcldId()) || (this
						.getPcldId() != null
						&& castOther.getPcldId() != null && this.getPcldId()
						.equals(castOther.getPcldId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPcldDomain() == null ? 0 : this.getPcldDomain()
						.hashCode());
		result = 37 * result
				+ (getPcldGroup() == null ? 0 : this.getPcldGroup().hashCode());
		result = 37 * result
				+ (getPcldId() == null ? 0 : this.getPcldId().hashCode());
		return result;
	}

}