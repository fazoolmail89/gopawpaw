package com.gopawpaw.erp.hibernate.g;

/**
 * GridDet entity. @author MyEclipse Persistence Tools
 */
public class GridDet extends AbstractGridDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GridDet() {
	}

	/** minimal constructor */
	public GridDet(GridDetId id, Double oidGridDet) {
		super(id, oidGridDet);
	}

	/** full constructor */
	public GridDet(GridDetId id, Integer gridIndent, String gridLabel,
			Integer gridSkips, Integer gridExplLine, String gridRowType,
			String gridPreUnd, String gridPostUnd, Boolean gridPage,
			Boolean gridAllzero, Boolean gridPrint, String gridText,
			Boolean gridSelect, Boolean gridApplySym, String gridZeroSuppress,
			String gridUser1, String gridUser2, String gridQadc01,
			Double oidGridDet) {
		super(id, gridIndent, gridLabel, gridSkips, gridExplLine, gridRowType,
				gridPreUnd, gridPostUnd, gridPage, gridAllzero, gridPrint,
				gridText, gridSelect, gridApplySym, gridZeroSuppress,
				gridUser1, gridUser2, gridQadc01, oidGridDet);
	}

}
