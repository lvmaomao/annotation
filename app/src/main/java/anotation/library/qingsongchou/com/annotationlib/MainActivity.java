package anotation.library.qingsongchou.com.annotationlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.qingsongchou.lib.annotation.CardMap;

@CardMap(AAabbbb.class)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
