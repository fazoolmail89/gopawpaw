package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCksdDetId entity provides the base persistence definition of the
 * CksdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCksdDetId implements java.io.Serializable {

	// Fields

	private String cksdDomain;
	private String cksdBatch;
	private Integer cksdLine;
	private Integer cksdNbr;

	// Constructors

	/** default constructor */
	public AbstractCksdDetId() {
	}

	/** minimal constructor */
	public AbstractCksdDetId(String cksdDomain) {
		this.cksdDomain = cksdDomain;
	}

	/** full constructor */
	public AbstractCksdDetId(String cksdDomain, String cksdBatch,
			Integer cksdLine, Integer cksdNbr) {
		this.cksdDomain = cksdDomain;
		this.cksdBatch = cksdBatch;
		this.cksdLine = cksdLine;
		this.cksdNbr = cksdNbr;
	}

	// Property accessors

	public String getCksdDomain() {
		return this.cksdDomain;
	}

	public void setCksdDomain(String cksdDomain) {
		this.cksdDomain = cksdDomain;
	}

	public String getCksdBatch() {
		return this.cksdBatch;
	}

	public void setCksdBatch(String cksdBatch) {
		this.cksdBatch = cksdBatch;
	}

	public Integer getCksdLine() {
		return this.cksdLine;
	}

	public void setCksdLine(Integer cksdLine) {
		this.cksdLine = cksdLine;
	}

	public Integer getCksdNbr() {
		return this.cksdNbr;
	}

	public void setCksdNbr(Integer cksdNbr) {
		this.cksdNbr = cksdNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCksdDetId))
			return false;
		AbstractCksdDetId castOther = (AbstractCksdDetId) other;

		return ((this.getCksdDomain() == castOther.getCksdDomain()) || (this
				.getCksdDomain() != null
				&& castOther.getCksdDomain() != null && this.getCksdDomain()
				.equals(castOther.getCksdDomain())))
				&& ((this.getCksdBatch() == castOther.getCksdBatch()) || (this
						.getCksdBatch() != null
						&& castOther.getCksdBatch() != null && this
						.getCksdBatch().equals(castOther.getCksdBatch())))
				&& ((this.getCksdLine() == castOther.getCksdLine()) || (this
						.getCksdLine() != null
						&& castOther.getCksdLine() != null && this
						.getCksdLine().equals(castOther.getCksdLine())))
				&& ((this.getCksdNbr() == castOther.getCksdNbr()) || (this
						.getCksdNbr() != null
						&& castOther.getCksdNbr() != null && this.getCksdNbr()
						.equals(castOther.getCksdNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCksdDomain() == null ? 0 : this.getCksdDomain()
						.hashCode());
		result = 37 * result
				+ (getCksdBatch() == null ? 0 : this.getCksdBatch().hashCode());
		result = 37 * result
				+ (getCksdLine() == null ? 0 : this.getCksdLine().hashCode());
		result = 37 * result
				+ (getCksdNbr() == null ? 0 : this.getCksdNbr().hashCode());
		return result;
	}

}