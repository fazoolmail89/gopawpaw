package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSeqMstrId entity provides the base persistence definition of the
 * SeqMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSeqMstrId implements java.io.Serializable {

	// Fields

	private String seqDomain;
	private String seqSite;
	private String seqLine;
	private String seqPart;
	private Date seqDueDate;

	// Constructors

	/** default constructor */
	public AbstractSeqMstrId() {
	}

	/** minimal constructor */
	public AbstractSeqMstrId(String seqDomain) {
		this.seqDomain = seqDomain;
	}

	/** full constructor */
	public AbstractSeqMstrId(String seqDomain, String seqSite, String seqLine,
			String seqPart, Date seqDueDate) {
		this.seqDomain = seqDomain;
		this.seqSite = seqSite;
		this.seqLine = seqLine;
		this.seqPart = seqPart;
		this.seqDueDate = seqDueDate;
	}

	// Property accessors

	public String getSeqDomain() {
		return this.seqDomain;
	}

	public void setSeqDomain(String seqDomain) {
		this.seqDomain = seqDomain;
	}

	public String getSeqSite() {
		return this.seqSite;
	}

	public void setSeqSite(String seqSite) {
		this.seqSite = seqSite;
	}

	public String getSeqLine() {
		return this.seqLine;
	}

	public void setSeqLine(String seqLine) {
		this.seqLine = seqLine;
	}

	public String getSeqPart() {
		return this.seqPart;
	}

	public void setSeqPart(String seqPart) {
		this.seqPart = seqPart;
	}

	public Date getSeqDueDate() {
		return this.seqDueDate;
	}

	public void setSeqDueDate(Date seqDueDate) {
		this.seqDueDate = seqDueDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSeqMstrId))
			return false;
		AbstractSeqMstrId castOther = (AbstractSeqMstrId) other;

		return ((this.getSeqDomain() == castOther.getSeqDomain()) || (this
				.getSeqDomain() != null
				&& castOther.getSeqDomain() != null && this.getSeqDomain()
				.equals(castOther.getSeqDomain())))
				&& ((this.getSeqSite() == castOther.getSeqSite()) || (this
						.getSeqSite() != null
						&& castOther.getSeqSite() != null && this.getSeqSite()
						.equals(castOther.getSeqSite())))
				&& ((this.getSeqLine() == castOther.getSeqLine()) || (this
						.getSeqLine() != null
						&& castOther.getSeqLine() != null && this.getSeqLine()
						.equals(castOther.getSeqLine())))
				&& ((this.getSeqPart() == castOther.getSeqPart()) || (this
						.getSeqPart() != null
						&& castOther.getSeqPart() != null && this.getSeqPart()
						.equals(castOther.getSeqPart())))
				&& ((this.getSeqDueDate() == castOther.getSeqDueDate()) || (this
						.getSeqDueDate() != null
						&& castOther.getSeqDueDate() != null && this
						.getSeqDueDate().equals(castOther.getSeqDueDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSeqDomain() == null ? 0 : this.getSeqDomain().hashCode());
		result = 37 * result
				+ (getSeqSite() == null ? 0 : this.getSeqSite().hashCode());
		result = 37 * result
				+ (getSeqLine() == null ? 0 : this.getSeqLine().hashCode());
		result = 37 * result
				+ (getSeqPart() == null ? 0 : this.getSeqPart().hashCode());
		result = 37
				* result
				+ (getSeqDueDate() == null ? 0 : this.getSeqDueDate()
						.hashCode());
		return result;
	}

}