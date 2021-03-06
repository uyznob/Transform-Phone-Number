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


public class SearchHHP extends Activity implements AdapterView.OnItemSelectedListener {
    private static final String TAG = "THÉP HỘP HÒA PHÁT";

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
            8,
            15,
            23,
            33,
            41,
            49,
            59,
            69,
            79,
            89,
            99,
            113,
            127,
            138,
            153,
            167,
            181,
            193,
            206,
            218,
            231,
            243,
            254,
            266,
            278,
            289,
            300,
            308,
            317,
            327,
            337,
            347,
            357,
            367,
            375,
            379, //Tăng thêm 1
    };

    private final static String[] spinnerList = {
            "10X30",
            "12X12",
            "13X26",
            "12X32",
            "14X14",
            "16X16",
            "20X20",
            "20X25",
            "25X25",
            "20X30",
            "15X35",
            "30X30",
            "20X40",
            "25X40",
            "25X50",
            "40X40",
            "30X50",
            "30X60",
            "50X50",
            "60X60",
            "40X60",
            "40X80",
            "45X90",
            "40X100",
            "50X100",
            "90X90",
            "60X120",
            "LG 30",
            "OV 10X20",
            "OV 12X23.5",
            "OV 14X24",
            "OV 16X27",
            "OV 16X31",
            "OV 18X36",
            "OV 21X38",
            "OV 21X72",
    };

    private final static Integer[] socay = {
            50,
            100,
            105,
            50,
            100,
            100,
            100,
            64,
            90,
            90,
            90,
            81,
            72,
            60,
            72,
            0,
            60,
            50,
            36,
            25,
            40,
            32,
            18,
            18,
            18,
            16,
            18,
            80,
            100,
            50,
            50,
            50,
            50,
            50,
            50,
            25,
    };

    private final static Double[] t = {
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
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
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
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
            3.0,
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
            3.0,
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
            3.0,
            3.2,
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
            3.0,
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
            3.0,
            0.8,
            0.9,
            1.0,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
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
            3.0,
            3.2,
            3.5,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
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
            3.0,
            3.2,
            3.5,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            3.8,
            4.0,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            3.8,
            4.0,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            3.8,
            4.0,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            3.8,
            4.0,
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
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            1.4,
            1.5,
            1.8,
            2.0
    };

    private final static Double[] klc = {
            2.53,
            2.87,
            3.21,
            3.54,
            3.87,
            4.20,
            4.83,
            1.47,
            1.66,
            1.85,
            2.03,
            2.21,
            2.39,
            2.72,
            2.46,
            2.79,
            3.12,
            3.45,
            3.77,
            4.08,
            4.70,
            5.00,
            2.79,
            3.17,
            3.55,
            3.92,
            4.29,
            4.65,
            5.36,
            5.71,
            6.73,
            7.39,
            1.74,
            1.97,
            2.19,
            2.41,
            2.63,
            2.84,
            3.25,
            3.45,
            2.00,
            2.27,
            2.53,
            2.79,
            3.04,
            3.29,
            3.78,
            4.01,
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
            2.86,
            3.25,
            3.63,
            4.01,
            4.39,
            4.76,
            5.49,
            5.85,
            6.90,
            7.57,
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
            10.40,
            11.80,
            12.72,
            14.05,
            14.92,
            3.85,
            4.38,
            4.90,
            5.43,
            5.94,
            6.46,
            7.47,
            7.97,
            9.44,
            10.40,
            11.80,
            12.72,
            14.05,
            14.92,
            4.18,
            4.75,
            5.33,
            5.90,
            6.46,
            7.02,
            8.13,
            8.68,
            10.29,
            11.34,
            12.89,
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
            15.05,
            16.25,
            18.01,
            19.16,
            20.29,
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
            20.57,
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
            20.57,
            6.64,
            7.45,
            8.25,
            9.85,
            11.43,
            12.21,
            14.53,
            16.05,
            18.30,
            19.78,
            21.97,
            23.40,
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
            26.23,
            27.83,
            30.20,
            12.16,
            13.24,
            15.38,
            16.45,
            19.61,
            21.70,
            24.80,
            26.85,
            29.88,
            31.88,
            33.86,
            36.79,
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
            26.23,
            27.83,
            30.20,
            12.16,
            13.24,
            15.38,
            16.45,
            19.61,
            21.70,
            24.80,
            26.85,
            29.88,
            31.88,
            33.86,
            36.79,
            14.93,
            17.36,
            18.57,
            22.16,
            24.53,
            28.05,
            30.38,
            33.84,
            36.12,
            38.38,
            41.74,
            18.02,
            19.27,
            23.01,
            25.47,
            29.14,
            31.56,
            35.15,
            37.53,
            39.89,
            43.39,
            46.85,
            49.13,
            19.34,
            20.69,
            24.70,
            27.36,
            31.30,
            33.91,
            37.79,
            40.36,
            42.90,
            46.69,
            50.43,
            52.90,
            24.93,
            29.79,
            33.01,
            37.80,
            40.98,
            45.70,
            48.83,
            51.94,
            56.58,
            61.17,
            64.21,
            24.93,
            29.79,
            33.01,
            37.80,
            40.98,
            45.70,
            48.83,
            51.94,
            56.58,
            61.17,
            64.21,
            4.34,
            4.81,
            5.27,
            5.74,
            6.65,
            7.10,
            8.44,
            9.32,
            1.62,
            1.84,
            2.06,
            2.27,
            2.49,
            2.69,
            3.10,
            3.30,
            3.88,
            1.91,
            2.17,
            2.42,
            2.68,
            2.93,
            3.18,
            3.67,
            3.91,
            4.61,
            5.06,
            2.21,
            2.51,
            2.81,
            3.11,
            3.40,
            3.69,
            4.27,
            4.55,
            5.38,
            5.92,
            2.27,
            2.59,
            2.90,
            3.20,
            3.51,
            3.81,
            4.40,
            4.69,
            5.55,
            6.11,
            2.57,
            2.93,
            3.28,
            3.63,
            3.98,
            4.32,
            5.00,
            5.34,
            6.33,
            6.97,
            3.03,
            3.46,
            3.88,
            4.29,
            4.70,
            5.11,
            5.92,
            6.33,
            7.51,
            8.29,
            4.12,
            4.56,
            5.00,
            5.43,
            6.30,
            6.73,
            7.99,
            8.82,
            10.79,
            11.54,
            13.71,
            15.24
    };
}
