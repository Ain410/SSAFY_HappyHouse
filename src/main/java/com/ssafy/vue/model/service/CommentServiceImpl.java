package com.ssafy.vue.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.model.CommentDto;
import com.ssafy.vue.model.mapper.CommentMapper;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public boolean comment(CommentDto commentDto) throws Exception {
		if(commentDto.getContent() == null) {
			throw new Exception();
		}
		return sqlSession.getMapper(CommentMapper.class).comment(commentDto) == 1;
	}

	@Override
	public List<CommentDto> getComments(int articleno) throws Exception {
		return sqlSession.getMapper(CommentMapper.class).getComments(articleno);
	}

}
