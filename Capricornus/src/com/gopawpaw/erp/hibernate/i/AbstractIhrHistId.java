package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIhrHistId entity provides the base persistence definition of the
 * IhrHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIhrHistId implements java.io.Serializable {

	// Fields

	private String ihrDomain;
	private String ihrInvNbr;
	private String ihrNbr;
	private Integer ihrSeq;

	// Constructors

	/** default constructor */
	public AbstractIhrHistId() {
	}

	/** minimal constructor */
	public AbstractIhrHistId(String ihrDomain) {
		this.ihrDomain = ihrDomain;
	}

	/** full constructor */
	public AbstractIhrHistId(String ihrDomain, String ihrInvNbr, String ihrNbr,
			Integer ihrSeq) {
		this.ihrDomain = ihrDomain;
		this.ihrInvNbr = ihrInvNbr;
		this.ihrNbr = ihrNbr;
		this.ihrSeq = ihrSeq;
	}

	// Property accessors

	public String getIhrDomain() {
		return this.ihrDomain;
	}

	public void setIhrDomain(String ihrDomain) {
		this.ihrDomain = ihrDomain;
	}

	public String getIhrInvNbr() {
		return this.ihrInvNbr;
	}

	public void setIhrInvNbr(String ihrInvNbr) {
		this.ihrInvNbr = ihrInvNbr;
	}

	public String getIhrNbr() {
		return this.ihrNbr;
	}

	public void setIhrNbr(String ihrNbr) {
		this.ihrNbr = ihrNbr;
	}

	public Integer getIhrSeq() {
		return this.ihrSeq;
	}

	public void setIhrSeq(Integer ihrSeq) {
		this.ihrSeq = ihrSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIhrHistId))
			return false;
		AbstractIhrHistId castOther = (AbstractIhrHistId) other;

		return ((this.getIhrDomain() == castOther.getIhrDomain()) || (this
				.getIhrDomain() != null
				&& castOther.getIhrDomain() != null && this.getIhrDomain()
				.equals(castOther.getIhrDomain())))
				&& ((this.getIhrInvNbr() == castOther.getIhrInvNbr()) || (this
						.getIhrInvNbr() != null
						&& castOther.getIhrInvNbr() != null && this
						.getIhrInvNbr().equals(castOther.getIhrInvNbr())))
				&& ((this.getIhrNbr() == castOther.getIhrNbr()) || (this
						.getIhrNbr() != null
						&& castOther.getIhrNbr() != null && this.getIhrNbr()
						.equals(castOther.getIhrNbr())))
				&& ((this.getIhrSeq() == castOther.getIhrSeq()) || (this
						.getIhrSeq() != null
						&& castOther.getIhrSeq() != null && this.getIhrSeq()
						.equals(castOther.getIhrSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIhrDomain() == null ? 0 : this.getIhrDomain().hashCode());
		result = 37 * result
				+ (getIhrInvNbr() == null ? 0 : this.getIhrInvNbr().hashCode());
		result = 37 * result
				+ (getIhrNbr() == null ? 0 : this.getIhrNbr().hashCode());
		result = 37 * result
				+ (getIhrSeq() == null ? 0 : this.getIhrSeq().hashCode());
		return result;
	}

}