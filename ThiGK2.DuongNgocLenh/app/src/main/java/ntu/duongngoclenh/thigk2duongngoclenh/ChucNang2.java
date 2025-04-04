package ntu.duongngoclenh.thigk2duongngoclenh;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChucNang2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText edtA = findViewById(R.id.edtGK);
        EditText edtB = findViewById(R.id.edtCK);
        EditText ketqua = findViewById(R.id.edtKQ);
        Button tinh = findViewById(R.id.btnTinh);
        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float gk = Float.parseFloat(edtA.getText().toString());
                float ck = Float.parseFloat(edtB.getText().toString());
                float trungbinh = (gk * 50/100) + (ck*50/100);
                ketqua.setText(String.valueOf(trungbinh));
            }
        });
    }
}