package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAcxMstrId entity provides the base persistence definition of the
 * AcxMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAcxMstrId implements java.io.Serializable {

	// Fields

	private String acxDomain;
	private String acxEntity;
	private String acxToEnt;
	private String acxAcc;
	private String acxSub;
	private String acxCc;

	// Constructors

	/** default constructor */
	public AbstractAcxMstrId() {
	}

	/** minimal constructor */
	public AbstractAcxMstrId(String acxDomain) {
		this.acxDomain = acxDomain;
	}

	/** full constructor */
	public AbstractAcxMstrId(String acxDomain, String acxEntity,
			String acxToEnt, String acxAcc, String acxSub, String acxCc) {
		this.acxDomain = acxDomain;
		this.acxEntity = acxEntity;
		this.acxToEnt = acxToEnt;
		this.acxAcc = acxAcc;
		this.acxSub = acxSub;
		this.acxCc = acxCc;
	}

	// Property accessors

	public String getAcxDomain() {
		return this.acxDomain;
	}

	public void setAcxDomain(String acxDomain) {
		this.acxDomain = acxDomain;
	}

	public String getAcxEntity() {
		return this.acxEntity;
	}

	public void setAcxEntity(String acxEntity) {
		this.acxEntity = acxEntity;
	}

	public String getAcxToEnt() {
		return this.acxToEnt;
	}

	public void setAcxToEnt(String acxToEnt) {
		this.acxToEnt = acxToEnt;
	}

	public String getAcxAcc() {
		return this.acxAcc;
	}

	public void setAcxAcc(String acxAcc) {
		this.acxAcc = acxAcc;
	}

	public String getAcxSub() {
		return this.acxSub;
	}

	public void setAcxSub(String acxSub) {
		this.acxSub = acxSub;
	}

	public String getAcxCc() {
		return this.acxCc;
	}

	public void setAcxCc(String acxCc) {
		this.acxCc = acxCc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAcxMstrId))
			return false;
		AbstractAcxMstrId castOther = (AbstractAcxMstrId) other;

		return ((this.getAcxDomain() == castOther.getAcxDomain()) || (this
				.getAcxDomain() != null
				&& castOther.getAcxDomain() != null && this.getAcxDomain()
				.equals(castOther.getAcxDomain())))
				&& ((this.getAcxEntity() == castOther.getAcxEntity()) || (this
						.getAcxEntity() != null
						&& castOther.getAcxEntity() != null && this
						.getAcxEntity().equals(castOther.getAcxEntity())))
				&& ((this.getAcxToEnt() == castOther.getAcxToEnt()) || (this
						.getAcxToEnt() != null
						&& castOther.getAcxToEnt() != null && this
						.getAcxToEnt().equals(castOther.getAcxToEnt())))
				&& ((this.getAcxAcc() == castOther.getAcxAcc()) || (this
						.getAcxAcc() != null
						&& castOther.getAcxAcc() != null && this.getAcxAcc()
						.equals(castOther.getAcxAcc())))
				&& ((this.getAcxSub() == castOther.getAcxSub()) || (this
						.getAcxSub() != null
						&& castOther.getAcxSub() != null && this.getAcxSub()
						.equals(castOther.getAcxSub())))
				&& ((this.getAcxCc() == castOther.getAcxCc()) || (this
						.getAcxCc() != null
						&& castOther.getAcxCc() != null && this.getAcxCc()
						.equals(castOther.getAcxCc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAcxDomain() == null ? 0 : this.getAcxDomain().hashCode());
		result = 37 * result
				+ (getAcxEntity() == null ? 0 : this.getAcxEntity().hashCode());
		result = 37 * result
				+ (getAcxToEnt() == null ? 0 : this.getAcxToEnt().hashCode());
		result = 37 * result
				+ (getAcxAcc() == null ? 0 : this.getAcxAcc().hashCode());
		result = 37 * result
				+ (getAcxSub() == null ? 0 : this.getAcxSub().hashCode());
		result = 37 * result
				+ (getAcxCc() == null ? 0 : this.getAcxCc().hashCode());
		return result;
	}

}