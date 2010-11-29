package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DprdDetId entity. @author MyEclipse Persistence Tools
 */
public class DprdDetId extends AbstractDprdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DprdDetId() {
	}

	/** full constructor */
	public DprdDetId(String dprdEntity, String dprdBook, String dprdAsset,
			Date dprdPdDate, Integer dprdLine, Boolean dprdRflag) {
		super(dprdEntity, dprdBook, dprdAsset, dprdPdDate, dprdLine, dprdRflag);
	}

}
