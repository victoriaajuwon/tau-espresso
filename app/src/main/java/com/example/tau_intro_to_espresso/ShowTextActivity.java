package com.example.tau_intro_to_espresso;

import com.google.common.base.Strings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowTextActivity extends Activity {

    // The name of the extra data sent through an {@link Intent}.
    public final static String KEY_EXTRA_MESSAGE =
            "com.example.chapter_three.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_text);

        // Get the message from the Intent.
        Intent intent = getIntent();
        String message = Strings.nullToEmpty(intent.getStringExtra(KEY_EXTRA_MESSAGE));

        // Show message.
        ((TextView)findViewById(R.id.show_text_view)).setText(message);
    }

    /**
     * Creates an {@link Intent} for {@link ShowTextActivity} with the message to be displayed.
     * @param context the {@link Context} where the {@link Intent} will be used
     * @param message a {@link String} with text to be displayed
     * @return an {@link Intent} used to start {@link ShowTextActivity}
     */
    static protected Intent newStartIntent(Context context, String message) {
        Intent newIntent = new Intent(context, ShowTextActivity.class);
        newIntent.putExtra(KEY_EXTRA_MESSAGE, message);
        return newIntent;
    }
}
