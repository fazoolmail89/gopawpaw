package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUmsgDetId entity provides the base persistence definition of the
 * UmsgDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUmsgDetId implements java.io.Serializable {

	// Fields

	private String umsgDomain;
	private String umsgLang;
	private String umsgSite;
	private String umsgAddr;
	private String umsgCallPgm;
	private Integer umsgNbr;
	private Integer umsgSeq;

	// Constructors

	/** default constructor */
	public AbstractUmsgDetId() {
	}

	/** minimal constructor */
	public AbstractUmsgDetId(String umsgDomain) {
		this.umsgDomain = umsgDomain;
	}

	/** full constructor */
	public AbstractUmsgDetId(String umsgDomain, String umsgLang,
			String umsgSite, String umsgAddr, String umsgCallPgm,
			Integer umsgNbr, Integer umsgSeq) {
		this.umsgDomain = umsgDomain;
		this.umsgLang = umsgLang;
		this.umsgSite = umsgSite;
		this.umsgAddr = umsgAddr;
		this.umsgCallPgm = umsgCallPgm;
		this.umsgNbr = umsgNbr;
		this.umsgSeq = umsgSeq;
	}

	// Property accessors

	public String getUmsgDomain() {
		return this.umsgDomain;
	}

	public void setUmsgDomain(String umsgDomain) {
		this.umsgDomain = umsgDomain;
	}

	public String getUmsgLang() {
		return this.umsgLang;
	}

	public void setUmsgLang(String umsgLang) {
		this.umsgLang = umsgLang;
	}

	public String getUmsgSite() {
		return this.umsgSite;
	}

	public void setUmsgSite(String umsgSite) {
		this.umsgSite = umsgSite;
	}

	public String getUmsgAddr() {
		return this.umsgAddr;
	}

	public void setUmsgAddr(String umsgAddr) {
		this.umsgAddr = umsgAddr;
	}

	public String getUmsgCallPgm() {
		return this.umsgCallPgm;
	}

	public void setUmsgCallPgm(String umsgCallPgm) {
		this.umsgCallPgm = umsgCallPgm;
	}

	public Integer getUmsgNbr() {
		return this.umsgNbr;
	}

	public void setUmsgNbr(Integer umsgNbr) {
		this.umsgNbr = umsgNbr;
	}

	public Integer getUmsgSeq() {
		return this.umsgSeq;
	}

	public void setUmsgSeq(Integer umsgSeq) {
		this.umsgSeq = umsgSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractUmsgDetId))
			return false;
		AbstractUmsgDetId castOther = (AbstractUmsgDetId) other;

		return ((this.getUmsgDomain() == castOther.getUmsgDomain()) || (this
				.getUmsgDomain() != null
				&& castOther.getUmsgDomain() != null && this.getUmsgDomain()
				.equals(castOther.getUmsgDomain())))
				&& ((this.getUmsgLang() == castOther.getUmsgLang()) || (this
						.getUmsgLang() != null
						&& castOther.getUmsgLang() != null && this
						.getUmsgLang().equals(castOther.getUmsgLang())))
				&& ((this.getUmsgSite() == castOther.getUmsgSite()) || (this
						.getUmsgSite() != null
						&& castOther.getUmsgSite() != null && this
						.getUmsgSite().equals(castOther.getUmsgSite())))
				&& ((this.getUmsgAddr() == castOther.getUmsgAddr()) || (this
						.getUmsgAddr() != null
						&& castOther.getUmsgAddr() != null && this
						.getUmsgAddr().equals(castOther.getUmsgAddr())))
				&& ((this.getUmsgCallPgm() == castOther.getUmsgCallPgm()) || (this
						.getUmsgCallPgm() != null
						&& castOther.getUmsgCallPgm() != null && this
						.getUmsgCallPgm().equals(castOther.getUmsgCallPgm())))
				&& ((this.getUmsgNbr() == castOther.getUmsgNbr()) || (this
						.getUmsgNbr() != null
						&& castOther.getUmsgNbr() != null && this.getUmsgNbr()
						.equals(castOther.getUmsgNbr())))
				&& ((this.getUmsgSeq() == castOther.getUmsgSeq()) || (this
						.getUmsgSeq() != null
						&& castOther.getUmsgSeq() != null && this.getUmsgSeq()
						.equals(castOther.getUmsgSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getUmsgDomain() == null ? 0 : this.getUmsgDomain()
						.hashCode());
		result = 37 * result
				+ (getUmsgLang() == null ? 0 : this.getUmsgLang().hashCode());
		result = 37 * result
				+ (getUmsgSite() == null ? 0 : this.getUmsgSite().hashCode());
		result = 37 * result
				+ (getUmsgAddr() == null ? 0 : this.getUmsgAddr().hashCode());
		result = 37
				* result
				+ (getUmsgCallPgm() == null ? 0 : this.getUmsgCallPgm()
						.hashCode());
		result = 37 * result
				+ (getUmsgNbr() == null ? 0 : this.getUmsgNbr().hashCode());
		result = 37 * result
				+ (getUmsgSeq() == null ? 0 : this.getUmsgSeq().hashCode());
		return result;
	}

}