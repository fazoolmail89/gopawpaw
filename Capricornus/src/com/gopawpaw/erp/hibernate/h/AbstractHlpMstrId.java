package com.gopawpaw.erp.hibernate.h;

/**
 * AbstractHlpMstrId entity provides the base persistence definition of the
 * HlpMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHlpMstrId implements java.io.Serializable {

	// Fields

	private String hlpContextStr;
	private Integer hlpContextNbr;
	private String hlpFile;
	private String hlpUser1;
	private String hlpUser2;
	private String hlpQadc01;
	private Double oidHlpMstr;

	// Constructors

	/** default constructor */
	public AbstractHlpMstrId() {
	}

	/** minimal constructor */
	public AbstractHlpMstrId(String hlpFile, Double oidHlpMstr) {
		this.hlpFile = hlpFile;
		this.oidHlpMstr = oidHlpMstr;
	}

	/** full constructor */
	public AbstractHlpMstrId(String hlpContextStr, Integer hlpContextNbr,
			String hlpFile, String hlpUser1, String hlpUser2, String hlpQadc01,
			Double oidHlpMstr) {
		this.hlpContextStr = hlpContextStr;
		this.hlpContextNbr = hlpContextNbr;
		this.hlpFile = hlpFile;
		this.hlpUser1 = hlpUser1;
		this.hlpUser2 = hlpUser2;
		this.hlpQadc01 = hlpQadc01;
		this.oidHlpMstr = oidHlpMstr;
	}

	// Property accessors

	public String getHlpContextStr() {
		return this.hlpContextStr;
	}

	public void setHlpContextStr(String hlpContextStr) {
		this.hlpContextStr = hlpContextStr;
	}

	public Integer getHlpContextNbr() {
		return this.hlpContextNbr;
	}

	public void setHlpContextNbr(Integer hlpContextNbr) {
		this.hlpContextNbr = hlpContextNbr;
	}

	public String getHlpFile() {
		return this.hlpFile;
	}

	public void setHlpFile(String hlpFile) {
		this.hlpFile = hlpFile;
	}

	public String getHlpUser1() {
		return this.hlpUser1;
	}

	public void setHlpUser1(String hlpUser1) {
		this.hlpUser1 = hlpUser1;
	}

	public String getHlpUser2() {
		return this.hlpUser2;
	}

	public void setHlpUser2(String hlpUser2) {
		this.hlpUser2 = hlpUser2;
	}

	public String getHlpQadc01() {
		return this.hlpQadc01;
	}

	public void setHlpQadc01(String hlpQadc01) {
		this.hlpQadc01 = hlpQadc01;
	}

	public Double getOidHlpMstr() {
		return this.oidHlpMstr;
	}

	public void setOidHlpMstr(Double oidHlpMstr) {
		this.oidHlpMstr = oidHlpMstr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHlpMstrId))
			return false;
		AbstractHlpMstrId castOther = (AbstractHlpMstrId) other;

		return ((this.getHlpContextStr() == castOther.getHlpContextStr()) || (this
				.getHlpContextStr() != null
				&& castOther.getHlpContextStr() != null && this
				.getHlpContextStr().equals(castOther.getHlpContextStr())))
				&& ((this.getHlpContextNbr() == castOther.getHlpContextNbr()) || (this
						.getHlpContextNbr() != null
						&& castOther.getHlpContextNbr() != null && this
						.getHlpContextNbr()
						.equals(castOther.getHlpContextNbr())))
				&& ((this.getHlpFile() == castOther.getHlpFile()) || (this
						.getHlpFile() != null
						&& castOther.getHlpFile() != null && this.getHlpFile()
						.equals(castOther.getHlpFile())))
				&& ((this.getHlpUser1() == castOther.getHlpUser1()) || (this
						.getHlpUser1() != null
						&& castOther.getHlpUser1() != null && this
						.getHlpUser1().equals(castOther.getHlpUser1())))
				&& ((this.getHlpUser2() == castOther.getHlpUser2()) || (this
						.getHlpUser2() != null
						&& castOther.getHlpUser2() != null && this
						.getHlpUser2().equals(castOther.getHlpUser2())))
				&& ((this.getHlpQadc01() == castOther.getHlpQadc01()) || (this
						.getHlpQadc01() != null
						&& castOther.getHlpQadc01() != null && this
						.getHlpQadc01().equals(castOther.getHlpQadc01())))
				&& ((this.getOidHlpMstr() == castOther.getOidHlpMstr()) || (this
						.getOidHlpMstr() != null
						&& castOther.getOidHlpMstr() != null && this
						.getOidHlpMstr().equals(castOther.getOidHlpMstr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getHlpContextStr() == null ? 0 : this.getHlpContextStr()
						.hashCode());
		result = 37
				* result
				+ (getHlpContextNbr() == null ? 0 : this.getHlpContextNbr()
						.hashCode());
		result = 37 * result
				+ (getHlpFile() == null ? 0 : this.getHlpFile().hashCode());
		result = 37 * result
				+ (getHlpUser1() == null ? 0 : this.getHlpUser1().hashCode());
		result = 37 * result
				+ (getHlpUser2() == null ? 0 : this.getHlpUser2().hashCode());
		result = 37 * result
				+ (getHlpQadc01() == null ? 0 : this.getHlpQadc01().hashCode());
		result = 37
				* result
				+ (getOidHlpMstr() == null ? 0 : this.getOidHlpMstr()
						.hashCode());
		return result;
	}

}