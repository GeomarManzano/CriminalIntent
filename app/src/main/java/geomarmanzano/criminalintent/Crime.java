package geomarmanzano.criminalintent;

import java.util.UUID;

/**
 * Created by geomar on 9/4/16.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}