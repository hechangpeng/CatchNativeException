package demo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;

import com.aaaaaaa.demo.R;

import cn.onlinecache.breakpad.NativeBreakpad;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NativeBreakpad.init(MainActivity.this.getExternalFilesDir(Environment.DIRECTORY_PODCASTS).getAbsolutePath());
        findViewById(R.id.btnTestNDKCrash).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NativeBreakpad.testNativeCrash();
            }
        });
    }
}
