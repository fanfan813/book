package bookshop.service.impl;

import bookshop.entity.User;
import bookshop.repository.UserMapper;
import bookshop.service.UserService;
import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author: Administrator
 * @date: 2018/3/29 19:06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
    @Override
    public boolean existUser(String mobile) {
        Wrapper<User> con=new Condition();
        User user=selectOne(con);
        if (user==null)
            return false;
        else
            return true;
    }
}
