package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPghHistId entity provides the base persistence definition of the
 * PghHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPghHistId implements java.io.Serializable {

	// Fields

	private String pghDomain;
	private Integer pghTrnbr;

	// Constructors

	/** default constructor */
	public AbstractPghHistId() {
	}

	/** minimal constructor */
	public AbstractPghHistId(String pghDomain) {
		this.pghDomain = pghDomain;
	}

	/** full constructor */
	public AbstractPghHistId(String pghDomain, Integer pghTrnbr) {
		this.pghDomain = pghDomain;
		this.pghTrnbr = pghTrnbr;
	}

	// Property accessors

	public String getPghDomain() {
		return this.pghDomain;
	}

	public void setPghDomain(String pghDomain) {
		this.pghDomain = pghDomain;
	}

	public Integer getPghTrnbr() {
		return this.pghTrnbr;
	}

	public void setPghTrnbr(Integer pghTrnbr) {
		this.pghTrnbr = pghTrnbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPghHistId))
			return false;
		AbstractPghHistId castOther = (AbstractPghHistId) other;

		return ((this.getPghDomain() == castOther.getPghDomain()) || (this
				.getPghDomain() != null
				&& castOther.getPghDomain() != null && this.getPghDomain()
				.equals(castOther.getPghDomain())))
				&& ((this.getPghTrnbr() == castOther.getPghTrnbr()) || (this
						.getPghTrnbr() != null
						&& castOther.getPghTrnbr() != null && this
						.getPghTrnbr().equals(castOther.getPghTrnbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPghDomain() == null ? 0 : this.getPghDomain().hashCode());
		result = 37 * result
				+ (getPghTrnbr() == null ? 0 : this.getPghTrnbr().hashCode());
		return result;
	}

}