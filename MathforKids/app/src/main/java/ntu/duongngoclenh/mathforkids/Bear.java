package ntu.duongngoclenh.mathforkids;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Bear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bear);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button da1 = findViewById(R.id.da1);
        Button da2 = findViewById(R.id.da2);
        Button da3 = findViewById(R.id.da3);
        Button da4 = findViewById(R.id.da4);
        ImageButton home = findViewById(R.id.btnhome);
        da1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bear.this,"Đáp án sai!",Toast.LENGTH_SHORT).show();
            }
        });
        da2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bear.this,"Đáp án sai!",Toast.LENGTH_SHORT).show();
            }
        });
        da3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bear.this,"Đáp án đúng!",Toast.LENGTH_SHORT).show();
            }
        });
        da4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bear.this,"Đáp án sai!",Toast.LENGTH_SHORT).show();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cbhome = new Intent(Bear.this,MainActivity.class);
                startActivity(cbhome);
            }
        });
    }
}