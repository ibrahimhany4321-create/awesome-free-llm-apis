package com.worldicons;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class IconsAdapter extends RecyclerView.Adapter<IconsAdapter.ViewHolder> {

    private final List<IconItem> icons;

    public IconsAdapter(List<IconItem> icons) {
        this.icons = icons;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_icon, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        IconItem icon = icons.get(position);
        holder.iconText.setText(icon.getEmoji());
        holder.iconName.setText(icon.getName());
    }

    @Override
    public int getItemCount() {
        return icons.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView iconText;
        public final TextView iconName;

        public ViewHolder(View view) {
            super(view);
            iconText = view.findViewById(R.id.iconText);
            iconName = view.findViewById(R.id.iconName);
        }
    }
}