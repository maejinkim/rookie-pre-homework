package org.zerock.guestbook.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.guestbook.dto.GuestbookDTO;

@Service
@Log4j2
public class GuestbookServiceImpl implements GuestbookService {

    @Override
    public Long register(GuestbookDTO dto) {
        return null;
    }
}
