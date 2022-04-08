package com.latinad.audiencia.persistence.errores;

public class ErrorServicio extends Exception {

    public ErrorServicio(String msn){
        super(msn);
    }
}