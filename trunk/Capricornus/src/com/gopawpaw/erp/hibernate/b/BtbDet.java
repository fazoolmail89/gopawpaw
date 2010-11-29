package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * BtbDet entity. @author MyEclipse Persistence Tools
 */
public class BtbDet extends AbstractBtbDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BtbDet() {
	}

	/** full constructor */
	public BtbDet(BtbDetId id, String btbCmAddr, String btbCmPart,
			String btbCmDesc, Double btbSoPrice, String btbPrSo,
			Integer btbPrSodLine, String btbUser1, String btbUser2,
			String btbModUserid, Date btbModDate, String btbQadc01,
			Double oidBtbDet) {
		super(id, btbCmAddr, btbCmPart, btbCmDesc, btbSoPrice, btbPrSo,
				btbPrSodLine, btbUser1, btbUser2, btbModUserid, btbModDate,
				btbQadc01, oidBtbDet);
	}

}
