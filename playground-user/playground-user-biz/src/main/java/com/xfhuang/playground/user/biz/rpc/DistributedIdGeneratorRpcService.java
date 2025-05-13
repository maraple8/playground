package com.xfhuang.playground.user.biz.rpc;

import com.xfhuang.playground.distributed.id.generator.api.DistributedIdGeneratorFeignApi;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;


@Component
public class DistributedIdGeneratorRpcService {

    @Resource
    private DistributedIdGeneratorFeignApi distributedIdGeneratorFeignApi;


    private static final String BIZ_TAG_playground_ID = "leaf-segment-playground-id";


    private static final String BIZ_TAG_USER_ID = "leaf-segment-user-id";


    public String getplaygroundId() {
        return distributedIdGeneratorFeignApi.getSegmentId(BIZ_TAG_playground_ID);
    }


    public String getUserId() {
        return distributedIdGeneratorFeignApi.getSegmentId(BIZ_TAG_USER_ID);
    }
}
