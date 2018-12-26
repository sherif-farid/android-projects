package ;

import android.content.Intent;
import android.os.Bundle;
import org.apache.cordova.CordovaActivity;

public class MainActivity
  extends CordovaActivity
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getExtras();
    if ((paramBundle != null) && (paramBundle.getBoolean("cdvStartInBackground", false))) {
      moveTaskToBack(true);
    }
    loadUrl(this.launchUrl);
  }
}


/* Location:              D:\googleplay\extractedApk\extract\dex2jar2\gather-dex2jar.jar!\com\max\gathernClient\MainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */