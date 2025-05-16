package mate.academy.mate.controller;

import lombok.RequiredArgsConstructor;
import mate.academy.mate.dto.BookDto;
import mate.academy.mate.dto.CreateBookRequestDto;
import mate.academy.mate.model.Book;
import mate.academy.mate.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@ResponseBody
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    @GetMapping
public List<BookDto> findAll(){
        return bookService.getAll();
    }
    @GetMapping("/{id}")
    public BookDto getById(@PathVariable Long id) {
        return bookService.getById(id);
    }

    @PostMapping
    public BookDto create(@RequestBody CreateBookRequestDto dto) {
        return bookService.create(dto);
    }

}
