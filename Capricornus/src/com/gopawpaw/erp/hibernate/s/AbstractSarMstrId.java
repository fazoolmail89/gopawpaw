package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSarMstrId entity provides the base persistence definition of the
 * SarMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSarMstrId implements java.io.Serializable {

	// Fields

	private String sarDomain;
	private String sarNbr;
	private String sarPrefix;
	private Integer sarSadLine;
	private String sarSerial;
	private String sarRef;

	// Constructors

	/** default constructor */
	public AbstractSarMstrId() {
	}

	/** minimal constructor */
	public AbstractSarMstrId(String sarDomain, Integer sarSadLine) {
		this.sarDomain = sarDomain;
		this.sarSadLine = sarSadLine;
	}

	/** full constructor */
	public AbstractSarMstrId(String sarDomain, String sarNbr, String sarPrefix,
			Integer sarSadLine, String sarSerial, String sarRef) {
		this.sarDomain = sarDomain;
		this.sarNbr = sarNbr;
		this.sarPrefix = sarPrefix;
		this.sarSadLine = sarSadLine;
		this.sarSerial = sarSerial;
		this.sarRef = sarRef;
	}

	// Property accessors

	public String getSarDomain() {
		return this.sarDomain;
	}

	public void setSarDomain(String sarDomain) {
		this.sarDomain = sarDomain;
	}

	public String getSarNbr() {
		return this.sarNbr;
	}

	public void setSarNbr(String sarNbr) {
		this.sarNbr = sarNbr;
	}

	public String getSarPrefix() {
		return this.sarPrefix;
	}

	public void setSarPrefix(String sarPrefix) {
		this.sarPrefix = sarPrefix;
	}

	public Integer getSarSadLine() {
		return this.sarSadLine;
	}

	public void setSarSadLine(Integer sarSadLine) {
		this.sarSadLine = sarSadLine;
	}

	public String getSarSerial() {
		return this.sarSerial;
	}

	public void setSarSerial(String sarSerial) {
		this.sarSerial = sarSerial;
	}

	public String getSarRef() {
		return this.sarRef;
	}

	public void setSarRef(String sarRef) {
		this.sarRef = sarRef;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSarMstrId))
			return false;
		AbstractSarMstrId castOther = (AbstractSarMstrId) other;

		return ((this.getSarDomain() == castOther.getSarDomain()) || (this
				.getSarDomain() != null
				&& castOther.getSarDomain() != null && this.getSarDomain()
				.equals(castOther.getSarDomain())))
				&& ((this.getSarNbr() == castOther.getSarNbr()) || (this
						.getSarNbr() != null
						&& castOther.getSarNbr() != null && this.getSarNbr()
						.equals(castOther.getSarNbr())))
				&& ((this.getSarPrefix() == castOther.getSarPrefix()) || (this
						.getSarPrefix() != null
						&& castOther.getSarPrefix() != null && this
						.getSarPrefix().equals(castOther.getSarPrefix())))
				&& ((this.getSarSadLine() == castOther.getSarSadLine()) || (this
						.getSarSadLine() != null
						&& castOther.getSarSadLine() != null && this
						.getSarSadLine().equals(castOther.getSarSadLine())))
				&& ((this.getSarSerial() == castOther.getSarSerial()) || (this
						.getSarSerial() != null
						&& castOther.getSarSerial() != null && this
						.getSarSerial().equals(castOther.getSarSerial())))
				&& ((this.getSarRef() == castOther.getSarRef()) || (this
						.getSarRef() != null
						&& castOther.getSarRef() != null && this.getSarRef()
						.equals(castOther.getSarRef())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSarDomain() == null ? 0 : this.getSarDomain().hashCode());
		result = 37 * result
				+ (getSarNbr() == null ? 0 : this.getSarNbr().hashCode());
		result = 37 * result
				+ (getSarPrefix() == null ? 0 : this.getSarPrefix().hashCode());
		result = 37
				* result
				+ (getSarSadLine() == null ? 0 : this.getSarSadLine()
						.hashCode());
		result = 37 * result
				+ (getSarSerial() == null ? 0 : this.getSarSerial().hashCode());
		result = 37 * result
				+ (getSarRef() == null ? 0 : this.getSarRef().hashCode());
		return result;
	}

}