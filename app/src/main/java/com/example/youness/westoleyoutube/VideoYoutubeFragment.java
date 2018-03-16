package com.example.youness.westoleyoutube;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static android.content.ContentValues.TAG;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class VideoYoutubeFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private OnListFragmentInteractionListener mListener;
    private ArrayList<VideoYoutube> vids;
    private Call<YoutubeRequest> request;
    private MyVideoYoutubeRecyclerViewAdapter madapter;
    public RecyclerView recyclerView;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public VideoYoutubeFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static VideoYoutubeFragment newInstance(int columnCount) {
        VideoYoutubeFragment fragment = new VideoYoutubeFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_videoyoutube_list, container, false);
        //Receive the bundle
        request = ((MainActivity)this.getActivity()).videos;
        vids = new ArrayList<VideoYoutube>();
        Log.d(TAG, "onCreateView: "+request.request().url());
        request.enqueue(new Callback<YoutubeRequest>() {
            @Override
            public void onResponse(Call<YoutubeRequest> call, Response<YoutubeRequest> response) {

                vids = response.body().getItems();
                Log.v("the result",response.body().toString());
                Log.v("the result","Notified");
            }

            @Override
            public void onFailure(Call<YoutubeRequest> call, Throwable t) {
                Log.v("bad request",""+t.toString());
            }
        });

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
             recyclerView = (RecyclerView) view;

            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            madapter = new MyVideoYoutubeRecyclerViewAdapter(vids, mListener);
            recyclerView.setAdapter(madapter);
        }
        Refresh();
        return view;
    }
    public void Refresh()
    {
        recyclerView.removeViewAt(0);
        this.madapter.notifyDataSetChanged();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        void onListFragmentInteraction(VideoYoutube item);
    }
}
