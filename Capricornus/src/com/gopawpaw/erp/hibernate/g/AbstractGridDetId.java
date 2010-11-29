package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGridDetId entity provides the base persistence definition of the
 * GridDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGridDetId implements java.io.Serializable {

	// Fields

	private String gridDomain;
	private Integer gridRunId;
	private Integer gridRow;
	private Integer gridLine;
	private Integer gridStl;

	// Constructors

	/** default constructor */
	public AbstractGridDetId() {
	}

	/** minimal constructor */
	public AbstractGridDetId(String gridDomain) {
		this.gridDomain = gridDomain;
	}

	/** full constructor */
	public AbstractGridDetId(String gridDomain, Integer gridRunId,
			Integer gridRow, Integer gridLine, Integer gridStl) {
		this.gridDomain = gridDomain;
		this.gridRunId = gridRunId;
		this.gridRow = gridRow;
		this.gridLine = gridLine;
		this.gridStl = gridStl;
	}

	// Property accessors

	public String getGridDomain() {
		return this.gridDomain;
	}

	public void setGridDomain(String gridDomain) {
		this.gridDomain = gridDomain;
	}

	public Integer getGridRunId() {
		return this.gridRunId;
	}

	public void setGridRunId(Integer gridRunId) {
		this.gridRunId = gridRunId;
	}

	public Integer getGridRow() {
		return this.gridRow;
	}

	public void setGridRow(Integer gridRow) {
		this.gridRow = gridRow;
	}

	public Integer getGridLine() {
		return this.gridLine;
	}

	public void setGridLine(Integer gridLine) {
		this.gridLine = gridLine;
	}

	public Integer getGridStl() {
		return this.gridStl;
	}

	public void setGridStl(Integer gridStl) {
		this.gridStl = gridStl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGridDetId))
			return false;
		AbstractGridDetId castOther = (AbstractGridDetId) other;

		return ((this.getGridDomain() == castOther.getGridDomain()) || (this
				.getGridDomain() != null
				&& castOther.getGridDomain() != null && this.getGridDomain()
				.equals(castOther.getGridDomain())))
				&& ((this.getGridRunId() == castOther.getGridRunId()) || (this
						.getGridRunId() != null
						&& castOther.getGridRunId() != null && this
						.getGridRunId().equals(castOther.getGridRunId())))
				&& ((this.getGridRow() == castOther.getGridRow()) || (this
						.getGridRow() != null
						&& castOther.getGridRow() != null && this.getGridRow()
						.equals(castOther.getGridRow())))
				&& ((this.getGridLine() == castOther.getGridLine()) || (this
						.getGridLine() != null
						&& castOther.getGridLine() != null && this
						.getGridLine().equals(castOther.getGridLine())))
				&& ((this.getGridStl() == castOther.getGridStl()) || (this
						.getGridStl() != null
						&& castOther.getGridStl() != null && this.getGridStl()
						.equals(castOther.getGridStl())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGridDomain() == null ? 0 : this.getGridDomain()
						.hashCode());
		result = 37 * result
				+ (getGridRunId() == null ? 0 : this.getGridRunId().hashCode());
		result = 37 * result
				+ (getGridRow() == null ? 0 : this.getGridRow().hashCode());
		result = 37 * result
				+ (getGridLine() == null ? 0 : this.getGridLine().hashCode());
		result = 37 * result
				+ (getGridStl() == null ? 0 : this.getGridStl().hashCode());
		return result;
	}

}