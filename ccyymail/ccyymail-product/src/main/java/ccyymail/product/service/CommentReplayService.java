package ccyymail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ccyymail.common.utils.PageUtils;
import ccyymail.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author ccyy
 * @email 15016250640@163.com
 * @date 2021-01-27 20:57:55
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

