package com.infsis.example.Services;

import com.infsis.example.DTOs.ArticleDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface ArticleService {

    /*
    Lista de servicios que serán implementados es decir
    aqui van los métodos que proporcionaran la funcionalidad a nuestra aplicación
    */
    Optional<ArticleDTO> getArticleById(Integer articleId);

    ArticleDTO saveArticle(ArticleDTO articleDTO);

    ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO);
    void delete(Integer articleId);
}
