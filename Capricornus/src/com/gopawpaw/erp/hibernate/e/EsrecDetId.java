package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EsrecDetId entity. @author MyEclipse Persistence Tools
 */
public class EsrecDetId extends AbstractEsrecDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsrecDetId() {
	}

	/** full constructor */
	public EsrecDetId(Double oidEsrecDet, Double oidErecord,
			Double oidEsigMstr, Double oidEscdDet, String esrecTableName,
			Integer esrecRecordOrder, Date esrecModDate, String esrecModUserid,
			String esrecUser1, String esrecUser2, String esrecQadc01,
			String esrecQadc02) {
		super(oidEsrecDet, oidErecord, oidEsigMstr, oidEscdDet, esrecTableName,
				esrecRecordOrder, esrecModDate, esrecModUserid, esrecUser1,
				esrecUser2, esrecQadc01, esrecQadc02);
	}

}
