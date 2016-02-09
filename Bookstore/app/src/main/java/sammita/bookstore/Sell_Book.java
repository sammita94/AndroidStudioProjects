package sammita.bookstore;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Sell_Book extends Activity {

    Spinner spinner;
    EditText text;

    List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell__book);

        spinner = (Spinner) findViewById(R.id.spinner1);
        text = (EditText) findViewById(R.id.editText1);

        list = new ArrayList<String>();
        list.add("Item 0");
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");

        ArrayAdapter<String> adp = new ArrayAdapter<String>
                (this, android.R.layout.simple_dropdown_item_1line, list);
        adp.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        spinner.setAdapter(adp);

        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                // TODO Auto-generated method stub

                switch(arg2) {

                    case 0 :
                        text.setText("Value 0");
                        break;
                    case 1 :
                        text.setText("Value 1");
                        break;
                    case 2 :
                        text.setText("Value 2");
                        break;
                    case 3 :
                        text.setText("Value 3");
                        break;
                    default :
                        text.setText("Nothing");
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sell__book, menu);
        return true;
    }
}