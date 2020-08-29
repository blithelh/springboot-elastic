package com.xinghuo.elastic.repository;

import com.xinghuo.elastic.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRespository extends ElasticsearchRepository<Book,String> {


}
