    package ntu.duongngoclenh.ex4_addsubmuldiv_onclick;

    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;

    import androidx.activity.EdgeToEdge;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.core.graphics.Insets;
    import androidx.core.view.ViewCompat;
    import androidx.core.view.WindowInsetsCompat;

    public class MainActivity extends AppCompatActivity {
        //Khai bao cac đối tượng gắn với đk tương ứng ở đây
        EditText so1;
        EditText so2;
        EditText editTextKQ;
        Button nutCong,nutTru,nutNhan,nutChia;
        void TimDieuKhien(){
            so1 = (EditText)findViewById(R.id.edtSO1);
            so2 = (EditText)findViewById(R.id.edtSO2);
            editTextKQ = (EditText)findViewById(R.id.edtKetQua);
            nutCong = (Button)findViewById(R.id.btnCong);
            nutTru = (Button)findViewById(R.id.btnTru);
            nutNhan = (Button)findViewById(R.id.btnNhan);
            nutChia = (Button)findViewById(R.id.btnChia);
        }
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Compiler EdgeToEdge;
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);
            TimDieuKhien();
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        //Xu Ly Cong
        public void XuLyCo
        ng(View v){
            //xu ly code
            String sothu1 = so1.getText().toString();
            String sothu2 = so2.getText().toString();
            float soA = Float.parseFloat(sothu1);
            float soB = Float.parseFloat(sothu2);
            float Tong = soA + soB;
            String chuoiKQ = String.valueOf(Tong);
            editTextKQ.setText(chuoiKQ);
        }
        public void XuLyTru(View v){
            //xu ly code
            String sothu1 = so1.getText().toString();
            String sothu2 = so2.getText().toString();
            float soA = Float.parseFloat(sothu1);
            float soB = Float.parseFloat(sothu2);
            float Tong = soA - soB;
            String chuoiKQ = String.valueOf(Tong);
            editTextKQ.setText(chuoiKQ);
        }
        public void XuLyNhan(View v){
            //xu ly code
            String sothu1 = so1.getText().toString();
            String sothu2 = so2.getText().toString();
            float soA = Float.parseFloat(sothu1);
            float soB = Float.parseFloat(sothu2);
            float Tong = soA * soB;
            String chuoiKQ = String.valueOf(Tong);
            editTextKQ.setText(chuoiKQ);
        }
        public void XuLyChia(View v){
            //xu ly code
            String sothu1 = so1.getText().toString();
            String sothu2 = so2.getText().toString();
            float soA = Float.parseFloat(sothu1);
            float soB = Float.parseFloat(sothu2);
            float Tong = soA / soB;
            String chuoiKQ = String.valueOf(Tong);
            editTextKQ.setText(chuoiKQ);
        }
    }