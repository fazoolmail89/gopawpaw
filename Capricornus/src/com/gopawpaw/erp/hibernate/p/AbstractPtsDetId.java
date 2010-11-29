package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPtsDetId entity provides the base persistence definition of the
 * PtsDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtsDetId implements java.io.Serializable {

	// Fields

	private String ptsDomain;
	private String ptsPart;
	private String ptsPar;
	private String ptsSubPart;

	// Constructors

	/** default constructor */
	public AbstractPtsDetId() {
	}

	/** minimal constructor */
	public AbstractPtsDetId(String ptsDomain) {
		this.ptsDomain = ptsDomain;
	}

	/** full constructor */
	public AbstractPtsDetId(String ptsDomain, String ptsPart, String ptsPar,
			String ptsSubPart) {
		this.ptsDomain = ptsDomain;
		this.ptsPart = ptsPart;
		this.ptsPar = ptsPar;
		this.ptsSubPart = ptsSubPart;
	}

	// Property accessors

	public String getPtsDomain() {
		return this.ptsDomain;
	}

	public void setPtsDomain(String ptsDomain) {
		this.ptsDomain = ptsDomain;
	}

	public String getPtsPart() {
		return this.ptsPart;
	}

	public void setPtsPart(String ptsPart) {
		this.ptsPart = ptsPart;
	}

	public String getPtsPar() {
		return this.ptsPar;
	}

	public void setPtsPar(String ptsPar) {
		this.ptsPar = ptsPar;
	}

	public String getPtsSubPart() {
		return this.ptsSubPart;
	}

	public void setPtsSubPart(String ptsSubPart) {
		this.ptsSubPart = ptsSubPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPtsDetId))
			return false;
		AbstractPtsDetId castOther = (AbstractPtsDetId) other;

		return ((this.getPtsDomain() == castOther.getPtsDomain()) || (this
				.getPtsDomain() != null
				&& castOther.getPtsDomain() != null && this.getPtsDomain()
				.equals(castOther.getPtsDomain())))
				&& ((this.getPtsPart() == castOther.getPtsPart()) || (this
						.getPtsPart() != null
						&& castOther.getPtsPart() != null && this.getPtsPart()
						.equals(castOther.getPtsPart())))
				&& ((this.getPtsPar() == castOther.getPtsPar()) || (this
						.getPtsPar() != null
						&& castOther.getPtsPar() != null && this.getPtsPar()
						.equals(castOther.getPtsPar())))
				&& ((this.getPtsSubPart() == castOther.getPtsSubPart()) || (this
						.getPtsSubPart() != null
						&& castOther.getPtsSubPart() != null && this
						.getPtsSubPart().equals(castOther.getPtsSubPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPtsDomain() == null ? 0 : this.getPtsDomain().hashCode());
		result = 37 * result
				+ (getPtsPart() == null ? 0 : this.getPtsPart().hashCode());
		result = 37 * result
				+ (getPtsPar() == null ? 0 : this.getPtsPar().hashCode());
		result = 37
				* result
				+ (getPtsSubPart() == null ? 0 : this.getPtsSubPart()
						.hashCode());
		return result;
	}

}