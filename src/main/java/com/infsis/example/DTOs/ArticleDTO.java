package com.infsis.example.DTOs;

public class ArticleDTO {

    /*Si bien el id puede no relevante se muestra este dato al Usuario Final (En la UI),
     si es necesario para la parte del Cliente(Una Aplicación FrontEnd)
     debido a que necesita del id para interactuar cuando se tenga un Delete, Update
     y para obtener un Usuario por su id
    */

    private Integer id;
    private String title;

    public ArticleDTO(Integer id,String title) {

        this.id = id;
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
