package com.gopawpaw.erp.hibernate.h;

import java.util.Date;

/**
 * HwmDet entity. @author MyEclipse Persistence Tools
 */
public class HwmDet extends AbstractHwmDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HwmDet() {
	}

	/** minimal constructor */
	public HwmDet(HwmDetId id, Integer hwmTime, String hwmUserid,
			String hwmSid, String hwmLicType, Integer hwmCnt,
			Integer hwmLicCnt, String hwmQadc01, String hwmQadc02,
			Double hwmQadd01, Double oidHwmDet) {
		super(id, hwmTime, hwmUserid, hwmSid, hwmLicType, hwmCnt, hwmLicCnt,
				hwmQadc01, hwmQadc02, hwmQadd01, oidHwmDet);
	}

	/** full constructor */
	public HwmDet(HwmDetId id, Integer hwmTime, String hwmUserid,
			String hwmSid, String hwmLicType, Integer hwmCnt,
			Integer hwmLicCnt, String hwmQadc01, String hwmQadc02,
			Double hwmQadd01, Date hwmQadt01, Double oidHwmDet) {
		super(id, hwmTime, hwmUserid, hwmSid, hwmLicType, hwmCnt, hwmLicCnt,
				hwmQadc01, hwmQadc02, hwmQadd01, hwmQadt01, oidHwmDet);
	}

}
