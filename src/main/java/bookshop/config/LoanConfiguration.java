package bookshop.config;

import com.xiaoleilu.hutool.lang.Snowflake;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * User: pacey
 * Date: 2018-03-20 11:32
 */
@Configuration
public class LoanConfiguration {

    /**
     * 雪花生成唯一id bean
     * @return
     */
    @Bean
    public Snowflake snowflake(@Value("${snowflaker.workId}")long workId, @Value("${snowflaker.datacentId}")long datacentId){
        return new Snowflake(workId,datacentId);
    }
}