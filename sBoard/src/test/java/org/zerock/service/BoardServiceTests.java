package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {org.zerock.config.RootConfig.class})
@Log4j
public class BoardServiceTests {
	@Setter(onMethod_ = @Autowired)
	private BoardService service;
	
	@Test
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}
	
	@Test
	public void testGetList(){
		//service.getList().forEach(board -> log.info(board));
		service.getList(new Criteria(2, 10)).forEach(board -> log.info(board));
	}
	
	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("jsp에서 새로 작성한 title");
		board.setContent("jsp에서 새로 작성한 content");
		board.setWriter("jsp");
		
		service.register(board);
		
		log.info("생성된 게시물의 변호 : " + board.getBno());
	}
	
	@Test
	public void testGet() {
		log.info(service.get(29L));
	}	
	
	@Test 
	public void testRemove() {
		log.info(service.remove(27L));
	}
	
	@Test
	public void testUpdate() {
		BoardVO board = service.get(29L);
		
		if (board == null) {
			return;
		}
		
		board.setTitle("제목 수정");
		log.info("MODIFY RESULT : " + service.modify(board));
	}
	
	
	
}
