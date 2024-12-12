package com.kh.model.vo;

public class Member {
	
	private String member;
	private String memberPwd;
	
	public Member() {
		super();
	}
	public Member(String member, String memberPwd) {
		super();
		this.member = member;
		this.memberPwd = memberPwd;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	@Override
	public String toString() {
		return "Member [member=" + member + ", memberPwd=" + memberPwd + "]";
	}
	
	

}
