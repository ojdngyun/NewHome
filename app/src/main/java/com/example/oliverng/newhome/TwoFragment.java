package com.example.oliverng.newhome;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TwoFragment extends android.support.v4.app.Fragment {

    String[] BrandName = {"Brooklyn Bridge", "Golden Gates", "Tower Bridge",
            "Sydney Harbour Bridge", "Cloudy Mountains", "Cracked Dirt",
            "Cathedral", "Shanghai Bay", "Paris", "Eifel Tower", "Paris Bridge"};

    String[] codeDrawables = {"arrow_down.png","background.jpg","background2.jpg","background3.png","badge_label.9.png","badges_unearned.png","bioicon.png","birthdayicon.png","button_delete.png","button_retake.png","button_share.png","button_sign_up.png","button_sign_up_home.png","button_submission_cancel.png","button_submission_scan.png","button_submission_share.png","button_take_back.png","button_take_front.png","checkbox_off.png","checkbox_on.png","cleaner_options_girl.png","counter_bg_two.9.png","directional.9.png","dirty_meter_girl.png","dirty_meter_girl_large.png","drawer_addfriends.png","drawer_addfriends_active.png","drawer_addproducts.png","drawer_addproducts_active.png","drawer_history.png","drawer_history_active.png","drawer_home.png","drawer_home_active.png","drawer_likes.png","drawer_likes_active.png","drawer_lists.png","drawer_lists_active.png","drawer_scanproducts.png","drawer_settings.png","earnedbadges_close.png","earnedbadges_congrats.png","earnedbadgesbackground.jpg","emailicon.png","empty_search_girl.png","facebook.png","first_time_product_1.png","first_time_product_2.png","first_time_search_1.png","flower.png","footer.png","girl.png","haveanaccount.png","heartoff.png","hearton.png","ic_action_search.png","ic_drawer.png","ic_launcher.png","icon_barcode.png","icon_brand.png","icon_grid.png","icon_product_name.png","icon_submit_instructions.png","learn_more_bathroom_score.png","learn_more_be_in_the_know.png","learn_more_get_organized.png","learn_more_to_be_the_know.png","learn_more_zig_zag.png","letmein.png","list_empty_girl.png","list_flower.png","list_heart.png","list_item_add.png","list_item_delete.png","list_item_edit.png","list_list.png","list_skull.png","loader00.png","loader01.png","loader02.png","loader03.png","logo.png","maskicon.png","nameicon.png","notifications_boy.png","notifications_bubble.9.png","passicon.png","phoneicon.png","prod_not_found_girl.png","prod_not_found_submit.png","product_alias_icon.png","product_green_block.png","product_health_icon.png","product_name_icon.png","product_page_girl.png","product_placeholder.jpg","product_red_block.png","product_source_icon.png","product_usage_icon.png","product_warnings_icon.png","product_yellow_block.png","progress_gradient.png","progress_gradient_back.png","quick_tour_1.png","quick_tour_2.png","quick_tour_3.png","quick_tour_4.jpg","quick_tour_4_couple.png","quick_tour_5.png","quick_tour_5_girl.png","quick_tour_6.png","quick_tour_7.png","quick_tour_8.png","quick_tour_back_1.jpg","quick_tour_back_2.jpg","quick_tour_back_3.jpg","quick_tour_back_4.jpg","quick_tour_back_5.jpg","quick_tour_back_7.jpg","quick_tour_back_8.jpg","quick_tour_bar.9.png","quick_tour_footer.png","quick_tour_scan.jpg","quick_tour_title.png","rating0.png","rating0q.png","rating1.png","rating10.png","rating10q.png","rating1q.png","rating2.png","rating2q.png","rating3.png","rating3q.png","rating4.png","rating4q.png","rating5.png","rating5q.png","rating6.png","rating6q.png","rating7.png","rating7q.png","rating8.png","rating8q.png","rating9.png","rating9q.png","ratingnr.png","ratingnrq.png","ratingpop_chart_1.png","ratingpop_chart_2.png","ratingpop_close.png","resetpass.png","rightarrow.png","scale_title.png","scan_banner.png","scan_button.png","scanner_window.png","searchbar.9.png","searchicon.png","sexicon.png","shelfback.9.png","shopbtn.png","signin.png","signup.png","social_share.png","submission_boy.png","tabs.9.png","unregistered_lists.jpg","unregistered_products_bg.png","unregistered_products_learn.png","unregistered_products_signup.png","unregistered_profile.jpg","unregistered_scan_history.jpg","usericon.png","welcome_footer_brands.png","welcome_footer_products.png","welcome_footer_unique_scans.png","zxing_girl.png","zxing_lightbulb.png","zxing_scanning.png"};


    RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.two_fragment, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);

        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();

        StringAdapter adapter = new StringAdapter(codeDrawables, mRecyclerView.getContext());

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(adapter);

    }
}
