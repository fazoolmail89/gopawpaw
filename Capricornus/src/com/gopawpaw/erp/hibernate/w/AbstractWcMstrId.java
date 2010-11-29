package com.gopawpaw.erp.hibernate.w;

/**
 * AbstractWcMstrId entity provides the base persistence definition of the
 * WcMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWcMstrId implements java.io.Serializable {

	// Fields

	private String wcDomain;
	private String wcWkctr;
	private String wcMch;

	// Constructors

	/** default constructor */
	public AbstractWcMstrId() {
	}

	/** minimal constructor */
	public AbstractWcMstrId(String wcDomain, String wcWkctr) {
		this.wcDomain = wcDomain;
		this.wcWkctr = wcWkctr;
	}

	/** full constructor */
	public AbstractWcMstrId(String wcDomain, String wcWkctr, String wcMch) {
		this.wcDomain = wcDomain;
		this.wcWkctr = wcWkctr;
		this.wcMch = wcMch;
	}

	// Property accessors

	public String getWcDomain() {
		return this.wcDomain;
	}

	public void setWcDomain(String wcDomain) {
		this.wcDomain = wcDomain;
	}

	public String getWcWkctr() {
		return this.wcWkctr;
	}

	public void setWcWkctr(String wcWkctr) {
		this.wcWkctr = wcWkctr;
	}

	public String getWcMch() {
		return this.wcMch;
	}

	public void setWcMch(String wcMch) {
		this.wcMch = wcMch;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractWcMstrId))
			return false;
		AbstractWcMstrId castOther = (AbstractWcMstrId) other;

		return ((this.getWcDomain() == castOther.getWcDomain()) || (this
				.getWcDomain() != null
				&& castOther.getWcDomain() != null && this.getWcDomain()
				.equals(castOther.getWcDomain())))
				&& ((this.getWcWkctr() == castOther.getWcWkctr()) || (this
						.getWcWkctr() != null
						&& castOther.getWcWkctr() != null && this.getWcWkctr()
						.equals(castOther.getWcWkctr())))
				&& ((this.getWcMch() == castOther.getWcMch()) || (this
						.getWcMch() != null
						&& castOther.getWcMch() != null && this.getWcMch()
						.equals(castOther.getWcMch())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getWcDomain() == null ? 0 : this.getWcDomain().hashCode());
		result = 37 * result
				+ (getWcWkctr() == null ? 0 : this.getWcWkctr().hashCode());
		result = 37 * result
				+ (getWcMch() == null ? 0 : this.getWcMch().hashCode());
		return result;
	}

}