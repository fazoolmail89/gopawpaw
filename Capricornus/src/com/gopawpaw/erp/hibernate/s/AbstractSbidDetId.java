package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSbidDetId entity provides the base persistence definition of the
 * SbidDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSbidDetId implements java.io.Serializable {

	// Fields

	private String sbidDomain;
	private String sbidBill;
	private String sbidNbr;
	private Integer sbidLine;

	// Constructors

	/** default constructor */
	public AbstractSbidDetId() {
	}

	/** minimal constructor */
	public AbstractSbidDetId(String sbidDomain, String sbidBill, String sbidNbr) {
		this.sbidDomain = sbidDomain;
		this.sbidBill = sbidBill;
		this.sbidNbr = sbidNbr;
	}

	/** full constructor */
	public AbstractSbidDetId(String sbidDomain, String sbidBill,
			String sbidNbr, Integer sbidLine) {
		this.sbidDomain = sbidDomain;
		this.sbidBill = sbidBill;
		this.sbidNbr = sbidNbr;
		this.sbidLine = sbidLine;
	}

	// Property accessors

	public String getSbidDomain() {
		return this.sbidDomain;
	}

	public void setSbidDomain(String sbidDomain) {
		this.sbidDomain = sbidDomain;
	}

	public String getSbidBill() {
		return this.sbidBill;
	}

	public void setSbidBill(String sbidBill) {
		this.sbidBill = sbidBill;
	}

	public String getSbidNbr() {
		return this.sbidNbr;
	}

	public void setSbidNbr(String sbidNbr) {
		this.sbidNbr = sbidNbr;
	}

	public Integer getSbidLine() {
		return this.sbidLine;
	}

	public void setSbidLine(Integer sbidLine) {
		this.sbidLine = sbidLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSbidDetId))
			return false;
		AbstractSbidDetId castOther = (AbstractSbidDetId) other;

		return ((this.getSbidDomain() == castOther.getSbidDomain()) || (this
				.getSbidDomain() != null
				&& castOther.getSbidDomain() != null && this.getSbidDomain()
				.equals(castOther.getSbidDomain())))
				&& ((this.getSbidBill() == castOther.getSbidBill()) || (this
						.getSbidBill() != null
						&& castOther.getSbidBill() != null && this
						.getSbidBill().equals(castOther.getSbidBill())))
				&& ((this.getSbidNbr() == castOther.getSbidNbr()) || (this
						.getSbidNbr() != null
						&& castOther.getSbidNbr() != null && this.getSbidNbr()
						.equals(castOther.getSbidNbr())))
				&& ((this.getSbidLine() == castOther.getSbidLine()) || (this
						.getSbidLine() != null
						&& castOther.getSbidLine() != null && this
						.getSbidLine().equals(castOther.getSbidLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSbidDomain() == null ? 0 : this.getSbidDomain()
						.hashCode());
		result = 37 * result
				+ (getSbidBill() == null ? 0 : this.getSbidBill().hashCode());
		result = 37 * result
				+ (getSbidNbr() == null ? 0 : this.getSbidNbr().hashCode());
		result = 37 * result
				+ (getSbidLine() == null ? 0 : this.getSbidLine().hashCode());
		return result;
	}

}