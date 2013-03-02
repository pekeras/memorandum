package in.andante.android.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloWorld2 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView _helloWorldWord = new TextView(this);
        _helloWorldWord.setText("Hello, world2");
        setContentView(_helloWorldWord);
    }
}