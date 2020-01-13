package pl.gda.wsb.zabawa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText imie = findViewById(R.id.imieEditText);

        Toast.makeText(this, "Twoje imie to " + imie.getText().toString(), Toast.LENGTH_LONG ).show();

        Log.i("Wpisałeś imię", imie.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
