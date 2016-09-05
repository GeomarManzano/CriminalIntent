package geomarmanzano.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

public class CrimeActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        // This code creates and commits a Fragment transaction.
        // Fragment transactions are used to add, remove, detach, or replace
        // fragments in the fragment list. The FragmentManager maintains a
        // backstack of fragment transactions that we can navigate
        if (fragment == null) {
            fragment = new CrimeFragment();
            // Create a new fragment transaction, include one add operation
            // in it, and then commit it
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}