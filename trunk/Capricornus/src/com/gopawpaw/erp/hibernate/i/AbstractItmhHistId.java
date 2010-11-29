package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractItmhHistId entity provides the base persistence definition of the
 * ItmhHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractItmhHistId implements java.io.Serializable {

	// Fields

	private String itmhDomain;
	private String itmhNbr;
	private String itmhPrefix;
	private String itmhType;
	private Integer itmhItmLine;
	private Integer itmhLine;

	// Constructors

	/** default constructor */
	public AbstractItmhHistId() {
	}

	/** minimal constructor */
	public AbstractItmhHistId(String itmhDomain) {
		this.itmhDomain = itmhDomain;
	}

	/** full constructor */
	public AbstractItmhHistId(String itmhDomain, String itmhNbr,
			String itmhPrefix, String itmhType, Integer itmhItmLine,
			Integer itmhLine) {
		this.itmhDomain = itmhDomain;
		this.itmhNbr = itmhNbr;
		this.itmhPrefix = itmhPrefix;
		this.itmhType = itmhType;
		this.itmhItmLine = itmhItmLine;
		this.itmhLine = itmhLine;
	}

	// Property accessors

	public String getItmhDomain() {
		return this.itmhDomain;
	}

	public void setItmhDomain(String itmhDomain) {
		this.itmhDomain = itmhDomain;
	}

	public String getItmhNbr() {
		return this.itmhNbr;
	}

	public void setItmhNbr(String itmhNbr) {
		this.itmhNbr = itmhNbr;
	}

	public String getItmhPrefix() {
		return this.itmhPrefix;
	}

	public void setItmhPrefix(String itmhPrefix) {
		this.itmhPrefix = itmhPrefix;
	}

	public String getItmhType() {
		return this.itmhType;
	}

	public void setItmhType(String itmhType) {
		this.itmhType = itmhType;
	}

	public Integer getItmhItmLine() {
		return this.itmhItmLine;
	}

	public void setItmhItmLine(Integer itmhItmLine) {
		this.itmhItmLine = itmhItmLine;
	}

	public Integer getItmhLine() {
		return this.itmhLine;
	}

	public void setItmhLine(Integer itmhLine) {
		this.itmhLine = itmhLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractItmhHistId))
			return false;
		AbstractItmhHistId castOther = (AbstractItmhHistId) other;

		return ((this.getItmhDomain() == castOther.getItmhDomain()) || (this
				.getItmhDomain() != null
				&& castOther.getItmhDomain() != null && this.getItmhDomain()
				.equals(castOther.getItmhDomain())))
				&& ((this.getItmhNbr() == castOther.getItmhNbr()) || (this
						.getItmhNbr() != null
						&& castOther.getItmhNbr() != null && this.getItmhNbr()
						.equals(castOther.getItmhNbr())))
				&& ((this.getItmhPrefix() == castOther.getItmhPrefix()) || (this
						.getItmhPrefix() != null
						&& castOther.getItmhPrefix() != null && this
						.getItmhPrefix().equals(castOther.getItmhPrefix())))
				&& ((this.getItmhType() == castOther.getItmhType()) || (this
						.getItmhType() != null
						&& castOther.getItmhType() != null && this
						.getItmhType().equals(castOther.getItmhType())))
				&& ((this.getItmhItmLine() == castOther.getItmhItmLine()) || (this
						.getItmhItmLine() != null
						&& castOther.getItmhItmLine() != null && this
						.getItmhItmLine().equals(castOther.getItmhItmLine())))
				&& ((this.getItmhLine() == castOther.getItmhLine()) || (this
						.getItmhLine() != null
						&& castOther.getItmhLine() != null && this
						.getItmhLine().equals(castOther.getItmhLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getItmhDomain() == null ? 0 : this.getItmhDomain()
						.hashCode());
		result = 37 * result
				+ (getItmhNbr() == null ? 0 : this.getItmhNbr().hashCode());
		result = 37
				* result
				+ (getItmhPrefix() == null ? 0 : this.getItmhPrefix()
						.hashCode());
		result = 37 * result
				+ (getItmhType() == null ? 0 : this.getItmhType().hashCode());
		result = 37
				* result
				+ (getItmhItmLine() == null ? 0 : this.getItmhItmLine()
						.hashCode());
		result = 37 * result
				+ (getItmhLine() == null ? 0 : this.getItmhLine().hashCode());
		return result;
	}

}