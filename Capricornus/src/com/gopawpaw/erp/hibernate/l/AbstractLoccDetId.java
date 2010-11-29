package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLoccDetId entity provides the base persistence definition of the
 * LoccDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLoccDetId implements java.io.Serializable {

	// Fields

	private String loccDomain;
	private String loccSite;
	private String loccLoc;
	private String loccAddr;

	// Constructors

	/** default constructor */
	public AbstractLoccDetId() {
	}

	/** full constructor */
	public AbstractLoccDetId(String loccDomain, String loccSite,
			String loccLoc, String loccAddr) {
		this.loccDomain = loccDomain;
		this.loccSite = loccSite;
		this.loccLoc = loccLoc;
		this.loccAddr = loccAddr;
	}

	// Property accessors

	public String getLoccDomain() {
		return this.loccDomain;
	}

	public void setLoccDomain(String loccDomain) {
		this.loccDomain = loccDomain;
	}

	public String getLoccSite() {
		return this.loccSite;
	}

	public void setLoccSite(String loccSite) {
		this.loccSite = loccSite;
	}

	public String getLoccLoc() {
		return this.loccLoc;
	}

	public void setLoccLoc(String loccLoc) {
		this.loccLoc = loccLoc;
	}

	public String getLoccAddr() {
		return this.loccAddr;
	}

	public void setLoccAddr(String loccAddr) {
		this.loccAddr = loccAddr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLoccDetId))
			return false;
		AbstractLoccDetId castOther = (AbstractLoccDetId) other;

		return ((this.getLoccDomain() == castOther.getLoccDomain()) || (this
				.getLoccDomain() != null
				&& castOther.getLoccDomain() != null && this.getLoccDomain()
				.equals(castOther.getLoccDomain())))
				&& ((this.getLoccSite() == castOther.getLoccSite()) || (this
						.getLoccSite() != null
						&& castOther.getLoccSite() != null && this
						.getLoccSite().equals(castOther.getLoccSite())))
				&& ((this.getLoccLoc() == castOther.getLoccLoc()) || (this
						.getLoccLoc() != null
						&& castOther.getLoccLoc() != null && this.getLoccLoc()
						.equals(castOther.getLoccLoc())))
				&& ((this.getLoccAddr() == castOther.getLoccAddr()) || (this
						.getLoccAddr() != null
						&& castOther.getLoccAddr() != null && this
						.getLoccAddr().equals(castOther.getLoccAddr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getLoccDomain() == null ? 0 : this.getLoccDomain()
						.hashCode());
		result = 37 * result
				+ (getLoccSite() == null ? 0 : this.getLoccSite().hashCode());
		result = 37 * result
				+ (getLoccLoc() == null ? 0 : this.getLoccLoc().hashCode());
		result = 37 * result
				+ (getLoccAddr() == null ? 0 : this.getLoccAddr().hashCode());
		return result;
	}

}