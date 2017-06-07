package pl.lukaszpelczar.booklisting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StarterActivity extends AppCompatActivity {

    //This is the keyword the user want to search
    public static String mKeyword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starter);

        //These lines of code sets the logo in App Toolbar
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_book_white_18dp);

        Button search = (Button)findViewById(R.id.search_button);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bookIntent = new Intent(StarterActivity.this, BookActivity.class);
                startActivity(bookIntent);

                EditText editText = (EditText)findViewById(R.id.keyword);
                mKeyword = editText.getText().toString();
            }
        });


    }


}
