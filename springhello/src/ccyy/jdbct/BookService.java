package ccyy.jdbct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;
    public int findCount(){
        int count = bookDao.selectCount();
        return count;
    }

}
