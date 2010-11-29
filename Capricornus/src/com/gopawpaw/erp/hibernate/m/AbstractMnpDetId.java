package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMnpDetId entity provides the base persistence definition of the
 * MnpDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMnpDetId implements java.io.Serializable {

	// Fields

	private String mnpDomain;
	private String mnpProgram;
	private String mnpUserid;
	private Integer mnpSequence;
	private String mnpProgType;

	// Constructors

	/** default constructor */
	public AbstractMnpDetId() {
	}

	/** minimal constructor */
	public AbstractMnpDetId(String mnpDomain) {
		this.mnpDomain = mnpDomain;
	}

	/** full constructor */
	public AbstractMnpDetId(String mnpDomain, String mnpProgram,
			String mnpUserid, Integer mnpSequence, String mnpProgType) {
		this.mnpDomain = mnpDomain;
		this.mnpProgram = mnpProgram;
		this.mnpUserid = mnpUserid;
		this.mnpSequence = mnpSequence;
		this.mnpProgType = mnpProgType;
	}

	// Property accessors

	public String getMnpDomain() {
		return this.mnpDomain;
	}

	public void setMnpDomain(String mnpDomain) {
		this.mnpDomain = mnpDomain;
	}

	public String getMnpProgram() {
		return this.mnpProgram;
	}

	public void setMnpProgram(String mnpProgram) {
		this.mnpProgram = mnpProgram;
	}

	public String getMnpUserid() {
		return this.mnpUserid;
	}

	public void setMnpUserid(String mnpUserid) {
		this.mnpUserid = mnpUserid;
	}

	public Integer getMnpSequence() {
		return this.mnpSequence;
	}

	public void setMnpSequence(Integer mnpSequence) {
		this.mnpSequence = mnpSequence;
	}

	public String getMnpProgType() {
		return this.mnpProgType;
	}

	public void setMnpProgType(String mnpProgType) {
		this.mnpProgType = mnpProgType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMnpDetId))
			return false;
		AbstractMnpDetId castOther = (AbstractMnpDetId) other;

		return ((this.getMnpDomain() == castOther.getMnpDomain()) || (this
				.getMnpDomain() != null
				&& castOther.getMnpDomain() != null && this.getMnpDomain()
				.equals(castOther.getMnpDomain())))
				&& ((this.getMnpProgram() == castOther.getMnpProgram()) || (this
						.getMnpProgram() != null
						&& castOther.getMnpProgram() != null && this
						.getMnpProgram().equals(castOther.getMnpProgram())))
				&& ((this.getMnpUserid() == castOther.getMnpUserid()) || (this
						.getMnpUserid() != null
						&& castOther.getMnpUserid() != null && this
						.getMnpUserid().equals(castOther.getMnpUserid())))
				&& ((this.getMnpSequence() == castOther.getMnpSequence()) || (this
						.getMnpSequence() != null
						&& castOther.getMnpSequence() != null && this
						.getMnpSequence().equals(castOther.getMnpSequence())))
				&& ((this.getMnpProgType() == castOther.getMnpProgType()) || (this
						.getMnpProgType() != null
						&& castOther.getMnpProgType() != null && this
						.getMnpProgType().equals(castOther.getMnpProgType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMnpDomain() == null ? 0 : this.getMnpDomain().hashCode());
		result = 37
				* result
				+ (getMnpProgram() == null ? 0 : this.getMnpProgram()
						.hashCode());
		result = 37 * result
				+ (getMnpUserid() == null ? 0 : this.getMnpUserid().hashCode());
		result = 37
				* result
				+ (getMnpSequence() == null ? 0 : this.getMnpSequence()
						.hashCode());
		result = 37
				* result
				+ (getMnpProgType() == null ? 0 : this.getMnpProgType()
						.hashCode());
		return result;
	}

}