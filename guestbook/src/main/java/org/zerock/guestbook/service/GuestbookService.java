package org.zerock.guestbook.service;

import org.zerock.guestbook.dto.GuestbookDTO;

public interface GuestbookService {
    Long register(GuestbookDTO dto);
}
