package com.gopawpaw.erp.hibernate.i;

/**
 * ImapDetId entity. @author MyEclipse Persistence Tools
 */
public class ImapDetId extends AbstractImapDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ImapDetId() {
	}

	/** minimal constructor */
	public ImapDetId(String imapDomain) {
		super(imapDomain);
	}

	/** full constructor */
	public ImapDetId(Integer imapDocId, Integer imapDocSufx,
			Integer imapDocLine, String imapDomain) {
		super(imapDocId, imapDocSufx, imapDocLine, imapDomain);
	}

}
