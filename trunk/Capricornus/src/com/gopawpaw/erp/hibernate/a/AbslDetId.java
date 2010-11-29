package com.gopawpaw.erp.hibernate.a;

/**
 * AbslDetId entity. @author MyEclipse Persistence Tools
 */
public class AbslDetId extends AbstractAbslDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AbslDetId() {
	}

	/** full constructor */
	public AbslDetId(String abslDomain, String abslAbsId,
			String abslAbsShipfrom, String abslOrder, Integer abslOrdLine,
			Integer abslLcLine) {
		super(abslDomain, abslAbsId, abslAbsShipfrom, abslOrder, abslOrdLine,
				abslLcLine);
	}

}
