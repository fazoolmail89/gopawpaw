package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGltmMstrId entity provides the base persistence definition of the
 * GltmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGltmMstrId implements java.io.Serializable {

	// Fields

	private String gltmDomain;
	private String gltmEntity;
	private String gltmAcct;
	private Integer gltmMatchNbr;

	// Constructors

	/** default constructor */
	public AbstractGltmMstrId() {
	}

	/** full constructor */
	public AbstractGltmMstrId(String gltmDomain, String gltmEntity,
			String gltmAcct, Integer gltmMatchNbr) {
		this.gltmDomain = gltmDomain;
		this.gltmEntity = gltmEntity;
		this.gltmAcct = gltmAcct;
		this.gltmMatchNbr = gltmMatchNbr;
	}

	// Property accessors

	public String getGltmDomain() {
		return this.gltmDomain;
	}

	public void setGltmDomain(String gltmDomain) {
		this.gltmDomain = gltmDomain;
	}

	public String getGltmEntity() {
		return this.gltmEntity;
	}

	public void setGltmEntity(String gltmEntity) {
		this.gltmEntity = gltmEntity;
	}

	public String getGltmAcct() {
		return this.gltmAcct;
	}

	public void setGltmAcct(String gltmAcct) {
		this.gltmAcct = gltmAcct;
	}

	public Integer getGltmMatchNbr() {
		return this.gltmMatchNbr;
	}

	public void setGltmMatchNbr(Integer gltmMatchNbr) {
		this.gltmMatchNbr = gltmMatchNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGltmMstrId))
			return false;
		AbstractGltmMstrId castOther = (AbstractGltmMstrId) other;

		return ((this.getGltmDomain() == castOther.getGltmDomain()) || (this
				.getGltmDomain() != null
				&& castOther.getGltmDomain() != null && this.getGltmDomain()
				.equals(castOther.getGltmDomain())))
				&& ((this.getGltmEntity() == castOther.getGltmEntity()) || (this
						.getGltmEntity() != null
						&& castOther.getGltmEntity() != null && this
						.getGltmEntity().equals(castOther.getGltmEntity())))
				&& ((this.getGltmAcct() == castOther.getGltmAcct()) || (this
						.getGltmAcct() != null
						&& castOther.getGltmAcct() != null && this
						.getGltmAcct().equals(castOther.getGltmAcct())))
				&& ((this.getGltmMatchNbr() == castOther.getGltmMatchNbr()) || (this
						.getGltmMatchNbr() != null
						&& castOther.getGltmMatchNbr() != null && this
						.getGltmMatchNbr().equals(castOther.getGltmMatchNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGltmDomain() == null ? 0 : this.getGltmDomain()
						.hashCode());
		result = 37
				* result
				+ (getGltmEntity() == null ? 0 : this.getGltmEntity()
						.hashCode());
		result = 37 * result
				+ (getGltmAcct() == null ? 0 : this.getGltmAcct().hashCode());
		result = 37
				* result
				+ (getGltmMatchNbr() == null ? 0 : this.getGltmMatchNbr()
						.hashCode());
		return result;
	}

}