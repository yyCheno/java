package ccyymail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ccyymail.common.utils.PageUtils;
import ccyymail.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author ccyy
 * @email 15016250640@163.com
 * @date 2021-01-27 20:57:56
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

