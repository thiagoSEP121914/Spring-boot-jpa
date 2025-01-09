package com.projeto_java.curso_spring.services.exeception;

public class ResourceNotFoundExecption extends RuntimeException{

    public ResourceNotFoundExecption (Object id) {
        super("Resource not found. id" + id);
    }

}
