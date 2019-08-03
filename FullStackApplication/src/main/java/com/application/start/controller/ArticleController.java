package com.application.start.controller;
import com.application.start.bean.*;
import com.application.start.service.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	@RequestMapping(method = RequestMethod.GET,value="/Articles")
	public List<Article> getListOfArticles(){
		return articleService.getArticlesService();
	}
	@RequestMapping(method = RequestMethod.GET,value="/Articles/{id}")
	public Optional<Article> getArticle(@PathVariable("id") int id){
		return articleService.getArticle(id);
	}
}
