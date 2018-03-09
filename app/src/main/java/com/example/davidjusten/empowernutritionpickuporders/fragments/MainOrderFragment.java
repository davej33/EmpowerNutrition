package com.example.davidjusten.empowernutritionpickuporders.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.davidjusten.empowernutritionpickuporders.MainOrderActivity;
import com.example.davidjusten.empowernutritionpickuporders.MenuItemsActivity;
import com.example.davidjusten.empowernutritionpickuporders.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MainOrderFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MainOrderFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainOrderFragment extends Fragment implements View.OnClickListener{

    private static final String LOG_TAG = MainOrderFragment.class.getSimpleName();

    private static final String SMOOTHIES = "smoothies";
    private static final String ITEM_SELECTION_TAG = "tag";

    private OnFragmentInteractionListener mListener;

    public MainOrderFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainOrderFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainOrderFragment newInstance(String param1, String param2) {
        MainOrderFragment fragment = new MainOrderFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main_order, container, false);

        // get views, set OnClickListener
        ImageView mSmoothieImage = view.findViewById(R.id.image_smoothies);
        TextView mSmoothieText = view.findViewById(R.id.image_smoothie_text);

        // set onClick
        mSmoothieText.setOnClickListener(this);
        mSmoothieImage.setOnClickListener(this);

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.image_smoothies:
            case R.id.image_smoothie_text:
                Intent intent = new Intent(getContext(), MenuItemsActivity.class);
                intent.putExtra(ITEM_SELECTION_TAG, SMOOTHIES);
                startActivity(intent);
                break;
            default:
                Log.e(LOG_TAG, "No ID match on click");
        }
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
