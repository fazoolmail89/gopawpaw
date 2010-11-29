package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EgsDet entity. @author MyEclipse Persistence Tools
 */
public class EgsDet extends AbstractEgsDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EgsDet() {
	}

	/** minimal constructor */
	public EgsDet(EgsDetId id, Double oidEgsDet) {
		super(id, oidEgsDet);
	}

	/** full constructor */
	public EgsDet(EgsDetId id, String egsLevel, Date egsCert, String egsChr01,
			String egsChr02, String egsChr03, Double egsDec01, Double egsDec02,
			Date egsDte01, Date egsDte02, Boolean egsLog01, Boolean egsLog02,
			String egsUser1, String egsUser2, String egsArea, String egsQadc01,
			String egsQadc02, Boolean egsQadl01, Boolean egsQadl02,
			Date egsQadt01, Integer egsQadi01, Double egsQade01,
			Date egsModDate, String egsModUserid, Double oidEgsDet) {
		super(id, egsLevel, egsCert, egsChr01, egsChr02, egsChr03, egsDec01,
				egsDec02, egsDte01, egsDte02, egsLog01, egsLog02, egsUser1,
				egsUser2, egsArea, egsQadc01, egsQadc02, egsQadl01, egsQadl02,
				egsQadt01, egsQadi01, egsQade01, egsModDate, egsModUserid,
				oidEgsDet);
	}

}
