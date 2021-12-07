package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "CommentDto : 게시판 정보", description = "게시판에 필요한 정보를 나타낸다.")
@Data
public class CommentDto {
	@ApiModelProperty(value = "댓글번호")
	private int seq;
	
	@ApiModelProperty(value = "글번호")
	private int articleno;
	
	@ApiModelProperty(value = "댓글 내용")
	private String content;
	
	@ApiModelProperty(value = "작성자 아이디")
	private String writer;

}
