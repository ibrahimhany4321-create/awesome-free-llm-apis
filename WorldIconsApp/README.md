# تطبيق أيقونات العالم 🌍

تطبيق Android يحتوي على مجموعة شاملة من الأيقونات والرموز من جميع أنحاء العالم.

## المحتويات

يحتوي التطبيق على 8 فئات رئيسية:

1. **🌍 أعلام الدول** - أعلام 32 دولة عربية وأجنبية
2. **😀 رموز تعبيرية** - 24 رمز تعبيري شائع
3. **☪️ رموز دينية** - رموز الإسلام، المسيحية، اليهودية، البوذية، الهندوسية، والطاوية
4. **⚽ رياضة** - أيقونات 16 رياضة مختلفة
5. **🍎 طعام** - 20 نوع من الفواكه والطعام
6. **🚗 نقل** - 20 وسيلة نقل مختلفة
7. **💼 مهن** - 24 مهنة ووظيفة
8. **❤️ مشاعر** - 24 مشاعر وعاطفة

## كيفية البناء

### المتطلبات
- Android Studio (الإصدار 2022 أو أحدث)
- JDK 17 أو أحدث
- Android SDK 34

### خطوات البناء

1. **فتح المشروع في Android Studio:**
   - افتح Android Studio
   - اختر "Open an existing project"
   - اختر مجلد `WorldIconsApp`

2. **انتظار المزامنة:**
   - انتظر حتى تكتمل مزامنة Gradle

3. **بناء ملف APK:**
   - اذهب إلى `Build` → `Build Bundle(s) / APK(s)` → `Build APK(s)`
   - انتظر حتى يكتمل البناء
   - اضغط على "locate" في الإشعار للعثور على ملف APK

### البناء عبر سطر الأوامر

```bash
cd WorldIconsApp
./gradlew assembleDebug
```

سيكون ملف APK في:
```
app/build/outputs/apk/debug/app-debug.apk
```

## التثبيت

1. انقل ملف APK إلى هاتفك Android
2. افتح الملف
3. اضغط "تثبيت"
4. إذا طُلب،فعّل "مصادر غير معروفة" من الإعدادات

## التقنيات المستخدمة

- **لغة البرمجة:** Java
- **واجهة المستخدم:** Material Design
- **التخطيط:** RecyclerView مع GridLayoutManager
- **التنقل:** ViewPager2 مع TabLayout
- **الحد الأدنى للإصدار:** Android 7.0 (API 24)
- **الإصدار المستهدف:** Android 14 (API 34)

## هيكل المشروع

```
WorldIconsApp/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/worldicons/
│   │       │   ├── MainActivity.java
│   │       │   ├── IconsPagerAdapter.java
│   │       │   ├── IconsFragment.java
│   │       │   ├── IconsAdapter.java
│   │       │   └── IconItem.java
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   ├── activity_main.xml
│   │       │   │   ├── fragment_icons.xml
│   │       │   │   └── item_icon.xml
│   │       │   ├── values/
│   │       │   │   ├── strings.xml
│   │       │   │   ├── colors.xml
│   │       │   │   └── themes.xml
│   │       │   └── drawable/
│   │       │       └── circle_background.xml
│   │       └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── README.md
```

## الترخيص

هذا المشروع مجاني ومفتوح المصدر.

---

**ملاحظة:** هذا التطبيق يستخدم Unicode Emoji لعرض الأيقونات، لذا قد تختلف الأيقونات حسب نظام التشغيل والإصدار.