package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractActMstrId entity provides the base persistence definition of the
 * ActMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractActMstrId implements java.io.Serializable {

	// Fields

	private String actDomain;
	private String actNbr;
	private Integer actLine;
	private String actContPart;

	// Constructors

	/** default constructor */
	public AbstractActMstrId() {
	}

	/** minimal constructor */
	public AbstractActMstrId(String actDomain) {
		this.actDomain = actDomain;
	}

	/** full constructor */
	public AbstractActMstrId(String actDomain, String actNbr, Integer actLine,
			String actContPart) {
		this.actDomain = actDomain;
		this.actNbr = actNbr;
		this.actLine = actLine;
		this.actContPart = actContPart;
	}

	// Property accessors

	public String getActDomain() {
		return this.actDomain;
	}

	public void setActDomain(String actDomain) {
		this.actDomain = actDomain;
	}

	public String getActNbr() {
		return this.actNbr;
	}

	public void setActNbr(String actNbr) {
		this.actNbr = actNbr;
	}

	public Integer getActLine() {
		return this.actLine;
	}

	public void setActLine(Integer actLine) {
		this.actLine = actLine;
	}

	public String getActContPart() {
		return this.actContPart;
	}

	public void setActContPart(String actContPart) {
		this.actContPart = actContPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractActMstrId))
			return false;
		AbstractActMstrId castOther = (AbstractActMstrId) other;

		return ((this.getActDomain() == castOther.getActDomain()) || (this
				.getActDomain() != null
				&& castOther.getActDomain() != null && this.getActDomain()
				.equals(castOther.getActDomain())))
				&& ((this.getActNbr() == castOther.getActNbr()) || (this
						.getActNbr() != null
						&& castOther.getActNbr() != null && this.getActNbr()
						.equals(castOther.getActNbr())))
				&& ((this.getActLine() == castOther.getActLine()) || (this
						.getActLine() != null
						&& castOther.getActLine() != null && this.getActLine()
						.equals(castOther.getActLine())))
				&& ((this.getActContPart() == castOther.getActContPart()) || (this
						.getActContPart() != null
						&& castOther.getActContPart() != null && this
						.getActContPart().equals(castOther.getActContPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getActDomain() == null ? 0 : this.getActDomain().hashCode());
		result = 37 * result
				+ (getActNbr() == null ? 0 : this.getActNbr().hashCode());
		result = 37 * result
				+ (getActLine() == null ? 0 : this.getActLine().hashCode());
		result = 37
				* result
				+ (getActContPart() == null ? 0 : this.getActContPart()
						.hashCode());
		return result;
	}

}