package kepstudio.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button plus, minus, multiply, divide, clear;
    EditText num1, num2;
    TextView answer, sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = (Button)findViewById(R.id.add);
        minus = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        clear = (Button)findViewById(R.id.clear);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);

        answer = (TextView)findViewById(R.id.textView);
        sign = (TextView)findViewById(R.id.sign);

        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double ret = add(Double.parseDouble(num1.getText().toString()),
                        Double.parseDouble(num2.getText().toString()));
                answer.setText(Double.toString(ret));
                sign.setText("+");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double ret = subtract(Double.parseDouble(num2.getText().toString()),
                        Double.parseDouble(num1.getText().toString()));
                answer.setText(Double.toString(ret));
                sign.setText("-");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double ret = multiply(Double.parseDouble(num1.getText().toString()),
                        Double.parseDouble(num2.getText().toString()));
                answer.setText(Double.toString(ret));
                sign.setText("*");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double ret = divide(Double.parseDouble(num2.getText().toString()),
                        Double.parseDouble(num1.getText().toString()));
                answer.setText(Double.toString(ret));
                sign.setText("/");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                answer.setText("Answer");
                sign.setText("");
            }
        });
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }
}
