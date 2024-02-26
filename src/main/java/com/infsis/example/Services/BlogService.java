package com.infsis.example.Services;

import com.infsis.example.DTOs.BlogDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface BlogService {

    /*
    Lista de servicios que serán implementados es decir
    aqui van los métodos que proporcionaran la funcionalidad a nuestra aplicación
    */
    Optional<BlogDTO> getBlogById(Integer blogId);

    BlogDTO saveBlog(BlogDTO blogDTO);

    BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO);
    void delete(Integer blogId);
}
