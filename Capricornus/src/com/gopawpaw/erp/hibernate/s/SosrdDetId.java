package com.gopawpaw.erp.hibernate.s;

/**
 * SosrdDetId entity. @author MyEclipse Persistence Tools
 */
public class SosrdDetId extends AbstractSosrdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SosrdDetId() {
	}

	/** full constructor */
	public SosrdDetId(String sosrdDomain, String sosrdNbr, Integer sosrdLine,
			String sosrdShipfrom, String sosrdAbsId,
			Integer sosrdMeasurementType, String sosrdDataset) {
		super(sosrdDomain, sosrdNbr, sosrdLine, sosrdShipfrom, sosrdAbsId,
				sosrdMeasurementType, sosrdDataset);
	}

}
