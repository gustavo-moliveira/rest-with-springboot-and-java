package br.com.erudio.mapper.custom;

import br.com.erudio.data.vo.v2.BookVO;
import br.com.erudio.data.vo.v2.PersonVOV2;
import br.com.erudio.models.Book;
import br.com.erudio.models.Person;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BookMapper {
    public BookVO convertEntityToVo(Book book) {
        BookVO vo = new BookVO();
        vo.setKey(book.getId());
        vo.setAuthor(book.getAuthor());
        vo.setLaunchDate(book.getLaunchDate());
        vo.setPrice(book.getPrice());
        vo.setTitle(book.getTitle());

        return vo;
    }

//    public Book convertVoToEntity(BookVO book) {
//        Book entity = new Book();
//        entity.setId(book.getKey());
//        entity.setAuthor(book.getAuthor());
//        entity.setLaunchDate(book.getLaunchDate());
//        entity.setPrice(book.getPrice());
//        entity.setTitle(book.getTitle());
//        entity.setBirthday(new Date());
//
//        return entity;
//    }
}
