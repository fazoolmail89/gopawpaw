package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IvsCtrl entity. @author MyEclipse Persistence Tools
 */
public class IvsCtrl extends AbstractIvsCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IvsCtrl() {
	}

	/** minimal constructor */
	public IvsCtrl(Integer ivsIndex1, Boolean ivsCmmts, String ivsSoPre,
			Integer ivsSoNbr, String ivsArAcct, String ivsArSub,
			String ivsArCc, String ivsPrepAcct, String ivsPrepSub,
			String ivsPrepCc, String ivsPtaxAcct, String ivsPtaxSub,
			String ivsPtaxCc, String ivsInvType, Date ivsModDate,
			String ivsModUserid, Double oidIvsCtrl) {
		super(ivsIndex1, ivsCmmts, ivsSoPre, ivsSoNbr, ivsArAcct, ivsArSub,
				ivsArCc, ivsPrepAcct, ivsPrepSub, ivsPrepCc, ivsPtaxAcct,
				ivsPtaxSub, ivsPtaxCc, ivsInvType, ivsModDate, ivsModUserid,
				oidIvsCtrl);
	}

	/** full constructor */
	public IvsCtrl(Integer ivsIndex1, Boolean ivsCmmts, String ivsSoPre,
			Integer ivsSoNbr, String ivsArAcct, String ivsArSub,
			String ivsArCc, String ivsPrepAcct, String ivsPrepSub,
			String ivsPrepCc, String ivsPtaxAcct, String ivsPtaxSub,
			String ivsPtaxCc, String ivsInvType, Date ivsModDate,
			String ivsModUserid, String ivsUser1, String ivsUser2,
			String ivsQadc01, Double ivsQadd01, Integer ivsQadi01,
			Boolean ivsQadl01, Date ivsQadt01, Double oidIvsCtrl) {
		super(ivsIndex1, ivsCmmts, ivsSoPre, ivsSoNbr, ivsArAcct, ivsArSub,
				ivsArCc, ivsPrepAcct, ivsPrepSub, ivsPrepCc, ivsPtaxAcct,
				ivsPtaxSub, ivsPtaxCc, ivsInvType, ivsModDate, ivsModUserid,
				ivsUser1, ivsUser2, ivsQadc01, ivsQadd01, ivsQadi01, ivsQadl01,
				ivsQadt01, oidIvsCtrl);
	}

}
