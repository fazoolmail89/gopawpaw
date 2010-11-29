package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IsvcMstr entity. @author MyEclipse Persistence Tools
 */
public class IsvcMstr extends AbstractIsvcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IsvcMstr() {
	}

	/** full constructor */
	public IsvcMstr(IsvcMstrId id, Double isvcMinValue, Double isvcPercentage,
			Double isvcPerUnit, Double isvcPerWeight, Date isvcModDate,
			String isvcModUserid, String isvcUser1, String isvcUser2,
			String isvcQadc01, String isvcQadc02, String isvcUm,
			Double oidIsvcMstr) {
		super(id, isvcMinValue, isvcPercentage, isvcPerUnit, isvcPerWeight,
				isvcModDate, isvcModUserid, isvcUser1, isvcUser2, isvcQadc01,
				isvcQadc02, isvcUm, oidIsvcMstr);
	}

}
