package com.goodness.studentdata;

public class Students {
	private int regnum;
	private int name;
	private int department;

	public int getRegnum() {
		return regnum;
	}

	public void setRegnum(int regnum) {
		this.regnum = regnum;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Students [regnum=" + regnum + ", name=" + name + ", department=" + department + "]";
	}


	

}
