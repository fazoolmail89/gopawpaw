package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPliMstrId entity provides the base persistence definition of the
 * PliMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPliMstrId implements java.io.Serializable {

	// Fields

	private String pliDomain;
	private Integer pliKeyid;

	// Constructors

	/** default constructor */
	public AbstractPliMstrId() {
	}

	/** full constructor */
	public AbstractPliMstrId(String pliDomain, Integer pliKeyid) {
		this.pliDomain = pliDomain;
		this.pliKeyid = pliKeyid;
	}

	// Property accessors

	public String getPliDomain() {
		return this.pliDomain;
	}

	public void setPliDomain(String pliDomain) {
		this.pliDomain = pliDomain;
	}

	public Integer getPliKeyid() {
		return this.pliKeyid;
	}

	public void setPliKeyid(Integer pliKeyid) {
		this.pliKeyid = pliKeyid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPliMstrId))
			return false;
		AbstractPliMstrId castOther = (AbstractPliMstrId) other;

		return ((this.getPliDomain() == castOther.getPliDomain()) || (this
				.getPliDomain() != null
				&& castOther.getPliDomain() != null && this.getPliDomain()
				.equals(castOther.getPliDomain())))
				&& ((this.getPliKeyid() == castOther.getPliKeyid()) || (this
						.getPliKeyid() != null
						&& castOther.getPliKeyid() != null && this
						.getPliKeyid().equals(castOther.getPliKeyid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPliDomain() == null ? 0 : this.getPliDomain().hashCode());
		result = 37 * result
				+ (getPliKeyid() == null ? 0 : this.getPliKeyid().hashCode());
		return result;
	}

}