package ntu.duongngoclenh.thigk2duongngoclenh;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class ChucNang3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView monhoc = findViewById(R.id.lvMonHoc);
        ArrayList<String> dsMonHoc = new ArrayList<String>();
        //Chuan bi du lieu
        dsMonHoc.add("Tin học đại cương");
        dsMonHoc.add("Lập trình Java");
        dsMonHoc.add("Phát triển Ứng dụng web");
        dsMonHoc.add("Khai phá dữ liệu lớn");
        dsMonHoc.add("Kinh tế chính trị Mác - Lê nin");
        dsMonHoc.add("...");
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dsMonHoc);
        monhoc.setAdapter(adapter);
        //Gan bo lang nghe va xu ly su kien
        monhoc.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String giaTriDuocChon = dsMonHoc.get(position);
                Toast.makeText(ChucNang3.this, giaTriDuocChon, Toast.LENGTH_SHORT).show();
            }
        });
    }
}