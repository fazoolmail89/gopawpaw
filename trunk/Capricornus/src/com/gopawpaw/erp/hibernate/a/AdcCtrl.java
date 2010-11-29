package com.gopawpaw.erp.hibernate.a;

/**
 * AdcCtrl entity. @author MyEclipse Persistence Tools
 */
public class AdcCtrl extends AbstractAdcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AdcCtrl() {
	}

	/** minimal constructor */
	public AdcCtrl(Double oidAdcCtrl) {
		super(oidAdcCtrl);
	}

	/** full constructor */
	public AdcCtrl(Integer adcFormat, String adcUser1, String adcUser2,
			Integer adcQadi01, String adcQadc01, Double oidAdcCtrl) {
		super(adcFormat, adcUser1, adcUser2, adcQadi01, adcQadc01, oidAdcCtrl);
	}

}
