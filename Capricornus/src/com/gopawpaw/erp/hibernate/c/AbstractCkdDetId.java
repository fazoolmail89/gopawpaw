package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCkdDetId entity provides the base persistence definition of the
 * CkdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCkdDetId implements java.io.Serializable {

	// Fields

	private String ckdDomain;
	private String ckdRef;
	private String ckdVoucher;
	private String ckdType;
	private String ckdEntity;
	private String ckdAcct;
	private String ckdSub;
	private String ckdCc;
	private String ckdProject;

	// Constructors

	/** default constructor */
	public AbstractCkdDetId() {
	}

	/** minimal constructor */
	public AbstractCkdDetId(String ckdDomain) {
		this.ckdDomain = ckdDomain;
	}

	/** full constructor */
	public AbstractCkdDetId(String ckdDomain, String ckdRef, String ckdVoucher,
			String ckdType, String ckdEntity, String ckdAcct, String ckdSub,
			String ckdCc, String ckdProject) {
		this.ckdDomain = ckdDomain;
		this.ckdRef = ckdRef;
		this.ckdVoucher = ckdVoucher;
		this.ckdType = ckdType;
		this.ckdEntity = ckdEntity;
		this.ckdAcct = ckdAcct;
		this.ckdSub = ckdSub;
		this.ckdCc = ckdCc;
		this.ckdProject = ckdProject;
	}

	// Property accessors

	public String getCkdDomain() {
		return this.ckdDomain;
	}

	public void setCkdDomain(String ckdDomain) {
		this.ckdDomain = ckdDomain;
	}

	public String getCkdRef() {
		return this.ckdRef;
	}

	public void setCkdRef(String ckdRef) {
		this.ckdRef = ckdRef;
	}

	public String getCkdVoucher() {
		return this.ckdVoucher;
	}

	public void setCkdVoucher(String ckdVoucher) {
		this.ckdVoucher = ckdVoucher;
	}

	public String getCkdType() {
		return this.ckdType;
	}

	public void setCkdType(String ckdType) {
		this.ckdType = ckdType;
	}

	public String getCkdEntity() {
		return this.ckdEntity;
	}

	public void setCkdEntity(String ckdEntity) {
		this.ckdEntity = ckdEntity;
	}

	public String getCkdAcct() {
		return this.ckdAcct;
	}

	public void setCkdAcct(String ckdAcct) {
		this.ckdAcct = ckdAcct;
	}

	public String getCkdSub() {
		return this.ckdSub;
	}

	public void setCkdSub(String ckdSub) {
		this.ckdSub = ckdSub;
	}

	public String getCkdCc() {
		return this.ckdCc;
	}

	public void setCkdCc(String ckdCc) {
		this.ckdCc = ckdCc;
	}

	public String getCkdProject() {
		return this.ckdProject;
	}

	public void setCkdProject(String ckdProject) {
		this.ckdProject = ckdProject;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCkdDetId))
			return false;
		AbstractCkdDetId castOther = (AbstractCkdDetId) other;

		return ((this.getCkdDomain() == castOther.getCkdDomain()) || (this
				.getCkdDomain() != null
				&& castOther.getCkdDomain() != null && this.getCkdDomain()
				.equals(castOther.getCkdDomain())))
				&& ((this.getCkdRef() == castOther.getCkdRef()) || (this
						.getCkdRef() != null
						&& castOther.getCkdRef() != null && this.getCkdRef()
						.equals(castOther.getCkdRef())))
				&& ((this.getCkdVoucher() == castOther.getCkdVoucher()) || (this
						.getCkdVoucher() != null
						&& castOther.getCkdVoucher() != null && this
						.getCkdVoucher().equals(castOther.getCkdVoucher())))
				&& ((this.getCkdType() == castOther.getCkdType()) || (this
						.getCkdType() != null
						&& castOther.getCkdType() != null && this.getCkdType()
						.equals(castOther.getCkdType())))
				&& ((this.getCkdEntity() == castOther.getCkdEntity()) || (this
						.getCkdEntity() != null
						&& castOther.getCkdEntity() != null && this
						.getCkdEntity().equals(castOther.getCkdEntity())))
				&& ((this.getCkdAcct() == castOther.getCkdAcct()) || (this
						.getCkdAcct() != null
						&& castOther.getCkdAcct() != null && this.getCkdAcct()
						.equals(castOther.getCkdAcct())))
				&& ((this.getCkdSub() == castOther.getCkdSub()) || (this
						.getCkdSub() != null
						&& castOther.getCkdSub() != null && this.getCkdSub()
						.equals(castOther.getCkdSub())))
				&& ((this.getCkdCc() == castOther.getCkdCc()) || (this
						.getCkdCc() != null
						&& castOther.getCkdCc() != null && this.getCkdCc()
						.equals(castOther.getCkdCc())))
				&& ((this.getCkdProject() == castOther.getCkdProject()) || (this
						.getCkdProject() != null
						&& castOther.getCkdProject() != null && this
						.getCkdProject().equals(castOther.getCkdProject())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCkdDomain() == null ? 0 : this.getCkdDomain().hashCode());
		result = 37 * result
				+ (getCkdRef() == null ? 0 : this.getCkdRef().hashCode());
		result = 37
				* result
				+ (getCkdVoucher() == null ? 0 : this.getCkdVoucher()
						.hashCode());
		result = 37 * result
				+ (getCkdType() == null ? 0 : this.getCkdType().hashCode());
		result = 37 * result
				+ (getCkdEntity() == null ? 0 : this.getCkdEntity().hashCode());
		result = 37 * result
				+ (getCkdAcct() == null ? 0 : this.getCkdAcct().hashCode());
		result = 37 * result
				+ (getCkdSub() == null ? 0 : this.getCkdSub().hashCode());
		result = 37 * result
				+ (getCkdCc() == null ? 0 : this.getCkdCc().hashCode());
		result = 37
				* result
				+ (getCkdProject() == null ? 0 : this.getCkdProject()
						.hashCode());
		return result;
	}

}