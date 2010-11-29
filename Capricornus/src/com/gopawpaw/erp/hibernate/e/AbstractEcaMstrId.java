package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEcaMstrId entity provides the base persistence definition of the
 * EcaMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcaMstrId implements java.io.Serializable {

	// Fields

	private String ecaDomain;
	private String ecaCode;
	private String ecaGroup;

	// Constructors

	/** default constructor */
	public AbstractEcaMstrId() {
	}

	/** minimal constructor */
	public AbstractEcaMstrId(String ecaDomain) {
		this.ecaDomain = ecaDomain;
	}

	/** full constructor */
	public AbstractEcaMstrId(String ecaDomain, String ecaCode, String ecaGroup) {
		this.ecaDomain = ecaDomain;
		this.ecaCode = ecaCode;
		this.ecaGroup = ecaGroup;
	}

	// Property accessors

	public String getEcaDomain() {
		return this.ecaDomain;
	}

	public void setEcaDomain(String ecaDomain) {
		this.ecaDomain = ecaDomain;
	}

	public String getEcaCode() {
		return this.ecaCode;
	}

	public void setEcaCode(String ecaCode) {
		this.ecaCode = ecaCode;
	}

	public String getEcaGroup() {
		return this.ecaGroup;
	}

	public void setEcaGroup(String ecaGroup) {
		this.ecaGroup = ecaGroup;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEcaMstrId))
			return false;
		AbstractEcaMstrId castOther = (AbstractEcaMstrId) other;

		return ((this.getEcaDomain() == castOther.getEcaDomain()) || (this
				.getEcaDomain() != null
				&& castOther.getEcaDomain() != null && this.getEcaDomain()
				.equals(castOther.getEcaDomain())))
				&& ((this.getEcaCode() == castOther.getEcaCode()) || (this
						.getEcaCode() != null
						&& castOther.getEcaCode() != null && this.getEcaCode()
						.equals(castOther.getEcaCode())))
				&& ((this.getEcaGroup() == castOther.getEcaGroup()) || (this
						.getEcaGroup() != null
						&& castOther.getEcaGroup() != null && this
						.getEcaGroup().equals(castOther.getEcaGroup())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEcaDomain() == null ? 0 : this.getEcaDomain().hashCode());
		result = 37 * result
				+ (getEcaCode() == null ? 0 : this.getEcaCode().hashCode());
		result = 37 * result
				+ (getEcaGroup() == null ? 0 : this.getEcaGroup().hashCode());
		return result;
	}

}