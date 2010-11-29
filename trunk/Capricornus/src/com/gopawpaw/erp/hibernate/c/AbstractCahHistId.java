package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCahHistId entity provides the base persistence definition of the
 * CahHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCahHistId implements java.io.Serializable {

	// Fields

	private String cahDomain;
	private String cahNbr;
	private Date cahOpnDate;
	private Integer cahSeq;

	// Constructors

	/** default constructor */
	public AbstractCahHistId() {
	}

	/** minimal constructor */
	public AbstractCahHistId(String cahDomain) {
		this.cahDomain = cahDomain;
	}

	/** full constructor */
	public AbstractCahHistId(String cahDomain, String cahNbr, Date cahOpnDate,
			Integer cahSeq) {
		this.cahDomain = cahDomain;
		this.cahNbr = cahNbr;
		this.cahOpnDate = cahOpnDate;
		this.cahSeq = cahSeq;
	}

	// Property accessors

	public String getCahDomain() {
		return this.cahDomain;
	}

	public void setCahDomain(String cahDomain) {
		this.cahDomain = cahDomain;
	}

	public String getCahNbr() {
		return this.cahNbr;
	}

	public void setCahNbr(String cahNbr) {
		this.cahNbr = cahNbr;
	}

	public Date getCahOpnDate() {
		return this.cahOpnDate;
	}

	public void setCahOpnDate(Date cahOpnDate) {
		this.cahOpnDate = cahOpnDate;
	}

	public Integer getCahSeq() {
		return this.cahSeq;
	}

	public void setCahSeq(Integer cahSeq) {
		this.cahSeq = cahSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCahHistId))
			return false;
		AbstractCahHistId castOther = (AbstractCahHistId) other;

		return ((this.getCahDomain() == castOther.getCahDomain()) || (this
				.getCahDomain() != null
				&& castOther.getCahDomain() != null && this.getCahDomain()
				.equals(castOther.getCahDomain())))
				&& ((this.getCahNbr() == castOther.getCahNbr()) || (this
						.getCahNbr() != null
						&& castOther.getCahNbr() != null && this.getCahNbr()
						.equals(castOther.getCahNbr())))
				&& ((this.getCahOpnDate() == castOther.getCahOpnDate()) || (this
						.getCahOpnDate() != null
						&& castOther.getCahOpnDate() != null && this
						.getCahOpnDate().equals(castOther.getCahOpnDate())))
				&& ((this.getCahSeq() == castOther.getCahSeq()) || (this
						.getCahSeq() != null
						&& castOther.getCahSeq() != null && this.getCahSeq()
						.equals(castOther.getCahSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCahDomain() == null ? 0 : this.getCahDomain().hashCode());
		result = 37 * result
				+ (getCahNbr() == null ? 0 : this.getCahNbr().hashCode());
		result = 37
				* result
				+ (getCahOpnDate() == null ? 0 : this.getCahOpnDate()
						.hashCode());
		result = 37 * result
				+ (getCahSeq() == null ? 0 : this.getCahSeq().hashCode());
		return result;
	}

}