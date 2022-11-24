package samples.speech.cognitiveservices.microsoft.mp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    StudentFragment studentFragment;
    StaffFragment staffFragment;
    ListFragment listFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentFragment = new StudentFragment();
        staffFragment = new StaffFragment();
        listFragment = new ListFragment();
        //getSupportFragmentManager().beginTransaction().replace(R.id.containers,studentFragment).commit();
        NavigationBarView navigationBarView = findViewById(R.id.bottom_navigationview);
        
    }

}