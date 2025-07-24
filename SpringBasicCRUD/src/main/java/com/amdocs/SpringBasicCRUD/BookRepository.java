package com.amdocs.SpringBasicCRUD;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  BookRepository extends JpaRepository<Book, Long> {
    // This interface will automatically provide CRUD operations for Book entities
    // No additional methods are needed unless custom queries are required
    public Optional<Book> findByTitle(String title);
    
}
