package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSchMstrId entity provides the base persistence definition of the
 * SchMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSchMstrId implements java.io.Serializable {

	// Fields

	private String schDomain;
	private Integer schType;
	private String schNbr;
	private Integer schLine;
	private String schRlseId;

	// Constructors

	/** default constructor */
	public AbstractSchMstrId() {
	}

	/** minimal constructor */
	public AbstractSchMstrId(String schDomain) {
		this.schDomain = schDomain;
	}

	/** full constructor */
	public AbstractSchMstrId(String schDomain, Integer schType, String schNbr,
			Integer schLine, String schRlseId) {
		this.schDomain = schDomain;
		this.schType = schType;
		this.schNbr = schNbr;
		this.schLine = schLine;
		this.schRlseId = schRlseId;
	}

	// Property accessors

	public String getSchDomain() {
		return this.schDomain;
	}

	public void setSchDomain(String schDomain) {
		this.schDomain = schDomain;
	}

	public Integer getSchType() {
		return this.schType;
	}

	public void setSchType(Integer schType) {
		this.schType = schType;
	}

	public String getSchNbr() {
		return this.schNbr;
	}

	public void setSchNbr(String schNbr) {
		this.schNbr = schNbr;
	}

	public Integer getSchLine() {
		return this.schLine;
	}

	public void setSchLine(Integer schLine) {
		this.schLine = schLine;
	}

	public String getSchRlseId() {
		return this.schRlseId;
	}

	public void setSchRlseId(String schRlseId) {
		this.schRlseId = schRlseId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSchMstrId))
			return false;
		AbstractSchMstrId castOther = (AbstractSchMstrId) other;

		return ((this.getSchDomain() == castOther.getSchDomain()) || (this
				.getSchDomain() != null
				&& castOther.getSchDomain() != null && this.getSchDomain()
				.equals(castOther.getSchDomain())))
				&& ((this.getSchType() == castOther.getSchType()) || (this
						.getSchType() != null
						&& castOther.getSchType() != null && this.getSchType()
						.equals(castOther.getSchType())))
				&& ((this.getSchNbr() == castOther.getSchNbr()) || (this
						.getSchNbr() != null
						&& castOther.getSchNbr() != null && this.getSchNbr()
						.equals(castOther.getSchNbr())))
				&& ((this.getSchLine() == castOther.getSchLine()) || (this
						.getSchLine() != null
						&& castOther.getSchLine() != null && this.getSchLine()
						.equals(castOther.getSchLine())))
				&& ((this.getSchRlseId() == castOther.getSchRlseId()) || (this
						.getSchRlseId() != null
						&& castOther.getSchRlseId() != null && this
						.getSchRlseId().equals(castOther.getSchRlseId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSchDomain() == null ? 0 : this.getSchDomain().hashCode());
		result = 37 * result
				+ (getSchType() == null ? 0 : this.getSchType().hashCode());
		result = 37 * result
				+ (getSchNbr() == null ? 0 : this.getSchNbr().hashCode());
		result = 37 * result
				+ (getSchLine() == null ? 0 : this.getSchLine().hashCode());
		result = 37 * result
				+ (getSchRlseId() == null ? 0 : this.getSchRlseId().hashCode());
		return result;
	}

}