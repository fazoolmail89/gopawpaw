package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGridDet entity provides the base persistence definition of the
 * GridDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGridDet implements java.io.Serializable {

	// Fields

	private GridDetId id;
	private Integer gridIndent;
	private String gridLabel;
	private Integer gridSkips;
	private Integer gridExplLine;
	private String gridRowType;
	private String gridPreUnd;
	private String gridPostUnd;
	private Boolean gridPage;
	private Boolean gridAllzero;
	private Boolean gridPrint;
	private String gridText;
	private Boolean gridSelect;
	private Boolean gridApplySym;
	private String gridZeroSuppress;
	private String gridUser1;
	private String gridUser2;
	private String gridQadc01;
	private Double oidGridDet;

	// Constructors

	/** default constructor */
	public AbstractGridDet() {
	}

	/** minimal constructor */
	public AbstractGridDet(GridDetId id, Double oidGridDet) {
		this.id = id;
		this.oidGridDet = oidGridDet;
	}

	/** full constructor */
	public AbstractGridDet(GridDetId id, Integer gridIndent, String gridLabel,
			Integer gridSkips, Integer gridExplLine, String gridRowType,
			String gridPreUnd, String gridPostUnd, Boolean gridPage,
			Boolean gridAllzero, Boolean gridPrint, String gridText,
			Boolean gridSelect, Boolean gridApplySym, String gridZeroSuppress,
			String gridUser1, String gridUser2, String gridQadc01,
			Double oidGridDet) {
		this.id = id;
		this.gridIndent = gridIndent;
		this.gridLabel = gridLabel;
		this.gridSkips = gridSkips;
		this.gridExplLine = gridExplLine;
		this.gridRowType = gridRowType;
		this.gridPreUnd = gridPreUnd;
		this.gridPostUnd = gridPostUnd;
		this.gridPage = gridPage;
		this.gridAllzero = gridAllzero;
		this.gridPrint = gridPrint;
		this.gridText = gridText;
		this.gridSelect = gridSelect;
		this.gridApplySym = gridApplySym;
		this.gridZeroSuppress = gridZeroSuppress;
		this.gridUser1 = gridUser1;
		this.gridUser2 = gridUser2;
		this.gridQadc01 = gridQadc01;
		this.oidGridDet = oidGridDet;
	}

	// Property accessors

	public GridDetId getId() {
		return this.id;
	}

	public void setId(GridDetId id) {
		this.id = id;
	}

	public Integer getGridIndent() {
		return this.gridIndent;
	}

	public void setGridIndent(Integer gridIndent) {
		this.gridIndent = gridIndent;
	}

	public String getGridLabel() {
		return this.gridLabel;
	}

	public void setGridLabel(String gridLabel) {
		this.gridLabel = gridLabel;
	}

	public Integer getGridSkips() {
		return this.gridSkips;
	}

	public void setGridSkips(Integer gridSkips) {
		this.gridSkips = gridSkips;
	}

	public Integer getGridExplLine() {
		return this.gridExplLine;
	}

	public void setGridExplLine(Integer gridExplLine) {
		this.gridExplLine = gridExplLine;
	}

	public String getGridRowType() {
		return this.gridRowType;
	}

	public void setGridRowType(String gridRowType) {
		this.gridRowType = gridRowType;
	}

	public String getGridPreUnd() {
		return this.gridPreUnd;
	}

	public void setGridPreUnd(String gridPreUnd) {
		this.gridPreUnd = gridPreUnd;
	}

	public String getGridPostUnd() {
		return this.gridPostUnd;
	}

	public void setGridPostUnd(String gridPostUnd) {
		this.gridPostUnd = gridPostUnd;
	}

	public Boolean getGridPage() {
		return this.gridPage;
	}

	public void setGridPage(Boolean gridPage) {
		this.gridPage = gridPage;
	}

	public Boolean getGridAllzero() {
		return this.gridAllzero;
	}

	public void setGridAllzero(Boolean gridAllzero) {
		this.gridAllzero = gridAllzero;
	}

	public Boolean getGridPrint() {
		return this.gridPrint;
	}

	public void setGridPrint(Boolean gridPrint) {
		this.gridPrint = gridPrint;
	}

	public String getGridText() {
		return this.gridText;
	}

	public void setGridText(String gridText) {
		this.gridText = gridText;
	}

	public Boolean getGridSelect() {
		return this.gridSelect;
	}

	public void setGridSelect(Boolean gridSelect) {
		this.gridSelect = gridSelect;
	}

	public Boolean getGridApplySym() {
		return this.gridApplySym;
	}

	public void setGridApplySym(Boolean gridApplySym) {
		this.gridApplySym = gridApplySym;
	}

	public String getGridZeroSuppress() {
		return this.gridZeroSuppress;
	}

	public void setGridZeroSuppress(String gridZeroSuppress) {
		this.gridZeroSuppress = gridZeroSuppress;
	}

	public String getGridUser1() {
		return this.gridUser1;
	}

	public void setGridUser1(String gridUser1) {
		this.gridUser1 = gridUser1;
	}

	public String getGridUser2() {
		return this.gridUser2;
	}

	public void setGridUser2(String gridUser2) {
		this.gridUser2 = gridUser2;
	}

	public String getGridQadc01() {
		return this.gridQadc01;
	}

	public void setGridQadc01(String gridQadc01) {
		this.gridQadc01 = gridQadc01;
	}

	public Double getOidGridDet() {
		return this.oidGridDet;
	}

	public void setOidGridDet(Double oidGridDet) {
		this.oidGridDet = oidGridDet;
	}

}