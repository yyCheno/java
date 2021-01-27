package ccyymail.product.dao;

import ccyymail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ccyy
 * @email 15016250640@163.com
 * @date 2021-01-27 20:57:56
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
