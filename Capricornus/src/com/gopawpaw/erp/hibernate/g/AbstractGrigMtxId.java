package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrigMtxId entity provides the base persistence definition of the
 * GrigMtxId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrigMtxId implements java.io.Serializable {

	// Fields

	private String grigDomain;
	private Integer grigRunId;
	private String grigBrkGp;
	private Integer grigRow;
	private Integer grigLine;
	private Integer grigStl;
	private Integer grigCol;

	// Constructors

	/** default constructor */
	public AbstractGrigMtxId() {
	}

	/** minimal constructor */
	public AbstractGrigMtxId(String grigDomain) {
		this.grigDomain = grigDomain;
	}

	/** full constructor */
	public AbstractGrigMtxId(String grigDomain, Integer grigRunId,
			String grigBrkGp, Integer grigRow, Integer grigLine,
			Integer grigStl, Integer grigCol) {
		this.grigDomain = grigDomain;
		this.grigRunId = grigRunId;
		this.grigBrkGp = grigBrkGp;
		this.grigRow = grigRow;
		this.grigLine = grigLine;
		this.grigStl = grigStl;
		this.grigCol = grigCol;
	}

	// Property accessors

	public String getGrigDomain() {
		return this.grigDomain;
	}

	public void setGrigDomain(String grigDomain) {
		this.grigDomain = grigDomain;
	}

	public Integer getGrigRunId() {
		return this.grigRunId;
	}

	public void setGrigRunId(Integer grigRunId) {
		this.grigRunId = grigRunId;
	}

	public String getGrigBrkGp() {
		return this.grigBrkGp;
	}

	public void setGrigBrkGp(String grigBrkGp) {
		this.grigBrkGp = grigBrkGp;
	}

	public Integer getGrigRow() {
		return this.grigRow;
	}

	public void setGrigRow(Integer grigRow) {
		this.grigRow = grigRow;
	}

	public Integer getGrigLine() {
		return this.grigLine;
	}

	public void setGrigLine(Integer grigLine) {
		this.grigLine = grigLine;
	}

	public Integer getGrigStl() {
		return this.grigStl;
	}

	public void setGrigStl(Integer grigStl) {
		this.grigStl = grigStl;
	}

	public Integer getGrigCol() {
		return this.grigCol;
	}

	public void setGrigCol(Integer grigCol) {
		this.grigCol = grigCol;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrigMtxId))
			return false;
		AbstractGrigMtxId castOther = (AbstractGrigMtxId) other;

		return ((this.getGrigDomain() == castOther.getGrigDomain()) || (this
				.getGrigDomain() != null
				&& castOther.getGrigDomain() != null && this.getGrigDomain()
				.equals(castOther.getGrigDomain())))
				&& ((this.getGrigRunId() == castOther.getGrigRunId()) || (this
						.getGrigRunId() != null
						&& castOther.getGrigRunId() != null && this
						.getGrigRunId().equals(castOther.getGrigRunId())))
				&& ((this.getGrigBrkGp() == castOther.getGrigBrkGp()) || (this
						.getGrigBrkGp() != null
						&& castOther.getGrigBrkGp() != null && this
						.getGrigBrkGp().equals(castOther.getGrigBrkGp())))
				&& ((this.getGrigRow() == castOther.getGrigRow()) || (this
						.getGrigRow() != null
						&& castOther.getGrigRow() != null && this.getGrigRow()
						.equals(castOther.getGrigRow())))
				&& ((this.getGrigLine() == castOther.getGrigLine()) || (this
						.getGrigLine() != null
						&& castOther.getGrigLine() != null && this
						.getGrigLine().equals(castOther.getGrigLine())))
				&& ((this.getGrigStl() == castOther.getGrigStl()) || (this
						.getGrigStl() != null
						&& castOther.getGrigStl() != null && this.getGrigStl()
						.equals(castOther.getGrigStl())))
				&& ((this.getGrigCol() == castOther.getGrigCol()) || (this
						.getGrigCol() != null
						&& castOther.getGrigCol() != null && this.getGrigCol()
						.equals(castOther.getGrigCol())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGrigDomain() == null ? 0 : this.getGrigDomain()
						.hashCode());
		result = 37 * result
				+ (getGrigRunId() == null ? 0 : this.getGrigRunId().hashCode());
		result = 37 * result
				+ (getGrigBrkGp() == null ? 0 : this.getGrigBrkGp().hashCode());
		result = 37 * result
				+ (getGrigRow() == null ? 0 : this.getGrigRow().hashCode());
		result = 37 * result
				+ (getGrigLine() == null ? 0 : this.getGrigLine().hashCode());
		result = 37 * result
				+ (getGrigStl() == null ? 0 : this.getGrigStl().hashCode());
		result = 37 * result
				+ (getGrigCol() == null ? 0 : this.getGrigCol().hashCode());
		return result;
	}

}