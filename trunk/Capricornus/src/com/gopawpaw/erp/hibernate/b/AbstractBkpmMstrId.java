package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBkpmMstrId entity provides the base persistence definition of the
 * BkpmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBkpmMstrId implements java.io.Serializable {

	// Fields

	private String bkpmDomain;
	private String bkpmBank;
	private String bkpmPayMethod;
	private String bkpmModule;
	private Integer bkpmSeq;

	// Constructors

	/** default constructor */
	public AbstractBkpmMstrId() {
	}

	/** full constructor */
	public AbstractBkpmMstrId(String bkpmDomain, String bkpmBank,
			String bkpmPayMethod, String bkpmModule, Integer bkpmSeq) {
		this.bkpmDomain = bkpmDomain;
		this.bkpmBank = bkpmBank;
		this.bkpmPayMethod = bkpmPayMethod;
		this.bkpmModule = bkpmModule;
		this.bkpmSeq = bkpmSeq;
	}

	// Property accessors

	public String getBkpmDomain() {
		return this.bkpmDomain;
	}

	public void setBkpmDomain(String bkpmDomain) {
		this.bkpmDomain = bkpmDomain;
	}

	public String getBkpmBank() {
		return this.bkpmBank;
	}

	public void setBkpmBank(String bkpmBank) {
		this.bkpmBank = bkpmBank;
	}

	public String getBkpmPayMethod() {
		return this.bkpmPayMethod;
	}

	public void setBkpmPayMethod(String bkpmPayMethod) {
		this.bkpmPayMethod = bkpmPayMethod;
	}

	public String getBkpmModule() {
		return this.bkpmModule;
	}

	public void setBkpmModule(String bkpmModule) {
		this.bkpmModule = bkpmModule;
	}

	public Integer getBkpmSeq() {
		return this.bkpmSeq;
	}

	public void setBkpmSeq(Integer bkpmSeq) {
		this.bkpmSeq = bkpmSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBkpmMstrId))
			return false;
		AbstractBkpmMstrId castOther = (AbstractBkpmMstrId) other;

		return ((this.getBkpmDomain() == castOther.getBkpmDomain()) || (this
				.getBkpmDomain() != null
				&& castOther.getBkpmDomain() != null && this.getBkpmDomain()
				.equals(castOther.getBkpmDomain())))
				&& ((this.getBkpmBank() == castOther.getBkpmBank()) || (this
						.getBkpmBank() != null
						&& castOther.getBkpmBank() != null && this
						.getBkpmBank().equals(castOther.getBkpmBank())))
				&& ((this.getBkpmPayMethod() == castOther.getBkpmPayMethod()) || (this
						.getBkpmPayMethod() != null
						&& castOther.getBkpmPayMethod() != null && this
						.getBkpmPayMethod()
						.equals(castOther.getBkpmPayMethod())))
				&& ((this.getBkpmModule() == castOther.getBkpmModule()) || (this
						.getBkpmModule() != null
						&& castOther.getBkpmModule() != null && this
						.getBkpmModule().equals(castOther.getBkpmModule())))
				&& ((this.getBkpmSeq() == castOther.getBkpmSeq()) || (this
						.getBkpmSeq() != null
						&& castOther.getBkpmSeq() != null && this.getBkpmSeq()
						.equals(castOther.getBkpmSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getBkpmDomain() == null ? 0 : this.getBkpmDomain()
						.hashCode());
		result = 37 * result
				+ (getBkpmBank() == null ? 0 : this.getBkpmBank().hashCode());
		result = 37
				* result
				+ (getBkpmPayMethod() == null ? 0 : this.getBkpmPayMethod()
						.hashCode());
		result = 37
				* result
				+ (getBkpmModule() == null ? 0 : this.getBkpmModule()
						.hashCode());
		result = 37 * result
				+ (getBkpmSeq() == null ? 0 : this.getBkpmSeq().hashCode());
		return result;
	}

}