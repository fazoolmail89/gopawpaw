package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRsudDetId entity provides the base persistence definition of the
 * RsudDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRsudDetId implements java.io.Serializable {

	// Fields

	private String rsudDomain;
	private Integer rsudIndex;
	private String rsudGroup;

	// Constructors

	/** default constructor */
	public AbstractRsudDetId() {
	}

	/** full constructor */
	public AbstractRsudDetId(String rsudDomain, Integer rsudIndex,
			String rsudGroup) {
		this.rsudDomain = rsudDomain;
		this.rsudIndex = rsudIndex;
		this.rsudGroup = rsudGroup;
	}

	// Property accessors

	public String getRsudDomain() {
		return this.rsudDomain;
	}

	public void setRsudDomain(String rsudDomain) {
		this.rsudDomain = rsudDomain;
	}

	public Integer getRsudIndex() {
		return this.rsudIndex;
	}

	public void setRsudIndex(Integer rsudIndex) {
		this.rsudIndex = rsudIndex;
	}

	public String getRsudGroup() {
		return this.rsudGroup;
	}

	public void setRsudGroup(String rsudGroup) {
		this.rsudGroup = rsudGroup;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRsudDetId))
			return false;
		AbstractRsudDetId castOther = (AbstractRsudDetId) other;

		return ((this.getRsudDomain() == castOther.getRsudDomain()) || (this
				.getRsudDomain() != null
				&& castOther.getRsudDomain() != null && this.getRsudDomain()
				.equals(castOther.getRsudDomain())))
				&& ((this.getRsudIndex() == castOther.getRsudIndex()) || (this
						.getRsudIndex() != null
						&& castOther.getRsudIndex() != null && this
						.getRsudIndex().equals(castOther.getRsudIndex())))
				&& ((this.getRsudGroup() == castOther.getRsudGroup()) || (this
						.getRsudGroup() != null
						&& castOther.getRsudGroup() != null && this
						.getRsudGroup().equals(castOther.getRsudGroup())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getRsudDomain() == null ? 0 : this.getRsudDomain()
						.hashCode());
		result = 37 * result
				+ (getRsudIndex() == null ? 0 : this.getRsudIndex().hashCode());
		result = 37 * result
				+ (getRsudGroup() == null ? 0 : this.getRsudGroup().hashCode());
		return result;
	}

}