package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBdpDetId entity provides the base persistence definition of the
 * BdpDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBdpDetId implements java.io.Serializable {

	// Fields

	private String bdpDomain;
	private String bdpProgram;
	private String bdpAddr;
	private String bdpBank;
	private String bdpPayMethod;
	private String bdpRef;
	private Integer bdpSeq;

	// Constructors

	/** default constructor */
	public AbstractBdpDetId() {
	}

	/** full constructor */
	public AbstractBdpDetId(String bdpDomain, String bdpProgram,
			String bdpAddr, String bdpBank, String bdpPayMethod, String bdpRef,
			Integer bdpSeq) {
		this.bdpDomain = bdpDomain;
		this.bdpProgram = bdpProgram;
		this.bdpAddr = bdpAddr;
		this.bdpBank = bdpBank;
		this.bdpPayMethod = bdpPayMethod;
		this.bdpRef = bdpRef;
		this.bdpSeq = bdpSeq;
	}

	// Property accessors

	public String getBdpDomain() {
		return this.bdpDomain;
	}

	public void setBdpDomain(String bdpDomain) {
		this.bdpDomain = bdpDomain;
	}

	public String getBdpProgram() {
		return this.bdpProgram;
	}

	public void setBdpProgram(String bdpProgram) {
		this.bdpProgram = bdpProgram;
	}

	public String getBdpAddr() {
		return this.bdpAddr;
	}

	public void setBdpAddr(String bdpAddr) {
		this.bdpAddr = bdpAddr;
	}

	public String getBdpBank() {
		return this.bdpBank;
	}

	public void setBdpBank(String bdpBank) {
		this.bdpBank = bdpBank;
	}

	public String getBdpPayMethod() {
		return this.bdpPayMethod;
	}

	public void setBdpPayMethod(String bdpPayMethod) {
		this.bdpPayMethod = bdpPayMethod;
	}

	public String getBdpRef() {
		return this.bdpRef;
	}

	public void setBdpRef(String bdpRef) {
		this.bdpRef = bdpRef;
	}

	public Integer getBdpSeq() {
		return this.bdpSeq;
	}

	public void setBdpSeq(Integer bdpSeq) {
		this.bdpSeq = bdpSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBdpDetId))
			return false;
		AbstractBdpDetId castOther = (AbstractBdpDetId) other;

		return ((this.getBdpDomain() == castOther.getBdpDomain()) || (this
				.getBdpDomain() != null
				&& castOther.getBdpDomain() != null && this.getBdpDomain()
				.equals(castOther.getBdpDomain())))
				&& ((this.getBdpProgram() == castOther.getBdpProgram()) || (this
						.getBdpProgram() != null
						&& castOther.getBdpProgram() != null && this
						.getBdpProgram().equals(castOther.getBdpProgram())))
				&& ((this.getBdpAddr() == castOther.getBdpAddr()) || (this
						.getBdpAddr() != null
						&& castOther.getBdpAddr() != null && this.getBdpAddr()
						.equals(castOther.getBdpAddr())))
				&& ((this.getBdpBank() == castOther.getBdpBank()) || (this
						.getBdpBank() != null
						&& castOther.getBdpBank() != null && this.getBdpBank()
						.equals(castOther.getBdpBank())))
				&& ((this.getBdpPayMethod() == castOther.getBdpPayMethod()) || (this
						.getBdpPayMethod() != null
						&& castOther.getBdpPayMethod() != null && this
						.getBdpPayMethod().equals(castOther.getBdpPayMethod())))
				&& ((this.getBdpRef() == castOther.getBdpRef()) || (this
						.getBdpRef() != null
						&& castOther.getBdpRef() != null && this.getBdpRef()
						.equals(castOther.getBdpRef())))
				&& ((this.getBdpSeq() == castOther.getBdpSeq()) || (this
						.getBdpSeq() != null
						&& castOther.getBdpSeq() != null && this.getBdpSeq()
						.equals(castOther.getBdpSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBdpDomain() == null ? 0 : this.getBdpDomain().hashCode());
		result = 37
				* result
				+ (getBdpProgram() == null ? 0 : this.getBdpProgram()
						.hashCode());
		result = 37 * result
				+ (getBdpAddr() == null ? 0 : this.getBdpAddr().hashCode());
		result = 37 * result
				+ (getBdpBank() == null ? 0 : this.getBdpBank().hashCode());
		result = 37
				* result
				+ (getBdpPayMethod() == null ? 0 : this.getBdpPayMethod()
						.hashCode());
		result = 37 * result
				+ (getBdpRef() == null ? 0 : this.getBdpRef().hashCode());
		result = 37 * result
				+ (getBdpSeq() == null ? 0 : this.getBdpSeq().hashCode());
		return result;
	}

}