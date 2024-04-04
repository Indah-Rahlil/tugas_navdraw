package fragments;

import android.content.Intent;
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

public class Mkn_khas extends Fragment {
    RecyclerView makananKhas;
    List<Item_MakMin> listMakananKhas;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.mkn_khas, container, false);

        // Cari referensi ke RecyclerView di dalam rootView
        makananKhas = rootView.findViewById(R.id.makananKhas);
        listMakananKhas = new ArrayList<>();

        Item_MakMin kari = new Item_MakMin();
        kari.setNamaItem("Kari Rajungan");
        kari.setDeskripsiItem("Rajungan dimasak dengan bumbu kare. Rasa hidangannya gurih dan kaya akan rempah.");
        kari.setImageItem(R.drawable.kari_rajungan);
        listMakananKhas.add(kari);

        Item_MakMin dumbek = new Item_MakMin();
        dumbek.setNamaItem("Dumbek");
        dumbek.setDeskripsiItem("Dumpek adalah makanan khas Tuban yang terbuat dari tepung beras, gula merah, daun pandan, santan, parutan kelapa, dan garam. Bentuk hidangannya mirip dengan terompet.");
        dumbek.setImageItem(R.drawable.dumbek);
        listMakananKhas.add(dumbek);

        Item_MakMin ampo = new Item_MakMin();
        ampo.setNamaItem("Ampo");
        ampo.setDeskripsiItem("Ampo merupakan camilan legendaris masyarakat Tuban yang terbuat dari tanah liat. Biasanya ampo disajikan sebagai camilan pendamping kopi dan teh.");
        ampo.setImageItem(R.drawable.ampo);
        listMakananKhas.add(dumbek);

        Item_MakMin becek = new Item_MakMin();
        becek.setNamaItem("Becek Menthok");
        becek.setDeskripsiItem("Daging mentok yang sudah dibersihkan dan dipotong akan diungkep bersama dengan bumbu-bumbu dan rempah yang cukup banyak.");
        becek.setImageItem(R.drawable.becek_mentok);
        listMakananKhas.add(dumbek);

        // Set up RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        makananKhas.setLayoutManager(layoutManager);

        // Buat adapter untuk RecyclerView
        AdapterItem adapter = new AdapterItem(listMakananKhas);
        makananKhas.setAdapter(adapter);

        return rootView;
    }
}
