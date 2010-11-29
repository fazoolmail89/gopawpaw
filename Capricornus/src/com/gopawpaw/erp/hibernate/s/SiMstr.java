package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SiMstr entity. @author MyEclipse Persistence Tools
 */
public class SiMstr extends AbstractSiMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SiMstr() {
	}

	/** minimal constructor */
	public SiMstr(SiMstrId id, String siDb, String siGitAcct, String siGitCc,
			Boolean siExtVd, String siBtbVend, String siDecl,
			Boolean siXferOwnership, String siGitLocation, Boolean siType,
			Double oidSiMstr) {
		super(id, siDb, siGitAcct, siGitCc, siExtVd, siBtbVend, siDecl,
				siXferOwnership, siGitLocation, siType, oidSiMstr);
	}

	/** full constructor */
	public SiMstr(SiMstrId id, String siDesc, String siEntity, String siStatus,
			Boolean siAutoLoc, String siUser1, String siUser2, String siChr01,
			String siChr02, String siChr03, String siChr04, String siChr05,
			Date siDte01, Date siDte02, Double siDec01, Double siDec02,
			Boolean siLog01, String siGlSet, String siDb, String siXferAcct,
			String siCurSet, String siXferCc, String siGitAcct, String siGitCc,
			String siCanrun, Boolean siExtVd, String siBtbVend,
			String siGitSub, String siXferSub, String siDecl,
			Boolean siXferOwnership, String siGitLocation, Boolean siType,
			Double oidSiMstr) {
		super(id, siDesc, siEntity, siStatus, siAutoLoc, siUser1, siUser2,
				siChr01, siChr02, siChr03, siChr04, siChr05, siDte01, siDte02,
				siDec01, siDec02, siLog01, siGlSet, siDb, siXferAcct, siCurSet,
				siXferCc, siGitAcct, siGitCc, siCanrun, siExtVd, siBtbVend,
				siGitSub, siXferSub, siDecl, siXferOwnership, siGitLocation,
				siType, oidSiMstr);
	}

}
