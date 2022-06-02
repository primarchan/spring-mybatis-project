package com.primarchan.project.dao;

import com.primarchan.project.domain.BoardDto;

public interface BoardDao {
    BoardDto select(int bno) throws Exception;
}
