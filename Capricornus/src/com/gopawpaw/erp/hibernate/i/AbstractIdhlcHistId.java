package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIdhlcHistId entity provides the base persistence definition of the
 * IdhlcHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIdhlcHistId implements java.io.Serializable {

	// Fields

	private String idhlcDomain;
	private String idhlcInvNbr;
	private String idhlcNbr;
	private Integer idhlcLine;
	private Integer idhlcSubLine;

	// Constructors

	/** default constructor */
	public AbstractIdhlcHistId() {
	}

	/** full constructor */
	public AbstractIdhlcHistId(String idhlcDomain, String idhlcInvNbr,
			String idhlcNbr, Integer idhlcLine, Integer idhlcSubLine) {
		this.idhlcDomain = idhlcDomain;
		this.idhlcInvNbr = idhlcInvNbr;
		this.idhlcNbr = idhlcNbr;
		this.idhlcLine = idhlcLine;
		this.idhlcSubLine = idhlcSubLine;
	}

	// Property accessors

	public String getIdhlcDomain() {
		return this.idhlcDomain;
	}

	public void setIdhlcDomain(String idhlcDomain) {
		this.idhlcDomain = idhlcDomain;
	}

	public String getIdhlcInvNbr() {
		return this.idhlcInvNbr;
	}

	public void setIdhlcInvNbr(String idhlcInvNbr) {
		this.idhlcInvNbr = idhlcInvNbr;
	}

	public String getIdhlcNbr() {
		return this.idhlcNbr;
	}

	public void setIdhlcNbr(String idhlcNbr) {
		this.idhlcNbr = idhlcNbr;
	}

	public Integer getIdhlcLine() {
		return this.idhlcLine;
	}

	public void setIdhlcLine(Integer idhlcLine) {
		this.idhlcLine = idhlcLine;
	}

	public Integer getIdhlcSubLine() {
		return this.idhlcSubLine;
	}

	public void setIdhlcSubLine(Integer idhlcSubLine) {
		this.idhlcSubLine = idhlcSubLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIdhlcHistId))
			return false;
		AbstractIdhlcHistId castOther = (AbstractIdhlcHistId) other;

		return ((this.getIdhlcDomain() == castOther.getIdhlcDomain()) || (this
				.getIdhlcDomain() != null
				&& castOther.getIdhlcDomain() != null && this.getIdhlcDomain()
				.equals(castOther.getIdhlcDomain())))
				&& ((this.getIdhlcInvNbr() == castOther.getIdhlcInvNbr()) || (this
						.getIdhlcInvNbr() != null
						&& castOther.getIdhlcInvNbr() != null && this
						.getIdhlcInvNbr().equals(castOther.getIdhlcInvNbr())))
				&& ((this.getIdhlcNbr() == castOther.getIdhlcNbr()) || (this
						.getIdhlcNbr() != null
						&& castOther.getIdhlcNbr() != null && this
						.getIdhlcNbr().equals(castOther.getIdhlcNbr())))
				&& ((this.getIdhlcLine() == castOther.getIdhlcLine()) || (this
						.getIdhlcLine() != null
						&& castOther.getIdhlcLine() != null && this
						.getIdhlcLine().equals(castOther.getIdhlcLine())))
				&& ((this.getIdhlcSubLine() == castOther.getIdhlcSubLine()) || (this
						.getIdhlcSubLine() != null
						&& castOther.getIdhlcSubLine() != null && this
						.getIdhlcSubLine().equals(castOther.getIdhlcSubLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getIdhlcDomain() == null ? 0 : this.getIdhlcDomain()
						.hashCode());
		result = 37
				* result
				+ (getIdhlcInvNbr() == null ? 0 : this.getIdhlcInvNbr()
						.hashCode());
		result = 37 * result
				+ (getIdhlcNbr() == null ? 0 : this.getIdhlcNbr().hashCode());
		result = 37 * result
				+ (getIdhlcLine() == null ? 0 : this.getIdhlcLine().hashCode());
		result = 37
				* result
				+ (getIdhlcSubLine() == null ? 0 : this.getIdhlcSubLine()
						.hashCode());
		return result;
	}

}