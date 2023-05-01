package org.example;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Mensageiro {

    public static void main(String[] args) throws InterruptedException {

        log.warn("Iniciando o programa.");
        System.out.println("Hello world!");

        log.info("Iniciando o sleep");
        Thread.sleep(5000);
        log.info("Terminando o sleep");

        log.info("Iniciando o segundo sleep");
        Thread.sleep(5000);
        log.info("Terminando o programa");

    }
}