package ntu.duongngoclenh.bottomnavigationview_ex;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        BottomNavigationView botnav;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        botnav = findViewById(R.id.bot_nav);
        botnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemid = item.getItemId();
                if(itemid == R.id.mnu_home){
                    Toast.makeText(MainActivity.this,"Day la fragment Home",Toast.LENGTH_SHORT).show();
                }else  if(itemid == R.id.mnu_search){
                    Toast.makeText(MainActivity.this,"Day la fragment Search",Toast.LENGTH_SHORT).show();
                }else  if(itemid == R.id.mnu_profile){
                    Toast.makeText(MainActivity.this,"Day la fragment Profile",Toast.LENGTH_SHORT).show();
                }else return false;
                return true;
            }
        });

    }
}