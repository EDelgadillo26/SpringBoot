package com.infsis.example.DTOs;

public class BlogDTO {

    /*Si bien el id puede no relevante se muestra este dato al Usuario Final (En la UI),
     si es necesario para la parte del Cliente(Una Aplicación FrontEnd)
     debido a que necesita del id para interactuar cuando se tenga un Delete, Update
     y para obtener un Usuario por su id
    */

    private Integer id;
    private String name;

    public BlogDTO(Integer id,String name) {

        this.id = id;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
