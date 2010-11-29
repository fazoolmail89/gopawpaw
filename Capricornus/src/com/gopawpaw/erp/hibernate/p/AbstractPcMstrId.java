package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPcMstrId entity provides the base persistence definition of the
 * PcMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPcMstrId implements java.io.Serializable {

	// Fields

	private String pcDomain;
	private String pcList;
	private String pcCurr;
	private String pcProdLine;
	private String pcPart;
	private String pcUm;
	private Date pcStart;

	// Constructors

	/** default constructor */
	public AbstractPcMstrId() {
	}

	/** minimal constructor */
	public AbstractPcMstrId(String pcDomain) {
		this.pcDomain = pcDomain;
	}

	/** full constructor */
	public AbstractPcMstrId(String pcDomain, String pcList, String pcCurr,
			String pcProdLine, String pcPart, String pcUm, Date pcStart) {
		this.pcDomain = pcDomain;
		this.pcList = pcList;
		this.pcCurr = pcCurr;
		this.pcProdLine = pcProdLine;
		this.pcPart = pcPart;
		this.pcUm = pcUm;
		this.pcStart = pcStart;
	}

	// Property accessors

	public String getPcDomain() {
		return this.pcDomain;
	}

	public void setPcDomain(String pcDomain) {
		this.pcDomain = pcDomain;
	}

	public String getPcList() {
		return this.pcList;
	}

	public void setPcList(String pcList) {
		this.pcList = pcList;
	}

	public String getPcCurr() {
		return this.pcCurr;
	}

	public void setPcCurr(String pcCurr) {
		this.pcCurr = pcCurr;
	}

	public String getPcProdLine() {
		return this.pcProdLine;
	}

	public void setPcProdLine(String pcProdLine) {
		this.pcProdLine = pcProdLine;
	}

	public String getPcPart() {
		return this.pcPart;
	}

	public void setPcPart(String pcPart) {
		this.pcPart = pcPart;
	}

	public String getPcUm() {
		return this.pcUm;
	}

	public void setPcUm(String pcUm) {
		this.pcUm = pcUm;
	}

	public Date getPcStart() {
		return this.pcStart;
	}

	public void setPcStart(Date pcStart) {
		this.pcStart = pcStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPcMstrId))
			return false;
		AbstractPcMstrId castOther = (AbstractPcMstrId) other;

		return ((this.getPcDomain() == castOther.getPcDomain()) || (this
				.getPcDomain() != null
				&& castOther.getPcDomain() != null && this.getPcDomain()
				.equals(castOther.getPcDomain())))
				&& ((this.getPcList() == castOther.getPcList()) || (this
						.getPcList() != null
						&& castOther.getPcList() != null && this.getPcList()
						.equals(castOther.getPcList())))
				&& ((this.getPcCurr() == castOther.getPcCurr()) || (this
						.getPcCurr() != null
						&& castOther.getPcCurr() != null && this.getPcCurr()
						.equals(castOther.getPcCurr())))
				&& ((this.getPcProdLine() == castOther.getPcProdLine()) || (this
						.getPcProdLine() != null
						&& castOther.getPcProdLine() != null && this
						.getPcProdLine().equals(castOther.getPcProdLine())))
				&& ((this.getPcPart() == castOther.getPcPart()) || (this
						.getPcPart() != null
						&& castOther.getPcPart() != null && this.getPcPart()
						.equals(castOther.getPcPart())))
				&& ((this.getPcUm() == castOther.getPcUm()) || (this.getPcUm() != null
						&& castOther.getPcUm() != null && this.getPcUm()
						.equals(castOther.getPcUm())))
				&& ((this.getPcStart() == castOther.getPcStart()) || (this
						.getPcStart() != null
						&& castOther.getPcStart() != null && this.getPcStart()
						.equals(castOther.getPcStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPcDomain() == null ? 0 : this.getPcDomain().hashCode());
		result = 37 * result
				+ (getPcList() == null ? 0 : this.getPcList().hashCode());
		result = 37 * result
				+ (getPcCurr() == null ? 0 : this.getPcCurr().hashCode());
		result = 37
				* result
				+ (getPcProdLine() == null ? 0 : this.getPcProdLine()
						.hashCode());
		result = 37 * result
				+ (getPcPart() == null ? 0 : this.getPcPart().hashCode());
		result = 37 * result
				+ (getPcUm() == null ? 0 : this.getPcUm().hashCode());
		result = 37 * result
				+ (getPcStart() == null ? 0 : this.getPcStart().hashCode());
		return result;
	}

}