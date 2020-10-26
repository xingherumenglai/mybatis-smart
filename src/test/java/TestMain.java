import com.qf.wly.entity.Cate;
import com.qf.wly.entity.Product;
import com.qf.wly.mapper.CateMapper;
import com.qf.wly.mapper.ProductMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.math.BigDecimal;

public class TestMain {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().
                build(TestMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
        CateMapper mapper1 = sqlSession.getMapper(CateMapper.class);
        Cate cate = new Cate();
        cate.setName("小米");
        mapper1.insert(cate);
        System.out.println(cate.getCateId());

        for (int i = 0; i <2; i++) {
            Product product = new Product();
            product.setContent("1111" + i);
            product.setCateId(cate.getCateId());
            product.setPrice(new BigDecimal("9999.00"));
            product.setTitle("手机1111" + i);
            product.setImg("/imgs/phone/" + i + ".png");
            mapper.insert(product);
        }
    }
}
