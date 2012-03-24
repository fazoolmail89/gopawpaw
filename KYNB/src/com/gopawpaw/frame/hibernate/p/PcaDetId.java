package com.gopawpaw.frame.hibernate.p;

/**
 * PcaDetId entity. @author MyEclipse Persistence Tools
 */
public class PcaDetId extends AbstractPcaDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PcaDetId() {
	}

	/** full constructor */
	public PcaDetId(String pcaMndNbrSelect, String pcaProComSerial,
			String pcaTarget, String pcaType) {
		super(pcaMndNbrSelect, pcaProComSerial, pcaTarget, pcaType);
	}

}
