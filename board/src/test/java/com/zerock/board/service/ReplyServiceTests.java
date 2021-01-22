package com.zerock.board.service;

import com.zerock.board.dto.ReplyDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ReplyServiceTests {

    @Autowired
    private ReplyService service;

    @Test
    public void testGetList() {
        Long bno = 100L;

        List<ReplyDTO> result = service.getList(bno);

        result.forEach(replyDTO -> System.out.println(replyDTO));
     }
}
