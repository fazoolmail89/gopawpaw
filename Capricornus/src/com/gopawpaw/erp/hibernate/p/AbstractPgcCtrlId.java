package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPgcCtrlId entity provides the base persistence definition of the
 * PgcCtrlId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPgcCtrlId implements java.io.Serializable {

	// Fields

	private String pgcDomain;
	private Integer pgcIndex;

	// Constructors

	/** default constructor */
	public AbstractPgcCtrlId() {
	}

	/** minimal constructor */
	public AbstractPgcCtrlId(String pgcDomain) {
		this.pgcDomain = pgcDomain;
	}

	/** full constructor */
	public AbstractPgcCtrlId(String pgcDomain, Integer pgcIndex) {
		this.pgcDomain = pgcDomain;
		this.pgcIndex = pgcIndex;
	}

	// Property accessors

	public String getPgcDomain() {
		return this.pgcDomain;
	}

	public void setPgcDomain(String pgcDomain) {
		this.pgcDomain = pgcDomain;
	}

	public Integer getPgcIndex() {
		return this.pgcIndex;
	}

	public void setPgcIndex(Integer pgcIndex) {
		this.pgcIndex = pgcIndex;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPgcCtrlId))
			return false;
		AbstractPgcCtrlId castOther = (AbstractPgcCtrlId) other;

		return ((this.getPgcDomain() == castOther.getPgcDomain()) || (this
				.getPgcDomain() != null
				&& castOther.getPgcDomain() != null && this.getPgcDomain()
				.equals(castOther.getPgcDomain())))
				&& ((this.getPgcIndex() == castOther.getPgcIndex()) || (this
						.getPgcIndex() != null
						&& castOther.getPgcIndex() != null && this
						.getPgcIndex().equals(castOther.getPgcIndex())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPgcDomain() == null ? 0 : this.getPgcDomain().hashCode());
		result = 37 * result
				+ (getPgcIndex() == null ? 0 : this.getPgcIndex().hashCode());
		return result;
	}

}