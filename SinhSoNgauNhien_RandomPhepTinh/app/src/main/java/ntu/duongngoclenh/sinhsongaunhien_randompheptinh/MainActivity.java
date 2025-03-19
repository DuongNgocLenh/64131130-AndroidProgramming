package ntu.duongngoclenh.sinhsongaunhien_randompheptinh;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

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
    EditText pheptinh;
    Button thapphan;
    Button btn0, btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,delete;
    public void TimDieuKhien(){
        soA = findViewById(R.id.edtA);
        soB = findViewById(R.id.edtB);
        ketqua = findViewById(R.id.KQ);
        kiemtra = findViewById(R.id.KT);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        pheptinh = findViewById(R.id.PhepTinh);
        thapphan = findViewById(R.id.btntp);
        delete = findViewById(R.id.btndlt);
    }
    void SinhSoNgauNhien(){
        int a = (int) (Math.random() * 5)+1;
        int b = (int) (Math.random() * 5)+1;
        String pt4[] = {"+","-","*","/"};
        String pt =pt4[(int)(Math.random()*4)];
        pheptinh.setText(String.valueOf(pt));
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
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketqua.append("0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketqua.append("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketqua.append("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketqua.append("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketqua.append("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketqua.append("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketqua.append("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketqua.append("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketqua.append("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketqua.append("9");
            }
        });
        thapphan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketqua.append(".");
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketqua.setText("");
            }
        });
        kiemtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(soA.getText().toString());
                double num2 = Double.parseDouble(soB.getText().toString());
                double kiemtrakq = Double.parseDouble(ketqua.getText().toString());
                String pt = pheptinh.getText().toString();
                double kqdung = 0.0;
                switch (pt){
                    case "+":
                        kqdung = num1+num2;
                        break;
                    case "-":
                        kqdung = num1-num2;
                        if(kqdung < 0){
                            Toast.makeText(MainActivity.this,"Ket qua < 0",Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case "*":
                        kqdung = num1*num2;
                        break;
                    case "/":
                        kqdung = num1/num2;
                        if(num2==0){
                            Toast.makeText(MainActivity.this,"Khong the chia 0!",Toast.LENGTH_SHORT).show();
                        }
                }
                if(kqdung == kiemtrakq){
                    Toast.makeText(MainActivity.this,"Ket qua dung!",Toast.LENGTH_SHORT).show();
                    ketqua.setText("");
                }else
                {
                    Toast.makeText(MainActivity.this,"Ket qua sai!",Toast.LENGTH_SHORT).show();
                    ketqua.setText("");
                }
                SinhSoNgauNhien();
            }
        });
    }
}