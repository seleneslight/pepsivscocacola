package enlightened.learn.pepsivscocacola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int a,b;
    ImageView bebziImageView, colaImageView;
    TextView bebziTextView, colaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=0;
        b = 0;

        bebziImageView = findViewById(R.id.bebziImg);
        colaImageView = findViewById(R.id.colaImg);

        colaTextView = findViewById(R.id.colaText);
        bebziTextView = findViewById(R.id.bebziText);

        bebziImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++a;
                bebziTextView.setText(""+a);
            }
        });
        colaImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++b;
                colaTextView.setText(""+b);
            }
        });
    }
}