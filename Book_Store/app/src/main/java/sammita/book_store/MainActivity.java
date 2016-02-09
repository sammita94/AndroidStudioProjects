package sammita.book_store;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText mainEditText1,mainEditText2,mainEditText3,mainEditText4,mainEditText5,mainEditText6,mainEditText7;
    Button mainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainEditText1 = (EditText) findViewById(R.id.main_edittext1);
        mainEditText2 = (EditText) findViewById(R.id.main_edittext2);
        mainEditText3 = (EditText) findViewById(R.id.main_edittext3);
        mainEditText4 = (EditText) findViewById(R.id.main_edittext4);
        mainEditText5 = (EditText) findViewById(R.id.main_edittext5);
        mainEditText6 = (EditText) findViewById(R.id.main_edittext6);
        mainEditText7 = (EditText) findViewById(R.id.main_edittext7);

        mainButton = (Button) findViewById(R.id.main_button);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
