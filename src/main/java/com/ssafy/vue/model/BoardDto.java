package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "BoardDto : 게시판 정보", description = "게시판에 필요한 정보를 나타낸다.")
@Data
public class BoardDto {
	@ApiModelProperty(value = "글번호")
	private int articleno;
	
	@ApiModelProperty(value = "작성자 아이디")
	private String userid;
	
	@ApiModelProperty(value = "글제목")
	private String subject;
	
	@ApiModelProperty(value = "글내용")
	private String content;
	
	@ApiModelProperty(value = "조회수")
	private int hit;
	
	@ApiModelProperty(value = "작성일")
	private String regtime;

}
