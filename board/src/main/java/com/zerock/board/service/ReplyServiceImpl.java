package com.zerock.board.service;

import com.zerock.board.dto.ReplyDTO;
import com.zerock.board.entity.Board;
import com.zerock.board.entity.Reply;
import com.zerock.board.repository.ReplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {

    private final ReplyRepository repository;

    @Override
    public Long register(ReplyDTO replyDTO) {
        Reply reply = dtoToEntity(replyDTO);
        repository.save(reply);
        return reply.getRno();
    }

    @Override
    public List<ReplyDTO> getList(Long bno) {
        List<Reply> result = repository.getRepliesByBoardOrderByRno(Board.builder().bno(bno).build());
        return result.stream().map(reply -> entityToDTO(reply)).collect(Collectors.toList());
    }

    @Override
    public void modify(ReplyDTO replyDTO) {
        Reply reply = dtoToEntity(replyDTO);
        repository.save(reply);
    }

    @Override
    public void remove(Long rno) {
        repository.deleteById(rno);
    }
}
