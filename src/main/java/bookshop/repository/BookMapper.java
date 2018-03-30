package bookshop.repository;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import bookshop.entity.Book;


/**
 * @Description:
 * @author: Administrator
 * @date: 2018/3/29 19:04
 */
@Mapper
public interface BookMapper extends BaseMapper<Book>{
}
