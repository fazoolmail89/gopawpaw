package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCscMstrId entity provides the base persistence definition of the
 * CscMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCscMstrId implements java.io.Serializable {

	// Fields

	private String cscDomain;
	private String cscCtryCode;
	private String cscAuth;
	private String cscAddr;

	// Constructors

	/** default constructor */
	public AbstractCscMstrId() {
	}

	/** minimal constructor */
	public AbstractCscMstrId(String cscDomain) {
		this.cscDomain = cscDomain;
	}

	/** full constructor */
	public AbstractCscMstrId(String cscDomain, String cscCtryCode,
			String cscAuth, String cscAddr) {
		this.cscDomain = cscDomain;
		this.cscCtryCode = cscCtryCode;
		this.cscAuth = cscAuth;
		this.cscAddr = cscAddr;
	}

	// Property accessors

	public String getCscDomain() {
		return this.cscDomain;
	}

	public void setCscDomain(String cscDomain) {
		this.cscDomain = cscDomain;
	}

	public String getCscCtryCode() {
		return this.cscCtryCode;
	}

	public void setCscCtryCode(String cscCtryCode) {
		this.cscCtryCode = cscCtryCode;
	}

	public String getCscAuth() {
		return this.cscAuth;
	}

	public void setCscAuth(String cscAuth) {
		this.cscAuth = cscAuth;
	}

	public String getCscAddr() {
		return this.cscAddr;
	}

	public void setCscAddr(String cscAddr) {
		this.cscAddr = cscAddr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCscMstrId))
			return false;
		AbstractCscMstrId castOther = (AbstractCscMstrId) other;

		return ((this.getCscDomain() == castOther.getCscDomain()) || (this
				.getCscDomain() != null
				&& castOther.getCscDomain() != null && this.getCscDomain()
				.equals(castOther.getCscDomain())))
				&& ((this.getCscCtryCode() == castOther.getCscCtryCode()) || (this
						.getCscCtryCode() != null
						&& castOther.getCscCtryCode() != null && this
						.getCscCtryCode().equals(castOther.getCscCtryCode())))
				&& ((this.getCscAuth() == castOther.getCscAuth()) || (this
						.getCscAuth() != null
						&& castOther.getCscAuth() != null && this.getCscAuth()
						.equals(castOther.getCscAuth())))
				&& ((this.getCscAddr() == castOther.getCscAddr()) || (this
						.getCscAddr() != null
						&& castOther.getCscAddr() != null && this.getCscAddr()
						.equals(castOther.getCscAddr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCscDomain() == null ? 0 : this.getCscDomain().hashCode());
		result = 37
				* result
				+ (getCscCtryCode() == null ? 0 : this.getCscCtryCode()
						.hashCode());
		result = 37 * result
				+ (getCscAuth() == null ? 0 : this.getCscAuth().hashCode());
		result = 37 * result
				+ (getCscAddr() == null ? 0 : this.getCscAddr().hashCode());
		return result;
	}

}