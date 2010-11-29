package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTrlMstrId entity provides the base persistence definition of the
 * TrlMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTrlMstrId implements java.io.Serializable {

	// Fields

	private String trlDomain;
	private String trlCode;

	// Constructors

	/** default constructor */
	public AbstractTrlMstrId() {
	}

	/** minimal constructor */
	public AbstractTrlMstrId(String trlDomain) {
		this.trlDomain = trlDomain;
	}

	/** full constructor */
	public AbstractTrlMstrId(String trlDomain, String trlCode) {
		this.trlDomain = trlDomain;
		this.trlCode = trlCode;
	}

	// Property accessors

	public String getTrlDomain() {
		return this.trlDomain;
	}

	public void setTrlDomain(String trlDomain) {
		this.trlDomain = trlDomain;
	}

	public String getTrlCode() {
		return this.trlCode;
	}

	public void setTrlCode(String trlCode) {
		this.trlCode = trlCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTrlMstrId))
			return false;
		AbstractTrlMstrId castOther = (AbstractTrlMstrId) other;

		return ((this.getTrlDomain() == castOther.getTrlDomain()) || (this
				.getTrlDomain() != null
				&& castOther.getTrlDomain() != null && this.getTrlDomain()
				.equals(castOther.getTrlDomain())))
				&& ((this.getTrlCode() == castOther.getTrlCode()) || (this
						.getTrlCode() != null
						&& castOther.getTrlCode() != null && this.getTrlCode()
						.equals(castOther.getTrlCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTrlDomain() == null ? 0 : this.getTrlDomain().hashCode());
		result = 37 * result
				+ (getTrlCode() == null ? 0 : this.getTrlCode().hashCode());
		return result;
	}

}