package com.primarchan.project.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class PageHandlerTest {

    @Test
    public void test1() {
        PageHandler pageHandler = new PageHandler(250,1);
        pageHandler.print();
        System.out.println("pageHandler" + pageHandler);
        assertTrue(pageHandler.getBeginPage() == 1);
        assertTrue(pageHandler.getEndPage() == 10);
    }

    @Test
    public void test2() {
        PageHandler pageHandler = new PageHandler(250,11);
        pageHandler.print();
        System.out.println("pageHandler" + pageHandler);
        assertTrue(pageHandler.getBeginPage() == 11);
        assertTrue(pageHandler.getEndPage() == 20);
    }

    @Test
    public void test3() {
        PageHandler pageHandler = new PageHandler(255,25);
        pageHandler.print();
        System.out.println("pageHandler" + pageHandler);
        assertTrue(pageHandler.getBeginPage() == 21);
        assertTrue(pageHandler.getEndPage() == 26);
    }
}