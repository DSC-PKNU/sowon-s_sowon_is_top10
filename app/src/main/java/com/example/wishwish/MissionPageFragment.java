package com.example.wishwish;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MissionPageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MissionPageFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    Button btn_okay;
    TextView textview_title;
    TextView textview_mission;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    String[] missions =
            {       "좋아하는 노래\n한 곡 듣기",
                    "달콤한 초콜릿\n하나 먹기",
                    "유튜브에서\n웃음 참기 영상 보기",
                    "낮이라면\n나가서 햇빛 보기",
                    "1분 스트레칭",
                    "거울 보고 웃기",
            };

    public MissionPageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MissionPageFragment newInstance(String param1, String param2) {
        MissionPageFragment fragment = new MissionPageFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mission_page, container, false);

        textview_title = (TextView)view.findViewById(R.id.mission_title);
        String mission = getResources().getString(R.string.mission_text);
        textview_title.setText(Html.fromHtml(mission));

        textview_mission= (TextView)view.findViewById(R.id.mission);
        int r = (int)(Math.random()*3);
        textview_mission.setText (missions[r]);

        Button okay_button = (Button)view.findViewById(R.id.button_okay);


        okay_button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent resultIntent = new Intent(getActivity(), MainActivity.class);
                startActivity(resultIntent);
                onDestroy();
            }
        });



        return inflater.inflate(R.layout.fragment_mission_page, container, false);

    }


}