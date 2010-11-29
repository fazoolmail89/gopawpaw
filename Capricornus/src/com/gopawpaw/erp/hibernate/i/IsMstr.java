package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IsMstr entity. @author MyEclipse Persistence Tools
 */
public class IsMstr extends AbstractIsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IsMstr() {
	}

	/** minimal constructor */
	public IsMstr(IsMstrId id, Double oidIsMstr) {
		super(id, oidIsMstr);
	}

	/** full constructor */
	public IsMstr(IsMstrId id, Boolean isAvail, Boolean isFrozen,
			Boolean isOverissue, String isUser1, String isUser2,
			String isUserid, Date isModDate, String isDesc, Integer isCmtindx,
			String isQadc01, Double oidIsMstr) {
		super(id, isAvail, isFrozen, isOverissue, isUser1, isUser2, isUserid,
				isModDate, isDesc, isCmtindx, isQadc01, oidIsMstr);
	}

}
