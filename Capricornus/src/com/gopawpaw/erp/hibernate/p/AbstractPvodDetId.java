package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPvodDetId entity provides the base persistence definition of the
 * PvodDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPvodDetId implements java.io.Serializable {

	// Fields

	private String pvodDomain;
	private Integer pvodId;
	private Integer pvodIdLine;

	// Constructors

	/** default constructor */
	public AbstractPvodDetId() {
	}

	/** full constructor */
	public AbstractPvodDetId(String pvodDomain, Integer pvodId,
			Integer pvodIdLine) {
		this.pvodDomain = pvodDomain;
		this.pvodId = pvodId;
		this.pvodIdLine = pvodIdLine;
	}

	// Property accessors

	public String getPvodDomain() {
		return this.pvodDomain;
	}

	public void setPvodDomain(String pvodDomain) {
		this.pvodDomain = pvodDomain;
	}

	public Integer getPvodId() {
		return this.pvodId;
	}

	public void setPvodId(Integer pvodId) {
		this.pvodId = pvodId;
	}

	public Integer getPvodIdLine() {
		return this.pvodIdLine;
	}

	public void setPvodIdLine(Integer pvodIdLine) {
		this.pvodIdLine = pvodIdLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPvodDetId))
			return false;
		AbstractPvodDetId castOther = (AbstractPvodDetId) other;

		return ((this.getPvodDomain() == castOther.getPvodDomain()) || (this
				.getPvodDomain() != null
				&& castOther.getPvodDomain() != null && this.getPvodDomain()
				.equals(castOther.getPvodDomain())))
				&& ((this.getPvodId() == castOther.getPvodId()) || (this
						.getPvodId() != null
						&& castOther.getPvodId() != null && this.getPvodId()
						.equals(castOther.getPvodId())))
				&& ((this.getPvodIdLine() == castOther.getPvodIdLine()) || (this
						.getPvodIdLine() != null
						&& castOther.getPvodIdLine() != null && this
						.getPvodIdLine().equals(castOther.getPvodIdLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPvodDomain() == null ? 0 : this.getPvodDomain()
						.hashCode());
		result = 37 * result
				+ (getPvodId() == null ? 0 : this.getPvodId().hashCode());
		result = 37
				* result
				+ (getPvodIdLine() == null ? 0 : this.getPvodIdLine()
						.hashCode());
		return result;
	}

}