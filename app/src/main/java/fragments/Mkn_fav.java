package fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas_navdraw.AdapterItem;
import com.example.tugas_navdraw.Item_MakMin;
import com.example.tugas_navdraw.R;

import java.util.ArrayList;
import java.util.List;

public class Mkn_fav extends Fragment {
    RecyclerView makananFavorit;
    List<Item_MakMin> listMakananfav;
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.mkn_fav, container, false);

        // Cari referensi ke RecyclerView di dalam rootView
        makananFavorit = rootView.findViewById(R.id.makananFavorit);
        listMakananfav = new ArrayList<>();

        Item_MakMin kari = new Item_MakMin();
        kari.setNamaItem("Kari Rajungan");
        kari.setDeskripsiItem("Rajungan dimasak dengan bumbu kare. Rasa hidangannya gurih dan kaya akan rempah.");
        kari.setImageItem(R.drawable.kari_rajungan);
        listMakananfav.add(kari);

        Item_MakMin dumbek = new Item_MakMin();
        dumbek.setNamaItem("Dumbek");
        dumbek.setDeskripsiItem("Dumpek adalah makanan khas Tuban yang terbuat dari tepung beras, gula merah, daun pandan, santan, parutan kelapa, dan garam. Bentuk hidangannya mirip dengan terompet.");
        dumbek.setImageItem(R.drawable.dumbek);
        listMakananfav.add(dumbek);

        // Set up RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        makananFavorit.setLayoutManager(layoutManager);

        // Buat adapter untuk RecyclerView
        AdapterItem adapter = new AdapterItem(listMakananfav);
        makananFavorit.setAdapter(adapter);

        return rootView;
    }
}
