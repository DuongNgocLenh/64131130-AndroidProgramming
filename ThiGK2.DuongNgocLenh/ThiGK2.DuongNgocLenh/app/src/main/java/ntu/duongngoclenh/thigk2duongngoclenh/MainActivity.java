package ntu.duongngoclenh.thigk2duongngoclenh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button cn2 = findViewById(R.id.btn2);
        Button cn3 = findViewById(R.id.btn3);
        Button cn4 = findViewById(R.id.btn4);
        Button me = findViewById(R.id.btnMe);
        Button them = findViewById(R.id.btnThem);
        cn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh2 = new Intent(MainActivity.this, ChucNang2.class);
                startActivity(mh2);
            }
        });
        cn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh3 = new Intent(MainActivity.this, ChucNang3.class);
                startActivity(mh3);
            }
        });
        cn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh4 = new Intent(MainActivity.this, ChucNang4.class);
                startActivity(mh4);
            }
        });
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutme = new Intent(MainActivity.this, AboutMe.class);
                startActivity(aboutme);
            }
        });
        them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lamthem = new Intent(MainActivity.this, ChuViDienTichHV.class);
                startActivity(lamthem);
            }
        });
    }
}