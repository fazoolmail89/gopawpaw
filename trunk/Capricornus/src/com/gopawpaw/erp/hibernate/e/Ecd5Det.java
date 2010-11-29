package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * Ecd5Det entity. @author MyEclipse Persistence Tools
 */
public class Ecd5Det extends AbstractEcd5Det implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ecd5Det() {
	}

	/** minimal constructor */
	public Ecd5Det(Ecd5DetId id, Double oidEcd5Det) {
		super(id, oidEcd5Det);
	}

	/** full constructor */
	public Ecd5Det(Ecd5DetId id, Date ecd5End, String ecd5User1,
			String ecd5User2, String ecd5Userid, Date ecd5ModDate,
			Double ecd5Batch, Date ecd5Apprdate, String ecd5ApprId,
			Integer ecd5Cmtindx, Double ecd5Material, Double ecd5Labor,
			Double ecd5Burden, Double ecd5Subcontract, Double ecd5Overhead,
			Double ecd5TotalCost, String ecd5QspecNbr, Integer ecd5QspecId,
			String ecd5Qadc01, Double oidEcd5Det) {
		super(id, ecd5End, ecd5User1, ecd5User2, ecd5Userid, ecd5ModDate,
				ecd5Batch, ecd5Apprdate, ecd5ApprId, ecd5Cmtindx, ecd5Material,
				ecd5Labor, ecd5Burden, ecd5Subcontract, ecd5Overhead,
				ecd5TotalCost, ecd5QspecNbr, ecd5QspecId, ecd5Qadc01,
				oidEcd5Det);
	}

}
