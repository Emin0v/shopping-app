package com.company.filestore.service.impl;

import com.company.filestore.service.FileStoreService;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import reactor.core.publisher.Mono;

import java.io.File;
import java.nio.file.Files;

@Service
public class FileStoreServiceImpl implements FileStoreService {

    @Override
    public Mono<byte[]> getImage(String id) throws Exception {
        File file = ResourceUtils.getFile("classpath:product-images/phone.png");

        return Mono.just(Files.readAllBytes(file.toPath()));
    }
}
