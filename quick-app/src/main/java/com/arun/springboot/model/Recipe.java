/**
 * 
 */
package com.arun.springboot.model;

import java.util.List;

/**
 * @author arun
 *
 */
public class Recipe {

	private String name;
	private List<String> ingredients;
	private String type;
	private String desc;

	public Recipe(String name, String type, String desc) {
		this.name = name;
		this.type = type;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
