package ntu.duongngoclenh.sinhsongaunhien_cong;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText soA;
    EditText soB;
    EditText ketqua;
    Button kiemtra;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    void TimDieuKhien(){
        soA = findViewById(R.id.edtA);
        soB = findViewById(R.id.edtB);
        ketqua = findViewById(R.id.KQ);
        kiemtra = findViewById(R.id.KT);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }
    void SinhSoNgauNhien(){
        int a = (int) (Math.random() * 5);
        int b = (int) (Math.random() * 5);
        int kqdung = a+b;
        soA.setText(String.valueOf(a));
        soB.setText(String.valueOf(b));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        SinhSoNgauNhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        kiemtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}