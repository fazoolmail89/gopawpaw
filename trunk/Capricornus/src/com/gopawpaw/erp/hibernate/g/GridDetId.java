package com.gopawpaw.erp.hibernate.g;

/**
 * GridDetId entity. @author MyEclipse Persistence Tools
 */
public class GridDetId extends AbstractGridDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GridDetId() {
	}

	/** minimal constructor */
	public GridDetId(String gridDomain) {
		super(gridDomain);
	}

	/** full constructor */
	public GridDetId(String gridDomain, Integer gridRunId, Integer gridRow,
			Integer gridLine, Integer gridStl) {
		super(gridDomain, gridRunId, gridRow, gridLine, gridStl);
	}

}
