package com.example.demo11111.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;

@Service
@Transactional
public class BookCoverService {
    @Value("covers")
    private String coversDir;

    private final BookService bookService;

    private final BookCoverService bookCoverService;

    public BookCoverService(BookService bookService, BookCoverService bookCoverService) {
        this.bookService = bookService;
        this.bookCoverService = bookCoverService;
    }

    public void uploadCover(Long id, MultipartFile cover) {

    }
}
