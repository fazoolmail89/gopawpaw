package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIdhHistId entity provides the base persistence definition of the
 * IdhHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIdhHistId implements java.io.Serializable {

	// Fields

	private String idhDomain;
	private String idhInvNbr;
	private String idhNbr;
	private Integer idhLine;

	// Constructors

	/** default constructor */
	public AbstractIdhHistId() {
	}

	/** minimal constructor */
	public AbstractIdhHistId(String idhDomain, String idhNbr) {
		this.idhDomain = idhDomain;
		this.idhNbr = idhNbr;
	}

	/** full constructor */
	public AbstractIdhHistId(String idhDomain, String idhInvNbr, String idhNbr,
			Integer idhLine) {
		this.idhDomain = idhDomain;
		this.idhInvNbr = idhInvNbr;
		this.idhNbr = idhNbr;
		this.idhLine = idhLine;
	}

	// Property accessors

	public String getIdhDomain() {
		return this.idhDomain;
	}

	public void setIdhDomain(String idhDomain) {
		this.idhDomain = idhDomain;
	}

	public String getIdhInvNbr() {
		return this.idhInvNbr;
	}

	public void setIdhInvNbr(String idhInvNbr) {
		this.idhInvNbr = idhInvNbr;
	}

	public String getIdhNbr() {
		return this.idhNbr;
	}

	public void setIdhNbr(String idhNbr) {
		this.idhNbr = idhNbr;
	}

	public Integer getIdhLine() {
		return this.idhLine;
	}

	public void setIdhLine(Integer idhLine) {
		this.idhLine = idhLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIdhHistId))
			return false;
		AbstractIdhHistId castOther = (AbstractIdhHistId) other;

		return ((this.getIdhDomain() == castOther.getIdhDomain()) || (this
				.getIdhDomain() != null
				&& castOther.getIdhDomain() != null && this.getIdhDomain()
				.equals(castOther.getIdhDomain())))
				&& ((this.getIdhInvNbr() == castOther.getIdhInvNbr()) || (this
						.getIdhInvNbr() != null
						&& castOther.getIdhInvNbr() != null && this
						.getIdhInvNbr().equals(castOther.getIdhInvNbr())))
				&& ((this.getIdhNbr() == castOther.getIdhNbr()) || (this
						.getIdhNbr() != null
						&& castOther.getIdhNbr() != null && this.getIdhNbr()
						.equals(castOther.getIdhNbr())))
				&& ((this.getIdhLine() == castOther.getIdhLine()) || (this
						.getIdhLine() != null
						&& castOther.getIdhLine() != null && this.getIdhLine()
						.equals(castOther.getIdhLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdhDomain() == null ? 0 : this.getIdhDomain().hashCode());
		result = 37 * result
				+ (getIdhInvNbr() == null ? 0 : this.getIdhInvNbr().hashCode());
		result = 37 * result
				+ (getIdhNbr() == null ? 0 : this.getIdhNbr().hashCode());
		result = 37 * result
				+ (getIdhLine() == null ? 0 : this.getIdhLine().hashCode());
		return result;
	}

}