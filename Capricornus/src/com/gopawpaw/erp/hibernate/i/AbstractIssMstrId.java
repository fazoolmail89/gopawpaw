package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIssMstrId entity provides the base persistence definition of the
 * IssMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIssMstrId implements java.io.Serializable {

	// Fields

	private String issDomain;
	private String issEuNbr;
	private String issPar;
	private String issParSer;
	private Integer issParRef;
	private String issComp;
	private String issCompSer;
	private Integer issCompRef;

	// Constructors

	/** default constructor */
	public AbstractIssMstrId() {
	}

	/** minimal constructor */
	public AbstractIssMstrId(String issDomain) {
		this.issDomain = issDomain;
	}

	/** full constructor */
	public AbstractIssMstrId(String issDomain, String issEuNbr, String issPar,
			String issParSer, Integer issParRef, String issComp,
			String issCompSer, Integer issCompRef) {
		this.issDomain = issDomain;
		this.issEuNbr = issEuNbr;
		this.issPar = issPar;
		this.issParSer = issParSer;
		this.issParRef = issParRef;
		this.issComp = issComp;
		this.issCompSer = issCompSer;
		this.issCompRef = issCompRef;
	}

	// Property accessors

	public String getIssDomain() {
		return this.issDomain;
	}

	public void setIssDomain(String issDomain) {
		this.issDomain = issDomain;
	}

	public String getIssEuNbr() {
		return this.issEuNbr;
	}

	public void setIssEuNbr(String issEuNbr) {
		this.issEuNbr = issEuNbr;
	}

	public String getIssPar() {
		return this.issPar;
	}

	public void setIssPar(String issPar) {
		this.issPar = issPar;
	}

	public String getIssParSer() {
		return this.issParSer;
	}

	public void setIssParSer(String issParSer) {
		this.issParSer = issParSer;
	}

	public Integer getIssParRef() {
		return this.issParRef;
	}

	public void setIssParRef(Integer issParRef) {
		this.issParRef = issParRef;
	}

	public String getIssComp() {
		return this.issComp;
	}

	public void setIssComp(String issComp) {
		this.issComp = issComp;
	}

	public String getIssCompSer() {
		return this.issCompSer;
	}

	public void setIssCompSer(String issCompSer) {
		this.issCompSer = issCompSer;
	}

	public Integer getIssCompRef() {
		return this.issCompRef;
	}

	public void setIssCompRef(Integer issCompRef) {
		this.issCompRef = issCompRef;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIssMstrId))
			return false;
		AbstractIssMstrId castOther = (AbstractIssMstrId) other;

		return ((this.getIssDomain() == castOther.getIssDomain()) || (this
				.getIssDomain() != null
				&& castOther.getIssDomain() != null && this.getIssDomain()
				.equals(castOther.getIssDomain())))
				&& ((this.getIssEuNbr() == castOther.getIssEuNbr()) || (this
						.getIssEuNbr() != null
						&& castOther.getIssEuNbr() != null && this
						.getIssEuNbr().equals(castOther.getIssEuNbr())))
				&& ((this.getIssPar() == castOther.getIssPar()) || (this
						.getIssPar() != null
						&& castOther.getIssPar() != null && this.getIssPar()
						.equals(castOther.getIssPar())))
				&& ((this.getIssParSer() == castOther.getIssParSer()) || (this
						.getIssParSer() != null
						&& castOther.getIssParSer() != null && this
						.getIssParSer().equals(castOther.getIssParSer())))
				&& ((this.getIssParRef() == castOther.getIssParRef()) || (this
						.getIssParRef() != null
						&& castOther.getIssParRef() != null && this
						.getIssParRef().equals(castOther.getIssParRef())))
				&& ((this.getIssComp() == castOther.getIssComp()) || (this
						.getIssComp() != null
						&& castOther.getIssComp() != null && this.getIssComp()
						.equals(castOther.getIssComp())))
				&& ((this.getIssCompSer() == castOther.getIssCompSer()) || (this
						.getIssCompSer() != null
						&& castOther.getIssCompSer() != null && this
						.getIssCompSer().equals(castOther.getIssCompSer())))
				&& ((this.getIssCompRef() == castOther.getIssCompRef()) || (this
						.getIssCompRef() != null
						&& castOther.getIssCompRef() != null && this
						.getIssCompRef().equals(castOther.getIssCompRef())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIssDomain() == null ? 0 : this.getIssDomain().hashCode());
		result = 37 * result
				+ (getIssEuNbr() == null ? 0 : this.getIssEuNbr().hashCode());
		result = 37 * result
				+ (getIssPar() == null ? 0 : this.getIssPar().hashCode());
		result = 37 * result
				+ (getIssParSer() == null ? 0 : this.getIssParSer().hashCode());
		result = 37 * result
				+ (getIssParRef() == null ? 0 : this.getIssParRef().hashCode());
		result = 37 * result
				+ (getIssComp() == null ? 0 : this.getIssComp().hashCode());
		result = 37
				* result
				+ (getIssCompSer() == null ? 0 : this.getIssCompSer()
						.hashCode());
		result = 37
				* result
				+ (getIssCompRef() == null ? 0 : this.getIssCompRef()
						.hashCode());
		return result;
	}

}