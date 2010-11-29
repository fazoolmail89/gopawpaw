package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IdhrHist entity. @author MyEclipse Persistence Tools
 */
public class IdhrHist extends AbstractIdhrHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IdhrHist() {
	}

	/** minimal constructor */
	public IdhrHist(IdhrHistId id, Double oidIdhrHist) {
		super(id, oidIdhrHist);
	}

	/** full constructor */
	public IdhrHist(IdhrHistId id, String idhrDiv, String idhrGroup,
			Integer idhrPricing, Integer idhrType, String idhrUser1,
			String idhrUser2, String idhrQadc01, String idhrQadc02,
			String idhrQadc03, Double idhrQadd01, Double idhrQadd02,
			Integer idhrQadi01, Integer idhrQadi02, Boolean idhrQadl01,
			Boolean idhrQadl02, Date idhrQadt01, Date idhrQadt02,
			Double oidIdhrHist) {
		super(id, idhrDiv, idhrGroup, idhrPricing, idhrType, idhrUser1,
				idhrUser2, idhrQadc01, idhrQadc02, idhrQadc03, idhrQadd01,
				idhrQadd02, idhrQadi01, idhrQadi02, idhrQadl01, idhrQadl02,
				idhrQadt01, idhrQadt02, oidIdhrHist);
	}

}
