package com.gopawpaw.erp.hibernate.c;

/**
 * ClcCtrl entity. @author MyEclipse Persistence Tools
 */
public class ClcCtrl extends AbstractClcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ClcCtrl() {
	}

	/** minimal constructor */
	public ClcCtrl(Double oidClcCtrl) {
		super(oidClcCtrl);
	}

	/** full constructor */
	public ClcCtrl(Boolean clcActive, Boolean clcCompIssue,
			Integer clcLotlevel, Boolean clcPolotRcpt, Boolean clcWolotRcpt,
			Boolean clcRelotRcpt, Integer clcQadi01, Boolean clcJpRcpt,
			String clcUser1, String clcUser2, String clcQadc01,
			Double oidClcCtrl) {
		super(clcActive, clcCompIssue, clcLotlevel, clcPolotRcpt, clcWolotRcpt,
				clcRelotRcpt, clcQadi01, clcJpRcpt, clcUser1, clcUser2,
				clcQadc01, oidClcCtrl);
	}

}
