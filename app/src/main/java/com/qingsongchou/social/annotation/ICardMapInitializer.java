package com.qingsongchou.social.annotation;

import android.app.Activity;

import java.util.Map;

/**
 * Created by kuangwen on 16/12/7.
 */

public interface ICardMapInitializer {
    void initRouterTable(Map<String, Class<? extends Activity>> router);
}
