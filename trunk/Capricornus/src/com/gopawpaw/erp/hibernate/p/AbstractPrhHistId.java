package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPrhHistId entity provides the base persistence definition of the
 * PrhHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPrhHistId implements java.io.Serializable {

	// Fields

	private String prhDomain;
	private String prhNbr;
	private String prhReceiver;
	private Integer prhLine;
	private String prhElement;

	// Constructors

	/** default constructor */
	public AbstractPrhHistId() {
	}

	/** minimal constructor */
	public AbstractPrhHistId(String prhDomain) {
		this.prhDomain = prhDomain;
	}

	/** full constructor */
	public AbstractPrhHistId(String prhDomain, String prhNbr,
			String prhReceiver, Integer prhLine, String prhElement) {
		this.prhDomain = prhDomain;
		this.prhNbr = prhNbr;
		this.prhReceiver = prhReceiver;
		this.prhLine = prhLine;
		this.prhElement = prhElement;
	}

	// Property accessors

	public String getPrhDomain() {
		return this.prhDomain;
	}

	public void setPrhDomain(String prhDomain) {
		this.prhDomain = prhDomain;
	}

	public String getPrhNbr() {
		return this.prhNbr;
	}

	public void setPrhNbr(String prhNbr) {
		this.prhNbr = prhNbr;
	}

	public String getPrhReceiver() {
		return this.prhReceiver;
	}

	public void setPrhReceiver(String prhReceiver) {
		this.prhReceiver = prhReceiver;
	}

	public Integer getPrhLine() {
		return this.prhLine;
	}

	public void setPrhLine(Integer prhLine) {
		this.prhLine = prhLine;
	}

	public String getPrhElement() {
		return this.prhElement;
	}

	public void setPrhElement(String prhElement) {
		this.prhElement = prhElement;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPrhHistId))
			return false;
		AbstractPrhHistId castOther = (AbstractPrhHistId) other;

		return ((this.getPrhDomain() == castOther.getPrhDomain()) || (this
				.getPrhDomain() != null
				&& castOther.getPrhDomain() != null && this.getPrhDomain()
				.equals(castOther.getPrhDomain())))
				&& ((this.getPrhNbr() == castOther.getPrhNbr()) || (this
						.getPrhNbr() != null
						&& castOther.getPrhNbr() != null && this.getPrhNbr()
						.equals(castOther.getPrhNbr())))
				&& ((this.getPrhReceiver() == castOther.getPrhReceiver()) || (this
						.getPrhReceiver() != null
						&& castOther.getPrhReceiver() != null && this
						.getPrhReceiver().equals(castOther.getPrhReceiver())))
				&& ((this.getPrhLine() == castOther.getPrhLine()) || (this
						.getPrhLine() != null
						&& castOther.getPrhLine() != null && this.getPrhLine()
						.equals(castOther.getPrhLine())))
				&& ((this.getPrhElement() == castOther.getPrhElement()) || (this
						.getPrhElement() != null
						&& castOther.getPrhElement() != null && this
						.getPrhElement().equals(castOther.getPrhElement())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPrhDomain() == null ? 0 : this.getPrhDomain().hashCode());
		result = 37 * result
				+ (getPrhNbr() == null ? 0 : this.getPrhNbr().hashCode());
		result = 37
				* result
				+ (getPrhReceiver() == null ? 0 : this.getPrhReceiver()
						.hashCode());
		result = 37 * result
				+ (getPrhLine() == null ? 0 : this.getPrhLine().hashCode());
		result = 37
				* result
				+ (getPrhElement() == null ? 0 : this.getPrhElement()
						.hashCode());
		return result;
	}

}