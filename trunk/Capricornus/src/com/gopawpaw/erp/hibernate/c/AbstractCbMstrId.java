package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCbMstrId entity provides the base persistence definition of the
 * CbMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCbMstrId implements java.io.Serializable {

	// Fields

	private String cbDomain;
	private String cbBatch;
	private Integer cbLine;

	// Constructors

	/** default constructor */
	public AbstractCbMstrId() {
	}

	/** minimal constructor */
	public AbstractCbMstrId(String cbDomain) {
		this.cbDomain = cbDomain;
	}

	/** full constructor */
	public AbstractCbMstrId(String cbDomain, String cbBatch, Integer cbLine) {
		this.cbDomain = cbDomain;
		this.cbBatch = cbBatch;
		this.cbLine = cbLine;
	}

	// Property accessors

	public String getCbDomain() {
		return this.cbDomain;
	}

	public void setCbDomain(String cbDomain) {
		this.cbDomain = cbDomain;
	}

	public String getCbBatch() {
		return this.cbBatch;
	}

	public void setCbBatch(String cbBatch) {
		this.cbBatch = cbBatch;
	}

	public Integer getCbLine() {
		return this.cbLine;
	}

	public void setCbLine(Integer cbLine) {
		this.cbLine = cbLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCbMstrId))
			return false;
		AbstractCbMstrId castOther = (AbstractCbMstrId) other;

		return ((this.getCbDomain() == castOther.getCbDomain()) || (this
				.getCbDomain() != null
				&& castOther.getCbDomain() != null && this.getCbDomain()
				.equals(castOther.getCbDomain())))
				&& ((this.getCbBatch() == castOther.getCbBatch()) || (this
						.getCbBatch() != null
						&& castOther.getCbBatch() != null && this.getCbBatch()
						.equals(castOther.getCbBatch())))
				&& ((this.getCbLine() == castOther.getCbLine()) || (this
						.getCbLine() != null
						&& castOther.getCbLine() != null && this.getCbLine()
						.equals(castOther.getCbLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCbDomain() == null ? 0 : this.getCbDomain().hashCode());
		result = 37 * result
				+ (getCbBatch() == null ? 0 : this.getCbBatch().hashCode());
		result = 37 * result
				+ (getCbLine() == null ? 0 : this.getCbLine().hashCode());
		return result;
	}

}