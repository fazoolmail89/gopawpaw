package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * UsgDet entity. @author MyEclipse Persistence Tools
 */
public class UsgDet extends AbstractUsgDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UsgDet() {
	}

	/** minimal constructor */
	public UsgDet(UsgDetId id, Integer usgCount, String usgUserid,
			String usgUser1, String usgUser2, String usgQadc01,
			String usgQadc02, Double usgQadd01, Double oidUsgDet) {
		super(id, usgCount, usgUserid, usgUser1, usgUser2, usgQadc01,
				usgQadc02, usgQadd01, oidUsgDet);
	}

	/** full constructor */
	public UsgDet(UsgDetId id, Integer usgCount, String usgUserid,
			String usgUser1, String usgUser2, String usgQadc01,
			String usgQadc02, Double usgQadd01, Date usgQadt01, Date usgDate,
			Date usgClearDate, Double oidUsgDet) {
		super(id, usgCount, usgUserid, usgUser1, usgUser2, usgQadc01,
				usgQadc02, usgQadd01, usgQadt01, usgDate, usgClearDate,
				oidUsgDet);
	}

}
