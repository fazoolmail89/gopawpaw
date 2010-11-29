package com.gopawpaw.erp.hibernate.s;

/**
 * ScxRefId entity. @author MyEclipse Persistence Tools
 */
public class ScxRefId extends AbstractScxRefId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ScxRefId() {
	}

	/** minimal constructor */
	public ScxRefId(String scxDomain, String scxCustref, String scxModelyr) {
		super(scxDomain, scxCustref, scxModelyr);
	}

	/** full constructor */
	public ScxRefId(String scxDomain, Integer scxType, String scxShipfrom,
			String scxShipto, String scxPart, String scxCustref, String scxPo,
			String scxModelyr) {
		super(scxDomain, scxType, scxShipfrom, scxShipto, scxPart, scxCustref,
				scxPo, scxModelyr);
	}

}
