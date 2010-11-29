package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RqaMstrId entity. @author MyEclipse Persistence Tools
 */
public class RqaMstrId extends AbstractRqaMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqaMstrId() {
	}

	/** minimal constructor */
	public RqaMstrId(String rqaDomain, String rqaApr) {
		super(rqaDomain, rqaApr);
	}

	/** full constructor */
	public RqaMstrId(String rqaDomain, String rqaApr, Integer rqaType,
			String rqaSite, String rqaProdLine, String rqaEntity,
			String rqaJob, String rqaCategory, String rqaSubFrom,
			String rqaCcFrom, Date rqaStart) {
		super(rqaDomain, rqaApr, rqaType, rqaSite, rqaProdLine, rqaEntity,
				rqaJob, rqaCategory, rqaSubFrom, rqaCcFrom, rqaStart);
	}

}
