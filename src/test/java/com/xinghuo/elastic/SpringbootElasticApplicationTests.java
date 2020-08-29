package com.xinghuo.elastic;

import com.xinghuo.elastic.bean.Book;
import com.xinghuo.elastic.repository.BookRespository;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.security.RunAs;


@SpringBootTest
class SpringbootElasticApplicationTests {


    @Autowired
    private BookRespository bookRespository;

    @Test
    void contextLoadsSave() {
        Book book = new Book();
        book.setId("111");
        book.setName("ces");
        book.setTitle("ceeee");
        bookRespository.save(book);

    }
    @Test
    void contextLoadsSearch() {
        Book book = new Book();
        book.setId("111");
        book.setName("ces");
        book.setTitle("ceeee");
        bookRespository.save(book);

    }
}
