package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * ImapDet entity. @author MyEclipse Persistence Tools
 */
public class ImapDet extends AbstractImapDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ImapDet() {
	}

	/** minimal constructor */
	public ImapDet(ImapDetId id, Double oidImapDet) {
		super(id, oidImapDet);
	}

	/** full constructor */
	public ImapDet(ImapDetId id, Boolean imapLineCont, String imapData,
			Date imapModDate, String imapModUserid, String imapUser1,
			String imapUser2, Double imapDec01, Double imapDec02,
			Integer imapInt01, Integer imapInt02, Boolean imapLog01,
			Boolean imapLog02, Date imapDte01, Date imapDte02,
			String imapQadc01, String imapQadc02, String imapQadc03,
			String imapQadc04, Double imapQadd01, Double imapQadd02,
			Integer imapQadi01, Integer imapQadi02, Boolean imapQadl01,
			Boolean imapQadl02, Date imapQadt01, Date imapQadt02,
			Double oidImapDet) {
		super(id, imapLineCont, imapData, imapModDate, imapModUserid,
				imapUser1, imapUser2, imapDec01, imapDec02, imapInt01,
				imapInt02, imapLog01, imapLog02, imapDte01, imapDte02,
				imapQadc01, imapQadc02, imapQadc03, imapQadc04, imapQadd01,
				imapQadd02, imapQadi01, imapQadi02, imapQadl01, imapQadl02,
				imapQadt01, imapQadt02, oidImapDet);
	}

}
