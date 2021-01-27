package ccyymail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ccyymail.common.utils.PageUtils;
import ccyymail.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author ccyy
 * @email 15016250640@163.com
 * @date 2021-01-27 20:57:55
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

