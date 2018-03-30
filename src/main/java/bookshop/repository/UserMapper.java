package bookshop.repository;

import bookshop.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @author: Administrator
 * @date: 2018/3/29 19:03
 */
@Mapper
public interface UserMapper extends BaseMapper<User>{
}
