package com.gopawpaw.erp.hibernate.e;

/**
 * ExcdDet entity. @author MyEclipse Persistence Tools
 */
public class ExcdDet extends AbstractExcdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ExcdDet() {
	}

	/** minimal constructor */
	public ExcdDet(ExcdDetId id, Double excdExRate2, String excdExRatetype,
			Integer excdExruSeq, Double oidExcdDet) {
		super(id, excdExRate2, excdExRatetype, excdExruSeq, oidExcdDet);
	}

	/** full constructor */
	public ExcdDet(ExcdDetId id, String excdXcc, String excdXacType,
			Double excdRate, String excdUser1, String excdUser2,
			Double excdEnRate, String excdQadc01, Double excdExRate2,
			String excdExRatetype, Integer excdExruSeq, Double oidExcdDet) {
		super(id, excdXcc, excdXacType, excdRate, excdUser1, excdUser2,
				excdEnRate, excdQadc01, excdExRate2, excdExRatetype,
				excdExruSeq, oidExcdDet);
	}

}
