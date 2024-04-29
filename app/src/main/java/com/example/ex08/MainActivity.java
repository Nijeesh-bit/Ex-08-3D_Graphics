package com.example.ex08;
import androidx.appcompat.app.AppCompatActivity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    private GLSurfaceView glView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        glView = new GLSurfaceView(this);
        glView.setRenderer(new MyGLRenderer(this));
        this.setContentView(glView);
    }
    @Override
    protected void onPause() {
        super.onPause();
        glView.onPause();
    }
    @Override
    protected void onResume() {
        super.onResume();
        glView.onResume();
    }
}
