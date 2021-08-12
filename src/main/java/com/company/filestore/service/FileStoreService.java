package com.company.filestore.service;

import reactor.core.publisher.Mono;

public interface FileStoreService {

    Mono<byte[]> getImage(String id) throws Exception;

}
