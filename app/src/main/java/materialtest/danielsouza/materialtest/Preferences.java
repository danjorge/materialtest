package materialtest.danielsouza.materialtest;

import android.content.Context;

/**
 * Created by daniel.souza on 05/01/2017.
 */

class Preferences {

    void saveToPreferences(Context context, String preferenceName, String preferenceValue){
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.PREF_FILE_NAME, Context.MODE_PRIVATE);
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(preferenceName, preferenceValue);
        editor.apply();
    }

    String readToPreferences(Context context, String preferenceName, String defaultValue) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.PREF_FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(preferenceName, defaultValue);
    }
}
