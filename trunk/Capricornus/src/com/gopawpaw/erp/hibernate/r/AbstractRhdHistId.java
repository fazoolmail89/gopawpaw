package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRhdHistId entity provides the base persistence definition of the
 * RhdHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRhdHistId implements java.io.Serializable {

	// Fields

	private String rhdDomain;
	private String rhdFileType;
	private Integer rhdTrnbr;

	// Constructors

	/** default constructor */
	public AbstractRhdHistId() {
	}

	/** minimal constructor */
	public AbstractRhdHistId(String rhdDomain) {
		this.rhdDomain = rhdDomain;
	}

	/** full constructor */
	public AbstractRhdHistId(String rhdDomain, String rhdFileType,
			Integer rhdTrnbr) {
		this.rhdDomain = rhdDomain;
		this.rhdFileType = rhdFileType;
		this.rhdTrnbr = rhdTrnbr;
	}

	// Property accessors

	public String getRhdDomain() {
		return this.rhdDomain;
	}

	public void setRhdDomain(String rhdDomain) {
		this.rhdDomain = rhdDomain;
	}

	public String getRhdFileType() {
		return this.rhdFileType;
	}

	public void setRhdFileType(String rhdFileType) {
		this.rhdFileType = rhdFileType;
	}

	public Integer getRhdTrnbr() {
		return this.rhdTrnbr;
	}

	public void setRhdTrnbr(Integer rhdTrnbr) {
		this.rhdTrnbr = rhdTrnbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRhdHistId))
			return false;
		AbstractRhdHistId castOther = (AbstractRhdHistId) other;

		return ((this.getRhdDomain() == castOther.getRhdDomain()) || (this
				.getRhdDomain() != null
				&& castOther.getRhdDomain() != null && this.getRhdDomain()
				.equals(castOther.getRhdDomain())))
				&& ((this.getRhdFileType() == castOther.getRhdFileType()) || (this
						.getRhdFileType() != null
						&& castOther.getRhdFileType() != null && this
						.getRhdFileType().equals(castOther.getRhdFileType())))
				&& ((this.getRhdTrnbr() == castOther.getRhdTrnbr()) || (this
						.getRhdTrnbr() != null
						&& castOther.getRhdTrnbr() != null && this
						.getRhdTrnbr().equals(castOther.getRhdTrnbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRhdDomain() == null ? 0 : this.getRhdDomain().hashCode());
		result = 37
				* result
				+ (getRhdFileType() == null ? 0 : this.getRhdFileType()
						.hashCode());
		result = 37 * result
				+ (getRhdTrnbr() == null ? 0 : this.getRhdTrnbr().hashCode());
		return result;
	}

}