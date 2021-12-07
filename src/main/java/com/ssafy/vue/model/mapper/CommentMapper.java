package com.ssafy.vue.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.model.CommentDto;

@Mapper
public interface CommentMapper {
	public int comment(CommentDto commentDto) throws SQLException;
	public List<CommentDto> getComments(int articleno) throws SQLException;
}
