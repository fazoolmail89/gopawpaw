package com.gopawpaw.erp.hibernate.r;

/**
 * RqpoRefId entity. @author MyEclipse Persistence Tools
 */
public class RqpoRefId extends AbstractRqpoRefId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqpoRefId() {
	}

	/** minimal constructor */
	public RqpoRefId(String rqpoDomain) {
		super(rqpoDomain);
	}

	/** full constructor */
	public RqpoRefId(String rqpoDomain, String rqpoReqNbr, Integer rqpoReqLine,
			String rqpoPoNbr, Integer rqpoPoLine) {
		super(rqpoDomain, rqpoReqNbr, rqpoReqLine, rqpoPoNbr, rqpoPoLine);
	}

}
