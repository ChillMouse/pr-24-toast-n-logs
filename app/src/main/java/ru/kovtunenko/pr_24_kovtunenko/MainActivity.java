package ru.kovtunenko.pr_24_kovtunenko;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

        TextView tvOut;
        Button btnOk;
        Button btnCancel;

/** Called when the activity is first created. */
@Override
  public void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
          Log.d("MyLog","Перед поиском вьюх");
          // найдем View-элементы
          tvOut = (TextView) findViewById(R.id.tvOut);
          btnOk = (Button) findViewById(R.id.btnOk);
          btnCancel = (Button) findViewById(R.id.btnCancel);

          // присваиваем обработчик кнопкам
          Log.d("MyLog","Назначен слушатель клика");
          btnOk.setOnClickListener(this);
          btnCancel.setOnClickListener(this);
          }

@Override
  public void onClick(View v) {
          // по id определяем кнопку, вызвавшую этот обработчик
        Log.d("MyLog","Клик по кнопке");
          switch(v.getId()) {
          case R.id.btnOk:
          // кнопка ОК
          tvOut.setText("Нажата кнопка ОК");
          Toast.makeText(this, "Нажата кнопка ОК", Toast.LENGTH_LONG).show();
          break;
          case R.id.btnCancel:
          // кнопка Cancel
          tvOut.setText("Нажата кнопка Cancel");
          Toast.makeText(this, "Нажата кнопка ОК", Toast.LENGTH_LONG).show();
          break;
          }
          }

          }


