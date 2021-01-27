package ccyymail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ccyymail.common.utils.PageUtils;
import ccyymail.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author ccyy
 * @email 15016250640@163.com
 * @date 2021-01-27 20:57:55
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

