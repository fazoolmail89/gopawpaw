package com.gopawpaw.erp.hibernate.s;

/**
 * SttqdDetId entity. @author MyEclipse Persistence Tools
 */
public class SttqdDetId extends AbstractSttqdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SttqdDetId() {
	}

	/** full constructor */
	public SttqdDetId(String sttqdDomain, Integer sttqdMeasurementType,
			String sttqdStatusCode, String sttqdCustomerSource,
			String sttqdShipfrom, String sttqdReceiveAddr, String sttqdPart) {
		super(sttqdDomain, sttqdMeasurementType, sttqdStatusCode,
				sttqdCustomerSource, sttqdShipfrom, sttqdReceiveAddr, sttqdPart);
	}

}
