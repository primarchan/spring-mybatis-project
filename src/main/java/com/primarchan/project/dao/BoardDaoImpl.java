package com.primarchan.project.dao;

import com.primarchan.project.domain.BoardDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDaoImpl implements BoardDao {
    @Autowired
    SqlSession session;

    String namespace = "com.primarchan.project.dao.BoardMapper.";

    public BoardDto select(int bno) throws Exception {
        return session.selectOne(namespace+"select", bno);
    }
}
