package com.innoventes.test.app.exception;

public class CompanyNotFoundException extends Exception{
    public CompanyNotFoundException(){
        super("unable to find company by id");
    }
}
