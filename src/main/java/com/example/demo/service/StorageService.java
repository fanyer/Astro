package com.example.demo.service;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {
    void init();

    void store(MultipartFile file);

    Stream<Path> loadAll();

    Path load(String filename);

    ServerProperties.Tomcat.Resource loadAsResource(String filename);

    void deleteAll();
}