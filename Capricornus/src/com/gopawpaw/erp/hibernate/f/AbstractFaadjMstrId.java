package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFaadjMstrId entity provides the base persistence definition of the
 * FaadjMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFaadjMstrId implements java.io.Serializable {

	// Fields

	private String faadjDomain;
	private String faadjFaId;
	private String faadjFabkId;
	private Integer faadjResrv;

	// Constructors

	/** default constructor */
	public AbstractFaadjMstrId() {
	}

	/** full constructor */
	public AbstractFaadjMstrId(String faadjDomain, String faadjFaId,
			String faadjFabkId, Integer faadjResrv) {
		this.faadjDomain = faadjDomain;
		this.faadjFaId = faadjFaId;
		this.faadjFabkId = faadjFabkId;
		this.faadjResrv = faadjResrv;
	}

	// Property accessors

	public String getFaadjDomain() {
		return this.faadjDomain;
	}

	public void setFaadjDomain(String faadjDomain) {
		this.faadjDomain = faadjDomain;
	}

	public String getFaadjFaId() {
		return this.faadjFaId;
	}

	public void setFaadjFaId(String faadjFaId) {
		this.faadjFaId = faadjFaId;
	}

	public String getFaadjFabkId() {
		return this.faadjFabkId;
	}

	public void setFaadjFabkId(String faadjFabkId) {
		this.faadjFabkId = faadjFabkId;
	}

	public Integer getFaadjResrv() {
		return this.faadjResrv;
	}

	public void setFaadjResrv(Integer faadjResrv) {
		this.faadjResrv = faadjResrv;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFaadjMstrId))
			return false;
		AbstractFaadjMstrId castOther = (AbstractFaadjMstrId) other;

		return ((this.getFaadjDomain() == castOther.getFaadjDomain()) || (this
				.getFaadjDomain() != null
				&& castOther.getFaadjDomain() != null && this.getFaadjDomain()
				.equals(castOther.getFaadjDomain())))
				&& ((this.getFaadjFaId() == castOther.getFaadjFaId()) || (this
						.getFaadjFaId() != null
						&& castOther.getFaadjFaId() != null && this
						.getFaadjFaId().equals(castOther.getFaadjFaId())))
				&& ((this.getFaadjFabkId() == castOther.getFaadjFabkId()) || (this
						.getFaadjFabkId() != null
						&& castOther.getFaadjFabkId() != null && this
						.getFaadjFabkId().equals(castOther.getFaadjFabkId())))
				&& ((this.getFaadjResrv() == castOther.getFaadjResrv()) || (this
						.getFaadjResrv() != null
						&& castOther.getFaadjResrv() != null && this
						.getFaadjResrv().equals(castOther.getFaadjResrv())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFaadjDomain() == null ? 0 : this.getFaadjDomain()
						.hashCode());
		result = 37 * result
				+ (getFaadjFaId() == null ? 0 : this.getFaadjFaId().hashCode());
		result = 37
				* result
				+ (getFaadjFabkId() == null ? 0 : this.getFaadjFabkId()
						.hashCode());
		result = 37
				* result
				+ (getFaadjResrv() == null ? 0 : this.getFaadjResrv()
						.hashCode());
		return result;
	}

}