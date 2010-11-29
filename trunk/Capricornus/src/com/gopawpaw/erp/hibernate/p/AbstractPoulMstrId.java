package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPoulMstrId entity provides the base persistence definition of the
 * PoulMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPoulMstrId implements java.io.Serializable {

	// Fields

	private String poulDomain;
	private String poulPouCode;
	private String poulSite;
	private String poulWkctr;
	private String poulMch;

	// Constructors

	/** default constructor */
	public AbstractPoulMstrId() {
	}

	/** full constructor */
	public AbstractPoulMstrId(String poulDomain, String poulPouCode,
			String poulSite, String poulWkctr, String poulMch) {
		this.poulDomain = poulDomain;
		this.poulPouCode = poulPouCode;
		this.poulSite = poulSite;
		this.poulWkctr = poulWkctr;
		this.poulMch = poulMch;
	}

	// Property accessors

	public String getPoulDomain() {
		return this.poulDomain;
	}

	public void setPoulDomain(String poulDomain) {
		this.poulDomain = poulDomain;
	}

	public String getPoulPouCode() {
		return this.poulPouCode;
	}

	public void setPoulPouCode(String poulPouCode) {
		this.poulPouCode = poulPouCode;
	}

	public String getPoulSite() {
		return this.poulSite;
	}

	public void setPoulSite(String poulSite) {
		this.poulSite = poulSite;
	}

	public String getPoulWkctr() {
		return this.poulWkctr;
	}

	public void setPoulWkctr(String poulWkctr) {
		this.poulWkctr = poulWkctr;
	}

	public String getPoulMch() {
		return this.poulMch;
	}

	public void setPoulMch(String poulMch) {
		this.poulMch = poulMch;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPoulMstrId))
			return false;
		AbstractPoulMstrId castOther = (AbstractPoulMstrId) other;

		return ((this.getPoulDomain() == castOther.getPoulDomain()) || (this
				.getPoulDomain() != null
				&& castOther.getPoulDomain() != null && this.getPoulDomain()
				.equals(castOther.getPoulDomain())))
				&& ((this.getPoulPouCode() == castOther.getPoulPouCode()) || (this
						.getPoulPouCode() != null
						&& castOther.getPoulPouCode() != null && this
						.getPoulPouCode().equals(castOther.getPoulPouCode())))
				&& ((this.getPoulSite() == castOther.getPoulSite()) || (this
						.getPoulSite() != null
						&& castOther.getPoulSite() != null && this
						.getPoulSite().equals(castOther.getPoulSite())))
				&& ((this.getPoulWkctr() == castOther.getPoulWkctr()) || (this
						.getPoulWkctr() != null
						&& castOther.getPoulWkctr() != null && this
						.getPoulWkctr().equals(castOther.getPoulWkctr())))
				&& ((this.getPoulMch() == castOther.getPoulMch()) || (this
						.getPoulMch() != null
						&& castOther.getPoulMch() != null && this.getPoulMch()
						.equals(castOther.getPoulMch())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPoulDomain() == null ? 0 : this.getPoulDomain()
						.hashCode());
		result = 37
				* result
				+ (getPoulPouCode() == null ? 0 : this.getPoulPouCode()
						.hashCode());
		result = 37 * result
				+ (getPoulSite() == null ? 0 : this.getPoulSite().hashCode());
		result = 37 * result
				+ (getPoulWkctr() == null ? 0 : this.getPoulWkctr().hashCode());
		result = 37 * result
				+ (getPoulMch() == null ? 0 : this.getPoulMch().hashCode());
		return result;
	}

}