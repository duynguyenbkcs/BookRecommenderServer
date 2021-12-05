package com.is.bookrecommender.mapper;

import com.is.bookrecommender.dto.BookDto;
import com.is.bookrecommender.dto.UserDto;
import com.is.bookrecommender.model.Author;
import com.is.bookrecommender.model.Book;
import com.is.bookrecommender.model.User;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class ApplicationMapper {
    public BookDto mapBookToBookDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setAuthors(book.getAuthor().stream().map(Author::getName).collect(Collectors.joining(",")));
        bookDto.setId(book.getId());
        bookDto.setImageURL(book.getImageURL());
        bookDto.setTitle(book.getTitle());
        bookDto.setPublishedYear(book.getPublishYear());
        return bookDto;
    }

    public UserDto mapUserToUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setAge(user.getAge());
        userDto.setUsername(user.getUsername());
        userDto.setCountry(user.getCountry());
        userDto.setMail(user.getMail());
        userDto.setName(user.getName());
        return  userDto;
    }
}
