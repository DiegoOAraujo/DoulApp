package com.example.android.doulapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DPP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dpp);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    private void mostraData(String data){
        TextView dpp_text_view = (TextView) findViewById(R.id.dpp_text_view);
        dpp_text_view.setText(data);
    }

    public void calculaDPP(View view) {
        Calendar calendar = Calendar.getInstance();

        DatePicker data = (DatePicker) findViewById(R.id.dialog_date_datePicker);

        int dia = data.getDayOfMonth();
        int mes = data.getMonth();
        int ano = data.getYear();

        calendar.set(Calendar.YEAR, ano);
        calendar.set(Calendar.MONTH, mes);
        calendar.set(Calendar.DAY_OF_MONTH, dia);

        //calendar.add( Calendar.DAY_OF_MONTH , 38 * 7 );
        String novaData = new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime());
        mostraData( novaData );
    }
}
