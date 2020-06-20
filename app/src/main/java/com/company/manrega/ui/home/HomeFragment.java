package com.company.manrega.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.company.manrega.R;
import com.company.manrega.ViewPagerAdapter;
import com.company.manrega.buttons.AnuMay;
import com.company.manrega.buttons.BFT;
import com.company.manrega.buttons.Bhumika;
import com.company.manrega.buttons.Disha_nirdesh;
import com.company.manrega.buttons.GoodGov;
import com.company.manrega.buttons.GramPanchayat;
import com.company.manrega.buttons.Jagrukta;
import com.company.manrega.buttons.Jio;
import com.company.manrega.buttons.Job;
import com.company.manrega.buttons.Karya;
import com.company.manrega.buttons.Met;
import com.company.manrega.buttons.Module;
import com.company.manrega.buttons.Nirdesh;
import com.company.manrega.buttons.Panjiyan;
import com.company.manrega.buttons.Question;
import com.company.manrega.buttons.Register;
import com.company.manrega.buttons.Social;
import com.company.manrega.buttons.Suchna;

import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends Fragment {
    LinearLayout DishaNirdesh,module,nirdesh,jagrukta,Anumay,Bhumika,Panchyat,BFT,Meat,Jeo,sAudit,Answer,Panjiyan,GoodGover,WorkFile,Registrar,SuchnaPatti,JobCard;
    Timer timer;
    ViewPager viewPager;
 int ci=0;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        DishaNirdesh=root.findViewById(R.id.dishaNirdesh);
        module=root.findViewById(R.id.txtmodule);
         nirdesh=root.findViewById(R.id.nirdesh);
        jagrukta=root.findViewById(R.id.jagrukta);
        Anumay=root.findViewById(R.id.anumay);
        Bhumika=root.findViewById(R.id.bhumika);
        Panchyat=root.findViewById(R.id.panchyat);
        BFT=root.findViewById(R.id.Bft);
        Meat=root.findViewById(R.id.Meet);
        Jeo=root.findViewById(R.id.jio);
        sAudit=root.findViewById(R.id.social);
        Answer=root.findViewById(R.id.squestion);

        Panjiyan=root.findViewById(R.id.panjiyan);
        GoodGover =root.findViewById(R.id.goodGova);
        WorkFile=root.findViewById(R.id.Work);

        Registrar=root.findViewById(R.id.Regis);
        SuchnaPatti=root.findViewById(R.id.such);
        JobCard=root.findViewById(R.id.jobcard);


         DishaNirdesh.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 startActivity(new Intent(getActivity(), Disha_nirdesh.class));
             }
         });
        module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Module.class));
            }
        });
        nirdesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Nirdesh.class));
            }
        });
        jagrukta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Jagrukta.class));
            }
        });
        Anumay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), AnuMay.class));
            }
        });
        Bhumika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.company.manrega.buttons.Bhumika.class));
            }
        });
        Panchyat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), GramPanchayat.class));
            }
        });
        BFT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), BFT.class));
            }
        });
        Meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Met.class));
            }
        });
        Jeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Jio.class));
            }
        });
        sAudit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Social.class));
            }
        });
        Answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Question.class));
            }
        });
        Panjiyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Panjiyan.class));
            }
        });
        GoodGover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), GoodGov.class));
            }
        });
        WorkFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Karya.class));
            }
        });
        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Register.class));
            }
        });
        SuchnaPatti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Suchna.class));
            }
        });
        JobCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Job.class));
            }
        });





























































        viewPager=(ViewPager)root.findViewById(R.id.mViewPager);
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getActivity());
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setPageMargin(60);
        viewPager.setClipToPadding(false);
        viewPager.setOffscreenPageLimit(viewPagerAdapter.getCount());

        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                viewPager.post(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("viewpager",""+ci);
                        viewPager.setCurrentItem(ci%7);
                        ci++;
                    }
                });
            }
        },1000,2000);
        return root;
    }
}
