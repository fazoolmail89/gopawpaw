package com.gopawpaw.erp.hibernate.w;

/**
 * AbstractWtxMstrId entity provides the base persistence definition of the
 * WtxMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWtxMstrId implements java.io.Serializable {

	// Fields

	private String wtxDomain;
	private String wtxAddr;
	private String wtxRef;
	private Integer wtxLn;
	private String wtxCheck;

	// Constructors

	/** default constructor */
	public AbstractWtxMstrId() {
	}

	/** full constructor */
	public AbstractWtxMstrId(String wtxDomain, String wtxAddr, String wtxRef,
			Integer wtxLn, String wtxCheck) {
		this.wtxDomain = wtxDomain;
		this.wtxAddr = wtxAddr;
		this.wtxRef = wtxRef;
		this.wtxLn = wtxLn;
		this.wtxCheck = wtxCheck;
	}

	// Property accessors

	public String getWtxDomain() {
		return this.wtxDomain;
	}

	public void setWtxDomain(String wtxDomain) {
		this.wtxDomain = wtxDomain;
	}

	public String getWtxAddr() {
		return this.wtxAddr;
	}

	public void setWtxAddr(String wtxAddr) {
		this.wtxAddr = wtxAddr;
	}

	public String getWtxRef() {
		return this.wtxRef;
	}

	public void setWtxRef(String wtxRef) {
		this.wtxRef = wtxRef;
	}

	public Integer getWtxLn() {
		return this.wtxLn;
	}

	public void setWtxLn(Integer wtxLn) {
		this.wtxLn = wtxLn;
	}

	public String getWtxCheck() {
		return this.wtxCheck;
	}

	public void setWtxCheck(String wtxCheck) {
		this.wtxCheck = wtxCheck;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractWtxMstrId))
			return false;
		AbstractWtxMstrId castOther = (AbstractWtxMstrId) other;

		return ((this.getWtxDomain() == castOther.getWtxDomain()) || (this
				.getWtxDomain() != null
				&& castOther.getWtxDomain() != null && this.getWtxDomain()
				.equals(castOther.getWtxDomain())))
				&& ((this.getWtxAddr() == castOther.getWtxAddr()) || (this
						.getWtxAddr() != null
						&& castOther.getWtxAddr() != null && this.getWtxAddr()
						.equals(castOther.getWtxAddr())))
				&& ((this.getWtxRef() == castOther.getWtxRef()) || (this
						.getWtxRef() != null
						&& castOther.getWtxRef() != null && this.getWtxRef()
						.equals(castOther.getWtxRef())))
				&& ((this.getWtxLn() == castOther.getWtxLn()) || (this
						.getWtxLn() != null
						&& castOther.getWtxLn() != null && this.getWtxLn()
						.equals(castOther.getWtxLn())))
				&& ((this.getWtxCheck() == castOther.getWtxCheck()) || (this
						.getWtxCheck() != null
						&& castOther.getWtxCheck() != null && this
						.getWtxCheck().equals(castOther.getWtxCheck())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getWtxDomain() == null ? 0 : this.getWtxDomain().hashCode());
		result = 37 * result
				+ (getWtxAddr() == null ? 0 : this.getWtxAddr().hashCode());
		result = 37 * result
				+ (getWtxRef() == null ? 0 : this.getWtxRef().hashCode());
		result = 37 * result
				+ (getWtxLn() == null ? 0 : this.getWtxLn().hashCode());
		result = 37 * result
				+ (getWtxCheck() == null ? 0 : this.getWtxCheck().hashCode());
		return result;
	}

}