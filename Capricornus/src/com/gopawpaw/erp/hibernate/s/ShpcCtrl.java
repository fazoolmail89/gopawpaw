package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * ShpcCtrl entity. @author MyEclipse Persistence Tools
 */
public class ShpcCtrl extends AbstractShpcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShpcCtrl() {
	}

	/** full constructor */
	public ShpcCtrl(Integer shpcQadi01, Boolean shpcActive,
			Boolean shpcIncludeSo, Boolean shpcIncludeSched,
			Boolean shpcIncludeDo, Boolean shpcUseCurrent,
			Boolean shpcShipperReasons, String shpcModUserid, Date shpcModDate,
			Integer shpcMeasSubtype, Boolean shpcIncludeRma,
			Integer shpcSchedType, Boolean shpcIncludeMo, String shpcQadc01,
			String shpcQadc02, String shpcUser1, String shpcUser2,
			Double oidShpcCtrl) {
		super(shpcQadi01, shpcActive, shpcIncludeSo, shpcIncludeSched,
				shpcIncludeDo, shpcUseCurrent, shpcShipperReasons,
				shpcModUserid, shpcModDate, shpcMeasSubtype, shpcIncludeRma,
				shpcSchedType, shpcIncludeMo, shpcQadc01, shpcQadc02,
				shpcUser1, shpcUser2, oidShpcCtrl);
	}

}
