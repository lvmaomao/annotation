package com.qingsongchou.social.annotation;

import java.util.List;

/**
 * Created by kuangwen on 16/12/7.
 */

public interface ICardMapInitializer {
    void initRouterTable(List<String> cardNameList, List<String> providerNameList);
}
