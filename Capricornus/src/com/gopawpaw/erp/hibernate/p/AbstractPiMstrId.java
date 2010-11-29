package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPiMstrId entity provides the base persistence definition of the
 * PiMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPiMstrId implements java.io.Serializable {

	// Fields

	private String piDomain;
	private String piList;
	private String piCsType;
	private String piCsCode;
	private String piPartType;
	private String piPartCode;
	private String piCurr;
	private String piUm;
	private Date piStart;

	// Constructors

	/** default constructor */
	public AbstractPiMstrId() {
	}

	/** minimal constructor */
	public AbstractPiMstrId(String piDomain, String piList, String piCsCode,
			String piPartCode, String piCurr, String piUm) {
		this.piDomain = piDomain;
		this.piList = piList;
		this.piCsCode = piCsCode;
		this.piPartCode = piPartCode;
		this.piCurr = piCurr;
		this.piUm = piUm;
	}

	/** full constructor */
	public AbstractPiMstrId(String piDomain, String piList, String piCsType,
			String piCsCode, String piPartType, String piPartCode,
			String piCurr, String piUm, Date piStart) {
		this.piDomain = piDomain;
		this.piList = piList;
		this.piCsType = piCsType;
		this.piCsCode = piCsCode;
		this.piPartType = piPartType;
		this.piPartCode = piPartCode;
		this.piCurr = piCurr;
		this.piUm = piUm;
		this.piStart = piStart;
	}

	// Property accessors

	public String getPiDomain() {
		return this.piDomain;
	}

	public void setPiDomain(String piDomain) {
		this.piDomain = piDomain;
	}

	public String getPiList() {
		return this.piList;
	}

	public void setPiList(String piList) {
		this.piList = piList;
	}

	public String getPiCsType() {
		return this.piCsType;
	}

	public void setPiCsType(String piCsType) {
		this.piCsType = piCsType;
	}

	public String getPiCsCode() {
		return this.piCsCode;
	}

	public void setPiCsCode(String piCsCode) {
		this.piCsCode = piCsCode;
	}

	public String getPiPartType() {
		return this.piPartType;
	}

	public void setPiPartType(String piPartType) {
		this.piPartType = piPartType;
	}

	public String getPiPartCode() {
		return this.piPartCode;
	}

	public void setPiPartCode(String piPartCode) {
		this.piPartCode = piPartCode;
	}

	public String getPiCurr() {
		return this.piCurr;
	}

	public void setPiCurr(String piCurr) {
		this.piCurr = piCurr;
	}

	public String getPiUm() {
		return this.piUm;
	}

	public void setPiUm(String piUm) {
		this.piUm = piUm;
	}

	public Date getPiStart() {
		return this.piStart;
	}

	public void setPiStart(Date piStart) {
		this.piStart = piStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPiMstrId))
			return false;
		AbstractPiMstrId castOther = (AbstractPiMstrId) other;

		return ((this.getPiDomain() == castOther.getPiDomain()) || (this
				.getPiDomain() != null
				&& castOther.getPiDomain() != null && this.getPiDomain()
				.equals(castOther.getPiDomain())))
				&& ((this.getPiList() == castOther.getPiList()) || (this
						.getPiList() != null
						&& castOther.getPiList() != null && this.getPiList()
						.equals(castOther.getPiList())))
				&& ((this.getPiCsType() == castOther.getPiCsType()) || (this
						.getPiCsType() != null
						&& castOther.getPiCsType() != null && this
						.getPiCsType().equals(castOther.getPiCsType())))
				&& ((this.getPiCsCode() == castOther.getPiCsCode()) || (this
						.getPiCsCode() != null
						&& castOther.getPiCsCode() != null && this
						.getPiCsCode().equals(castOther.getPiCsCode())))
				&& ((this.getPiPartType() == castOther.getPiPartType()) || (this
						.getPiPartType() != null
						&& castOther.getPiPartType() != null && this
						.getPiPartType().equals(castOther.getPiPartType())))
				&& ((this.getPiPartCode() == castOther.getPiPartCode()) || (this
						.getPiPartCode() != null
						&& castOther.getPiPartCode() != null && this
						.getPiPartCode().equals(castOther.getPiPartCode())))
				&& ((this.getPiCurr() == castOther.getPiCurr()) || (this
						.getPiCurr() != null
						&& castOther.getPiCurr() != null && this.getPiCurr()
						.equals(castOther.getPiCurr())))
				&& ((this.getPiUm() == castOther.getPiUm()) || (this.getPiUm() != null
						&& castOther.getPiUm() != null && this.getPiUm()
						.equals(castOther.getPiUm())))
				&& ((this.getPiStart() == castOther.getPiStart()) || (this
						.getPiStart() != null
						&& castOther.getPiStart() != null && this.getPiStart()
						.equals(castOther.getPiStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPiDomain() == null ? 0 : this.getPiDomain().hashCode());
		result = 37 * result
				+ (getPiList() == null ? 0 : this.getPiList().hashCode());
		result = 37 * result
				+ (getPiCsType() == null ? 0 : this.getPiCsType().hashCode());
		result = 37 * result
				+ (getPiCsCode() == null ? 0 : this.getPiCsCode().hashCode());
		result = 37
				* result
				+ (getPiPartType() == null ? 0 : this.getPiPartType()
						.hashCode());
		result = 37
				* result
				+ (getPiPartCode() == null ? 0 : this.getPiPartCode()
						.hashCode());
		result = 37 * result
				+ (getPiCurr() == null ? 0 : this.getPiCurr().hashCode());
		result = 37 * result
				+ (getPiUm() == null ? 0 : this.getPiUm().hashCode());
		result = 37 * result
				+ (getPiStart() == null ? 0 : this.getPiStart().hashCode());
		return result;
	}

}