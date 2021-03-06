package com.enginit.laptop.dttd;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


public class SearchHMKMN extends Activity implements AdapterView.OnItemSelectedListener {
    private static final String TAG = "THÉP HỘP MẠ KẼM MINH NGỌC";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchhhp_layout);

        Spinner spinner = findViewById(R.id.spinner);
        // Application of the Array to the Spinner
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_spinner_item, spinnerList);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
        spinner.setAdapter(spinnerArrayAdapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();

        ListView listView = findViewById(R.id.listView);
        ArrayList<RowDataHHP> rowDataList = new ArrayList<>();

        Integer temp1 = parent.getSelectedItemPosition();
        Integer temp2 = spinnerListRowid[temp1];
        Integer temp3 = spinnerListRowid[temp1 + 1];

        for (int i = temp2 - 1; i <= temp3 - 2; i++) {
            RowDataHHP temp = new RowDataHHP(spinnerList[temp1], socay[temp1], t[i], klc[i]);
            rowDataList.add(temp);
        }

        RowDataHHPAdapter adapter = new RowDataHHPAdapter(this, R.layout.adapter_searchhhp_layout, rowDataList);
        listView.setAdapter(adapter);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

    // Data
    private final static Integer[] spinnerListRowid = {
            1,
            11,
            21,
            31,
            41,
            51,
            61,
            74,
            84,
            94,
            102,
            112,
            124,
            136,
            148,
            158,
            166,
            //Tăng thêm 1
    };

    private final static String[] spinnerList = {
            "12X12",
            "14X14",
            "16X16",
            "20X20",
            "25X25",
            "30X30",
            "40X40",
            "50X50",
            "60X60",
            "75X75",
            "13X26",
            "20X40",
            "25X50",
            "30X60",
            "40X80",
            "50X100",
    };

    private final static Integer[] socay = {
            100,
            100,
            100,
            100,
            100,
            49,
            49,
            25,
            25,
            16,
            50,
            50,
            50,
            50,
            24,
            18,
    };

    private final static Double[] t = {
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
    };

    private final static Double[] klc = {
            1.47,
            1.66,
            1.85,
            2.03,
            2.21,
            2.39,
            2.72,
            2.88,
            3.34,
            3.62,
            1.74,
            1.97,
            2.19,
            2.41,
            2.63,
            2.84,
            3.25,
            3.45,
            4.02,
            4.37,
            2.00,
            2.27,
            2.53,
            2.76,
            3.04,
            3.29,
            3.78,
            4.01,
            4.69,
            5.12,
            2.53,
            2.87,
            3.21,
            3.54,
            3.87,
            4.20,
            4.83,
            5.14,
            6.05,
            6.63,
            3.19,
            3.62,
            4.06,
            4.48,
            4.91,
            5.33,
            6.15,
            6.56,
            7.75,
            8.52,
            3.85,
            4.38,
            4.90,
            5.43,
            5.94,
            6.46,
            7.47,
            7.97,
            9.44,
            10.04,
            5.16,
            5.88,
            6.60,
            7.31,
            8.02,
            8.72,
            10.11,
            10.80,
            12.83,
            14.17,
            16.14,
            17.43,
            19.33,
            9.19,
            10.09,
            10.98,
            12.74,
            13.62,
            16.22,
            17.94,
            20.47,
            22.14,
            24.60,
            11.08,
            12.16,
            13.24,
            15.38,
            16.45,
            19.61,
            21.70,
            24.80,
            26.85,
            29.88,
            16.63,
            19.33,
            20.68,
            24.69,
            27.34,
            31.29,
            33.89,
            37.77,
            2.46,
            2.79,
            3.12,
            3.45,
            3.77,
            4.08,
            4.70,
            5.00,
            5.88,
            6.54,
            3.85,
            4.38,
            4.90,
            5.43,
            5.94,
            6.46,
            7.47,
            7.97,
            9.44,
            10.04,
            11.80,
            12.72,
            4.83,
            5.51,
            6.18,
            6.84,
            7.50,
            8.15,
            9.45,
            10.09,
            11.98,
            13.23,
            15.06,
            16.25,
            6.59,
            7.45,
            8.25,
            9.05,
            9.85,
            11.43,
            12.21,
            14.53,
            16.05,
            18.30,
            19.78,
            21.97,
            11.08,
            12.16,
            13.24,
            15.38,
            16.45,
            19.61,
            21.70,
            24.80,
            26.85,
            29.88,
            16.63,
            19.33,
            20.68,
            24.69,
            27.34,
            31.29,
            33.89,
            37.77,
    };
}
