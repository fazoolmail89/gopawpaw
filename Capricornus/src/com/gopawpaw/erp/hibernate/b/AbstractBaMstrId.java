package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBaMstrId entity provides the base persistence definition of the
 * BaMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBaMstrId implements java.io.Serializable {

	// Fields

	private String baDomain;
	private String baModule;
	private String baBatch;

	// Constructors

	/** default constructor */
	public AbstractBaMstrId() {
	}

	/** minimal constructor */
	public AbstractBaMstrId(String baDomain) {
		this.baDomain = baDomain;
	}

	/** full constructor */
	public AbstractBaMstrId(String baDomain, String baModule, String baBatch) {
		this.baDomain = baDomain;
		this.baModule = baModule;
		this.baBatch = baBatch;
	}

	// Property accessors

	public String getBaDomain() {
		return this.baDomain;
	}

	public void setBaDomain(String baDomain) {
		this.baDomain = baDomain;
	}

	public String getBaModule() {
		return this.baModule;
	}

	public void setBaModule(String baModule) {
		this.baModule = baModule;
	}

	public String getBaBatch() {
		return this.baBatch;
	}

	public void setBaBatch(String baBatch) {
		this.baBatch = baBatch;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBaMstrId))
			return false;
		AbstractBaMstrId castOther = (AbstractBaMstrId) other;

		return ((this.getBaDomain() == castOther.getBaDomain()) || (this
				.getBaDomain() != null
				&& castOther.getBaDomain() != null && this.getBaDomain()
				.equals(castOther.getBaDomain())))
				&& ((this.getBaModule() == castOther.getBaModule()) || (this
						.getBaModule() != null
						&& castOther.getBaModule() != null && this
						.getBaModule().equals(castOther.getBaModule())))
				&& ((this.getBaBatch() == castOther.getBaBatch()) || (this
						.getBaBatch() != null
						&& castOther.getBaBatch() != null && this.getBaBatch()
						.equals(castOther.getBaBatch())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBaDomain() == null ? 0 : this.getBaDomain().hashCode());
		result = 37 * result
				+ (getBaModule() == null ? 0 : this.getBaModule().hashCode());
		result = 37 * result
				+ (getBaBatch() == null ? 0 : this.getBaBatch().hashCode());
		return result;
	}

}