package com.department.model;

public class AdminDepartment extends SuperDepartment {
	
	private String departmentName;
	private String todayWork; 
	private String workDeadline;
	
	public AdminDepartment() {

		super();
		this.departmentName = " Admin Department";
		this.todayWork = "Complete your documents Submission";
		this.workDeadline = "Complete by EOD ";		
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

}
