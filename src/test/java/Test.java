import com.qf.wly.entity.User;
import com.qf.wly.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {
    public static void main(String[] args) {
        //工厂模式
        //构造者模式
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Test.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession session = sqlSessionFactory.openSession(true);
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectById(2);
        System.out.println(user);
    }
}
