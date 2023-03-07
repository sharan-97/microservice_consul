package com.infytel.calldetails.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "calldetails")
public class CallDetails {

	@Id
	@GeneratedValue
	long id;
	@Column(nullable = false)
	long calledBy;
	@Column(nullable = false)
	long calledTo;
	@Column(nullable = false)
	Date calledOn;
	@Column(nullable = false)
	int duration;

	public CallDetails() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCalledBy() {
		return calledBy;
	}

	public void setCalledBy(long calledBy) {
		this.calledBy = calledBy;
	}

	public long getCalledTo() {
		return calledTo;
	}

	public void setCalledTo(long calledTo) {
		this.calledTo = calledTo;
	}

	public Date getCalledOn() {
		return calledOn;
	}

	public void setCalledOn(Date calledOn) {
		this.calledOn = calledOn;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "CallDetails [id=" + id + ", calledBy=" + calledBy + ", calledTo=" + calledTo + ", calledOn=" + calledOn
				+ ", duration=" + duration + "]";
	}

}
