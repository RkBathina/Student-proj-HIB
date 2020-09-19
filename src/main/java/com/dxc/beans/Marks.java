package com.dxc.beans;

public class Marks {
	int examid;
	int studentid;
	int sub1;
	int sub2;
	int sub3;
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marks(int examid, int studentid, int sub1, int sub2, int sub3) {
		super();
		this.examid = examid;
		this.studentid = studentid;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public int getExamid() {
		return examid;
	}
	public void setExamid(int examid) {
		this.examid = examid;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	@Override
	public String toString() {
		return "Marks [examid=" + examid + ", studentid=" + studentid + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3="
				+ sub3 + "]";
	}
	

}
