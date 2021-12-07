package com.ssafy.vue.model.service;

import java.util.List;

import com.ssafy.vue.model.CommentDto;

public interface CommentService {
	public boolean comment(CommentDto commentDto) throws Exception;
	public List<CommentDto> getComments(int articleno) throws Exception;
}
