package bookshop.service.impl;

import bookshop.entity.Book;
import bookshop.repository.BookMapper;
import bookshop.service.BookService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


/**
 * @Description:
 * @author: Administrator
 * @date: 2018/3/29 19:52
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper,Book> implements BookService{

}
