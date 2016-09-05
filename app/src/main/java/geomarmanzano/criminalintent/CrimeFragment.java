package geomarmanzano.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by geomar on 9/4/16.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTitleField;

    // Notice Fragment.onCreate(Bundle) is public whereas
    // Activity.onCreate(Bundle) is protected. This is because Fragment
    // lifecycle methods must be public in order for a hosting activity
    // to call the fragment
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    // Notice we inflate the fragment's view in the method below and not in
    // Fragment.onCreate(Bundle). We create and configure a fragment's view in
    // Fragment.onCreateView(LayoutInflater, ViewGroup, Bundle).
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Parameters to LayoutInflater.inflater:
        //   1st: Layout Resource ID to inflate
        //   2nd: The View's parent needed to configure widgets properly
        //   3rd: Whether to add to inflated view to the view's parent
        View v = inflater.inflate(R.layout.fragment_crime, container, false);
        mTitleField = (EditText) v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start,
                                          int count, int after) {
                // Intentionally blank
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start,
                                      int before, int count) {
                mCrime.setTitle(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // Intentionally blank
            }
        });
        return v;
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
    }
}
