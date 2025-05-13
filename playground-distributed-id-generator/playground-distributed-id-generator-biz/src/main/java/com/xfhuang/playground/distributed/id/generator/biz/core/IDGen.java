package com.xfhuang.playground.distributed.id.generator.biz.core;

import com.xfhuang.playground.distributed.id.generator.biz.core.common.Result;

public interface IDGen {
    Result get(String key);
    boolean init();
}
