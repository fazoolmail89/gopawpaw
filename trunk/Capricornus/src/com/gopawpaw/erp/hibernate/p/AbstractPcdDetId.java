package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPcdDetId entity provides the base persistence definition of the
 * PcdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPcdDetId implements java.io.Serializable {

	// Fields

	private String pcdDomain;
	private String pcdNbr;
	private Integer pcdLine;
	private String pcdElement;

	// Constructors

	/** default constructor */
	public AbstractPcdDetId() {
	}

	/** minimal constructor */
	public AbstractPcdDetId(String pcdDomain, String pcdNbr) {
		this.pcdDomain = pcdDomain;
		this.pcdNbr = pcdNbr;
	}

	/** full constructor */
	public AbstractPcdDetId(String pcdDomain, String pcdNbr, Integer pcdLine,
			String pcdElement) {
		this.pcdDomain = pcdDomain;
		this.pcdNbr = pcdNbr;
		this.pcdLine = pcdLine;
		this.pcdElement = pcdElement;
	}

	// Property accessors

	public String getPcdDomain() {
		return this.pcdDomain;
	}

	public void setPcdDomain(String pcdDomain) {
		this.pcdDomain = pcdDomain;
	}

	public String getPcdNbr() {
		return this.pcdNbr;
	}

	public void setPcdNbr(String pcdNbr) {
		this.pcdNbr = pcdNbr;
	}

	public Integer getPcdLine() {
		return this.pcdLine;
	}

	public void setPcdLine(Integer pcdLine) {
		this.pcdLine = pcdLine;
	}

	public String getPcdElement() {
		return this.pcdElement;
	}

	public void setPcdElement(String pcdElement) {
		this.pcdElement = pcdElement;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPcdDetId))
			return false;
		AbstractPcdDetId castOther = (AbstractPcdDetId) other;

		return ((this.getPcdDomain() == castOther.getPcdDomain()) || (this
				.getPcdDomain() != null
				&& castOther.getPcdDomain() != null && this.getPcdDomain()
				.equals(castOther.getPcdDomain())))
				&& ((this.getPcdNbr() == castOther.getPcdNbr()) || (this
						.getPcdNbr() != null
						&& castOther.getPcdNbr() != null && this.getPcdNbr()
						.equals(castOther.getPcdNbr())))
				&& ((this.getPcdLine() == castOther.getPcdLine()) || (this
						.getPcdLine() != null
						&& castOther.getPcdLine() != null && this.getPcdLine()
						.equals(castOther.getPcdLine())))
				&& ((this.getPcdElement() == castOther.getPcdElement()) || (this
						.getPcdElement() != null
						&& castOther.getPcdElement() != null && this
						.getPcdElement().equals(castOther.getPcdElement())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPcdDomain() == null ? 0 : this.getPcdDomain().hashCode());
		result = 37 * result
				+ (getPcdNbr() == null ? 0 : this.getPcdNbr().hashCode());
		result = 37 * result
				+ (getPcdLine() == null ? 0 : this.getPcdLine().hashCode());
		result = 37
				* result
				+ (getPcdElement() == null ? 0 : this.getPcdElement()
						.hashCode());
		return result;
	}

}