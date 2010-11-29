package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IhrHist entity. @author MyEclipse Persistence Tools
 */
public class IhrHist extends AbstractIhrHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IhrHist() {
	}

	/** minimal constructor */
	public IhrHist(IhrHistId id, Double oidIhrHist) {
		super(id, oidIhrHist);
	}

	/** full constructor */
	public IhrHist(IhrHistId id, String ihrDiv, String ihrGroup,
			Integer ihrPricing, Integer ihrType, String ihrUser1,
			String ihrUser2, String ihrQadc01, String ihrQadc02,
			String ihrQadc03, Double ihrQadd01, Double ihrQadd02,
			Integer ihrQadi01, Integer ihrQadi02, Boolean ihrQadl01,
			Boolean ihrQadl02, Date ihrQadt01, Date ihrQadt02, Double oidIhrHist) {
		super(id, ihrDiv, ihrGroup, ihrPricing, ihrType, ihrUser1, ihrUser2,
				ihrQadc01, ihrQadc02, ihrQadc03, ihrQadd01, ihrQadd02,
				ihrQadi01, ihrQadi02, ihrQadl01, ihrQadl02, ihrQadt01,
				ihrQadt02, oidIhrHist);
	}

}
