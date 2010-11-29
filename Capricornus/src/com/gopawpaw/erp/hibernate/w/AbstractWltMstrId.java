package com.gopawpaw.erp.hibernate.w;

/**
 * AbstractWltMstrId entity provides the base persistence definition of the
 * WltMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWltMstrId implements java.io.Serializable {

	// Fields

	private String wltDomain;
	private String wltTrType;
	private Integer wltTrnbr;
	private Boolean wltPrconsInd;
	private String wltMtlType;
	private String wltProdbyId;
	private Integer wltProdbyOp;
	private String wltPart;
	private String wltLotser;
	private String wltRef;

	// Constructors

	/** default constructor */
	public AbstractWltMstrId() {
	}

	/** minimal constructor */
	public AbstractWltMstrId(String wltDomain, Integer wltTrnbr,
			Integer wltProdbyOp, String wltPart) {
		this.wltDomain = wltDomain;
		this.wltTrnbr = wltTrnbr;
		this.wltProdbyOp = wltProdbyOp;
		this.wltPart = wltPart;
	}

	/** full constructor */
	public AbstractWltMstrId(String wltDomain, String wltTrType,
			Integer wltTrnbr, Boolean wltPrconsInd, String wltMtlType,
			String wltProdbyId, Integer wltProdbyOp, String wltPart,
			String wltLotser, String wltRef) {
		this.wltDomain = wltDomain;
		this.wltTrType = wltTrType;
		this.wltTrnbr = wltTrnbr;
		this.wltPrconsInd = wltPrconsInd;
		this.wltMtlType = wltMtlType;
		this.wltProdbyId = wltProdbyId;
		this.wltProdbyOp = wltProdbyOp;
		this.wltPart = wltPart;
		this.wltLotser = wltLotser;
		this.wltRef = wltRef;
	}

	// Property accessors

	public String getWltDomain() {
		return this.wltDomain;
	}

	public void setWltDomain(String wltDomain) {
		this.wltDomain = wltDomain;
	}

	public String getWltTrType() {
		return this.wltTrType;
	}

	public void setWltTrType(String wltTrType) {
		this.wltTrType = wltTrType;
	}

	public Integer getWltTrnbr() {
		return this.wltTrnbr;
	}

	public void setWltTrnbr(Integer wltTrnbr) {
		this.wltTrnbr = wltTrnbr;
	}

	public Boolean getWltPrconsInd() {
		return this.wltPrconsInd;
	}

	public void setWltPrconsInd(Boolean wltPrconsInd) {
		this.wltPrconsInd = wltPrconsInd;
	}

	public String getWltMtlType() {
		return this.wltMtlType;
	}

	public void setWltMtlType(String wltMtlType) {
		this.wltMtlType = wltMtlType;
	}

	public String getWltProdbyId() {
		return this.wltProdbyId;
	}

	public void setWltProdbyId(String wltProdbyId) {
		this.wltProdbyId = wltProdbyId;
	}

	public Integer getWltProdbyOp() {
		return this.wltProdbyOp;
	}

	public void setWltProdbyOp(Integer wltProdbyOp) {
		this.wltProdbyOp = wltProdbyOp;
	}

	public String getWltPart() {
		return this.wltPart;
	}

	public void setWltPart(String wltPart) {
		this.wltPart = wltPart;
	}

	public String getWltLotser() {
		return this.wltLotser;
	}

	public void setWltLotser(String wltLotser) {
		this.wltLotser = wltLotser;
	}

	public String getWltRef() {
		return this.wltRef;
	}

	public void setWltRef(String wltRef) {
		this.wltRef = wltRef;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractWltMstrId))
			return false;
		AbstractWltMstrId castOther = (AbstractWltMstrId) other;

		return ((this.getWltDomain() == castOther.getWltDomain()) || (this
				.getWltDomain() != null
				&& castOther.getWltDomain() != null && this.getWltDomain()
				.equals(castOther.getWltDomain())))
				&& ((this.getWltTrType() == castOther.getWltTrType()) || (this
						.getWltTrType() != null
						&& castOther.getWltTrType() != null && this
						.getWltTrType().equals(castOther.getWltTrType())))
				&& ((this.getWltTrnbr() == castOther.getWltTrnbr()) || (this
						.getWltTrnbr() != null
						&& castOther.getWltTrnbr() != null && this
						.getWltTrnbr().equals(castOther.getWltTrnbr())))
				&& ((this.getWltPrconsInd() == castOther.getWltPrconsInd()) || (this
						.getWltPrconsInd() != null
						&& castOther.getWltPrconsInd() != null && this
						.getWltPrconsInd().equals(castOther.getWltPrconsInd())))
				&& ((this.getWltMtlType() == castOther.getWltMtlType()) || (this
						.getWltMtlType() != null
						&& castOther.getWltMtlType() != null && this
						.getWltMtlType().equals(castOther.getWltMtlType())))
				&& ((this.getWltProdbyId() == castOther.getWltProdbyId()) || (this
						.getWltProdbyId() != null
						&& castOther.getWltProdbyId() != null && this
						.getWltProdbyId().equals(castOther.getWltProdbyId())))
				&& ((this.getWltProdbyOp() == castOther.getWltProdbyOp()) || (this
						.getWltProdbyOp() != null
						&& castOther.getWltProdbyOp() != null && this
						.getWltProdbyOp().equals(castOther.getWltProdbyOp())))
				&& ((this.getWltPart() == castOther.getWltPart()) || (this
						.getWltPart() != null
						&& castOther.getWltPart() != null && this.getWltPart()
						.equals(castOther.getWltPart())))
				&& ((this.getWltLotser() == castOther.getWltLotser()) || (this
						.getWltLotser() != null
						&& castOther.getWltLotser() != null && this
						.getWltLotser().equals(castOther.getWltLotser())))
				&& ((this.getWltRef() == castOther.getWltRef()) || (this
						.getWltRef() != null
						&& castOther.getWltRef() != null && this.getWltRef()
						.equals(castOther.getWltRef())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getWltDomain() == null ? 0 : this.getWltDomain().hashCode());
		result = 37 * result
				+ (getWltTrType() == null ? 0 : this.getWltTrType().hashCode());
		result = 37 * result
				+ (getWltTrnbr() == null ? 0 : this.getWltTrnbr().hashCode());
		result = 37
				* result
				+ (getWltPrconsInd() == null ? 0 : this.getWltPrconsInd()
						.hashCode());
		result = 37
				* result
				+ (getWltMtlType() == null ? 0 : this.getWltMtlType()
						.hashCode());
		result = 37
				* result
				+ (getWltProdbyId() == null ? 0 : this.getWltProdbyId()
						.hashCode());
		result = 37
				* result
				+ (getWltProdbyOp() == null ? 0 : this.getWltProdbyOp()
						.hashCode());
		result = 37 * result
				+ (getWltPart() == null ? 0 : this.getWltPart().hashCode());
		result = 37 * result
				+ (getWltLotser() == null ? 0 : this.getWltLotser().hashCode());
		result = 37 * result
				+ (getWltRef() == null ? 0 : this.getWltRef().hashCode());
		return result;
	}

}