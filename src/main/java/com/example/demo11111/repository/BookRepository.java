package com.example.demo11111.repository;

import com.example.demo11111.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByNameIgnoreCase(String name);

    Collection<Book> findBooksByAuthorContainsIgnoreCase(String author);

    Collection<Book> findALLByNameContainsIgnoreCase(String author);

    Collection<Book> findBooksByNameOrAuthorAndIdGreaterThan(String name, String author, Long number);


}
