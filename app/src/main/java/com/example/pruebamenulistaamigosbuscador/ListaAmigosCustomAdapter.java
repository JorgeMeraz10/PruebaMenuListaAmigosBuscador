package com.example.pruebamenulistaamigosbuscador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ListaAmigosCustomAdapter extends ArrayAdapter<Amigos> {

    private Context Context;
    private int Resource;

    public ListaAmigosCustomAdapter(Context context, int resource, List<Amigos> objects) {
        super(context, resource, objects);
        Context = context;
        Resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(Context);
            view = inflater.inflate(Resource, parent, false);
        }

        Amigos amigos = getItem(position);

        ImageView friendImage = view.findViewById(R.id.friend_image);
        TextView friendIName = view.findViewById(R.id.friend_name);
        TextView friendICareer = view.findViewById(R.id.friend_career);
        ImageView friendIIcon = view.findViewById(R.id.friend_icon);

        friendImage.setImageResource(amigos.getImageResourceId());
        friendIName.setText(amigos.getName());
        friendICareer.setText(amigos.getCareer());
        friendIIcon.setImageResource(amigos.getIconResourceId());

        return view;



    }
}
