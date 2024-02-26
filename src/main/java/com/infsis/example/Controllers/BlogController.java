package com.infsis.example.Controllers;

import com.infsis.example.DTOs.BlogDTO;
import com.infsis.example.Models.Blog;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {

    /*
    ResponseEntity<T>
    Extiende de HttpEntity y agrega un HttpStatus (código de estado)

    HttpEntity<T>
    Representa una entidad de solicitud o respuesta HTTP, que consta de encabezados y cuerpo.
    */

    @GetMapping()
    public ResponseEntity<BlogDTO> getBlogs(){
        BlogDTO blogDTO=new BlogDTO(1,"blogs");
        return ResponseEntity.ok().body(blogDTO);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<BlogDTO> getBlog(@PathVariable Integer id){
        BlogDTO blogDTO=new BlogDTO(1,"blog");
        return ResponseEntity.ok().body(blogDTO);
    }

    @PostMapping()
    public ResponseEntity<BlogDTO> saveBlog(@RequestBody BlogDTO blogDTO){

        return ResponseEntity.ok().body(blogDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BlogDTO> updateBlog(@PathVariable Integer id,@RequestBody BlogDTO blogDTO){
        return ResponseEntity.ok().body(blogDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteBlog(@PathVariable Integer id){

    }

}
