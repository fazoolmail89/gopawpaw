package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractShftDetId entity provides the base persistence definition of the
 * ShftDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShftDetId implements java.io.Serializable {

	// Fields

	private String shftDomain;
	private String shftSite;
	private String shftWkctr;
	private String shftMch;
	private Integer shftDay;

	// Constructors

	/** default constructor */
	public AbstractShftDetId() {
	}

	/** minimal constructor */
	public AbstractShftDetId(String shftDomain) {
		this.shftDomain = shftDomain;
	}

	/** full constructor */
	public AbstractShftDetId(String shftDomain, String shftSite,
			String shftWkctr, String shftMch, Integer shftDay) {
		this.shftDomain = shftDomain;
		this.shftSite = shftSite;
		this.shftWkctr = shftWkctr;
		this.shftMch = shftMch;
		this.shftDay = shftDay;
	}

	// Property accessors

	public String getShftDomain() {
		return this.shftDomain;
	}

	public void setShftDomain(String shftDomain) {
		this.shftDomain = shftDomain;
	}

	public String getShftSite() {
		return this.shftSite;
	}

	public void setShftSite(String shftSite) {
		this.shftSite = shftSite;
	}

	public String getShftWkctr() {
		return this.shftWkctr;
	}

	public void setShftWkctr(String shftWkctr) {
		this.shftWkctr = shftWkctr;
	}

	public String getShftMch() {
		return this.shftMch;
	}

	public void setShftMch(String shftMch) {
		this.shftMch = shftMch;
	}

	public Integer getShftDay() {
		return this.shftDay;
	}

	public void setShftDay(Integer shftDay) {
		this.shftDay = shftDay;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractShftDetId))
			return false;
		AbstractShftDetId castOther = (AbstractShftDetId) other;

		return ((this.getShftDomain() == castOther.getShftDomain()) || (this
				.getShftDomain() != null
				&& castOther.getShftDomain() != null && this.getShftDomain()
				.equals(castOther.getShftDomain())))
				&& ((this.getShftSite() == castOther.getShftSite()) || (this
						.getShftSite() != null
						&& castOther.getShftSite() != null && this
						.getShftSite().equals(castOther.getShftSite())))
				&& ((this.getShftWkctr() == castOther.getShftWkctr()) || (this
						.getShftWkctr() != null
						&& castOther.getShftWkctr() != null && this
						.getShftWkctr().equals(castOther.getShftWkctr())))
				&& ((this.getShftMch() == castOther.getShftMch()) || (this
						.getShftMch() != null
						&& castOther.getShftMch() != null && this.getShftMch()
						.equals(castOther.getShftMch())))
				&& ((this.getShftDay() == castOther.getShftDay()) || (this
						.getShftDay() != null
						&& castOther.getShftDay() != null && this.getShftDay()
						.equals(castOther.getShftDay())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getShftDomain() == null ? 0 : this.getShftDomain()
						.hashCode());
		result = 37 * result
				+ (getShftSite() == null ? 0 : this.getShftSite().hashCode());
		result = 37 * result
				+ (getShftWkctr() == null ? 0 : this.getShftWkctr().hashCode());
		result = 37 * result
				+ (getShftMch() == null ? 0 : this.getShftMch().hashCode());
		result = 37 * result
				+ (getShftDay() == null ? 0 : this.getShftDay().hashCode());
		return result;
	}

}