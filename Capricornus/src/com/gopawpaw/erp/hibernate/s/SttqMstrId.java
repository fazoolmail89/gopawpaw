package com.gopawpaw.erp.hibernate.s;

/**
 * SttqMstrId entity. @author MyEclipse Persistence Tools
 */
public class SttqMstrId extends AbstractSttqMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SttqMstrId() {
	}

	/** full constructor */
	public SttqMstrId(String sttqDomain, Integer sttqMeasurementType,
			String sttqStatusCode) {
		super(sttqDomain, sttqMeasurementType, sttqStatusCode);
	}

}
