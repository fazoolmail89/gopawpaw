package com.gopawpaw.erp.hibernate.l;

/**
 * LngdDetId entity. @author MyEclipse Persistence Tools
 */
public class LngdDetId extends AbstractLngdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public LngdDetId() {
	}

	/** full constructor */
	public LngdDetId(String lngdDataset, String lngdKey1, String lngdKey2,
			String lngdKey3, String lngdKey4, String lngdField, String lngdLang) {
		super(lngdDataset, lngdKey1, lngdKey2, lngdKey3, lngdKey4, lngdField,
				lngdLang);
	}

}
