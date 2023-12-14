package com.rainwon.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
        private String string1;

        List<String> words;

        int numSymbols;
        int numWords;


        private TextView asd12;
        private TextView asd22;
        private  TextView asd32;
        private TextView asd42;
        private TextView asd52;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            string1 = "У Лукоморья дуб зелёный";
            words = Arrays.asList(string1.split(" "));

            numSymbols = string1.length();
            numWords = words.size();

            asd12 = findViewById(R.id.headerApp1);
            asd22 = findViewById(R.id.headerApp2);
            asd32 = findViewById(R.id.headerApp3);

            asd42 = findViewById(R.id.headerApp4);
            asd52 = findViewById(R.id.headerApp5);
            //region Words

            //Количество букв 'л' в строке
            int numLettersL = 0;
            for (String word : words) {
                for (char letter : word.toCharArray()) {
                    if (letter == 'л') {
                        numLettersL++;
                    }
                }
            }

            //Вывод слов состоящих из 5 букв
            String hasFiveLetterWords = "false";
            for (String word : words) {
                if (word.length() == 5) {
                    hasFiveLetterWords = "true";
                    break;
                }
            }
            //Строка из всех слов, начинающихся на букву 'а'
            String stringWithAWords = "Нету";
            for (String word : words) {
                if (word.charAt(0) == 'а') {
                    stringWithAWords += word + " ";
                }
            }
            //endregion



            asd12.setText(String.valueOf("Количество букв 'л' в строке: " + numLettersL));

            asd22.setText("Наличие слов, состоящих из 5 букв: " + hasFiveLetterWords);

            asd32.setText("Строка из всех слов, начинающихся на букву 'а': " + stringWithAWords);

            asd42.setText(String.valueOf("Количество символов в строке: " + numSymbols));

            asd52.setText(String.valueOf("Количество слов в строке: " + numWords));

        }
}