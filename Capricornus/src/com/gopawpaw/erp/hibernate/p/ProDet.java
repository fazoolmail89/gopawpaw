package com.gopawpaw.erp.hibernate.p;

import java.sql.Timestamp;

/**
 * ProDet entity. @author MyEclipse Persistence Tools
 */
public class ProDet extends AbstractProDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ProDet() {
	}

	/** minimal constructor */
	public ProDet(String proComParSerial, String proSerial) {
		super(proComParSerial, proSerial);
	}

	/** full constructor */
	public ProDet(String proComName, String proComObject,
			String proComParSerial, String proSerial, Timestamp proMdate) {
		super(proComName, proComObject, proComParSerial, proSerial, proMdate);
	}

}
