package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSorMstrId entity provides the base persistence definition of the
 * SorMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSorMstrId implements java.io.Serializable {

	// Fields

	private String sorDomain;
	private String sorNbr;
	private Integer sorSeq;

	// Constructors

	/** default constructor */
	public AbstractSorMstrId() {
	}

	/** minimal constructor */
	public AbstractSorMstrId(String sorDomain) {
		this.sorDomain = sorDomain;
	}

	/** full constructor */
	public AbstractSorMstrId(String sorDomain, String sorNbr, Integer sorSeq) {
		this.sorDomain = sorDomain;
		this.sorNbr = sorNbr;
		this.sorSeq = sorSeq;
	}

	// Property accessors

	public String getSorDomain() {
		return this.sorDomain;
	}

	public void setSorDomain(String sorDomain) {
		this.sorDomain = sorDomain;
	}

	public String getSorNbr() {
		return this.sorNbr;
	}

	public void setSorNbr(String sorNbr) {
		this.sorNbr = sorNbr;
	}

	public Integer getSorSeq() {
		return this.sorSeq;
	}

	public void setSorSeq(Integer sorSeq) {
		this.sorSeq = sorSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSorMstrId))
			return false;
		AbstractSorMstrId castOther = (AbstractSorMstrId) other;

		return ((this.getSorDomain() == castOther.getSorDomain()) || (this
				.getSorDomain() != null
				&& castOther.getSorDomain() != null && this.getSorDomain()
				.equals(castOther.getSorDomain())))
				&& ((this.getSorNbr() == castOther.getSorNbr()) || (this
						.getSorNbr() != null
						&& castOther.getSorNbr() != null && this.getSorNbr()
						.equals(castOther.getSorNbr())))
				&& ((this.getSorSeq() == castOther.getSorSeq()) || (this
						.getSorSeq() != null
						&& castOther.getSorSeq() != null && this.getSorSeq()
						.equals(castOther.getSorSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSorDomain() == null ? 0 : this.getSorDomain().hashCode());
		result = 37 * result
				+ (getSorNbr() == null ? 0 : this.getSorNbr().hashCode());
		result = 37 * result
				+ (getSorSeq() == null ? 0 : this.getSorSeq().hashCode());
		return result;
	}

}