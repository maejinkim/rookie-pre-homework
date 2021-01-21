package com.zerock.board.repository;


import com.zerock.board.entity.Board;
import com.zerock.board.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.stream.IntStream;

@SpringBootTest
public class BoardRepositoryTests {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void insertBoard() {

        IntStream.rangeClosed(1,100).forEach(i -> {

            Member member = Member.builder().email("user"+i +"@aaa.com").build();

            Board board = Board.builder()
                    .title("Title..."+i)
                    .content("Content...." + i)
                    .writer(member)
                    .build();

            boardRepository.save(board);

        });

    }

}
