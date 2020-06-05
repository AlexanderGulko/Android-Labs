package ua.opu.pnit.Lab_6_7;

import android.app.Application;
import android.content.SharedPreferences;

public class MyNotepad extends Application {

    public static final String NOTE_ID_ARG = "note_id";
    public static final String USER_TOKEN = "user_token";

    public SharedPreferences preferences;
    private static MyNotepad instance;

    // OAuth2 - вход с помощью Facebook и Github

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        preferences = getSharedPreferences("preferences", MODE_PRIVATE);
    }

    public String getUserToken() {
        return preferences.getString(USER_TOKEN, "");
    }

    public void setUserToken(String token) {
        preferences.edit().putString(USER_TOKEN, token).apply();
    }

    public static MyNotepad getInstance() {
        return MyNotepad.instance;
    }
}
