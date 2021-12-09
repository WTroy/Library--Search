package com.sx.library.test.bean;

import java.io.Serializable;

/**
 * @author wanghao
 */
public class BookInfo implements Serializable {
    private String name;
    private String bookNo;
    private String local;

    public BookInfo(String name, String bookNo, String local) {
        this.name = name;
        this.bookNo = bookNo;
        this.local = local;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
