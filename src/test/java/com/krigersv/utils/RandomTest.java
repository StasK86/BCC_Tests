package com.krigersv.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class RandomTest {
    private final Faker faker = new Faker(new Locale("ru"));

    public String getRandomName() {
        return faker.name().fullName();
    }

    public String getRandomBank() {
        return faker.phoneNumber().subscriberNumber(12);
    }

    public String getRandomNumber() {
        return faker.phoneNumber().subscriberNumber(11);
    }

    public String getRandomCitySelection() {

        String[] selectCity = {"Алматы", "Астана", "Актау", "Актобе", "Атырау", "Кызылорда", "Кокшетау",
                "Костанай", "Павлодар", "Петропавловск", "Семей",
                "Тараз", "Уральск", "Усть-Каменогорск", "Шымкент", "Жезказган", "Караганда",
                "Талдыкорган", "Жезказган (обл. Ұлытау)", "Семей (обл. Абай)", "Жетысу", "АОФ",
                "Туркестанская обл", "Абай", "Аксай", "Аксу", "Аксукент", "Алтай", "Аральск",
                "Атамекен", "Ащибулак", "Аягоз", "Баейбарыс", "Байсерке", "Балпык би", "Балхаш",
                "Батыр", "Белоусовка", "Бестобе", "Боралдай", "Бурабай", "Есик", "Жанаарка",
                "Жанаконыс", "Жанаозен", "Жанатас", "Жаркент", "Жолымбет", "Заводской", "Зайсан",
                "Казалинск", "Карасу", "Каратау", "Каскелен", "Кенгир", "Коктерек", "Конаев", "Кордай",
                "Косшы", "Кулан", "Кульсары", "Курчатов", "Мангистау", "Манкент", "Мерке", "Новоишимское",
                "Отеген батыра", "Риддер", "Рудный", "Сарыагаш", "Сатпаев", "Секисовка", "Степногорск",
                "Талгар", "Текели", "Темиртау", "Тобыл", "Туркестан", "Узынагаш", "Урджар", "Уштобе", "Шемонаиха",
                "Шиели", "Шу", "Щучинск", "Экибастуз", "Жетысай", "Алгабас", "Жана Арка", "Айтеке би", "Жанагорган",
                "Отеген Батыр", "Ридер", "Тукестан", "Хоргос", "Бейбарыс", "Хромтау", "Шахтинск", "Тобол"};

        return faker.options().option(selectCity);
    }

    public String getRandomLetterSelection() {
        String[] letter = {"а", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о",
                "п", "р", "с", "т"};
        return faker.options().option(letter);
    }


    public String getRandomCity() {
        String[] goals = {"Алматы", "Туркестанская область", "Актау", "Актобе", "Атырау", "Жезказган",
                "Караганда", "Кокшетау", "Костанай", "Кызылорда", "Астана", "Павлодар", "Петропавловск", "Семей",
                "Талдыкорган", "Тараз", "Уральск", "Усть-Каменогорск", "Шымкент"};
        return faker.options().option(goals);
    }

}

