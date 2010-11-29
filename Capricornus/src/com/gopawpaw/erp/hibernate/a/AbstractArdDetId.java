package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractArdDetId entity provides the base persistence definition of the
 * ArdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractArdDetId implements java.io.Serializable {

	// Fields

	private String ardDomain;
	private String ardNbr;
	private String ardRef;
	private String ardType;
	private String ardTaxAt;
	private String ardEntity;
	private String ardAcct;
	private String ardSub;
	private String ardCc;
	private String ardTax;

	// Constructors

	/** default constructor */
	public AbstractArdDetId() {
	}

	/** minimal constructor */
	public AbstractArdDetId(String ardDomain) {
		this.ardDomain = ardDomain;
	}

	/** full constructor */
	public AbstractArdDetId(String ardDomain, String ardNbr, String ardRef,
			String ardType, String ardTaxAt, String ardEntity, String ardAcct,
			String ardSub, String ardCc, String ardTax) {
		this.ardDomain = ardDomain;
		this.ardNbr = ardNbr;
		this.ardRef = ardRef;
		this.ardType = ardType;
		this.ardTaxAt = ardTaxAt;
		this.ardEntity = ardEntity;
		this.ardAcct = ardAcct;
		this.ardSub = ardSub;
		this.ardCc = ardCc;
		this.ardTax = ardTax;
	}

	// Property accessors

	public String getArdDomain() {
		return this.ardDomain;
	}

	public void setArdDomain(String ardDomain) {
		this.ardDomain = ardDomain;
	}

	public String getArdNbr() {
		return this.ardNbr;
	}

	public void setArdNbr(String ardNbr) {
		this.ardNbr = ardNbr;
	}

	public String getArdRef() {
		return this.ardRef;
	}

	public void setArdRef(String ardRef) {
		this.ardRef = ardRef;
	}

	public String getArdType() {
		return this.ardType;
	}

	public void setArdType(String ardType) {
		this.ardType = ardType;
	}

	public String getArdTaxAt() {
		return this.ardTaxAt;
	}

	public void setArdTaxAt(String ardTaxAt) {
		this.ardTaxAt = ardTaxAt;
	}

	public String getArdEntity() {
		return this.ardEntity;
	}

	public void setArdEntity(String ardEntity) {
		this.ardEntity = ardEntity;
	}

	public String getArdAcct() {
		return this.ardAcct;
	}

	public void setArdAcct(String ardAcct) {
		this.ardAcct = ardAcct;
	}

	public String getArdSub() {
		return this.ardSub;
	}

	public void setArdSub(String ardSub) {
		this.ardSub = ardSub;
	}

	public String getArdCc() {
		return this.ardCc;
	}

	public void setArdCc(String ardCc) {
		this.ardCc = ardCc;
	}

	public String getArdTax() {
		return this.ardTax;
	}

	public void setArdTax(String ardTax) {
		this.ardTax = ardTax;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractArdDetId))
			return false;
		AbstractArdDetId castOther = (AbstractArdDetId) other;

		return ((this.getArdDomain() == castOther.getArdDomain()) || (this
				.getArdDomain() != null
				&& castOther.getArdDomain() != null && this.getArdDomain()
				.equals(castOther.getArdDomain())))
				&& ((this.getArdNbr() == castOther.getArdNbr()) || (this
						.getArdNbr() != null
						&& castOther.getArdNbr() != null && this.getArdNbr()
						.equals(castOther.getArdNbr())))
				&& ((this.getArdRef() == castOther.getArdRef()) || (this
						.getArdRef() != null
						&& castOther.getArdRef() != null && this.getArdRef()
						.equals(castOther.getArdRef())))
				&& ((this.getArdType() == castOther.getArdType()) || (this
						.getArdType() != null
						&& castOther.getArdType() != null && this.getArdType()
						.equals(castOther.getArdType())))
				&& ((this.getArdTaxAt() == castOther.getArdTaxAt()) || (this
						.getArdTaxAt() != null
						&& castOther.getArdTaxAt() != null && this
						.getArdTaxAt().equals(castOther.getArdTaxAt())))
				&& ((this.getArdEntity() == castOther.getArdEntity()) || (this
						.getArdEntity() != null
						&& castOther.getArdEntity() != null && this
						.getArdEntity().equals(castOther.getArdEntity())))
				&& ((this.getArdAcct() == castOther.getArdAcct()) || (this
						.getArdAcct() != null
						&& castOther.getArdAcct() != null && this.getArdAcct()
						.equals(castOther.getArdAcct())))
				&& ((this.getArdSub() == castOther.getArdSub()) || (this
						.getArdSub() != null
						&& castOther.getArdSub() != null && this.getArdSub()
						.equals(castOther.getArdSub())))
				&& ((this.getArdCc() == castOther.getArdCc()) || (this
						.getArdCc() != null
						&& castOther.getArdCc() != null && this.getArdCc()
						.equals(castOther.getArdCc())))
				&& ((this.getArdTax() == castOther.getArdTax()) || (this
						.getArdTax() != null
						&& castOther.getArdTax() != null && this.getArdTax()
						.equals(castOther.getArdTax())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getArdDomain() == null ? 0 : this.getArdDomain().hashCode());
		result = 37 * result
				+ (getArdNbr() == null ? 0 : this.getArdNbr().hashCode());
		result = 37 * result
				+ (getArdRef() == null ? 0 : this.getArdRef().hashCode());
		result = 37 * result
				+ (getArdType() == null ? 0 : this.getArdType().hashCode());
		result = 37 * result
				+ (getArdTaxAt() == null ? 0 : this.getArdTaxAt().hashCode());
		result = 37 * result
				+ (getArdEntity() == null ? 0 : this.getArdEntity().hashCode());
		result = 37 * result
				+ (getArdAcct() == null ? 0 : this.getArdAcct().hashCode());
		result = 37 * result
				+ (getArdSub() == null ? 0 : this.getArdSub().hashCode());
		result = 37 * result
				+ (getArdCc() == null ? 0 : this.getArdCc().hashCode());
		result = 37 * result
				+ (getArdTax() == null ? 0 : this.getArdTax().hashCode());
		return result;
	}

}