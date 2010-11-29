package com.gopawpaw.erp.hibernate.g;

/**
 * GribDetId entity. @author MyEclipse Persistence Tools
 */
public class GribDetId extends AbstractGribDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GribDetId() {
	}

	/** minimal constructor */
	public GribDetId(String gribDomain, Double oidGribDet) {
		super(gribDomain, oidGribDet);
	}

	/** full constructor */
	public GribDetId(Integer gribRunId, String gribAnCode, String gribLinkCode,
			String gribLinkType, String gribDesc, Integer gribLevel,
			Boolean gribSelect, Integer gribBasepage, Integer gribPages,
			String gribUser1, String gribUser2, String gribQadc01,
			String gribDomain, Double oidGribDet) {
		super(gribRunId, gribAnCode, gribLinkCode, gribLinkType, gribDesc,
				gribLevel, gribSelect, gribBasepage, gribPages, gribUser1,
				gribUser2, gribQadc01, gribDomain, oidGribDet);
	}

}
