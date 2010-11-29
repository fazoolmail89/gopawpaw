package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBkpdDetId entity provides the base persistence definition of the
 * BkpdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBkpdDetId implements java.io.Serializable {

	// Fields

	private String bkpdDomain;
	private String bkpdBank;
	private String bkpdPayMethod;
	private String bkpdModule;
	private Integer bkpdSeq;
	private String bkpdAddr;
	private String bkpdCurr;
	private Integer bkpdPaymentNbr;

	// Constructors

	/** default constructor */
	public AbstractBkpdDetId() {
	}

	/** full constructor */
	public AbstractBkpdDetId(String bkpdDomain, String bkpdBank,
			String bkpdPayMethod, String bkpdModule, Integer bkpdSeq,
			String bkpdAddr, String bkpdCurr, Integer bkpdPaymentNbr) {
		this.bkpdDomain = bkpdDomain;
		this.bkpdBank = bkpdBank;
		this.bkpdPayMethod = bkpdPayMethod;
		this.bkpdModule = bkpdModule;
		this.bkpdSeq = bkpdSeq;
		this.bkpdAddr = bkpdAddr;
		this.bkpdCurr = bkpdCurr;
		this.bkpdPaymentNbr = bkpdPaymentNbr;
	}

	// Property accessors

	public String getBkpdDomain() {
		return this.bkpdDomain;
	}

	public void setBkpdDomain(String bkpdDomain) {
		this.bkpdDomain = bkpdDomain;
	}

	public String getBkpdBank() {
		return this.bkpdBank;
	}

	public void setBkpdBank(String bkpdBank) {
		this.bkpdBank = bkpdBank;
	}

	public String getBkpdPayMethod() {
		return this.bkpdPayMethod;
	}

	public void setBkpdPayMethod(String bkpdPayMethod) {
		this.bkpdPayMethod = bkpdPayMethod;
	}

	public String getBkpdModule() {
		return this.bkpdModule;
	}

	public void setBkpdModule(String bkpdModule) {
		this.bkpdModule = bkpdModule;
	}

	public Integer getBkpdSeq() {
		return this.bkpdSeq;
	}

	public void setBkpdSeq(Integer bkpdSeq) {
		this.bkpdSeq = bkpdSeq;
	}

	public String getBkpdAddr() {
		return this.bkpdAddr;
	}

	public void setBkpdAddr(String bkpdAddr) {
		this.bkpdAddr = bkpdAddr;
	}

	public String getBkpdCurr() {
		return this.bkpdCurr;
	}

	public void setBkpdCurr(String bkpdCurr) {
		this.bkpdCurr = bkpdCurr;
	}

	public Integer getBkpdPaymentNbr() {
		return this.bkpdPaymentNbr;
	}

	public void setBkpdPaymentNbr(Integer bkpdPaymentNbr) {
		this.bkpdPaymentNbr = bkpdPaymentNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBkpdDetId))
			return false;
		AbstractBkpdDetId castOther = (AbstractBkpdDetId) other;

		return ((this.getBkpdDomain() == castOther.getBkpdDomain()) || (this
				.getBkpdDomain() != null
				&& castOther.getBkpdDomain() != null && this.getBkpdDomain()
				.equals(castOther.getBkpdDomain())))
				&& ((this.getBkpdBank() == castOther.getBkpdBank()) || (this
						.getBkpdBank() != null
						&& castOther.getBkpdBank() != null && this
						.getBkpdBank().equals(castOther.getBkpdBank())))
				&& ((this.getBkpdPayMethod() == castOther.getBkpdPayMethod()) || (this
						.getBkpdPayMethod() != null
						&& castOther.getBkpdPayMethod() != null && this
						.getBkpdPayMethod()
						.equals(castOther.getBkpdPayMethod())))
				&& ((this.getBkpdModule() == castOther.getBkpdModule()) || (this
						.getBkpdModule() != null
						&& castOther.getBkpdModule() != null && this
						.getBkpdModule().equals(castOther.getBkpdModule())))
				&& ((this.getBkpdSeq() == castOther.getBkpdSeq()) || (this
						.getBkpdSeq() != null
						&& castOther.getBkpdSeq() != null && this.getBkpdSeq()
						.equals(castOther.getBkpdSeq())))
				&& ((this.getBkpdAddr() == castOther.getBkpdAddr()) || (this
						.getBkpdAddr() != null
						&& castOther.getBkpdAddr() != null && this
						.getBkpdAddr().equals(castOther.getBkpdAddr())))
				&& ((this.getBkpdCurr() == castOther.getBkpdCurr()) || (this
						.getBkpdCurr() != null
						&& castOther.getBkpdCurr() != null && this
						.getBkpdCurr().equals(castOther.getBkpdCurr())))
				&& ((this.getBkpdPaymentNbr() == castOther.getBkpdPaymentNbr()) || (this
						.getBkpdPaymentNbr() != null
						&& castOther.getBkpdPaymentNbr() != null && this
						.getBkpdPaymentNbr().equals(
								castOther.getBkpdPaymentNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getBkpdDomain() == null ? 0 : this.getBkpdDomain()
						.hashCode());
		result = 37 * result
				+ (getBkpdBank() == null ? 0 : this.getBkpdBank().hashCode());
		result = 37
				* result
				+ (getBkpdPayMethod() == null ? 0 : this.getBkpdPayMethod()
						.hashCode());
		result = 37
				* result
				+ (getBkpdModule() == null ? 0 : this.getBkpdModule()
						.hashCode());
		result = 37 * result
				+ (getBkpdSeq() == null ? 0 : this.getBkpdSeq().hashCode());
		result = 37 * result
				+ (getBkpdAddr() == null ? 0 : this.getBkpdAddr().hashCode());
		result = 37 * result
				+ (getBkpdCurr() == null ? 0 : this.getBkpdCurr().hashCode());
		result = 37
				* result
				+ (getBkpdPaymentNbr() == null ? 0 : this.getBkpdPaymentNbr()
						.hashCode());
		return result;
	}

}