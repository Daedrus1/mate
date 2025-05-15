package mate.academy.mate.mapper;

import mate.academy.mate.dto.BookDto;
import mate.academy.mate.dto.CreateBookRequestDto;
import mate.academy.mate.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDto toDto(Book book);
    Book toEntity(CreateBookRequestDto dto);
}
