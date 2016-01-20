package sammita.omgandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener {

    TextView mainTextView;
    Button mainButton;
    EditText mainEditText;

    ListView mainListView;
    ArrayAdapter<String> mArrayAdapter;
    ArrayList<String> mNameList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainTextView = (TextView) findViewById(R.id.main_textview);
        mainTextView.setText("Set in Java!");

        mainButton = (Button) findViewById(R.id.main_button);
        mainButton.setOnClickListener(this);

        // 3. Access the EditText defined in layout XML
        mainEditText = (EditText) findViewById(R.id.main_edittext);

        // 4. Access the ListView
        mainListView = (ListView) findViewById(R.id.main_listview);

// Create an ArrayAdapter for the ListView
        mArrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                mNameList);

        mainListView.setAdapter(mArrayAdapter);

        mNameList.add(mainEditText.getText().toString());
        mArrayAdapter.notifyDataSetChanged();
// Set the ListView to use the ArrayAdapter

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public void onClick(View v) {

        mainTextView.setText(mainEditText.getText().toString()
                + " is learning Android development!");



    }
}
