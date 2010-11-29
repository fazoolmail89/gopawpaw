package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractImapDetId entity provides the base persistence definition of the
 * ImapDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractImapDetId implements java.io.Serializable {

	// Fields

	private Integer imapDocId;
	private Integer imapDocSufx;
	private Integer imapDocLine;
	private String imapDomain;

	// Constructors

	/** default constructor */
	public AbstractImapDetId() {
	}

	/** minimal constructor */
	public AbstractImapDetId(String imapDomain) {
		this.imapDomain = imapDomain;
	}

	/** full constructor */
	public AbstractImapDetId(Integer imapDocId, Integer imapDocSufx,
			Integer imapDocLine, String imapDomain) {
		this.imapDocId = imapDocId;
		this.imapDocSufx = imapDocSufx;
		this.imapDocLine = imapDocLine;
		this.imapDomain = imapDomain;
	}

	// Property accessors

	public Integer getImapDocId() {
		return this.imapDocId;
	}

	public void setImapDocId(Integer imapDocId) {
		this.imapDocId = imapDocId;
	}

	public Integer getImapDocSufx() {
		return this.imapDocSufx;
	}

	public void setImapDocSufx(Integer imapDocSufx) {
		this.imapDocSufx = imapDocSufx;
	}

	public Integer getImapDocLine() {
		return this.imapDocLine;
	}

	public void setImapDocLine(Integer imapDocLine) {
		this.imapDocLine = imapDocLine;
	}

	public String getImapDomain() {
		return this.imapDomain;
	}

	public void setImapDomain(String imapDomain) {
		this.imapDomain = imapDomain;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractImapDetId))
			return false;
		AbstractImapDetId castOther = (AbstractImapDetId) other;

		return ((this.getImapDocId() == castOther.getImapDocId()) || (this
				.getImapDocId() != null
				&& castOther.getImapDocId() != null && this.getImapDocId()
				.equals(castOther.getImapDocId())))
				&& ((this.getImapDocSufx() == castOther.getImapDocSufx()) || (this
						.getImapDocSufx() != null
						&& castOther.getImapDocSufx() != null && this
						.getImapDocSufx().equals(castOther.getImapDocSufx())))
				&& ((this.getImapDocLine() == castOther.getImapDocLine()) || (this
						.getImapDocLine() != null
						&& castOther.getImapDocLine() != null && this
						.getImapDocLine().equals(castOther.getImapDocLine())))
				&& ((this.getImapDomain() == castOther.getImapDomain()) || (this
						.getImapDomain() != null
						&& castOther.getImapDomain() != null && this
						.getImapDomain().equals(castOther.getImapDomain())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getImapDocId() == null ? 0 : this.getImapDocId().hashCode());
		result = 37
				* result
				+ (getImapDocSufx() == null ? 0 : this.getImapDocSufx()
						.hashCode());
		result = 37
				* result
				+ (getImapDocLine() == null ? 0 : this.getImapDocLine()
						.hashCode());
		result = 37
				* result
				+ (getImapDomain() == null ? 0 : this.getImapDomain()
						.hashCode());
		return result;
	}

}