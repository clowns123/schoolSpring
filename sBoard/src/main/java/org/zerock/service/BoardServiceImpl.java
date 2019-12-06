package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Service
@Log4j
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{
	private BoardMapper mapper;
	
	
	@Override
	public List<BoardVO> getList() {
		log.info("BoardServiceImpl getList!!");
		// TODO Auto-generated method stub
		return mapper.getList();
	}
}
