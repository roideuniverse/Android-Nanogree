package roide.nano.protfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button mSpotify;
    private Button mScores;
    private Button mLibrary;
    private Button mBigger;
    private Button mReader;
    private Button mCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prepareViews();
    }

    private void prepareViews()
    {
        mSpotify = (Button) findViewById(R.id.main_button_spotify);
        mScores = (Button) findViewById(R.id.main_button_scores);
        mLibrary = (Button) findViewById(R.id.main_button_library);
        mBigger = (Button) findViewById(R.id.main_button_bigger);
        mReader = (Button) findViewById(R.id.main_button_reader);
        mCapstone = (Button) findViewById(R.id.main_button_capstone);

        mSpotify.setOnClickListener(mOnButtonClickListener);
        mScores.setOnClickListener(mOnButtonClickListener);
        mLibrary.setOnClickListener(mOnButtonClickListener);
        mBigger.setOnClickListener(mOnButtonClickListener);
        mReader.setOnClickListener(mOnButtonClickListener);
        mCapstone.setOnClickListener(mOnButtonClickListener);
    }

    private View.OnClickListener mOnButtonClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            StringBuilder msg = new StringBuilder("This button will launch my ");
            switch(view.getId())
            {
                case R.id.main_button_spotify:
                    msg.append("spotify");
                    break;
                case R.id.main_button_scores:
                    msg.append("scores");
                    break;
                case R.id.main_button_library:
                    msg.append("library");
                    break;
                case R.id.main_button_bigger:
                    msg.append("bigger");
                    break;
                case R.id.main_button_reader:
                    msg.append("reader");
                    break;
                case R.id.main_button_capstone:
                    msg.append("capstone");
                    break;
            }

            msg.append(" app!");
            Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
