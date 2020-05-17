package com.company.project.stu49;


public class StudentBean {
    private String sId;
    private String sName;
    private String sSex;

    public StudentBean(){}
    public StudentBean(String sid, String sname, String ssex){
    	this.sId=sid;
        this.sName=sname;
        this.sSex=ssex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sId + '\'' +
                ", sname='" + sName + '\'' +
                ", ssex='" + sSex + '\'' +
                '}';
    }
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsSex() {
		return sSex;
	}
	public void setsSex(String sSex) {
		this.sSex = sSex;
	}

}
