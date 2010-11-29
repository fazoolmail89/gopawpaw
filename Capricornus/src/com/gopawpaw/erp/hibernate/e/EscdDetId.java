package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EscdDetId entity. @author MyEclipse Persistence Tools
 */
public class EscdDetId extends AbstractEscdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EscdDetId() {
	}

	/** full constructor */
	public EscdDetId(Double oidEscdDet, Double oidEsigMstr,
			Double oidEscatMstr, Double oidTopErecord, Double oidEsapMstr,
			Date escdDate, Integer escdTime, String escdTimezone,
			Date escdModDate, String escdModUserid, String escdUser1,
			String escdUser2, String escdQadc01, String escdQadc02) {
		super(oidEscdDet, oidEsigMstr, oidEscatMstr, oidTopErecord,
				oidEsapMstr, escdDate, escdTime, escdTimezone, escdModDate,
				escdModUserid, escdUser1, escdUser2, escdQadc01, escdQadc02);
	}

}
