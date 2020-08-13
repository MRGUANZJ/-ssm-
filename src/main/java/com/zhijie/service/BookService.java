package com.zhijie.service;

import com.zhijie.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Book books);

    //删除一本书
    int deteBook(int id);

    //更新一本书
    int updateBook(Book books);

    //查询一本书
    Book findByIDBook(int id);

    //查询全部的书
    List<Book> FindAllBook();

    List<Book>queryBookByName(@Param("bookName") String bookName);
}
