package com.primarchan.project.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class PageHandlerTest {

    @Test
    public void test1() {
        PageHandler pageHandler = new PageHandler(250,1);
        pageHandler.print();
        System.out.println("pageHandler" + pageHandler);
        assertTrue(pageHandler.beginPage == 1);
        assertTrue(pageHandler.endPage == 10);
    }

    @Test
    public void test2() {
        PageHandler pageHandler = new PageHandler(250,11);
        pageHandler.print();
        System.out.println("pageHandler" + pageHandler);
        assertTrue(pageHandler.beginPage == 11);
        assertTrue(pageHandler.endPage == 20);
    }

    @Test
    public void test3() {
        PageHandler pageHandler = new PageHandler(255,25);
        pageHandler.print();
        System.out.println("pageHandler" + pageHandler);
        assertTrue(pageHandler.beginPage == 21);
        assertTrue(pageHandler.endPage == 26);
    }
}