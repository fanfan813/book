package bookshop.service;

import bookshop.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * @Description:
 * @author: Administrator
 * @date: 2018/3/29 19:05
 */
public interface UserService extends IService<User>{
    public boolean existUser(String mobile);
}
