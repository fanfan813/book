package bookshop.config;

/**
 * @Description:
 * @author: Administrator
 * @date: 2018/3/21 15:08
 */
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MPConfig {

    /**
     * mybatis-plus SQL执行效率插件【生产环境可以关闭】
     */
/*    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }*/

    /**
     * mybatis-plus分页插件<br>
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
//        paginationInterceptor.setLocalPage(true);// 开启 PageHelper 的支持
        paginationInterceptor.setDialectType("mysql");
        return paginationInterceptor;
    }

}
