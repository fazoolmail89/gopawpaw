package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKnbiMstrId entity provides the base persistence definition of the
 * KnbiMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbiMstrId implements java.io.Serializable {

	// Fields

	private String knbiDomain;
	private String knbiPart;
	private Integer knbiStep;

	// Constructors

	/** default constructor */
	public AbstractKnbiMstrId() {
	}

	/** full constructor */
	public AbstractKnbiMstrId(String knbiDomain, String knbiPart,
			Integer knbiStep) {
		this.knbiDomain = knbiDomain;
		this.knbiPart = knbiPart;
		this.knbiStep = knbiStep;
	}

	// Property accessors

	public String getKnbiDomain() {
		return this.knbiDomain;
	}

	public void setKnbiDomain(String knbiDomain) {
		this.knbiDomain = knbiDomain;
	}

	public String getKnbiPart() {
		return this.knbiPart;
	}

	public void setKnbiPart(String knbiPart) {
		this.knbiPart = knbiPart;
	}

	public Integer getKnbiStep() {
		return this.knbiStep;
	}

	public void setKnbiStep(Integer knbiStep) {
		this.knbiStep = knbiStep;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKnbiMstrId))
			return false;
		AbstractKnbiMstrId castOther = (AbstractKnbiMstrId) other;

		return ((this.getKnbiDomain() == castOther.getKnbiDomain()) || (this
				.getKnbiDomain() != null
				&& castOther.getKnbiDomain() != null && this.getKnbiDomain()
				.equals(castOther.getKnbiDomain())))
				&& ((this.getKnbiPart() == castOther.getKnbiPart()) || (this
						.getKnbiPart() != null
						&& castOther.getKnbiPart() != null && this
						.getKnbiPart().equals(castOther.getKnbiPart())))
				&& ((this.getKnbiStep() == castOther.getKnbiStep()) || (this
						.getKnbiStep() != null
						&& castOther.getKnbiStep() != null && this
						.getKnbiStep().equals(castOther.getKnbiStep())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKnbiDomain() == null ? 0 : this.getKnbiDomain()
						.hashCode());
		result = 37 * result
				+ (getKnbiPart() == null ? 0 : this.getKnbiPart().hashCode());
		result = 37 * result
				+ (getKnbiStep() == null ? 0 : this.getKnbiStep().hashCode());
		return result;
	}

}