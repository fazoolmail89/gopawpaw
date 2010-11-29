package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractReqDetId entity provides the base persistence definition of the
 * ReqDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractReqDetId implements java.io.Serializable {

	// Fields

	private String reqDomain;
	private String reqNbr;
	private Integer reqLine;

	// Constructors

	/** default constructor */
	public AbstractReqDetId() {
	}

	/** minimal constructor */
	public AbstractReqDetId(String reqDomain, String reqNbr) {
		this.reqDomain = reqDomain;
		this.reqNbr = reqNbr;
	}

	/** full constructor */
	public AbstractReqDetId(String reqDomain, String reqNbr, Integer reqLine) {
		this.reqDomain = reqDomain;
		this.reqNbr = reqNbr;
		this.reqLine = reqLine;
	}

	// Property accessors

	public String getReqDomain() {
		return this.reqDomain;
	}

	public void setReqDomain(String reqDomain) {
		this.reqDomain = reqDomain;
	}

	public String getReqNbr() {
		return this.reqNbr;
	}

	public void setReqNbr(String reqNbr) {
		this.reqNbr = reqNbr;
	}

	public Integer getReqLine() {
		return this.reqLine;
	}

	public void setReqLine(Integer reqLine) {
		this.reqLine = reqLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractReqDetId))
			return false;
		AbstractReqDetId castOther = (AbstractReqDetId) other;

		return ((this.getReqDomain() == castOther.getReqDomain()) || (this
				.getReqDomain() != null
				&& castOther.getReqDomain() != null && this.getReqDomain()
				.equals(castOther.getReqDomain())))
				&& ((this.getReqNbr() == castOther.getReqNbr()) || (this
						.getReqNbr() != null
						&& castOther.getReqNbr() != null && this.getReqNbr()
						.equals(castOther.getReqNbr())))
				&& ((this.getReqLine() == castOther.getReqLine()) || (this
						.getReqLine() != null
						&& castOther.getReqLine() != null && this.getReqLine()
						.equals(castOther.getReqLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getReqDomain() == null ? 0 : this.getReqDomain().hashCode());
		result = 37 * result
				+ (getReqNbr() == null ? 0 : this.getReqNbr().hashCode());
		result = 37 * result
				+ (getReqLine() == null ? 0 : this.getReqLine().hashCode());
		return result;
	}

}