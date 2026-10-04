package com.worldicons;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class IconsFragment extends Fragment {

    private static final String ARG_CATEGORY = "category";

    public static IconsFragment newInstance(int category) {
        IconsFragment fragment = new IconsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_CATEGORY, category);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_icons, container, false);
        
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        
        int category = getArguments() != null ? getArguments().getInt(ARG_CATEGORY) : 0;
        List<IconItem> icons = getIconsForCategory(category);
        
        IconsAdapter adapter = new IconsAdapter(icons);
        recyclerView.setAdapter(adapter);
        
        return view;
    }

    private List<IconItem> getIconsForCategory(int category) {
        List<IconItem> icons = new ArrayList<>();
        
        switch (category) {
            case 0: // Country Flags
                icons.add(new IconItem("🇸🇦", "السعودية"));
                icons.add(new IconItem("🇪🇬", "مصر"));
                icons.add(new IconItem("🇦🇪", "الإمارات"));
                icons.add(new IconItem("🇰🇼", "الكويت"));
                icons.add(new IconItem("🇶🇦", "قطر"));
                icons.add(new IconItem("🇧🇭", "البحرين"));
                icons.add(new IconItem("🇴🇲", "عمان"));
                icons.add(new IconItem("🇯🇴", "الأردن"));
                icons.add(new IconItem("🇱🇧", "لبنان"));
                icons.add(new IconItem("🇸🇾", "سوريا"));
                icons.add(new IconItem("🇮🇶", "العراق"));
                icons.add(new IconItem("🇱🇾", "ليبيا"));
                icons.add(new IconItem("🇹🇳", "تونس"));
                icons.add(new IconItem("🇩🇿", "الجزائر"));
                icons.add(new IconItem("🇲🇦", "المغرب"));
                icons.add(new IconItem("🇸🇩", "السودان"));
                icons.add(new IconItem("🇾🇪", "اليمن"));
                icons.add(new IconItem("🇵🇸", "فلسطين"));
                icons.add(new IconItem("🇺🇸", "أمريكا"));
                icons.add(new IconItem("🇬🇧", "بريطانيا"));
                icons.add(new IconItem("🇫🇷", "فرنسا"));
                icons.add(new IconItem("🇩🇪", "ألمانيا"));
                icons.add(new IconItem("🇮🇹", "إيطاليا"));
                icons.add(new IconItem("🇪🇸", "إسبانيا"));
                icons.add(new IconItem("🇯🇵", "اليابان"));
                icons.add(new IconItem("🇰🇷", "كوريا"));
                icons.add(new IconItem("🇨🇳", "الصين"));
                icons.add(new IconItem("🇮🇳", "الهند"));
                icons.add(new IconItem("🇧🇷", "البرازيل"));
                icons.add(new IconItem("🇷🇺", "روسيا"));
                icons.add(new IconItem("🇨🇦", "كندا"));
                icons.add(new IconItem("🇦🇺", "أستراليا"));
                break;
                
            case 1: // Emoji
                icons.add(new IconItem("😀", "ابتسامة"));
                icons.add(new IconItem("😂", "ضحك"));
                icons.add(new IconItem("😍", "حب"));
                icons.add(new IconItem("😎", " cool"));
                icons.add(new IconItem("🤔", "تفكير"));
                icons.add(new IconItem("😢", "حزن"));
                icons.add(new IconItem("😡", "غضب"));
                icons.add(new IconItem("🥳", "احتفال"));
                icons.add(new IconItem("😴", "نوم"));
                icons.add(new IconItem("🤗", "عناق"));
                icons.add(new IconItem("😈", "شيطان"));
                icons.add(new IconItem("👻", "شبح"));
                icons.add(new IconItem("💀", "جمجمة"));
                icons.add(new IconItem("🤖", "روبوت"));
                icons.add(new IconItem("👽", "كائن فضائي"));
                icons.add(new IconItem("💩", "براز"));
                icons.add(new IconItem("🤡", "مهرج"));
                icons.add(new IconItem("👹", "وحش"));
                icons.add(new IconItem("👺", "غول"));
                icons.add(new IconItem("🎃", "هالوين"));
                icons.add(new IconItem("🔥", "نار"));
                icons.add(new IconItem("💯", "مئة"));
                icons.add(new IconItem("✨", "بريق"));
                icons.add(new IconItem("❤️", "قلب"));
                break;
                
            case 2: // Religious
                icons.add(new IconItem("☪️", "إسلام"));
                icons.add(new IconItem("✝️", "مسيحية"));
                icons.add(new IconItem("✡️", "يهودية"));
                icons.add(new IconItem("☸️", "بوذية"));
                icons.add(new IconItem("🕉️", "هندوسية"));
                icons.add(new IconItem("☯️", "طاوية"));
                icons.add(new IconItem("🕎", "شمعدان"));
                icons.add(new IconItem("⚛️", "إلحاد"));
                icons.add(new IconItem("🛐", "عبادة"));
                icons.add(new IconItem("🕌", "مسجد"));
                icons.add(new IconItem("⛪", "كنيسة"));
                icons.add(new IconItem("🛕", "معبد"));
                icons.add(new IconItem("🕍", "كنيس"));
                icons.add(new IconItem("📿", "مسبحة"));
                icons.add(new IconItem("🤲", "دعاء"));
                icons.add(new IconItem("🙏", "صلاة"));
                break;
                
            case 3: // Sports
                icons.add(new IconItem("⚽", "كرة قدم"));
                icons.add(new IconItem("🏀", "كرة سلة"));
                icons.add(new IconItem("🏈", "كرة أمريكية"));
                icons.add(new IconItem("⚾", "بيسبول"));
                icons.add(new IconItem("🎾", "تنس"));
                icons.add(new IconItem("🏐", "كرة طائرة"));
                icons.add(new IconItem("🏉", "رغبي"));
                icons.add(new IconItem("🎱", "بلياردو"));
                icons.add(new IconItem("🏓", "تنس طاولة"));
                icons.add(new IconItem("🏸", "بادمينتون"));
                icons.add(new IconItem("🥊", "ملاكمة"));
                icons.add(new IconItem("🥋", "فنون قتالية"));
                icons.add(new IconItem("⛳", "غولف"));
                icons.add(new IconItem("⛸️", "تزلج"));
                icons.add(new IconItem("🥇", "ميدالية ذهبية"));
                icons.add(new IconItem("🏆", "كأس"));
                break;
                
            case 4: // Food
                icons.add(new IconItem("🍎", "تفاح"));
                icons.add(new IconItem("🍌", "موز"));
                icons.add(new IconItem("🍇", "عنب"));
                icons.add(new IconItem("🍓", "فراولة"));
                icons.add(new IconItem("🍉", "بطيخ"));
                icons.add(new IconItem("🍊", "برتقال"));
                icons.add(new IconItem("🍋", "ليمون"));
                icons.add(new IconItem("🥑", "أفوكادو"));
                icons.add(new IconItem("🥕", "جزر"));
                icons.add(new IconItem("🌽", "ذرة"));
                icons.add(new IconItem("🍔", "همبرغر"));
                icons.add(new IconItem("🍕", "بيتزا"));
                icons.add(new IconItem("🌮", "تاكو"));
                icons.add(new IconItem("🍣", "سوشي"));
                icons.add(new IconItem("🍜", "نودلز"));
                icons.add(new IconItem("☕", "قهوة"));
                icons.add(new IconItem("🧃", "عصير"));
                icons.add(new IconItem("🍰", "كعكة"));
                icons.add(new IconItem("🍩", "دونات"));
                icons.add(new IconItem("🍪", "كعك"));
                break;
                
            case 5: // Transportation
                icons.add(new IconItem("🚗", "سيارة"));
                icons.add(new IconItem("🚕", "تاكسي"));
                icons.add(new IconItem("🚌", "حافلة"));
                icons.add(new IconItem("🚎", "ترام"));
                icons.add(new IconItem("🏎️", "سيارة سباق"));
                icons.add(new IconItem("🚓", "شرطة"));
                icons.add(new IconItem("🚑", "إسعاف"));
                icons.add(new IconItem("🚒", "إطفاء"));
                icons.add(new IconItem("✈️", "طائرة"));
                icons.add(new IconItem("🚀", "صاروخ"));
                icons.add(new IconItem("🛸", "طبق طائر"));
                icons.add(new IconItem("🚂", "قطار"));
                icons.add(new IconItem("🚆", "قطار سريع"));
                icons.add(new IconItem("🚇", "مترو"));
                icons.add(new IconItem("🚢", "سفينة"));
                icons.add(new IconItem("⛵", "شراع"));
                icons.add(new IconItem("🚤", "قارب سريع"));
                icons.add(new IconItem("🏍️", "دراجة نارية"));
                icons.add(new IconItem("🚲", "دراجة"));
                icons.add(new IconItem("🛴", "سكوتر"));
                break;
                
            case 6: // Professions
                icons.add(new IconItem("👨‍⚕️", "طبيب"));
                icons.add(new IconItem("👩‍⚕️", "طبيبة"));
                icons.add(new IconItem("👨‍🏫", "معلم"));
                icons.add(new IconItem("👩‍🏫", "معلمة"));
                icons.add(new IconItem("👨‍💻", "مبرمج"));
                icons.add(new IconItem("👩‍💻", "مبرمجة"));
                icons.add(new IconItem("👨‍🔧", "مهندس"));
                icons.add(new IconItem("👩‍🔧", "مهندسة"));
                icons.add(new IconItem("👨‍🍳", "طباخ"));
                icons.add(new IconItem("👩‍🍳", "طباخة"));
                icons.add(new IconItem("👨‍🚀", "رائد فضاء"));
                icons.add(new IconItem("👩‍🚀", "رائدة فضاء"));
                icons.add(new IconItem("👨‍🚒", "رجل إطفاء"));
                icons.add(new IconItem("👩‍🚒", "سيدة إطفاء"));
                icons.add(new IconItem("👨‍✈️", "طيار"));
                icons.add(new IconItem("👩‍✈️", "طيارة"));
                icons.add(new IconItem("👨‍⚖️", "قاضي"));
                icons.add(new IconItem("👩‍⚖️", "قاضية"));
                icons.add(new IconItem("👮", "شرطي"));
                icons.add(new IconItem("🕵️", "محقق"));
                icons.add(new IconItem("💂", "حارس"));
                icons.add(new IconItem("👷", "عامل"));
                icons.add(new IconItem("🧑‍🎤", "مغني"));
                icons.add(new IconItem("🎨", "فنان"));
                break;
                
            case 7: // Emotions
                icons.add(new IconItem("❤️", "حب"));
                icons.add(new IconItem("💔", "قلب مكسور"));
                icons.add(new IconItem("💕", "قلبان"));
                icons.add(new IconItem("💞", "قلوب"));
                icons.add(new IconItem("💓", "قلب نابض"));
                icons.add(new IconItem("💗", "قلب نامي"));
                icons.add(new IconItem("💖", "قلب متألق"));
                icons.add(new IconItem("💘", "قلب بسهم"));
                icons.add(new IconItem("💝", "قلب بهدية"));
                icons.add(new IconItem("😡", "غضب"));
                icons.add(new IconItem("😢", "حزن"));
                icons.add(new IconItem("😭", "بكاء"));
                icons.add(new IconItem("😤", "إحباط"));
                icons.add(new IconItem("😠", "استياء"));
                icons.add(new IconItem("🤬", "شتيمة"));
                icons.add(new IconItem("😱", "خوف"));
                icons.add(new IconItem("😨", "رعب"));
                icons.add(new IconItem("😰", "قلق"));
                icons.add(new IconItem("😥", "قلق حزين"));
                icons.add(new IconItem("😓", "تعب"));
                icons.add(new IconItem("🤩", "إعجاب"));
                icons.add(new IconItem("😋", "لذيذ"));
                icons.add(new IconItem("😛", "لسان"));
                icons.add(new IconItem("😜", "مزاح"));
                break;
        }
        
        return icons;
    }
}