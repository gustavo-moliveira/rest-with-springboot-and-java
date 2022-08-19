package br.com.erudio.repositories;

import br.com.erudio.models.Book;
import br.com.erudio.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}