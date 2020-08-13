package com.zhijie.dao;

import com.zhijie.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    //增加一本书
    int addBook(Book books);

    //删除一本书
    int deteBook(@Param("bookID") int id);

    //更新一本书
    int updateBook(Book books);

    //查询一本书
    Book findByIDBook(@Param("bookID") int id);

    //查询全部的书
    List<Book> FindAllBook();

   List<Book>queryBookByName(@Param("bookName") String bookName);
}
