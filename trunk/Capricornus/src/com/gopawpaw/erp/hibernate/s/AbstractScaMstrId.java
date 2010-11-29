package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractScaMstrId entity provides the base persistence definition of the
 * ScaMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractScaMstrId implements java.io.Serializable {

	// Fields

	private String scaDomain;
	private String scaService;
	private String scaPart;

	// Constructors

	/** default constructor */
	public AbstractScaMstrId() {
	}

	/** minimal constructor */
	public AbstractScaMstrId(String scaDomain) {
		this.scaDomain = scaDomain;
	}

	/** full constructor */
	public AbstractScaMstrId(String scaDomain, String scaService, String scaPart) {
		this.scaDomain = scaDomain;
		this.scaService = scaService;
		this.scaPart = scaPart;
	}

	// Property accessors

	public String getScaDomain() {
		return this.scaDomain;
	}

	public void setScaDomain(String scaDomain) {
		this.scaDomain = scaDomain;
	}

	public String getScaService() {
		return this.scaService;
	}

	public void setScaService(String scaService) {
		this.scaService = scaService;
	}

	public String getScaPart() {
		return this.scaPart;
	}

	public void setScaPart(String scaPart) {
		this.scaPart = scaPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractScaMstrId))
			return false;
		AbstractScaMstrId castOther = (AbstractScaMstrId) other;

		return ((this.getScaDomain() == castOther.getScaDomain()) || (this
				.getScaDomain() != null
				&& castOther.getScaDomain() != null && this.getScaDomain()
				.equals(castOther.getScaDomain())))
				&& ((this.getScaService() == castOther.getScaService()) || (this
						.getScaService() != null
						&& castOther.getScaService() != null && this
						.getScaService().equals(castOther.getScaService())))
				&& ((this.getScaPart() == castOther.getScaPart()) || (this
						.getScaPart() != null
						&& castOther.getScaPart() != null && this.getScaPart()
						.equals(castOther.getScaPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getScaDomain() == null ? 0 : this.getScaDomain().hashCode());
		result = 37
				* result
				+ (getScaService() == null ? 0 : this.getScaService()
						.hashCode());
		result = 37 * result
				+ (getScaPart() == null ? 0 : this.getScaPart().hashCode());
		return result;
	}

}