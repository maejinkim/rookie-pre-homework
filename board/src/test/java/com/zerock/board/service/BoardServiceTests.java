package com.zerock.board.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.zerock.board.dto.BoardDTO;

@SpringBootTest
public class BoardServiceTests {

    @Autowired
    private BoardService boardService;

    @Test
    public void testRegister() {

        BoardDTO dto = BoardDTO.builder()
                .title("Test.")
                .content("Test...")
                .writerEmail("user55@aaa.com") 
                .build();

        Long bno = boardService.register(dto);

    }

}
