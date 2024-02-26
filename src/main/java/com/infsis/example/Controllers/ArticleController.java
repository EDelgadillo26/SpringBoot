package com.infsis.example.Controllers;

import com.infsis.example.DTOs.ArticleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {

    /*
    ResponseEntity<T>
    Extiende de HttpEntity y agrega un HttpStatus (código de estado)

    HttpEntity<T>
    Representa una entidad de solicitud o respuesta HTTP, que consta de encabezados y cuerpo.
    */

    @GetMapping()
    public ResponseEntity<ArticleDTO> getArticles(){
        ArticleDTO articleDTO=new ArticleDTO(1,"articles");
        return ResponseEntity.ok().body(articleDTO);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<ArticleDTO> getArticle(@PathVariable Integer id){
        ArticleDTO articleDTO=new ArticleDTO(1,"article");
        return ResponseEntity.ok().body(articleDTO);
    }

    @PostMapping()
    public ResponseEntity<ArticleDTO> saveArticle(@RequestBody ArticleDTO articleDTO){

        return ResponseEntity.ok().body(articleDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ArticleDTO> updateArticle(@PathVariable Integer id,@RequestBody ArticleDTO articleDTO){
        return ResponseEntity.ok().body(articleDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable Integer id){

    }

}
