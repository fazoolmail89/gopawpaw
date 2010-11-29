package com.gopawpaw.erp.hibernate.h;

/**
 * HlpMstrId entity. @author MyEclipse Persistence Tools
 */
public class HlpMstrId extends AbstractHlpMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HlpMstrId() {
	}

	/** minimal constructor */
	public HlpMstrId(String hlpFile, Double oidHlpMstr) {
		super(hlpFile, oidHlpMstr);
	}

	/** full constructor */
	public HlpMstrId(String hlpContextStr, Integer hlpContextNbr,
			String hlpFile, String hlpUser1, String hlpUser2, String hlpQadc01,
			Double oidHlpMstr) {
		super(hlpContextStr, hlpContextNbr, hlpFile, hlpUser1, hlpUser2,
				hlpQadc01, oidHlpMstr);
	}

}
