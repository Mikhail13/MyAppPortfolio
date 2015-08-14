package za.co.mikhails.nanodegree.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void sendMessage(View view) {
        String toastText = "This button will launch ";
        switch (view.getId()) {
            case R.id.button_spotify_streamer:
                toastText += getString(R.string.button_spotify_streamer_text);
                break;
            case R.id.button_football_scores_app:
                toastText += getString(R.string.button_football_scores_app_text);
                break;
            case R.id.button_library_app:
                toastText += getString(R.string.button_library_app_text);
                break;
            case R.id.button_build_it_bigger:
                toastText += getString(R.string.button_build_it_bigger_text);
                break;
            case R.id.button_xyz_reader:
                toastText += getString(R.string.button_xyz_reader_text);
                break;
            case R.id.button_capstone:
                toastText += getString(R.string.button_capstone_text);
                break;
        }
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }
}
