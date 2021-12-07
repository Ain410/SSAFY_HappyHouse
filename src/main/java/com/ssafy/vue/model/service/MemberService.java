package com.ssafy.vue.model.service;

import com.ssafy.vue.model.MemberDto;

public interface MemberService {

	public MemberDto login(MemberDto memberDto) throws Exception;
	public MemberDto userInfo(String userid) throws Exception;
	public int registMember(MemberDto memberDto) throws Exception;
	public int updateMember(MemberDto memberDto) throws Exception;
	public int deleteMember(String userid) throws Exception;
}
