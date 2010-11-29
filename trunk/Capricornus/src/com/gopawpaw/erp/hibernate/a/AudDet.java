package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AudDet entity. @author MyEclipse Persistence Tools
 */
public class AudDet extends AbstractAudDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AudDet() {
	}

	/** minimal constructor */
	public AudDet(AudDetId id, Date audDate, Double oidAudDet) {
		super(id, audDate, oidAudDet);
	}

	/** full constructor */
	public AudDet(AudDetId id, String audDataset, String audUserid,
			Date audDate, String audKey1, String audKey2, String audKey3,
			String audKey4, String audKey5, String audKey6, String audKey7,
			String audOldData, String audTime, String audUser1,
			String audUser2, String audField, String audNewData,
			String audQadc01, Double oidAudDet) {
		super(id, audDataset, audUserid, audDate, audKey1, audKey2, audKey3,
				audKey4, audKey5, audKey6, audKey7, audOldData, audTime,
				audUser1, audUser2, audField, audNewData, audQadc01, oidAudDet);
	}

}
