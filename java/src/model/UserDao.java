package src.model;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import src.model.User;

public interface UserDao {

    int insert(@Param("pojo") User pojo);

    int insertList(@Param("pojos") List< User> pojo);

    List<User> select(@Param("pojo") User pojo);

    int update(@Param("pojo") User pojo);

}