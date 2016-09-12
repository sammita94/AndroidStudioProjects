package sammita.validation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText userName;
    private EditText email;
    private EditText phoneNum;
    private Button submit;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        phoneNum = (EditText) findViewById(R.id.phone);
        submit = (Button) findViewById(R.id.btnSubmit);
        next = (Button) findViewById(R.id.btnNext);

        final String name = userName.getText().toString().trim();
        final String emailValidate = email.getText().toString().trim();
        final String phone = phoneNum.getText().toString().trim();


        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                final String name = userName.getText().toString().trim();
                final String emailValidate = email.getText().toString().trim();
                final String phone = phoneNum.getText().toString().trim();
                final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

                boolean flag = true;
                if (emailValidate == null) {
                    flag = false;
                } else {
                    flag = emailValidate.matches(emailPattern);
                    System.out.println("****"+emailValidate+name);
                }

                if(flag == false)
                    Toast.makeText(getApplicationContext(),
                            "Enter email correctly", Toast.LENGTH_LONG)
                            .show();
                else {
                    Intent i = new Intent(getApplicationContext(),
                            Next.class);
                    startActivity(i);
                    finish();
                }
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                final String name = userName.getText().toString().trim();
                final String emailValidate = email.getText().toString().trim();
                final String phone = phoneNum.getText().toString().trim();
                final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

                boolean flag = true;
                if (emailValidate == null) {
                    flag = false;
                } else {
                    flag = emailValidate.matches(emailPattern);
                }

                if(flag == false)
                    Toast.makeText(getApplicationContext(),
                            "Enter email correctly", Toast.LENGTH_LONG)
                            .show();
                else {
                    //add data to database
                }
            }
        });

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
