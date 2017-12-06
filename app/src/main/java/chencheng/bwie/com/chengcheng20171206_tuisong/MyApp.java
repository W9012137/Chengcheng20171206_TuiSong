package chencheng.bwie.com.chengcheng20171206_tuisong;

import android.app.Application;

import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;

/**
 * Created by dell on 2017/12/6.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Config.DEBUG=true;

    }{
        PlatformConfig.setWeixin("","");
        PlatformConfig.setQQZone("1106577948","K96acHJ690OOVHaL");
        PlatformConfig.setSinaWeibo("","","");
    }
}
