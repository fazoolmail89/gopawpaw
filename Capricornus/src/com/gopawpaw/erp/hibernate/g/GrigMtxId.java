package com.gopawpaw.erp.hibernate.g;

/**
 * GrigMtxId entity. @author MyEclipse Persistence Tools
 */
public class GrigMtxId extends AbstractGrigMtxId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrigMtxId() {
	}

	/** minimal constructor */
	public GrigMtxId(String grigDomain) {
		super(grigDomain);
	}

	/** full constructor */
	public GrigMtxId(String grigDomain, Integer grigRunId, String grigBrkGp,
			Integer grigRow, Integer grigLine, Integer grigStl, Integer grigCol) {
		super(grigDomain, grigRunId, grigBrkGp, grigRow, grigLine, grigStl,
				grigCol);
	}

}
