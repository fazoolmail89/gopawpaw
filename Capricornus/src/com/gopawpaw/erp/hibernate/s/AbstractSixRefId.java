package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSixRefId entity provides the base persistence definition of the
 * SixRefId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSixRefId implements java.io.Serializable {

	// Fields

	private String sixDomain;
	private Integer sixTrnbr;

	// Constructors

	/** default constructor */
	public AbstractSixRefId() {
	}

	/** minimal constructor */
	public AbstractSixRefId(String sixDomain) {
		this.sixDomain = sixDomain;
	}

	/** full constructor */
	public AbstractSixRefId(String sixDomain, Integer sixTrnbr) {
		this.sixDomain = sixDomain;
		this.sixTrnbr = sixTrnbr;
	}

	// Property accessors

	public String getSixDomain() {
		return this.sixDomain;
	}

	public void setSixDomain(String sixDomain) {
		this.sixDomain = sixDomain;
	}

	public Integer getSixTrnbr() {
		return this.sixTrnbr;
	}

	public void setSixTrnbr(Integer sixTrnbr) {
		this.sixTrnbr = sixTrnbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSixRefId))
			return false;
		AbstractSixRefId castOther = (AbstractSixRefId) other;

		return ((this.getSixDomain() == castOther.getSixDomain()) || (this
				.getSixDomain() != null
				&& castOther.getSixDomain() != null && this.getSixDomain()
				.equals(castOther.getSixDomain())))
				&& ((this.getSixTrnbr() == castOther.getSixTrnbr()) || (this
						.getSixTrnbr() != null
						&& castOther.getSixTrnbr() != null && this
						.getSixTrnbr().equals(castOther.getSixTrnbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSixDomain() == null ? 0 : this.getSixDomain().hashCode());
		result = 37 * result
				+ (getSixTrnbr() == null ? 0 : this.getSixTrnbr().hashCode());
		return result;
	}

}