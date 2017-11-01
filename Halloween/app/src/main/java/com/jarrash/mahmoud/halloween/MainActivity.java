package com.jarrash.mahmoud.halloween;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sayBoo(View view)
    {
        EditText nameTxt = (EditText) findViewById(R.id.nameEditText) ;
        TextView booTxt = (TextView) findViewById(R.id.msg);
        String name = nameTxt.getText().toString();
        booTxt.setText("Happy Halloween " + name);

        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.ghost);

    }
}
