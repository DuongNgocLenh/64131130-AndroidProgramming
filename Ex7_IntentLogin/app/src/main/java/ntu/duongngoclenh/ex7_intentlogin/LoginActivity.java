package ntu.duongngoclenh.ex7_intentlogin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnXacNhan = (Button) findViewById(R.id.btnOK);

        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xu ly
                EditText edTenDN = (EditText) findViewById(R.id.edtUsername);
                EditText edPass = (EditText) findViewById(R.id.edtPass);
            }
        });
        }
    }