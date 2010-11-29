package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCcdMstrId entity provides the base persistence definition of the
 * CcdMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCcdMstrId implements java.io.Serializable {

	// Fields

	private String ccdDomain;
	private String ccdCaNbr;
	private Date ccdOpnDate;
	private Integer ccdItmLine;
	private String ccdPart;
	private Integer ccdLine;

	// Constructors

	/** default constructor */
	public AbstractCcdMstrId() {
	}

	/** minimal constructor */
	public AbstractCcdMstrId(String ccdDomain) {
		this.ccdDomain = ccdDomain;
	}

	/** full constructor */
	public AbstractCcdMstrId(String ccdDomain, String ccdCaNbr,
			Date ccdOpnDate, Integer ccdItmLine, String ccdPart, Integer ccdLine) {
		this.ccdDomain = ccdDomain;
		this.ccdCaNbr = ccdCaNbr;
		this.ccdOpnDate = ccdOpnDate;
		this.ccdItmLine = ccdItmLine;
		this.ccdPart = ccdPart;
		this.ccdLine = ccdLine;
	}

	// Property accessors

	public String getCcdDomain() {
		return this.ccdDomain;
	}

	public void setCcdDomain(String ccdDomain) {
		this.ccdDomain = ccdDomain;
	}

	public String getCcdCaNbr() {
		return this.ccdCaNbr;
	}

	public void setCcdCaNbr(String ccdCaNbr) {
		this.ccdCaNbr = ccdCaNbr;
	}

	public Date getCcdOpnDate() {
		return this.ccdOpnDate;
	}

	public void setCcdOpnDate(Date ccdOpnDate) {
		this.ccdOpnDate = ccdOpnDate;
	}

	public Integer getCcdItmLine() {
		return this.ccdItmLine;
	}

	public void setCcdItmLine(Integer ccdItmLine) {
		this.ccdItmLine = ccdItmLine;
	}

	public String getCcdPart() {
		return this.ccdPart;
	}

	public void setCcdPart(String ccdPart) {
		this.ccdPart = ccdPart;
	}

	public Integer getCcdLine() {
		return this.ccdLine;
	}

	public void setCcdLine(Integer ccdLine) {
		this.ccdLine = ccdLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCcdMstrId))
			return false;
		AbstractCcdMstrId castOther = (AbstractCcdMstrId) other;

		return ((this.getCcdDomain() == castOther.getCcdDomain()) || (this
				.getCcdDomain() != null
				&& castOther.getCcdDomain() != null && this.getCcdDomain()
				.equals(castOther.getCcdDomain())))
				&& ((this.getCcdCaNbr() == castOther.getCcdCaNbr()) || (this
						.getCcdCaNbr() != null
						&& castOther.getCcdCaNbr() != null && this
						.getCcdCaNbr().equals(castOther.getCcdCaNbr())))
				&& ((this.getCcdOpnDate() == castOther.getCcdOpnDate()) || (this
						.getCcdOpnDate() != null
						&& castOther.getCcdOpnDate() != null && this
						.getCcdOpnDate().equals(castOther.getCcdOpnDate())))
				&& ((this.getCcdItmLine() == castOther.getCcdItmLine()) || (this
						.getCcdItmLine() != null
						&& castOther.getCcdItmLine() != null && this
						.getCcdItmLine().equals(castOther.getCcdItmLine())))
				&& ((this.getCcdPart() == castOther.getCcdPart()) || (this
						.getCcdPart() != null
						&& castOther.getCcdPart() != null && this.getCcdPart()
						.equals(castOther.getCcdPart())))
				&& ((this.getCcdLine() == castOther.getCcdLine()) || (this
						.getCcdLine() != null
						&& castOther.getCcdLine() != null && this.getCcdLine()
						.equals(castOther.getCcdLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCcdDomain() == null ? 0 : this.getCcdDomain().hashCode());
		result = 37 * result
				+ (getCcdCaNbr() == null ? 0 : this.getCcdCaNbr().hashCode());
		result = 37
				* result
				+ (getCcdOpnDate() == null ? 0 : this.getCcdOpnDate()
						.hashCode());
		result = 37
				* result
				+ (getCcdItmLine() == null ? 0 : this.getCcdItmLine()
						.hashCode());
		result = 37 * result
				+ (getCcdPart() == null ? 0 : this.getCcdPart().hashCode());
		result = 37 * result
				+ (getCcdLine() == null ? 0 : this.getCcdLine().hashCode());
		return result;
	}

}