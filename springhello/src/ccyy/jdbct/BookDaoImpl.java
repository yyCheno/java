package ccyy.jdbct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class BookDaoImpl implements BookDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void display(){

    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from salaries";
        int count = jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }
}
