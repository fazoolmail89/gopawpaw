package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCdDetId entity provides the base persistence definition of the
 * CdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCdDetId implements java.io.Serializable {

	// Fields

	private String cdDomain;
	private String cdRef;
	private String cdType;
	private String cdLang;
	private Integer cdSeq;

	// Constructors

	/** default constructor */
	public AbstractCdDetId() {
	}

	/** minimal constructor */
	public AbstractCdDetId(String cdDomain) {
		this.cdDomain = cdDomain;
	}

	/** full constructor */
	public AbstractCdDetId(String cdDomain, String cdRef, String cdType,
			String cdLang, Integer cdSeq) {
		this.cdDomain = cdDomain;
		this.cdRef = cdRef;
		this.cdType = cdType;
		this.cdLang = cdLang;
		this.cdSeq = cdSeq;
	}

	// Property accessors

	public String getCdDomain() {
		return this.cdDomain;
	}

	public void setCdDomain(String cdDomain) {
		this.cdDomain = cdDomain;
	}

	public String getCdRef() {
		return this.cdRef;
	}

	public void setCdRef(String cdRef) {
		this.cdRef = cdRef;
	}

	public String getCdType() {
		return this.cdType;
	}

	public void setCdType(String cdType) {
		this.cdType = cdType;
	}

	public String getCdLang() {
		return this.cdLang;
	}

	public void setCdLang(String cdLang) {
		this.cdLang = cdLang;
	}

	public Integer getCdSeq() {
		return this.cdSeq;
	}

	public void setCdSeq(Integer cdSeq) {
		this.cdSeq = cdSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCdDetId))
			return false;
		AbstractCdDetId castOther = (AbstractCdDetId) other;

		return ((this.getCdDomain() == castOther.getCdDomain()) || (this
				.getCdDomain() != null
				&& castOther.getCdDomain() != null && this.getCdDomain()
				.equals(castOther.getCdDomain())))
				&& ((this.getCdRef() == castOther.getCdRef()) || (this
						.getCdRef() != null
						&& castOther.getCdRef() != null && this.getCdRef()
						.equals(castOther.getCdRef())))
				&& ((this.getCdType() == castOther.getCdType()) || (this
						.getCdType() != null
						&& castOther.getCdType() != null && this.getCdType()
						.equals(castOther.getCdType())))
				&& ((this.getCdLang() == castOther.getCdLang()) || (this
						.getCdLang() != null
						&& castOther.getCdLang() != null && this.getCdLang()
						.equals(castOther.getCdLang())))
				&& ((this.getCdSeq() == castOther.getCdSeq()) || (this
						.getCdSeq() != null
						&& castOther.getCdSeq() != null && this.getCdSeq()
						.equals(castOther.getCdSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCdDomain() == null ? 0 : this.getCdDomain().hashCode());
		result = 37 * result
				+ (getCdRef() == null ? 0 : this.getCdRef().hashCode());
		result = 37 * result
				+ (getCdType() == null ? 0 : this.getCdType().hashCode());
		result = 37 * result
				+ (getCdLang() == null ? 0 : this.getCdLang().hashCode());
		result = 37 * result
				+ (getCdSeq() == null ? 0 : this.getCdSeq().hashCode());
		return result;
	}

}