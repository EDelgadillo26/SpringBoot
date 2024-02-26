package com.infsis.example.Services.implement;

import com.infsis.example.DTOs.ArticleDTO;
import com.infsis.example.Models.Article;
import com.infsis.example.Services.ArticleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {


    @Override
    public Optional<ArticleDTO> getArticleById(Integer articleId) {
        return Optional.empty();
    }

    @Override
    public ArticleDTO saveArticle(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public void delete(Integer articleId) {

    }

    private ArticleDTO ArticletoDto(Article article){
        ArticleDTO articleDTO=new ArticleDTO(
                article.getId(),
                article.getTitle()
        );
        return articleDTO;
    }

    private Article DtoToArticle(ArticleDTO articleDTO){
        Article article=new Article();
        article.setTitle(articleDTO.getTitle());
        return article;
    }
}
