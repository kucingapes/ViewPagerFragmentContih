package com.utsman.kucingapes.viewpagerfragmentcontih.Fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.utsman.kucingapes.viewpagerfragmentcontih.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Dua.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Dua#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Dua extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ArgGambar = "default gambar";
    private static final String ArgString1 = "1";
    private static final String ArgString2 = "2";

    // TODO: Rename and change types of parameters
    private int mGambar;
    private String mText1;
    private String mText2;

    private OnFragmentInteractionListener mListener;

    public Dua() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static Dua newInstance(int parGambar, String text1, String text2) {
        Dua fragment = new Dua();
        Bundle args = new Bundle();
        args.putInt(ArgGambar, parGambar);
        args.putString(ArgString1, text1);
        args.putString(ArgString2, text2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mGambar = getArguments().getInt(ArgGambar);
            mText1 = getArguments().getString(ArgString1);
            mText2 = getArguments().getString(ArgString2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dua, container, false);
        ImageView gambar = view.findViewById(R.id.img);
        TextView textJudul = view.findViewById(R.id.textjuduldua);
        TextView textDua = view.findViewById(R.id.textdua);
        gambar.setImageResource(mGambar);
        textJudul.setText(mText1);
        textDua.setText(mText2);
        return view;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
