package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LoccDet entity. @author MyEclipse Persistence Tools
 */
public class LoccDet extends AbstractLoccDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LoccDet() {
	}

	/** minimal constructor */
	public LoccDet(LoccDetId id, Boolean loccPrimaryLoc, Date loccModDate,
			String loccModUserid, String loccUserc01, String loccUserc02,
			Double loccUserd01, Integer loccUseri01, Boolean loccUserl01,
			String loccQadc01, Double loccQadd01, Integer loccQadi01,
			Boolean loccQadl01, Double oidLoccDet) {
		super(id, loccPrimaryLoc, loccModDate, loccModUserid, loccUserc01,
				loccUserc02, loccUserd01, loccUseri01, loccUserl01, loccQadc01,
				loccQadd01, loccQadi01, loccQadl01, oidLoccDet);
	}

	/** full constructor */
	public LoccDet(LoccDetId id, Boolean loccPrimaryLoc, Date loccModDate,
			String loccModUserid, String loccUserc01, String loccUserc02,
			Double loccUserd01, Date loccUsert01, Integer loccUseri01,
			Boolean loccUserl01, String loccQadc01, Double loccQadd01,
			Integer loccQadi01, Boolean loccQadl01, Date loccQadt01,
			Double oidLoccDet) {
		super(id, loccPrimaryLoc, loccModDate, loccModUserid, loccUserc01,
				loccUserc02, loccUserd01, loccUsert01, loccUseri01,
				loccUserl01, loccQadc01, loccQadd01, loccQadi01, loccQadl01,
				loccQadt01, oidLoccDet);
	}

}
