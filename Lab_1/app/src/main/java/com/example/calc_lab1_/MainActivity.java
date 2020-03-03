package com.example.calc_lab1_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Enter1;
    private EditText Enter2;
    private TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Enter1  = (EditText)findViewById(R.id.Enter1);
        Enter2 = (EditText)findViewById(R.id.Enter2);
        Result  = (TextView)findViewById(R.id.Result);
    }

    public void ClickButton_1(View view) {

        //Объявим числовые переменные
        double a,b,c;

        //Считаем с editText и editText2 текстовые значения
        String S1 = Enter1.getText().toString();
        String S2 = Enter2.getText().toString();

        //Преобразуем текстовые переменные в числовые значения
        a = Double.parseDouble(S1);
        b = Double.parseDouble(S2);

        //Проведем с числовыми переменными нужные действия
        c = a+b;

        //Преобразуем ответ в число
        String S = Double.toString(c);

        //Выведем текст в textView
        Result.setText(S);
    }

    public void ClickButton_2(View view) {

        //Объявим числовые переменные
        double a,b,c;

        //Считаем с editText и editText2 текстовые значения
        String S1 = Enter1.getText().toString();
        String S2 = Enter2.getText().toString();

        //Преобразуем текстовые переменные в числовые значения
        a = Double.parseDouble(S1);
        b = Double.parseDouble(S2);

        //Проведем с числовыми переменными нужные действия
        c = a-b;

        //Преобразуем ответ в число
        String S = Double.toString(c);

        //Выведем текст в textView
        Result.setText(S);
    }

    public void ClickButton_3(View view) {

        //Объявим числовые переменные
        double a,b,c;

        //Считаем с editText и editText2 текстовые значения
        String S1 = Enter1.getText().toString();
        String S2 = Enter2.getText().toString();

        //Преобразуем текстовые переменные в числовые значения
        a = Double.parseDouble(S1);
        b = Double.parseDouble(S2);

        //Проведем с числовыми переменными нужные действия
        c = a*b;

        //Преобразуем ответ в число
        String S = Double.toString(c);

        //Выведем текст в textView
        Result.setText(S);
    }

    public void ClickButton_4(View view) {

        //Объявим числовые переменные
        double a,b,c;

        //Считаем с editText и editText2 текстовые значения
        String S1 = Enter1.getText().toString();
        String S2 = Enter2.getText().toString();

        //Преобразуем текстовые переменные в числовые значения
        a = Double.parseDouble(S1);
        b = Double.parseDouble(S2);

        //Проведем с числовыми переменными нужные действия
        c = a/b;

        //Преобразуем ответ в число
        String S = Double.toString(c);

        //Выведем текст в textView
        Result.setText(S);
    }
}
