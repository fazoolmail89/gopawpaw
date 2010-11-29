package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPvoMstrId entity provides the base persistence definition of the
 * PvoMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPvoMstrId implements java.io.Serializable {

	// Fields

	private String pvoDomain;
	private Integer pvoId;

	// Constructors

	/** default constructor */
	public AbstractPvoMstrId() {
	}

	/** full constructor */
	public AbstractPvoMstrId(String pvoDomain, Integer pvoId) {
		this.pvoDomain = pvoDomain;
		this.pvoId = pvoId;
	}

	// Property accessors

	public String getPvoDomain() {
		return this.pvoDomain;
	}

	public void setPvoDomain(String pvoDomain) {
		this.pvoDomain = pvoDomain;
	}

	public Integer getPvoId() {
		return this.pvoId;
	}

	public void setPvoId(Integer pvoId) {
		this.pvoId = pvoId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPvoMstrId))
			return false;
		AbstractPvoMstrId castOther = (AbstractPvoMstrId) other;

		return ((this.getPvoDomain() == castOther.getPvoDomain()) || (this
				.getPvoDomain() != null
				&& castOther.getPvoDomain() != null && this.getPvoDomain()
				.equals(castOther.getPvoDomain())))
				&& ((this.getPvoId() == castOther.getPvoId()) || (this
						.getPvoId() != null
						&& castOther.getPvoId() != null && this.getPvoId()
						.equals(castOther.getPvoId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPvoDomain() == null ? 0 : this.getPvoDomain().hashCode());
		result = 37 * result
				+ (getPvoId() == null ? 0 : this.getPvoId().hashCode());
		return result;
	}

}