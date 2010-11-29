package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSsmMstrId entity provides the base persistence definition of the
 * SsmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSsmMstrId implements java.io.Serializable {

	// Fields

	private String ssmDomain;
	private String ssmNetwork;

	// Constructors

	/** default constructor */
	public AbstractSsmMstrId() {
	}

	/** minimal constructor */
	public AbstractSsmMstrId(String ssmDomain) {
		this.ssmDomain = ssmDomain;
	}

	/** full constructor */
	public AbstractSsmMstrId(String ssmDomain, String ssmNetwork) {
		this.ssmDomain = ssmDomain;
		this.ssmNetwork = ssmNetwork;
	}

	// Property accessors

	public String getSsmDomain() {
		return this.ssmDomain;
	}

	public void setSsmDomain(String ssmDomain) {
		this.ssmDomain = ssmDomain;
	}

	public String getSsmNetwork() {
		return this.ssmNetwork;
	}

	public void setSsmNetwork(String ssmNetwork) {
		this.ssmNetwork = ssmNetwork;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSsmMstrId))
			return false;
		AbstractSsmMstrId castOther = (AbstractSsmMstrId) other;

		return ((this.getSsmDomain() == castOther.getSsmDomain()) || (this
				.getSsmDomain() != null
				&& castOther.getSsmDomain() != null && this.getSsmDomain()
				.equals(castOther.getSsmDomain())))
				&& ((this.getSsmNetwork() == castOther.getSsmNetwork()) || (this
						.getSsmNetwork() != null
						&& castOther.getSsmNetwork() != null && this
						.getSsmNetwork().equals(castOther.getSsmNetwork())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSsmDomain() == null ? 0 : this.getSsmDomain().hashCode());
		result = 37
				* result
				+ (getSsmNetwork() == null ? 0 : this.getSsmNetwork()
						.hashCode());
		return result;
	}

}