package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIdhrHistId entity provides the base persistence definition of the
 * IdhrHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIdhrHistId implements java.io.Serializable {

	// Fields

	private String idhrDomain;
	private String idhrInvNbr;
	private String idhrNbr;
	private Integer idhrLine;
	private Integer idhrSeq;

	// Constructors

	/** default constructor */
	public AbstractIdhrHistId() {
	}

	/** minimal constructor */
	public AbstractIdhrHistId(String idhrDomain) {
		this.idhrDomain = idhrDomain;
	}

	/** full constructor */
	public AbstractIdhrHistId(String idhrDomain, String idhrInvNbr,
			String idhrNbr, Integer idhrLine, Integer idhrSeq) {
		this.idhrDomain = idhrDomain;
		this.idhrInvNbr = idhrInvNbr;
		this.idhrNbr = idhrNbr;
		this.idhrLine = idhrLine;
		this.idhrSeq = idhrSeq;
	}

	// Property accessors

	public String getIdhrDomain() {
		return this.idhrDomain;
	}

	public void setIdhrDomain(String idhrDomain) {
		this.idhrDomain = idhrDomain;
	}

	public String getIdhrInvNbr() {
		return this.idhrInvNbr;
	}

	public void setIdhrInvNbr(String idhrInvNbr) {
		this.idhrInvNbr = idhrInvNbr;
	}

	public String getIdhrNbr() {
		return this.idhrNbr;
	}

	public void setIdhrNbr(String idhrNbr) {
		this.idhrNbr = idhrNbr;
	}

	public Integer getIdhrLine() {
		return this.idhrLine;
	}

	public void setIdhrLine(Integer idhrLine) {
		this.idhrLine = idhrLine;
	}

	public Integer getIdhrSeq() {
		return this.idhrSeq;
	}

	public void setIdhrSeq(Integer idhrSeq) {
		this.idhrSeq = idhrSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIdhrHistId))
			return false;
		AbstractIdhrHistId castOther = (AbstractIdhrHistId) other;

		return ((this.getIdhrDomain() == castOther.getIdhrDomain()) || (this
				.getIdhrDomain() != null
				&& castOther.getIdhrDomain() != null && this.getIdhrDomain()
				.equals(castOther.getIdhrDomain())))
				&& ((this.getIdhrInvNbr() == castOther.getIdhrInvNbr()) || (this
						.getIdhrInvNbr() != null
						&& castOther.getIdhrInvNbr() != null && this
						.getIdhrInvNbr().equals(castOther.getIdhrInvNbr())))
				&& ((this.getIdhrNbr() == castOther.getIdhrNbr()) || (this
						.getIdhrNbr() != null
						&& castOther.getIdhrNbr() != null && this.getIdhrNbr()
						.equals(castOther.getIdhrNbr())))
				&& ((this.getIdhrLine() == castOther.getIdhrLine()) || (this
						.getIdhrLine() != null
						&& castOther.getIdhrLine() != null && this
						.getIdhrLine().equals(castOther.getIdhrLine())))
				&& ((this.getIdhrSeq() == castOther.getIdhrSeq()) || (this
						.getIdhrSeq() != null
						&& castOther.getIdhrSeq() != null && this.getIdhrSeq()
						.equals(castOther.getIdhrSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getIdhrDomain() == null ? 0 : this.getIdhrDomain()
						.hashCode());
		result = 37
				* result
				+ (getIdhrInvNbr() == null ? 0 : this.getIdhrInvNbr()
						.hashCode());
		result = 37 * result
				+ (getIdhrNbr() == null ? 0 : this.getIdhrNbr().hashCode());
		result = 37 * result
				+ (getIdhrLine() == null ? 0 : this.getIdhrLine().hashCode());
		result = 37 * result
				+ (getIdhrSeq() == null ? 0 : this.getIdhrSeq().hashCode());
		return result;
	}

}