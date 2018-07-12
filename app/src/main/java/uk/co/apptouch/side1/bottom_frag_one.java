package uk.co.apptouch.side1;

import android.os.Bundle;
//import android.support.v4.app.Fragment;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class bottom_frag_one extends Fragment {
    public static bottom_frag_one newInstance() {
        bottom_frag_one fragment = new bottom_frag_one();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bottom_frag_one, container, false); }

}