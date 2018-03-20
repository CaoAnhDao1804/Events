package com.example.administrator.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtSoa;
    private EditText edtSob;
    private TextView tvKetqua;
    private Button btnTong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        config();
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int soA = Integer.parseInt(edtSoa.getText().toString());
                    int soB = Integer.parseInt(edtSob.getText().toString());
                    int result = soA+soB;
                    tvKetqua.setText(result+"");
                } catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Wrong number",Toast.LENGTH_LONG).show();
                }
            }
        });
      //C3  btnTong.setOnClickListener(this);
    }

    public void config() {
        edtSoa = (EditText) findViewById(R.id.txtSoA);
        edtSob = (EditText) findViewById(R.id.txtSoB);
        tvKetqua =(TextView) findViewById(R.id.txtKetQua);
        btnTong =(Button) findViewById(R.id.btnTong);
    }

    public void tinhtong(View view){//C1
        try{
            int soA = Integer.parseInt(edtSoa.getText().toString());
            int soB = Integer.parseInt(edtSob.getText().toString());
            int result = soA+soB;
            tvKetqua.setText(result+"");
        } catch (Exception e){
            Toast.makeText(getApplicationContext(),"Wrong number",Toast.LENGTH_LONG).show();
        }
    }

}
