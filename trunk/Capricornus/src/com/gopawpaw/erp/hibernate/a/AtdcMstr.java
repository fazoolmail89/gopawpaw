package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AtdcMstr entity. @author MyEclipse Persistence Tools
 */
public class AtdcMstr extends AbstractAtdcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AtdcMstr() {
	}

	/** minimal constructor */
	public AtdcMstr(Double oidAtdcMstr, String atdcPhyName, String atdcDir,
			String atdcHost, String atdcServer, String atdcType,
			String atdcNetwork, String atdcParmfile, Boolean atdcOnline,
			String atdcDesc, Date atdcModDate, String atdcModUserid,
			String atdcUser1, String atdcUser2, String atdcQadc01,
			String atdcQadc02) {
		super(oidAtdcMstr, atdcPhyName, atdcDir, atdcHost, atdcServer,
				atdcType, atdcNetwork, atdcParmfile, atdcOnline, atdcDesc,
				atdcModDate, atdcModUserid, atdcUser1, atdcUser2, atdcQadc01,
				atdcQadc02);
	}

	/** full constructor */
	public AtdcMstr(Double oidAtdcMstr, String atdcPhyName, String atdcDir,
			String atdcHost, String atdcServer, String atdcType,
			String atdcNetwork, String atdcParmfile, Boolean atdcOnline,
			String atdcDesc, Date atdcQadt01, Date atdcQadt02,
			Date atdcModDate, String atdcModUserid, String atdcUser1,
			String atdcUser2, String atdcQadc01, String atdcQadc02) {
		super(oidAtdcMstr, atdcPhyName, atdcDir, atdcHost, atdcServer,
				atdcType, atdcNetwork, atdcParmfile, atdcOnline, atdcDesc,
				atdcQadt01, atdcQadt02, atdcModDate, atdcModUserid, atdcUser1,
				atdcUser2, atdcQadc01, atdcQadc02);
	}

}
