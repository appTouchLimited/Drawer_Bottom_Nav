package uk.co.apptouch.side1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class drawer_frag_one  extends Fragment {
    public static drawer_frag_one newInstance() {
        drawer_frag_one fragment = new drawer_frag_one();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.drawer_frag_one, container, false); }

}