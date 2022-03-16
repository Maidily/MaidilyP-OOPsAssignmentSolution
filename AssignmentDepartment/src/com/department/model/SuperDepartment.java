package com.department.model;

public class SuperDepartment {
	
	private String departmentName;
	private String todayWork;
	private String workDeadline;
	private String holidayDtls;
	
	public SuperDepartment() {

		this.departmentName = " Super Department";
		this.todayWork = " No Work as of now";
		this.workDeadline = " Nil ";
		this.holidayDtls = "Today is not a Holiday";
	}

	public String departmentName() {
		
		return departmentName;
	}
	
	public String getTodaysWork() {
		
		return todayWork;
	}

	public String getWorkDeadline() {
		
		return workDeadline;
	}
	
	public String isTodayAHoliday() {
		
		return holidayDtls;
	}

}
