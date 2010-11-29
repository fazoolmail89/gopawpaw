package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBkdDetId entity provides the base persistence definition of the
 * BkdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBkdDetId implements java.io.Serializable {

	// Fields

	private String bkdDomain;
	private String bkdBank;
	private String bkdPayMethod;
	private String bkdModule;

	// Constructors

	/** default constructor */
	public AbstractBkdDetId() {
	}

	/** full constructor */
	public AbstractBkdDetId(String bkdDomain, String bkdBank,
			String bkdPayMethod, String bkdModule) {
		this.bkdDomain = bkdDomain;
		this.bkdBank = bkdBank;
		this.bkdPayMethod = bkdPayMethod;
		this.bkdModule = bkdModule;
	}

	// Property accessors

	public String getBkdDomain() {
		return this.bkdDomain;
	}

	public void setBkdDomain(String bkdDomain) {
		this.bkdDomain = bkdDomain;
	}

	public String getBkdBank() {
		return this.bkdBank;
	}

	public void setBkdBank(String bkdBank) {
		this.bkdBank = bkdBank;
	}

	public String getBkdPayMethod() {
		return this.bkdPayMethod;
	}

	public void setBkdPayMethod(String bkdPayMethod) {
		this.bkdPayMethod = bkdPayMethod;
	}

	public String getBkdModule() {
		return this.bkdModule;
	}

	public void setBkdModule(String bkdModule) {
		this.bkdModule = bkdModule;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBkdDetId))
			return false;
		AbstractBkdDetId castOther = (AbstractBkdDetId) other;

		return ((this.getBkdDomain() == castOther.getBkdDomain()) || (this
				.getBkdDomain() != null
				&& castOther.getBkdDomain() != null && this.getBkdDomain()
				.equals(castOther.getBkdDomain())))
				&& ((this.getBkdBank() == castOther.getBkdBank()) || (this
						.getBkdBank() != null
						&& castOther.getBkdBank() != null && this.getBkdBank()
						.equals(castOther.getBkdBank())))
				&& ((this.getBkdPayMethod() == castOther.getBkdPayMethod()) || (this
						.getBkdPayMethod() != null
						&& castOther.getBkdPayMethod() != null && this
						.getBkdPayMethod().equals(castOther.getBkdPayMethod())))
				&& ((this.getBkdModule() == castOther.getBkdModule()) || (this
						.getBkdModule() != null
						&& castOther.getBkdModule() != null && this
						.getBkdModule().equals(castOther.getBkdModule())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBkdDomain() == null ? 0 : this.getBkdDomain().hashCode());
		result = 37 * result
				+ (getBkdBank() == null ? 0 : this.getBkdBank().hashCode());
		result = 37
				* result
				+ (getBkdPayMethod() == null ? 0 : this.getBkdPayMethod()
						.hashCode());
		result = 37 * result
				+ (getBkdModule() == null ? 0 : this.getBkdModule().hashCode());
		return result;
	}

}