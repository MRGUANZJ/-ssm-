package com.zhijie.service;

import com.zhijie.dao.BookMapper;
import com.zhijie.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


import java.util.List;
//@Service
public class BookServiceimpl implements BookService {
  //  @Autowired
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Book books) {
        return bookMapper.addBook(books);
    }

    public int deteBook(int id) {
        return bookMapper.deteBook(id);
    }

    public int updateBook(Book books) {
        return bookMapper.updateBook(books);
    }

    public Book findByIDBook(int id) {
        return bookMapper.findByIDBook(id);
    }

    public List<Book> FindAllBook() {
        return bookMapper.FindAllBook();
    }

    public List<Book> queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
