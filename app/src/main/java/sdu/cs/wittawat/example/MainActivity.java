package sdu.cs.wittawat.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText number1EditText = findViewById(R.id.number1);
        final EditText number2EditText = findViewById(R.id.number2);
        Button addButton = findViewById(R.id.addButton);
        Button minusButton = findViewById(R.id.minusButton);
        Button multiButton = findViewById(R.id.multiButton);
        Button divideButton = findViewById(R.id.divideButton);
        final TextView resultTextView = findViewById(R.id.result);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1EditText.getText().toString());
                int num2 = Integer.parseInt(number2EditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result + " ");
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1EditText.getText().toString());
                int num2 = Integer.parseInt(number2EditText.getText().toString());
                int result = num1 - num2;
                resultTextView.setText(result + " ");
            }
        });

        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1EditText.getText().toString());
                int num2 = Integer.parseInt(number2EditText.getText().toString());
                int result = num1 * num2;
                resultTextView.setText(result + " ");
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1EditText.getText().toString());
                int num2 = Integer.parseInt(number2EditText.getText().toString());
                int result = num1 / num2;
                resultTextView.setText(result + " ");
            }
        });




    } // end onCreate method
} // end class
