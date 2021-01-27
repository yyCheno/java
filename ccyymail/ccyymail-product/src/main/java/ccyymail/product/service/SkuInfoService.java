package ccyymail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ccyymail.common.utils.PageUtils;
import ccyymail.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author ccyy
 * @email 15016250640@163.com
 * @date 2021-01-27 20:57:55
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

