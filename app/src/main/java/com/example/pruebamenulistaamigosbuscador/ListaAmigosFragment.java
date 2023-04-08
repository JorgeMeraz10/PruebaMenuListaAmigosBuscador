package com.example.pruebamenulistaamigosbuscador;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ListaAmigosFragment extends Fragment {

    private ListView FriendListView;
    private TextView cancelText;
    private ListaAmigosCustomAdapter adapter;
    private EditText searchView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lista_amigos, container, false);

        FriendListView = view.findViewById(R.id.friend_list);
        searchView = view.findViewById(R.id.search_view_edit_text);
        cancelText = view.findViewById(R.id.cancel_text);

        List<Amigos> friendList = new ArrayList<>();
        friendList.add(new Amigos(R.drawable.amigo1, "Francisco Morazan ", "Lic. en Derecho", R.drawable.friendicon));
        friendList.add(new Amigos(R.drawable.amigo2, "Abraham Lincoln", "Ingenieria en Electricidad", R.drawable.friendicon));
        friendList.add(new Amigos(R.drawable.amigo3, "George Whashintong", "Ingenieria Industrial", R.drawable.friendicon));
        friendList.add(new Amigos(R.drawable.amigo4, "Joao Da Silva", "Lic. en Economia", R.drawable.friendicon));

        ListaAmigosCustomAdapter adapter = new ListaAmigosCustomAdapter(getContext(), R.layout.lista_item_amigo, friendList);
        FriendListView.setAdapter(adapter);

        return view;
    }


}
