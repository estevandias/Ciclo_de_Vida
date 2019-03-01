package br.com.usjt.ciclo_de_vida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void ir (View view){
        intent i = new Intent(this, SegundaActivity.class);
        startActivity(i);
    }

    private static final String TAG = "ciclo de vida";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"MainActivity.onCreate");
    }
    @Override
    protected void onStart () {
        super.onStart();
        Log.i(TAG, "MainActivity.onStart");
    }

    protected void onResume[]{
            super.onResume();
            Log.i(TAG, "MainActivity.onResume");
        }
        @Override
        protected void onStop(){
            super.onStop();
            Log.i(TAG, "MainActivity.onStop");
        }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "MainActivity.onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "MainActivity.onRestart");
    }

}
