package vn.edu.usth.usthweather;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


public class WeatherActivity extends AppCompatActivity {


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("WeatherActivity Logging", "onCreate() called");

        setContentView(R.layout.activity_weather);
        ForecastFragment fragment1 = new ForecastFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.container, fragment1).commit();

    }


    @Override
    public void onStart() {
        super.onStart();
        Log.i("WeatherActivity Logging", "onStart() called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("WeatherActivity Logging", "onResume() called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("WeatherActivity Logging", "onPause() called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("WeatherActivity Logging", "onStop() called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("WeatherActivity Logging", "onDestroy() called");
    }
}