package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRdfMstrId entity provides the base persistence definition of the
 * RdfMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRdfMstrId implements java.io.Serializable {

	// Fields

	private String rdfDomain;
	private String rdfProdLine;
	private String rdfSvcGroup;
	private String rdfCaIntType;
	private String rdfPart;
	private String rdfArea;

	// Constructors

	/** default constructor */
	public AbstractRdfMstrId() {
	}

	/** minimal constructor */
	public AbstractRdfMstrId(String rdfDomain) {
		this.rdfDomain = rdfDomain;
	}

	/** full constructor */
	public AbstractRdfMstrId(String rdfDomain, String rdfProdLine,
			String rdfSvcGroup, String rdfCaIntType, String rdfPart,
			String rdfArea) {
		this.rdfDomain = rdfDomain;
		this.rdfProdLine = rdfProdLine;
		this.rdfSvcGroup = rdfSvcGroup;
		this.rdfCaIntType = rdfCaIntType;
		this.rdfPart = rdfPart;
		this.rdfArea = rdfArea;
	}

	// Property accessors

	public String getRdfDomain() {
		return this.rdfDomain;
	}

	public void setRdfDomain(String rdfDomain) {
		this.rdfDomain = rdfDomain;
	}

	public String getRdfProdLine() {
		return this.rdfProdLine;
	}

	public void setRdfProdLine(String rdfProdLine) {
		this.rdfProdLine = rdfProdLine;
	}

	public String getRdfSvcGroup() {
		return this.rdfSvcGroup;
	}

	public void setRdfSvcGroup(String rdfSvcGroup) {
		this.rdfSvcGroup = rdfSvcGroup;
	}

	public String getRdfCaIntType() {
		return this.rdfCaIntType;
	}

	public void setRdfCaIntType(String rdfCaIntType) {
		this.rdfCaIntType = rdfCaIntType;
	}

	public String getRdfPart() {
		return this.rdfPart;
	}

	public void setRdfPart(String rdfPart) {
		this.rdfPart = rdfPart;
	}

	public String getRdfArea() {
		return this.rdfArea;
	}

	public void setRdfArea(String rdfArea) {
		this.rdfArea = rdfArea;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRdfMstrId))
			return false;
		AbstractRdfMstrId castOther = (AbstractRdfMstrId) other;

		return ((this.getRdfDomain() == castOther.getRdfDomain()) || (this
				.getRdfDomain() != null
				&& castOther.getRdfDomain() != null && this.getRdfDomain()
				.equals(castOther.getRdfDomain())))
				&& ((this.getRdfProdLine() == castOther.getRdfProdLine()) || (this
						.getRdfProdLine() != null
						&& castOther.getRdfProdLine() != null && this
						.getRdfProdLine().equals(castOther.getRdfProdLine())))
				&& ((this.getRdfSvcGroup() == castOther.getRdfSvcGroup()) || (this
						.getRdfSvcGroup() != null
						&& castOther.getRdfSvcGroup() != null && this
						.getRdfSvcGroup().equals(castOther.getRdfSvcGroup())))
				&& ((this.getRdfCaIntType() == castOther.getRdfCaIntType()) || (this
						.getRdfCaIntType() != null
						&& castOther.getRdfCaIntType() != null && this
						.getRdfCaIntType().equals(castOther.getRdfCaIntType())))
				&& ((this.getRdfPart() == castOther.getRdfPart()) || (this
						.getRdfPart() != null
						&& castOther.getRdfPart() != null && this.getRdfPart()
						.equals(castOther.getRdfPart())))
				&& ((this.getRdfArea() == castOther.getRdfArea()) || (this
						.getRdfArea() != null
						&& castOther.getRdfArea() != null && this.getRdfArea()
						.equals(castOther.getRdfArea())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRdfDomain() == null ? 0 : this.getRdfDomain().hashCode());
		result = 37
				* result
				+ (getRdfProdLine() == null ? 0 : this.getRdfProdLine()
						.hashCode());
		result = 37
				* result
				+ (getRdfSvcGroup() == null ? 0 : this.getRdfSvcGroup()
						.hashCode());
		result = 37
				* result
				+ (getRdfCaIntType() == null ? 0 : this.getRdfCaIntType()
						.hashCode());
		result = 37 * result
				+ (getRdfPart() == null ? 0 : this.getRdfPart().hashCode());
		result = 37 * result
				+ (getRdfArea() == null ? 0 : this.getRdfArea().hashCode());
		return result;
	}

}