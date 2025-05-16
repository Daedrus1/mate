package mate.academy.mate.service;

import mate.academy.mate.dto.BookDto;
import mate.academy.mate.dto.CreateBookRequestDto;

import java.util.List;

public interface BookService {

    List<BookDto> getAll();

    BookDto getById(Long id);

    BookDto create(CreateBookRequestDto dto);
}
