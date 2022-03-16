package com.department.model;

public class TechDepartment extends SuperDepartment {
	
	private String departmentName;
	private String todayWork; 
	private String workDeadline;
	private String techStackInfo;
	
	public TechDepartment() {
		
		super();
		this.departmentName = " Tech Department";
		this.todayWork = "Complete coding of Module 1"; 
		this.workDeadline = "Complete by EOD ";
		this.techStackInfo = " Core Java";
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
	
	public String getTechStackInformation() {
		
		return techStackInfo;
	}

}
