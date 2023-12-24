package com.deveugene.securitysolution.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.deveugene.securitysolution.R;
import com.deveugene.securitysolution.adapter.factory.ItemsResourceFactory;
import com.deveugene.securitysolution.entity.ItemEntity;
import com.deveugene.securitysolution.entity.notification.Notification;
import com.deveugene.securitysolution.entity.organization.Organization;

import java.util.List;

public class HomeItemsAdapter<T extends ItemEntity> extends RecyclerView.Adapter<HomeItemsAdapter.ItemHolder> {
    private final List<T> items;

    public HomeItemsAdapter(List<T> items) {
        this.items = items;
    }

    public static HomeItemsAdapter<?> ofDefault(List<? extends ItemEntity> items, RecyclerView root) {
        HomeItemsAdapter<? extends ItemEntity> itemsAdapter = new HomeItemsAdapter<>(items);
        root.setAdapter(itemsAdapter);
        root.setHasFixedSize(true);
        root.setLayoutManager(new LinearLayoutManager(root.getContext()));
        return itemsAdapter;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return ItemHolder.of(LayoutInflater.from(parent.getContext())
                .inflate(ItemsResourceFactory.getResource(this.items.get(0)), parent, false), this.items.get(0));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        ItemEntity item = this.items.get(position);
        holder.title.setText(item.getTitle());
        holder.subTitle.setText(item.getSubTitle());
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    static class ItemHolder extends RecyclerView.ViewHolder {
        private TextView title, subTitle;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);

            this.title = itemView.findViewById(R.id.organizationTitle);
            this.subTitle = itemView.findViewById(R.id.organizationAddress);

            this.title = itemView.findViewById(R.id.notificationTitle);
        }

        public static ItemHolder of(View itemView, ItemEntity item) {
            if (item instanceof Notification) {
                return new NotificationHolder(itemView);
            } else if (item instanceof Organization) {
                return new OrganizationHolder(itemView);
            } else {
                throw new RuntimeException("Not Found");
            }
        }
    }

    static class NotificationHolder extends ItemHolder {
        public NotificationHolder(@NonNull View itemView) {
            super(itemView);
            super.title = itemView.findViewById(R.id.notificationTitle);
            super.subTitle = super.title;
        }
    }

    static class OrganizationHolder extends ItemHolder {
        public OrganizationHolder(@NonNull View itemView) {
            super(itemView);
            super.title = itemView.findViewById(R.id.organizationTitle);
            super.subTitle = itemView.findViewById(R.id.organizationAddress);
        }
    }
}
