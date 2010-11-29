package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAprmMstrId entity provides the base persistence definition of the
 * AprmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAprmMstrId implements java.io.Serializable {

	// Fields

	private String aprmDomain;
	private String aprmAppId;
	private String aprmDocStd;
	private String aprmMthdName;
	private Integer aprmSeq;

	// Constructors

	/** default constructor */
	public AbstractAprmMstrId() {
	}

	/** minimal constructor */
	public AbstractAprmMstrId(String aprmDomain) {
		this.aprmDomain = aprmDomain;
	}

	/** full constructor */
	public AbstractAprmMstrId(String aprmDomain, String aprmAppId,
			String aprmDocStd, String aprmMthdName, Integer aprmSeq) {
		this.aprmDomain = aprmDomain;
		this.aprmAppId = aprmAppId;
		this.aprmDocStd = aprmDocStd;
		this.aprmMthdName = aprmMthdName;
		this.aprmSeq = aprmSeq;
	}

	// Property accessors

	public String getAprmDomain() {
		return this.aprmDomain;
	}

	public void setAprmDomain(String aprmDomain) {
		this.aprmDomain = aprmDomain;
	}

	public String getAprmAppId() {
		return this.aprmAppId;
	}

	public void setAprmAppId(String aprmAppId) {
		this.aprmAppId = aprmAppId;
	}

	public String getAprmDocStd() {
		return this.aprmDocStd;
	}

	public void setAprmDocStd(String aprmDocStd) {
		this.aprmDocStd = aprmDocStd;
	}

	public String getAprmMthdName() {
		return this.aprmMthdName;
	}

	public void setAprmMthdName(String aprmMthdName) {
		this.aprmMthdName = aprmMthdName;
	}

	public Integer getAprmSeq() {
		return this.aprmSeq;
	}

	public void setAprmSeq(Integer aprmSeq) {
		this.aprmSeq = aprmSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAprmMstrId))
			return false;
		AbstractAprmMstrId castOther = (AbstractAprmMstrId) other;

		return ((this.getAprmDomain() == castOther.getAprmDomain()) || (this
				.getAprmDomain() != null
				&& castOther.getAprmDomain() != null && this.getAprmDomain()
				.equals(castOther.getAprmDomain())))
				&& ((this.getAprmAppId() == castOther.getAprmAppId()) || (this
						.getAprmAppId() != null
						&& castOther.getAprmAppId() != null && this
						.getAprmAppId().equals(castOther.getAprmAppId())))
				&& ((this.getAprmDocStd() == castOther.getAprmDocStd()) || (this
						.getAprmDocStd() != null
						&& castOther.getAprmDocStd() != null && this
						.getAprmDocStd().equals(castOther.getAprmDocStd())))
				&& ((this.getAprmMthdName() == castOther.getAprmMthdName()) || (this
						.getAprmMthdName() != null
						&& castOther.getAprmMthdName() != null && this
						.getAprmMthdName().equals(castOther.getAprmMthdName())))
				&& ((this.getAprmSeq() == castOther.getAprmSeq()) || (this
						.getAprmSeq() != null
						&& castOther.getAprmSeq() != null && this.getAprmSeq()
						.equals(castOther.getAprmSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAprmDomain() == null ? 0 : this.getAprmDomain()
						.hashCode());
		result = 37 * result
				+ (getAprmAppId() == null ? 0 : this.getAprmAppId().hashCode());
		result = 37
				* result
				+ (getAprmDocStd() == null ? 0 : this.getAprmDocStd()
						.hashCode());
		result = 37
				* result
				+ (getAprmMthdName() == null ? 0 : this.getAprmMthdName()
						.hashCode());
		result = 37 * result
				+ (getAprmSeq() == null ? 0 : this.getAprmSeq().hashCode());
		return result;
	}

}