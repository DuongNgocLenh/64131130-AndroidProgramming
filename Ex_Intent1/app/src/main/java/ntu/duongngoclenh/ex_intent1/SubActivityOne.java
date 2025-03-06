package ntu.duongngoclenh.ex_intent1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SubActivityOne extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
    }
public void QuayVe(View v){
        Intent iManHinhCHINH = new Intent (packageContext: this, MainActivity.class);
        startActivity(iManHinhCHINH);
}

}