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

public class Mnm_khas extends Fragment {
    RecyclerView minumanKhas;
    List<Item_MakMin> listMinumanKhas;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.mnm_khas, container, false);

        // Cari referensi ke RecyclerView di dalam rootView
        minumanKhas = rootView.findViewById(R.id.minumanKhas);
        listMinumanKhas = new ArrayList<>();

        Item_MakMin legen = new Item_MakMin();
        legen.setNamaItem("Legen");
        legen.setDeskripsiItem("Legen merupakan minuman khas Tuban yang diambil dari pohon Lontar atau Siwalan.");
        legen.setImageItem(R.drawable.legen);
        listMinumanKhas.add(legen);

        // Set up RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        minumanKhas.setLayoutManager(layoutManager);

        // Buat adapter untuk RecyclerView
        AdapterItem adapter = new AdapterItem(listMinumanKhas);
        minumanKhas.setAdapter(adapter);

        return rootView;
    }
}
