package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PexMstrId entity. @author MyEclipse Persistence Tools
 */
public class PexMstrId extends AbstractPexMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PexMstrId() {
	}

	/** minimal constructor */
	public PexMstrId(String pexProduct, Integer pexInstTime,
			String pexControl1, String pexControl2, String pexControl3,
			String pexControl4, String pexControl5, String pexControl6) {
		super(pexProduct, pexInstTime, pexControl1, pexControl2, pexControl3,
				pexControl4, pexControl5, pexControl6);
	}

	/** full constructor */
	public PexMstrId(String pexProduct, Date pexInstDate, Integer pexInstTime,
			String pexControl1, String pexControl2, String pexControl3,
			String pexControl4, String pexControl5, String pexControl6) {
		super(pexProduct, pexInstDate, pexInstTime, pexControl1, pexControl2,
				pexControl3, pexControl4, pexControl5, pexControl6);
	}

}
