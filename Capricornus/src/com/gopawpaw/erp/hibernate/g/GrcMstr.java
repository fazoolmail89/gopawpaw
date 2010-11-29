package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GrcMstr entity. @author MyEclipse Persistence Tools
 */
public class GrcMstr extends AbstractGrcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrcMstr() {
	}

	/** minimal constructor */
	public GrcMstr(GrcMstrId id, Double oidGrcMstr) {
		super(id, oidGrcMstr);
	}

	/** full constructor */
	public GrcMstr(GrcMstrId id, String grcDesc, String grcAddId,
			Date grcAddDate, String grcModId, Date grcModDate, String grcGroup,
			Boolean grcStatus, Integer grcCmtindx, String grcUser1,
			String grcUser2, String grcQadc01, Double oidGrcMstr) {
		super(id, grcDesc, grcAddId, grcAddDate, grcModId, grcModDate,
				grcGroup, grcStatus, grcCmtindx, grcUser1, grcUser2, grcQadc01,
				oidGrcMstr);
	}

}
