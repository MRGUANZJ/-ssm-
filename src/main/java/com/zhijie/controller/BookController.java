package com.zhijie.controller;

import com.zhijie.pojo.Book;
import com.zhijie.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
//controller 调service层

   @Autowired
    @Qualifier("bookServiceimpl")
    private BookService bookService;

    //查询全部的书籍，并且返回到一个书籍展示页面
    @RequestMapping("/allbook")
    public String list(Model model){
    List<Book> bookList = bookService.FindAllBook();
    model.addAttribute("list",bookList);
    return "allbook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toaddbook")
 public String add(){
  return "addbook";
 }

 //增加书籍
 @RequestMapping("/addbook")
 public String addBook(Book book){
  System.out.println("addBook=>"+book);
  bookService.addBook(book);
     return "redirect:/book/allbook";
 }
   //删除图书
   @RequestMapping("/detebook")
   public String deteBook(int id){
    bookService.deteBook(id);
    return "redirect:/book/allbook";
   }

   //修改页面
   @RequestMapping("/toupdatebook")
   public String toupdateBook(int id,Model model){
       Book byIDBook = bookService.findByIDBook(id);
       model.addAttribute("update",byIDBook);
       return "updatebook";
   }
    //查询一本书籍，并且返回到书籍展示页面
    @RequestMapping("/updatebook")
    public String updateBook(Book book){
        System.out.println("updateBook=>"+book);
             bookService.updateBook(book);
        return "redirect:/book/allbook";
    }
    @RequestMapping("querybook1")
    public String findyByIDbook(String queryBookName,Model model){
        System.out.println("updateBook=>"+queryBookName);
        return "redirect:/book/allbook";
    }

    @RequestMapping("querybook")
    public String QueryBookName(String queryBookName,Model model){
        List<Book> list = bookService.queryBookByName(queryBookName);
        System.out.println(list);
        if (list==null){
            list=bookService.FindAllBook();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",list);
        return "allbook";
    }

}
