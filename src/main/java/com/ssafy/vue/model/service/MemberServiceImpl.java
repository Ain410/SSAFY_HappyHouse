package com.ssafy.vue.model.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.model.MemberDto;
import com.ssafy.vue.model.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private MemberMapper mapper;
	
	@Override
	public MemberDto login(MemberDto memberDto) throws Exception {
		if(memberDto.getUserid() == null || memberDto.getUserpwd() == null)
			return null;
		return sqlSession.getMapper(MemberMapper.class).login(memberDto);
	}

	@Override
	public MemberDto userInfo(String userid) throws Exception {
		return sqlSession.getMapper(MemberMapper.class).userInfo(userid);
	}
	@Override
	public int registMember(MemberDto memberDto) throws Exception {
		// TODO Auto-generated method stub
		return mapper.registMember(memberDto);
	}

	@Override
	public int updateMember(MemberDto memberDto) throws Exception {
		// TODO Auto-generated method stub
		return mapper.updateMember(memberDto);
	}


	@Override
	public int deleteMember(String userid) throws Exception {
		// TODO Auto-generated method stub
		return mapper.deleteMember(userid);
	}

}
