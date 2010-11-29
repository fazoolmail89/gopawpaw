package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTx2dDetId entity provides the base persistence definition of the
 * Tx2dDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTx2dDetId implements java.io.Serializable {

	// Fields

	private String tx2dDomain;
	private String tx2dRef;
	private String tx2dNbr;
	private Integer tx2dLine;
	private String tx2dTrl;
	private String tx2dTrType;
	private String tx2dTaxCode;

	// Constructors

	/** default constructor */
	public AbstractTx2dDetId() {
	}

	/** full constructor */
	public AbstractTx2dDetId(String tx2dDomain, String tx2dRef, String tx2dNbr,
			Integer tx2dLine, String tx2dTrl, String tx2dTrType,
			String tx2dTaxCode) {
		this.tx2dDomain = tx2dDomain;
		this.tx2dRef = tx2dRef;
		this.tx2dNbr = tx2dNbr;
		this.tx2dLine = tx2dLine;
		this.tx2dTrl = tx2dTrl;
		this.tx2dTrType = tx2dTrType;
		this.tx2dTaxCode = tx2dTaxCode;
	}

	// Property accessors

	public String getTx2dDomain() {
		return this.tx2dDomain;
	}

	public void setTx2dDomain(String tx2dDomain) {
		this.tx2dDomain = tx2dDomain;
	}

	public String getTx2dRef() {
		return this.tx2dRef;
	}

	public void setTx2dRef(String tx2dRef) {
		this.tx2dRef = tx2dRef;
	}

	public String getTx2dNbr() {
		return this.tx2dNbr;
	}

	public void setTx2dNbr(String tx2dNbr) {
		this.tx2dNbr = tx2dNbr;
	}

	public Integer getTx2dLine() {
		return this.tx2dLine;
	}

	public void setTx2dLine(Integer tx2dLine) {
		this.tx2dLine = tx2dLine;
	}

	public String getTx2dTrl() {
		return this.tx2dTrl;
	}

	public void setTx2dTrl(String tx2dTrl) {
		this.tx2dTrl = tx2dTrl;
	}

	public String getTx2dTrType() {
		return this.tx2dTrType;
	}

	public void setTx2dTrType(String tx2dTrType) {
		this.tx2dTrType = tx2dTrType;
	}

	public String getTx2dTaxCode() {
		return this.tx2dTaxCode;
	}

	public void setTx2dTaxCode(String tx2dTaxCode) {
		this.tx2dTaxCode = tx2dTaxCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTx2dDetId))
			return false;
		AbstractTx2dDetId castOther = (AbstractTx2dDetId) other;

		return ((this.getTx2dDomain() == castOther.getTx2dDomain()) || (this
				.getTx2dDomain() != null
				&& castOther.getTx2dDomain() != null && this.getTx2dDomain()
				.equals(castOther.getTx2dDomain())))
				&& ((this.getTx2dRef() == castOther.getTx2dRef()) || (this
						.getTx2dRef() != null
						&& castOther.getTx2dRef() != null && this.getTx2dRef()
						.equals(castOther.getTx2dRef())))
				&& ((this.getTx2dNbr() == castOther.getTx2dNbr()) || (this
						.getTx2dNbr() != null
						&& castOther.getTx2dNbr() != null && this.getTx2dNbr()
						.equals(castOther.getTx2dNbr())))
				&& ((this.getTx2dLine() == castOther.getTx2dLine()) || (this
						.getTx2dLine() != null
						&& castOther.getTx2dLine() != null && this
						.getTx2dLine().equals(castOther.getTx2dLine())))
				&& ((this.getTx2dTrl() == castOther.getTx2dTrl()) || (this
						.getTx2dTrl() != null
						&& castOther.getTx2dTrl() != null && this.getTx2dTrl()
						.equals(castOther.getTx2dTrl())))
				&& ((this.getTx2dTrType() == castOther.getTx2dTrType()) || (this
						.getTx2dTrType() != null
						&& castOther.getTx2dTrType() != null && this
						.getTx2dTrType().equals(castOther.getTx2dTrType())))
				&& ((this.getTx2dTaxCode() == castOther.getTx2dTaxCode()) || (this
						.getTx2dTaxCode() != null
						&& castOther.getTx2dTaxCode() != null && this
						.getTx2dTaxCode().equals(castOther.getTx2dTaxCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTx2dDomain() == null ? 0 : this.getTx2dDomain()
						.hashCode());
		result = 37 * result
				+ (getTx2dRef() == null ? 0 : this.getTx2dRef().hashCode());
		result = 37 * result
				+ (getTx2dNbr() == null ? 0 : this.getTx2dNbr().hashCode());
		result = 37 * result
				+ (getTx2dLine() == null ? 0 : this.getTx2dLine().hashCode());
		result = 37 * result
				+ (getTx2dTrl() == null ? 0 : this.getTx2dTrl().hashCode());
		result = 37
				* result
				+ (getTx2dTrType() == null ? 0 : this.getTx2dTrType()
						.hashCode());
		result = 37
				* result
				+ (getTx2dTaxCode() == null ? 0 : this.getTx2dTaxCode()
						.hashCode());
		return result;
	}

}