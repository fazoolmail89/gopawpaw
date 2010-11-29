package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSypjDetId entity provides the base persistence definition of the
 * SypjDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSypjDetId implements java.io.Serializable {

	// Fields

	private String sypjProflId;
	private String sypjJoinProfl;
	private String sypjRelation;

	// Constructors

	/** default constructor */
	public AbstractSypjDetId() {
	}

	/** full constructor */
	public AbstractSypjDetId(String sypjProflId, String sypjJoinProfl,
			String sypjRelation) {
		this.sypjProflId = sypjProflId;
		this.sypjJoinProfl = sypjJoinProfl;
		this.sypjRelation = sypjRelation;
	}

	// Property accessors

	public String getSypjProflId() {
		return this.sypjProflId;
	}

	public void setSypjProflId(String sypjProflId) {
		this.sypjProflId = sypjProflId;
	}

	public String getSypjJoinProfl() {
		return this.sypjJoinProfl;
	}

	public void setSypjJoinProfl(String sypjJoinProfl) {
		this.sypjJoinProfl = sypjJoinProfl;
	}

	public String getSypjRelation() {
		return this.sypjRelation;
	}

	public void setSypjRelation(String sypjRelation) {
		this.sypjRelation = sypjRelation;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSypjDetId))
			return false;
		AbstractSypjDetId castOther = (AbstractSypjDetId) other;

		return ((this.getSypjProflId() == castOther.getSypjProflId()) || (this
				.getSypjProflId() != null
				&& castOther.getSypjProflId() != null && this.getSypjProflId()
				.equals(castOther.getSypjProflId())))
				&& ((this.getSypjJoinProfl() == castOther.getSypjJoinProfl()) || (this
						.getSypjJoinProfl() != null
						&& castOther.getSypjJoinProfl() != null && this
						.getSypjJoinProfl()
						.equals(castOther.getSypjJoinProfl())))
				&& ((this.getSypjRelation() == castOther.getSypjRelation()) || (this
						.getSypjRelation() != null
						&& castOther.getSypjRelation() != null && this
						.getSypjRelation().equals(castOther.getSypjRelation())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSypjProflId() == null ? 0 : this.getSypjProflId()
						.hashCode());
		result = 37
				* result
				+ (getSypjJoinProfl() == null ? 0 : this.getSypjJoinProfl()
						.hashCode());
		result = 37
				* result
				+ (getSypjRelation() == null ? 0 : this.getSypjRelation()
						.hashCode());
		return result;
	}

}