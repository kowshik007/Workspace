package com.application.start.service;
import com.application.start.bean.*;
import com.application.start.JPARepo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
	@Autowired
	private ArticleRepository articleRepo;
	public List<Article> getArticlesService(){
		List<Article> articles=new ArrayList<>();
		articleRepo.findAll().forEach(articles::add);
		return articles;
	}
	public Optional<Article> getArticle(int id) {
		return articleRepo.findById(id);
	}
	public String addArticle(Article a) {
		articleRepo.save(a);
		return "The record added successfully";
	}
	public String saveArticle(Article a) {
		articleRepo.save(a);
		return "Success";
	}
}
