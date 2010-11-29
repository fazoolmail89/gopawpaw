package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SufMstr entity. @author MyEclipse Persistence Tools
 */
public class SufMstr extends AbstractSufMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SufMstr() {
	}

	/** minimal constructor */
	public SufMstr(SufMstrId id, String sufAbsFldName, String sufFldName,
			String sufFldValue, Boolean sufFldPrompt, String sufValidate,
			String sufModUserid, String sufUserc01, String sufUserc02,
			String sufQadc01, String sufQadc02, Double oidSufMstr) {
		super(id, sufAbsFldName, sufFldName, sufFldValue, sufFldPrompt,
				sufValidate, sufModUserid, sufUserc01, sufUserc02, sufQadc01,
				sufQadc02, oidSufMstr);
	}

	/** full constructor */
	public SufMstr(SufMstrId id, String sufAbsFldName, String sufFldName,
			String sufFldValue, Boolean sufFldPrompt, String sufValidate,
			String sufModUserid, Date sufModDate, String sufUserc01,
			String sufUserc02, String sufQadc01, String sufQadc02,
			Double oidSufMstr) {
		super(id, sufAbsFldName, sufFldName, sufFldValue, sufFldPrompt,
				sufValidate, sufModUserid, sufModDate, sufUserc01, sufUserc02,
				sufQadc01, sufQadc02, oidSufMstr);
	}

}
