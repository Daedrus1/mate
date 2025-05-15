package mate.academy.mate.controller;

import lombok.RequiredArgsConstructor;
import mate.academy.mate.model.Book;
import mate.academy.mate.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequiredArgsConstructor
@ResponseBody
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    @GetMapping
public List<Book> findAll(){
        return null;
    }

}
