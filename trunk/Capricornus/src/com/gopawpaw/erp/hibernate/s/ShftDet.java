package com.gopawpaw.erp.hibernate.s;

/**
 * ShftDet entity. @author MyEclipse Persistence Tools
 */
public class ShftDet extends AbstractShftDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShftDet() {
	}

	/** minimal constructor */
	public ShftDet(ShftDetId id, Double oidShftDet) {
		super(id, oidShftDet);
	}

	/** full constructor */
	public ShftDet(ShftDetId id, Double shftStart1, Double shftStart2,
			Double shftStart3, Double shftStart4, Double shftHour1,
			Double shftHour2, Double shftHour3, Double shftHour4,
			String shftPat2, String shftPat3, String shftPat4, String shftPat1,
			Double shftLoad1, Double shftLoad2, Double shftLoad3,
			Double shftLoad4, String shftUser1, String shftUser2,
			String shftChr01, String shftChr02, String shftChr03,
			String shftChr04, String shftChr05, Double shftDec01,
			Double shftDec02, Double shftDec03, Double shftDec04,
			Boolean shftLog01, Double oidShftDet) {
		super(id, shftStart1, shftStart2, shftStart3, shftStart4, shftHour1,
				shftHour2, shftHour3, shftHour4, shftPat2, shftPat3, shftPat4,
				shftPat1, shftLoad1, shftLoad2, shftLoad3, shftLoad4,
				shftUser1, shftUser2, shftChr01, shftChr02, shftChr03,
				shftChr04, shftChr05, shftDec01, shftDec02, shftDec03,
				shftDec04, shftLog01, oidShftDet);
	}

}
