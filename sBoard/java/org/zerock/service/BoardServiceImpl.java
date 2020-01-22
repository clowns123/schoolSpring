package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Service
@Log4j
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{
	private BoardMapper mapper;
	
	/*
	@Override
	public List<BoardVO> getList() {
		log.info("BoardServiceImpl getList!!");
		// TODO Auto-generated method stub
		return mapper.getList();
	}
	*/

	@Override
	public List<BoardVO> getList(Criteria cri) {
		// TODO Auto-generated method stub
		
		log.info("get List with criteria : " + cri);
		return mapper.getListWritePaging(cri);
	}


	@Override
	public boolean modify(BoardVO board) {
		// TODO Auto-generated method stub
		log.info("BoardServiceImpl Modify " + board);
		return mapper.update(board) == 1;
	}


	@Override
	public boolean remove(Long bno) {
		// TODO Auto-generated method stub
		log.info("remove....." + bno);
		
		return mapper.delete(bno) == 1;
	}


	@Override
	public void register(BoardVO board) {
		// TODO Auto-generated method stub
		
		log.info("register...." + board);
		
		mapper.insert(board);
	}


	@Override
	public BoardVO get(Long bno) {
		// TODO Auto-generated method stub
		log.info("get..........." + bno);
		
		return mapper.read(bno);
		
	}


	@Override
	public int getTotal(Criteria cri) {
		// TODO Auto-generated method stub
		log.info("get total count");
		return mapper.getTotalCount(cri);
	}


}