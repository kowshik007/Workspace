package com.application.start.JPARepo;

import org.springframework.data.repository.CrudRepository;

import com.application.start.bean.Article;

public interface ArticleRepository extends CrudRepository<Article,Integer> {
	
}
