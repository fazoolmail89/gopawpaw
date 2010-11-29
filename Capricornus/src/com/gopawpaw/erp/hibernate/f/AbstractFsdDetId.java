package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFsdDetId entity provides the base persistence definition of the
 * FsdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFsdDetId implements java.io.Serializable {

	// Fields

	private String fsdDomain;
	private String fsdNbr;
	private String fsdFile;
	private Integer fsdFileLine;
	private String fsdPart;
	private Integer fsdLine;

	// Constructors

	/** default constructor */
	public AbstractFsdDetId() {
	}

	/** minimal constructor */
	public AbstractFsdDetId(String fsdDomain) {
		this.fsdDomain = fsdDomain;
	}

	/** full constructor */
	public AbstractFsdDetId(String fsdDomain, String fsdNbr, String fsdFile,
			Integer fsdFileLine, String fsdPart, Integer fsdLine) {
		this.fsdDomain = fsdDomain;
		this.fsdNbr = fsdNbr;
		this.fsdFile = fsdFile;
		this.fsdFileLine = fsdFileLine;
		this.fsdPart = fsdPart;
		this.fsdLine = fsdLine;
	}

	// Property accessors

	public String getFsdDomain() {
		return this.fsdDomain;
	}

	public void setFsdDomain(String fsdDomain) {
		this.fsdDomain = fsdDomain;
	}

	public String getFsdNbr() {
		return this.fsdNbr;
	}

	public void setFsdNbr(String fsdNbr) {
		this.fsdNbr = fsdNbr;
	}

	public String getFsdFile() {
		return this.fsdFile;
	}

	public void setFsdFile(String fsdFile) {
		this.fsdFile = fsdFile;
	}

	public Integer getFsdFileLine() {
		return this.fsdFileLine;
	}

	public void setFsdFileLine(Integer fsdFileLine) {
		this.fsdFileLine = fsdFileLine;
	}

	public String getFsdPart() {
		return this.fsdPart;
	}

	public void setFsdPart(String fsdPart) {
		this.fsdPart = fsdPart;
	}

	public Integer getFsdLine() {
		return this.fsdLine;
	}

	public void setFsdLine(Integer fsdLine) {
		this.fsdLine = fsdLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFsdDetId))
			return false;
		AbstractFsdDetId castOther = (AbstractFsdDetId) other;

		return ((this.getFsdDomain() == castOther.getFsdDomain()) || (this
				.getFsdDomain() != null
				&& castOther.getFsdDomain() != null && this.getFsdDomain()
				.equals(castOther.getFsdDomain())))
				&& ((this.getFsdNbr() == castOther.getFsdNbr()) || (this
						.getFsdNbr() != null
						&& castOther.getFsdNbr() != null && this.getFsdNbr()
						.equals(castOther.getFsdNbr())))
				&& ((this.getFsdFile() == castOther.getFsdFile()) || (this
						.getFsdFile() != null
						&& castOther.getFsdFile() != null && this.getFsdFile()
						.equals(castOther.getFsdFile())))
				&& ((this.getFsdFileLine() == castOther.getFsdFileLine()) || (this
						.getFsdFileLine() != null
						&& castOther.getFsdFileLine() != null && this
						.getFsdFileLine().equals(castOther.getFsdFileLine())))
				&& ((this.getFsdPart() == castOther.getFsdPart()) || (this
						.getFsdPart() != null
						&& castOther.getFsdPart() != null && this.getFsdPart()
						.equals(castOther.getFsdPart())))
				&& ((this.getFsdLine() == castOther.getFsdLine()) || (this
						.getFsdLine() != null
						&& castOther.getFsdLine() != null && this.getFsdLine()
						.equals(castOther.getFsdLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFsdDomain() == null ? 0 : this.getFsdDomain().hashCode());
		result = 37 * result
				+ (getFsdNbr() == null ? 0 : this.getFsdNbr().hashCode());
		result = 37 * result
				+ (getFsdFile() == null ? 0 : this.getFsdFile().hashCode());
		result = 37
				* result
				+ (getFsdFileLine() == null ? 0 : this.getFsdFileLine()
						.hashCode());
		result = 37 * result
				+ (getFsdPart() == null ? 0 : this.getFsdPart().hashCode());
		result = 37 * result
				+ (getFsdLine() == null ? 0 : this.getFsdLine().hashCode());
		return result;
	}

}