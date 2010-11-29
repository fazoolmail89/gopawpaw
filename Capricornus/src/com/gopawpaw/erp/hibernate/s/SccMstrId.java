package com.gopawpaw.erp.hibernate.s;

/**
 * SccMstrId entity. @author MyEclipse Persistence Tools
 */
public class SccMstrId extends AbstractSccMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SccMstrId() {
	}

	/** full constructor */
	public SccMstrId(String sccDomain, String sccCustomerSource,
			String sccShipfrom, String sccReceiveAddr, String sccPart) {
		super(sccDomain, sccCustomerSource, sccShipfrom, sccReceiveAddr,
				sccPart);
	}

}
