package com.example.basespringboottest.service;

import org.springframework.web.multipart.MultipartFile;

public interface StorageService {
  String storeFile(MultipartFile file, String fileName);
}
