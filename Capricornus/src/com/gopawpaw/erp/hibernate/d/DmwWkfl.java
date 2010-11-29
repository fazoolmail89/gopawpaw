package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DmwWkfl entity. @author MyEclipse Persistence Tools
 */
public class DmwWkfl extends AbstractDmwWkfl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DmwWkfl() {
	}

	/** minimal constructor */
	public DmwWkfl(DmwWkflId id, Double dmwAmt, Double dmwDisc, Double dmwAppl,
			Date dmwDate, Date dmwDueDate, Date dmwDte01, String dmwChar01,
			String dmwChar02, String dmwChar03, String dmwChar04,
			String dmwChar05, Boolean dmwLog01, String dmwType,
			String dmwEntity, String dmwCurr, String dmwBank, Double oidDmwWkfl) {
		super(id, dmwAmt, dmwDisc, dmwAppl, dmwDate, dmwDueDate, dmwDte01,
				dmwChar01, dmwChar02, dmwChar03, dmwChar04, dmwChar05,
				dmwLog01, dmwType, dmwEntity, dmwCurr, dmwBank, oidDmwWkfl);
	}

	/** full constructor */
	public DmwWkfl(DmwWkflId id, Double dmwAmt, Double dmwDisc, Double dmwAppl,
			Date dmwDate, Date dmwDueDate, Date dmwDte01, String dmwChar01,
			String dmwChar02, String dmwChar03, String dmwChar04,
			String dmwChar05, Boolean dmwLog01, String dmwType,
			String dmwEntity, String dmwCurr, String dmwBank, String dmwUser1,
			String dmwUser2, Double oidDmwWkfl) {
		super(id, dmwAmt, dmwDisc, dmwAppl, dmwDate, dmwDueDate, dmwDte01,
				dmwChar01, dmwChar02, dmwChar03, dmwChar04, dmwChar05,
				dmwLog01, dmwType, dmwEntity, dmwCurr, dmwBank, dmwUser1,
				dmwUser2, oidDmwWkfl);
	}

}
