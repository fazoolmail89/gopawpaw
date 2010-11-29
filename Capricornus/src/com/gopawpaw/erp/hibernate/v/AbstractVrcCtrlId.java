package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVrcCtrlId entity provides the base persistence definition of the
 * VrcCtrlId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVrcCtrlId implements java.io.Serializable {

	// Fields

	private String vrcDomain;
	private String vrcV86;

	// Constructors

	/** default constructor */
	public AbstractVrcCtrlId() {
	}

	/** minimal constructor */
	public AbstractVrcCtrlId(String vrcDomain) {
		this.vrcDomain = vrcDomain;
	}

	/** full constructor */
	public AbstractVrcCtrlId(String vrcDomain, String vrcV86) {
		this.vrcDomain = vrcDomain;
		this.vrcV86 = vrcV86;
	}

	// Property accessors

	public String getVrcDomain() {
		return this.vrcDomain;
	}

	public void setVrcDomain(String vrcDomain) {
		this.vrcDomain = vrcDomain;
	}

	public String getVrcV86() {
		return this.vrcV86;
	}

	public void setVrcV86(String vrcV86) {
		this.vrcV86 = vrcV86;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVrcCtrlId))
			return false;
		AbstractVrcCtrlId castOther = (AbstractVrcCtrlId) other;

		return ((this.getVrcDomain() == castOther.getVrcDomain()) || (this
				.getVrcDomain() != null
				&& castOther.getVrcDomain() != null && this.getVrcDomain()
				.equals(castOther.getVrcDomain())))
				&& ((this.getVrcV86() == castOther.getVrcV86()) || (this
						.getVrcV86() != null
						&& castOther.getVrcV86() != null && this.getVrcV86()
						.equals(castOther.getVrcV86())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVrcDomain() == null ? 0 : this.getVrcDomain().hashCode());
		result = 37 * result
				+ (getVrcV86() == null ? 0 : this.getVrcV86().hashCode());
		return result;
	}

}