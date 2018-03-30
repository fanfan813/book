package bookshop.controller;

import bookshop.entity.User;
import bookshop.service.UserService;
import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.xiaoleilu.hutool.lang.Snowflake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import java.awt.print.PrinterAbortException;
import java.security.PrivateKey;

/**
 * @Description:
 * @author: Administrator
 * @date: 2018/3/30 15:48
 */
@RestController
@RequestMapping("/")
public class RegisterController {
    @Resource
    private UserService userService;
    @Resource
    private Snowflake snowflake;

    @RequestMapping("/register")
    public ModelAndView register(HttpServletRequest request){
        ModelAndView mav=new ModelAndView("register");
        String mobile=request.getParameter("mobile");
        String password=request.getParameter("password");
        String profession=request.getParameter("profession");
        if(userService.existUser(mobile)){
            mav.addObject("existUser","alRegsit");
        }else {
            User user=new User();
            user.setUserId("u"+snowflake.nextId());
            user.setMobile(mobile);
            user.setPassword(password);
            user.setProfession(profession);
            userService.insert(user);
            mav.addObject("user",user);
        }
        return mav;
    }
}
