package mate.academy.mate.service;

import jakarta.persistence.EntityNotFoundException;
import mate.academy.mate.dto.BookDto;
import mate.academy.mate.dto.CreateBookRequestDto;
import mate.academy.mate.mapper.BookMapper;
import mate.academy.mate.model.Book;
import mate.academy.mate.repository.BookRepository;

import java.util.List;

public class BookServiceImpl implements BookService{

    private BookRepository repository;
    private BookMapper bookMapper;

    @Override
    public List<BookDto> getAll() {
        return repository.findAll().stream()
                .map(bookMapper::toDto)
                .toList();
    }

    @Override
    public BookDto getById(Long id) {
        Book book = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Book not found !"));
        return bookMapper.toDto(book);
    }

    @Override
    public BookDto create(CreateBookRequestDto dto) {
        Book book = bookMapper.toModel(dto);
        book = repository.save(book);
        return bookMapper.toDto(book);
    }
}
