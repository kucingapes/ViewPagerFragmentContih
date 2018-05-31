package com.utsman.kucingapes.viewpagerfragmentcontih.Fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pierfrancescosoffritti.youtubeplayer.player.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayer;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerInitListener;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerView;
import com.utsman.kucingapes.viewpagerfragmentcontih.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Tiga.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Tiga#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tiga extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    /*private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";*/
    private static final String ParamVideoId = "default id";

    // TODO: Rename and change types of parameters
    /*private String mParam1;
    private String mParam2;*/
    private String idParam;

    private YouTubePlayerView youTubePlayerView;

    private OnFragmentInteractionListener mListener;

    public Tiga() {
        // Required empty public constructor
    }


    public static Tiga newInstance(/*String param1, String param2, */String idParam) {
        Tiga fragment = new Tiga();
        Bundle args = new Bundle();
        /*args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);*/
        args.putString(ParamVideoId, idParam);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            /*mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);*/
            idParam = getArguments().getString(ParamVideoId);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final String videoID = idParam;
        View view = inflater.inflate(R.layout.fragment_tiga, container, false);
        youTubePlayerView = view.findViewById(R.id.youtube_play);
        youTubePlayerView.initialize(new YouTubePlayerInitListener() {
            @Override
            public void onInitSuccess(final YouTubePlayer youTubePlayer) {
                youTubePlayer.addListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady() {
                        youTubePlayer.loadVideo(videoID, 0);
                    }
                });
            }
        }, true);
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



    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (this.isVisible()) {
            if (!isVisibleToUser) {
                youTubePlayerView.initialize(new YouTubePlayerInitListener() {
                    @Override
                    public void onInitSuccess(YouTubePlayer youTubePlayer) {
                        youTubePlayer.pause();
                    }
                }, true);
            }
        }
    }
}
