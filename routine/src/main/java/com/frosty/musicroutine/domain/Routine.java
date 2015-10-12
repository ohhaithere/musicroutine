package com.frosty.musicroutine.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "routine")
public class Routine {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Integer id;

	@Column(name = "routine_name")
	private String routine_name;

	@Column(name = "routine_html")
	private String routine_html;

	@Column(name = "instrument")
	private String instrument;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoutine_name() {
		return routine_name;
	}

	public void setRoutine_name(String routine_name) {
		this.routine_name = routine_name;
	}

	public String getRoutine_html() {
		return routine_html;
	}

	public void setRoutine_html(String routine_html) {
		this.routine_html = routine_html;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	
}
