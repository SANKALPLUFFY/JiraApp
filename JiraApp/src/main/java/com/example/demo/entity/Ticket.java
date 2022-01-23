package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String summary;
	String issue;
	String description;
	String reporter;
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", summary=" + summary + ", issueType=" + issue + ", description=" + description
				+ ", reporter=" + reporter + ", asignee=" + asignee + "]";
	}

	String asignee;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReporter() {
		return reporter;
	}

	public void setReporter(String reporter) {
		this.reporter = reporter;
	}

	public String getAsignee() {
		return asignee;
	}

	public void setAsignee(String asignee) {
		this.asignee = asignee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
